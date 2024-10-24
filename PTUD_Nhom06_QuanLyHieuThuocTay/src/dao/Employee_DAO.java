package dao;

import database.ConnectDB;
import entity.Account;
import entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import static java.sql.Date.valueOf;

public class Employee_DAO {
    public Employee_DAO() {
    }

    /**
     * lấy danh sách tất cả nhân viên
     *
     * @return listEmp : ArrayList<Employee>
     */
    public ArrayList<Employee> getListEmployee() {
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Employee> empList = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("SELECT * FROM Employee");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String empID = rs.getString(1);
                String empName = rs.getString(2);
                String phoneNumber = rs.getString(3);
                LocalDate brithDate = rs.getDate(4).toLocalDate();
                Account acc = new Account(rs.getString(5));

                Employee emp = new Employee(empID, empName, phoneNumber, brithDate, acc);
                empList.add(emp);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return empList;

    }

    public boolean addEmployee(Employee employee) {
        Connection con = ConnectDB.getInstance().getConnection();
        String sql = "INSERT INTO Employee(employeeID, employeeName, phoneNumber, birthDate, accountID) VALUES (?, ?, ?, ?, ?)";
        int n = 0;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, employee.getEmployeeID());
            stmt.setString(2, employee.getEmployeeName());
            stmt.setString(3, employee.getPhoneNumber());
            stmt.setDate(4, valueOf(employee.getBirthDate()));
            stmt.setString(5, employee.getAccount().getAccountID());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public boolean deleteEmployee(String employeeID) {
        Connection con = ConnectDB.getInstance().getConnection();
        String sql = "DELETE FROM Employee WHERE employeeID = ?";
        int n = 0;

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, employeeID); // Thiết lập employeeID vào câu lệnh DELETE

            int rowsDeleted = stmt.executeUpdate();
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n > 0;
    }

    public boolean updateEmployee(Employee employee) {
        Connection con = ConnectDB.getInstance().getConnection();
        String sql = "UPDATE Employee SET employeeName = ?, phoneNumber = ?, birthDate = ? WHERE employeeID = ?";
        int n = 0;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, employee.getEmployeeName());
            stmt.setString(2, employee.getPhoneNumber());
            stmt.setDate(3, valueOf(employee.getBirthDate()));
            stmt.setString(4, employee.getEmployeeID());

            n = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return n > 0;
    }

    /**
     * Lọc nhân viên theo tiêu chí bất kỳ
     *
     * @param criterious
     * @return empByCriList : ArrayList<Employee>
     */
    public ArrayList<Employee> getEmployeeByCriterious(String criterious) {
        Connection con = ConnectDB.getInstance().getConnection();
        ArrayList<Employee> empByCriList = new ArrayList<>();
        ArrayList<Employee> empList = getListEmployee();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDateCriteria = null;

        try {
            birthDateCriteria = LocalDate.parse(criterious, dateFormatter);
        } catch (DateTimeParseException e) {

        }
        for (Employee emp : empList) {
            if (emp.getEmployeeID().toLowerCase().contains(criterious) ||
                    emp.getEmployeeName().toLowerCase().contains(criterious) ||
                    (birthDateCriteria != null && emp.getBirthDate().equals(birthDateCriteria)) ||
                    emp.getPhoneNumber().contains(criterious) ||
                    emp.getAccount().getAccountID().contains(criterious)) {
                empByCriList.add(emp);
            }
        }
        return empByCriList;
    }

    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        Employee_DAO emp_dao = new Employee_DAO();
//        Account acc = new Account("EP0302");
//        Employee emp = new Employee("EP0302", "Hồ Quang Nhân", "0399754203", LocalDate.of(1999,07,19), acc);
//        emp_dao.deleteEmployee("EP0000");
//        emp_dao.updateEmployee(emp);
        emp_dao.getListEmployee().forEach(x -> System.out.println(x));
//        emp_dao.getEmployeeByCriterious("quang nhân").forEach(x -> System.out.println(x));

    }

}
