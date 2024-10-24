package dao;

import database.ConnectDB;
import entity.Vendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Vendor_DAO {
    public Vendor_DAO() {
    }

    /**
     * Hàm lấy danh sách tất cả nhà cung cấp
     *
     * @return vendorList: ArrayList<Vendor>
     */
    public ArrayList<Vendor> getVendorList() {
        ArrayList<Vendor> vendorList = new ArrayList<>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Vendor");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String vendorID = rs.getString(1);
                String vendorName = rs.getString(2);
                String country = rs.getString(3);

                Vendor vendor = new Vendor(vendorID, vendorName, country);
                vendorList.add(vendor);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vendorList;
    }

    /**
     * Ti kiếm nhà cung cấp theo tiêu chí bất kỳ
     *
     * @param criterious
     * @return venDorByCriList: ArrayList<Vendor>
     */
    public ArrayList<Vendor> getVendorListByCriteroais(String criterious) {
        ArrayList<Vendor> vendorByCriList = new ArrayList<>();
        ArrayList<Vendor> listVendor = getVendorList();

        for (Vendor vendor : listVendor) {
            if (vendor.getVendorID().toLowerCase().trim().contains(criterious.toLowerCase().trim()) ||
                    vendor.getVendorName().toLowerCase().trim().contains(criterious.toLowerCase().trim()) ||
                    vendor.getCountry().toLowerCase().trim().contains(criterious.toLowerCase().trim())) {
                vendorByCriList.add(vendor); // Thêm nhà cung cấp thỏa mãn tiêu chí tìm kiếm vào danh sách kết quả
            }
        }
        return vendorByCriList;
    }

    /**
     * Kiểm tra xem nhà cung cấp đã tồn tại trong cơ sở dữ liệu chưa
     *
     * @param vendorID
     * @return vd : ArrayList<Vendor>
     */
    public ArrayList<Vendor> checkVendorExistence(String vendorID) {
        ArrayList<Vendor> vd = getVendorListByCriteroais(vendorID);
        return vd;
    }

    public boolean addVendor(Vendor vendor) {
        Connection con = ConnectDB.getInstance().getConnection();
        String sql = "INSERT INTO Vendor(vendorID, vendorName, country) VALUES (?, ?, ?)";
        int n = 0;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, vendor.getVendorID());
            stmt.setString(2, vendor.getVendorName());
            stmt.setString(3, vendor.getCountry());

            n = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public boolean updateVendor(Vendor vendor) {
        Connection con = ConnectDB.getInstance().getConnection();
        int n = 0;
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE Vendor SET vendorName = ?, country = ? WHERE vendorID = ?");
            stmt.setString(1, vendor.getVendorName());
            stmt.setString(2, vendor.getCountry());
            stmt.setString(3, vendor.getVendorID());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }


    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        Vendor_DAO vd_dao = new Vendor_DAO();
        vd_dao.getVendorList().forEach(x -> System.out.println(x));
        System.out.println(vd_dao.getVendorListByCriteroais("VDVN001"));
//        Vendor vd = new Vendor("VDVN004", "Công ty CP Dược Phẩm Nano", "Vệt Nam");
//        vd_dao.updateVendor(vd);
    }
}
