package dao;

import database.ConnectDB;
import entity.PromotionType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PromotionType_DAO {
    public PromotionType_DAO() {
    }

    public ArrayList<PromotionType> getPromotionTypeList() {
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<PromotionType> promotionTypeList = new ArrayList<>();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM PromotionType");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String promotionTypeID = rs.getString(1);
                String promotionTypeName = rs.getString(2);

                PromotionType promotionType = new PromotionType(promotionTypeID, promotionTypeName);
                promotionTypeList.add(promotionType);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return promotionTypeList;
    }

    public ArrayList<PromotionType> getPromotionTypeByCriterous(String criterous) {
        ArrayList<PromotionType> promotionTypeListByCri = new ArrayList<>();
        ArrayList<PromotionType> promotionTypeList = getPromotionTypeList();
        for (PromotionType promotionType : promotionTypeList) {
            if (promotionType.getPromotionTypeID().toLowerCase().trim().contains(criterous.toLowerCase().trim()) ||
                    promotionType.getPromotionTypeName().toLowerCase().trim().contains(criterous.toLowerCase().trim())
            ) {
                promotionTypeListByCri.add(promotionType);
            }
        }
        return promotionTypeListByCri;
    }
    public boolean addPromotionType (PromotionType promotionType){
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;

        String sql = "INSERT INTO PromotionType (promoTypeID, promoTypeName) VALUES (?, ?)";
        int n = 0;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, promotionType.getPromotionTypeID());
            stmt.setString(2, promotionType.getPromotionTypeName());

            n = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n > 0;
    }
    public boolean updatePromotionType(PromotionType promotionType) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n =0;

        String sql = "UPDATE promotion_type SET promotionTypeName = ? WHERE promotionTypeID = ?";

        try {
            stmt =con.prepareStatement(sql);
            stmt.setString(1, promotionType.getPromotionTypeName());
            stmt.setString(2, promotionType.getPromotionTypeID());

            n = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n > 0;
    }
    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        PromotionType_DAO promotionType_dao = new PromotionType_DAO();
        promotionType_dao.getPromotionTypeList().forEach(x -> System.out.println(x));
//        promotionType_dao.getPromotionTypeByCriterous("pr01").forEach(x -> System.out.println(x));
//        promotionType_dao.addPromotionType()

    }
}
