package dao;

import database.ConnectDB;
import entity.*;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import static java.sql.Date.valueOf;

public class Order_DAO {
    public Order_DAO() {
    }

    public ArrayList<Order> getOrderList() {
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Order> orderList = new ArrayList<>();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Orders");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String orderID = rs.getString(1);
                LocalDate orderDate = rs.getDate(2).toLocalDate();
                String shipToAddress = rs.getString(3);
                String paymentMethod = rs.getString(4);
                double totalDue = rs.getDouble(5);
                Customer customer = new Customer(rs.getString(6));
                Employee emp = new Employee(rs.getString(7));
                Prescription prescription = new Prescription(rs.getString(8));

                Order order = new Order(orderID, orderDate, shipToAddress, Enum_PaymentMethod.valueOf(paymentMethod), emp, customer, prescription);
                orderList.add(order);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return orderList;
    }

    public double getTotalDue(String orderID) {
        double totalDue = 0;
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT totalDue FROM Orders WHERE orderID = ?");
            stmt.setString(1, orderID);
            rs = stmt.executeQuery();

            if (rs.next()) {
                totalDue = rs.getDouble(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return totalDue;
    }

    /**
     * tìm kiếm hóa đơn theo tiêu chí bất kì
     * định dạng ngày khi nhập (yyyy-MM-dd)
     *
     * @param criterious
     * @return
     */
    //TODO: không tìm theo paymentMethod được, không biết lỗi đâu luôn =((((
    public ArrayList<Order> getOrderByCriterious(String criterious) {
        ArrayList<Order> orderListByCri = new ArrayList<>();
        ArrayList<Order> orderList = getOrderList();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate orderDate = null;

        if (criterious != null && !criterious.trim().isEmpty()) {
            try {
                orderDate = LocalDate.parse(criterious.trim(), dateFormatter);
            } catch (DateTimeParseException e) {

            }
        }
        for (Order o : orderList) {
            boolean matches =
                    (o.getOrderID() != null && o.getOrderID().toLowerCase().contains(criterious.toLowerCase())) ||
                            (orderDate != null && o.getOrderDate().equals(orderDate)) ||
                            (o.getShipToAddress() != null && o.getShipToAddress().toLowerCase().contains(criterious.toLowerCase())) ||
                            (o.getPaymentMethod() != null && o.getPaymentMethod().equals(criterious.toUpperCase())) ||
                            (o.getEmployee() != null && o.getEmployee().getEmployeeID() != null && o.getEmployee().getEmployeeID().toLowerCase().contains(criterious.toLowerCase())) ||
                            (o.getCustomer() != null && o.getCustomer().getPhoneNumber() != null && o.getCustomer().getPhoneNumber().contains(criterious.trim())) ||
                            (o.getPrescription() != null && o.getPrescription().getPrescriptionID() != null && o.getPrescription().getPrescriptionID().toLowerCase().contains(criterious.trim().toLowerCase()));

            if (matches) {
                orderListByCri.add(o);
            }
        }

        return orderListByCri;
    }

    /**
     * tính doanh thu theo 1 tiêu chí bất kì
     *
     * @param criteria
     * @return
     */
    //TODO: vẫn là lỗi paymentMethod =(((((
    public double getRevenueByCriteria(String criteria) {
        double totalRevenue = 0.0;
        ArrayList<Order> orderList = getOrderList();

        for (Order order : orderList) {
            boolean matchesCriteria = false;

            // Kiểm tra tiêu chí có thể là orderID
            if (order.getOrderID().toLowerCase().trim().contains(criteria.toLowerCase().trim())) {
                matchesCriteria = true;
            }

            // Kiểm tra tiêu chí có thể là ngày đặt hàng
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            try {
                LocalDate criteriaDate = LocalDate.parse(criteria, dateFormatter);
                if (order.getOrderDate().equals(criteriaDate)) {
                    matchesCriteria = true;
                }
            } catch (DateTimeParseException e) {
            }

            // Kiểm tra tiêu chí có thể là phương thức thanh toán
            if (order.getPaymentMethod().equals(criteria.trim())) {
                matchesCriteria = true;
            }

            // Kiểm tra tiêu chí có thể là employeeID
            if (order.getEmployee().getEmployeeID().toLowerCase().trim().contains(criteria.toLowerCase().trim())) {
                matchesCriteria = true;
            }

            // Kiểm tra tiêu chí có thể là customer phone number
            if (order.getCustomer().getPhoneNumber().contains(criteria.trim())) {
                matchesCriteria = true;
            }

            // Nếu đơn hàng khớp với tiêu chí, cộng doanh thu
            if (matchesCriteria) {
                totalRevenue += order.getToTalDue();
            }
        }

        return totalRevenue;
    }

    /**
     * tính doanh thu trong 1 khoảng thời gian bất kì
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public double getRevenueByDateRange(LocalDate startDate, LocalDate endDate) {
        double totalRevenue = 0.0;
        ArrayList<Order> orderList = getOrderList();

        for (Order order : orderList) {
            if ((order.getOrderDate().isEqual(startDate) || order.getOrderDate().isAfter(startDate)) &&
                    (order.getOrderDate().isEqual(endDate) || order.getOrderDate().isBefore(endDate))) {
                totalRevenue += order.getToTalDue();
            }
        }

        return totalRevenue;
    }

    /**
     * lọc danh sách hóa đơn theo ngày hiện tại của nhân viên
     *
     * @param empID
     * @return
     */

    public ArrayList<Order> filterOrderByEmpID(String empID) {
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Order> orderList = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT *  FROM Orders o WHERE o.employeeID = ? \n" +
                    "  AND CAST(o.orderDate AS DATE) = CAST(GETDATE() AS DATE)");
            stmt.setString(1, empID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String orderID = rs.getString(1);
                LocalDate orderDate = rs.getDate(2).toLocalDate();
                String shipToAddress = rs.getString(3);
                String paymentMethod = rs.getString(4);
                Customer customer = new Customer(rs.getString(6));
                Employee emp = new Employee(rs.getString(7));
                Prescription prescription = new Prescription(rs.getString(8));

                Order order = new Order(orderID, orderDate, shipToAddress, Enum_PaymentMethod.valueOf(paymentMethod), emp, customer, prescription);
                orderList.add(order);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orderList;
    }

    /**
     * Tính doanh thu theo ngày hiện tại của nhân viên
     *
     * @param empID
     * @return
     */
    public double calculateTotalAllOrder(String empID) {
        double total = 0;
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT employeeID, SUM(totalDue) AS totalDueSum\n" +
                    "FROM Orders \n" +
                    "WHERE employeeID = ? AND CAST(orderDate AS DATE) = CAST(GETDATE() AS DATE)\n" +
                    "GROUP BY employeeID");
            stmt.setString(1, empID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                total = rs.getDouble(2);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return total;
    }

    /**
     * Thêm hóa đơn
     * @param order
     * @return
     */
    //TODO: khi thêm hóa đơn thành công, tự động thêm orderDetail, cái này ph xử lý khi có giao diện ha. Kiểu phải chọn sản phẩm nào á

    public boolean addOrder(Order order) {
        Connection con = ConnectDB.getInstance().getConnection();
        PreparedStatement stmt = null;

        String sql = "INSERT INTO Orders (orderID, orderDate, shipToAddress, paymentMethod, customerID, employeeID, prescriptionID) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        int n = 0;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, order.getOrderID());
            stmt.setDate(2, valueOf(order.getOrderDate()));
            stmt.setString(3, order.getShipToAddress());
            stmt.setString(4, order.getPaymentMethod().name());
            stmt.setString(5, order.getCustomer().getPhoneNumber());
            stmt.setString(6, order.getEmployee().getEmployeeID());
            stmt.setString(7, order.getPrescription() != null ? order.getPrescription().getPrescriptionID() : null); // Thêm prescriptionID

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
        Order_DAO order_dao = new Order_DAO();
//        System.out.println(order_dao.getTotalDue("0123456987"));
//        order_dao.getOrderList().forEach(x -> System.out.println(x));
//        System.out.println();
//        order_dao.filterOrderByEmpID("EP1501").forEach(x -> System.out.println(x));
//        System.out.println(order_dao.calculateTotalAllOrder("EP1501"));
//        order_dao.getOrderByCriterious("2024-06-08").forEach(x -> System.out.println(x));
//        System.out.println(order_dao.getRevenueByCriteria("ep1501"));
        System.out.println(order_dao.getRevenueByDateRange(LocalDate.of(2024, 06, 8), LocalDate.of(2024, 10, 8)));



    }


}
