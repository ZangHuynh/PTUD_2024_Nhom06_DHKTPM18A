package dao;

import database.ConnectDB;
import entity.Promotion;
import entity.PromotionType;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Promotion_DAO {
    public Promotion_DAO() {
    }

    public ArrayList<Promotion> getPromotionList() {
        PromotionType_DAO promotionType_dao = new PromotionType_DAO();
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Promotion> promotionList = new ArrayList<>();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Promotion");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String promotionID = rs.getString(1);
                String promotionName = rs.getString(2);
                LocalDate startDate = rs.getDate(3).toLocalDate();
                LocalDate endDate = rs.getDate(4).toLocalDate();
                ArrayList<PromotionType> promotionTypeList = promotionType_dao.getPromotionTypeByCriterous(rs.getString(5));
                PromotionType promotionType = promotionTypeList.get(0);

                Promotion promotion = new Promotion(promotionID, promotionName, startDate, endDate, promotionType);
                promotionList.add(promotion);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return promotionList;
    }

    public ArrayList<Promotion> getPromotionListByCriterous(String criterious) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = null;

        if (criterious != null && !criterious.trim().isEmpty()) {
            try {
                date = LocalDate.parse(criterious.trim(), dateFormatter);
            } catch (DateTimeParseException e) {

            }
        }

        ArrayList<Promotion> promotionListByCriterous = new ArrayList<>();
        ArrayList<Promotion> promotionList = getPromotionList();
        for (Promotion promotion : promotionList) {
            if (promotion.getPromotionID().toLowerCase().trim().contains(criterious.toLowerCase().trim()) ||
                    promotion.getPromotionName().toLowerCase().trim().contains(criterious.toLowerCase().trim()) ||
                    (date != null && promotion.getStartDate().equals(date)) ||
                    (date != null && promotion.getEndDate().equals(date)) ||
                    promotion.getPromotionType().getPromotionTypeID().toLowerCase().trim().contains(criterious.toLowerCase().trim()) ||
                    promotion.getPromotionType().getPromotionTypeName().toLowerCase().trim().contains(criterious.toLowerCase().trim())

            ) {
                promotionListByCriterous.add(promotion);
            }
        }

        return promotionListByCriterous;
    }

    public boolean addPromotion(Promotion promotion) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;

        String sql = "INSERT INTO Promotion (promotionID, promotionName, startDate, endDate, promotionTypeID) VALUES (?, ?, ?, ?, ?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, promotion.getPromotionID());
            stmt.setString(2, promotion.getPromotionName());
            stmt.setDate(3, Date.valueOf(promotion.getStartDate()));
            stmt.setDate(4, Date.valueOf(promotion.getEndDate()));
            stmt.setString(5, promotion.getPromotionTypeID());

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

    public boolean updatePromotion(Promotion promotion) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        int n = 0;

        String sql = "UPDATE Promotion SET promotionName = ?, startDate = ?, endDate = ?, promotionTypeID = ? WHERE promotionID = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, promotion.getPromotionName());
            stmt.setDate(2, Date.valueOf(promotion.getStartDate()));
            stmt.setDate(3, Date.valueOf(promotion.getEndDate()));
            stmt.setString(4, promotion.getPromotionTypeID());
            stmt.setString(5, promotion.getPromotionID());

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
        Promotion_DAO promotion_dao = new Promotion_DAO();
//        promotion_dao.getPromotionList().forEach(x -> System.out.println(x));
        promotion_dao.getPromotionListByCriterous("pr02102410102401").forEach(x -> System.out.println(x));

    }

}
