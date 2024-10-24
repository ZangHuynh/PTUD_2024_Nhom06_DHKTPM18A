package dao;

import database.ConnectDB;
import entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Category_DAO {
    public Category_DAO() {
    }
    public ArrayList<Category> getCategoryList(){
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Category> categoryList = new ArrayList<>();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Category");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                String categoryID = rs.getString(1);
                String categoryName = rs.getString(2);

                Category category = new Category(categoryID, categoryName);
                categoryList.add(category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categoryList;
    }
    public ArrayList<Category> getCategoryByCriterous(String criterous){

        ArrayList<Category> categoryByCriterias = new ArrayList<>();
        ArrayList<Category> categoryList = getCategoryList();
        for(Category category : categoryList){
            if(category.getCategoryID().toLowerCase().trim().contains(criterous.toLowerCase().trim())||
                    category.getCategoryName().toLowerCase().trim().contains(criterous.toLowerCase().trim())) {
                categoryByCriterias.add(category);
            }
        }
        return categoryByCriterias;

    }

    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        Category_DAO category_dao = new Category_DAO();
//        category_dao.getCategoryList().forEach(x -> System.out.println(x));
        category_dao.getCategoryByCriterous("ca002").forEach(x -> System.out.println(x));
    }
}
