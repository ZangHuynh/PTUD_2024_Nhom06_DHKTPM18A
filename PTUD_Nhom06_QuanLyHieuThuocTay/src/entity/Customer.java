package entity;

import dao.Order_DAO;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
    private String phoneNumber;
    private String customerName;
    private boolean gender;
    private String email ;
    private String addr;
    private LocalDate brithDate;

    public Customer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public Customer(String phoneNumber, String customerName, boolean gender, String email, String addr, LocalDate brithDate) {
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.gender = gender;
        this.email = email;
        this.addr = addr;
        this.brithDate = brithDate;
    }

    public double point() {
        Order_DAO order_dao = new Order_DAO();
        double totalDue = order_dao.getTotalDue(phoneNumber);
        return totalDue;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã khách hàng không được rỗng");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên khách hàng không được rỗng");
        }
        this.customerName = customerName;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }


    public void setBrithDate(LocalDate brithDate) {
        if (brithDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngày sinh phải nhỏ hơn ngày hiện tại");
        }
        this.brithDate = brithDate;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        return Objects.equals(this.phoneNumber, other.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ",sex=" + gender + '\'' +
                ", brithDate=" + brithDate +
                ", email='" + email + '\'' +
                ", point=" + point() +
                ", address='" + addr + '\'' +
                '}';
    }
}
