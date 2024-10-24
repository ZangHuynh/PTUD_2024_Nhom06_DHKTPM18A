package dao;

import database.ConnectDB;
import entity.Account;
import entity.Customer;
import entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customer_DAO {
    public Customer_DAO(){

    }
    public ArrayList<Customer> getListCustomer() {
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Customer> cusList = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Customer");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String cusName = rs.getString(1);
                String phoneNumber = rs.getString(2);
                boolean sex = rs.getBoolean(3);
                LocalDate brithDate = rs.getDate(4).toLocalDate();
                String mail = rs.getString(5);
                String add = rs.getString(7);

                Customer cus = new Customer(phoneNumber,cusName,sex,mail,add,brithDate);
                cusList.add(cus);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cusList;

    }
    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        Customer_DAO cus_dao = new Customer_DAO();
        Account acc = new Account("EP0302");
          cus_dao.getListCustomer().forEach(System.out::println);

    }
}
