package dao;

import database.ConnectDB;
import entity.Category;
import entity.Product;
import entity.Promotion;
import entity.Vendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product_DAO {
    public Product_DAO() {
    }
    public ArrayList<Product> getProductList(){
        Vendor_DAO vendor_dao = new Vendor_DAO();
        Promotion_DAO promotion_dao = new Promotion_DAO();
        Category_DAO category_dao = new Category_DAO();
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Product> productList = new ArrayList<>();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Product");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                String proID = rs.getString(1);
                String proName = rs.getString(2);
                int quanInStock = rs.getInt(3);
                double tax = rs.getDouble(4);
                double purchasePrice = rs.getDouble(5);
                String resNumber = rs.getString(6);

                Promotion promotion = new Promotion();

                if(rs.getString(7) ==  null){

                    promotion = new Promotion();
                }else{
                    ArrayList<Promotion> promotionList = promotion_dao.getPromotionListByCriterous(rs.getString(7));
                    promotion = promotionList.get(0);
                }

                ArrayList<Vendor> vendorList = vendor_dao.getVendorListByCriteroais(rs.getString(8));
                Vendor vendor = vendorList.get(0);

                ArrayList<Category> categoryList = category_dao.getCategoryByCriterous(rs.getString(9));
                Category category = categoryList.get(0);

                Product product = new Product(proID, proName, resNumber, quanInStock, purchasePrice, tax, vendor, category, promotion);
                productList.add(product);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productList;
    }
    public ArrayList<Product> getProductListByCriterous(String criterous){
        ArrayList<Product> proListByCri = new ArrayList<>();
        ArrayList<Product> proList = getProductList();

        for(Product pro : proList){
            if(pro.getProductID().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getProductName().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getRegistrationNumber().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getVendor().getVendorID().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getVendor().getVendorName().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getVendor().getCountry().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getCategory().getCategoryID().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    pro.getCategory().getCategoryName().toLowerCase().trim().contains(criterous.toLowerCase().trim())
            ){
                proListByCri.add(pro);
            }
        }
        return proListByCri;
    }


    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        Product_DAO product_dao = new Product_DAO();
//        product_dao.getProductList().forEach(x -> System.out.println(x));
        product_dao.getProductListByCriterous("Nhóm thuốc điều trị các bệnh về gan").forEach(x -> System.out.println(x));
    }
}
