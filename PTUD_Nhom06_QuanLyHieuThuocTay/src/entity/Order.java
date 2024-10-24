package entity;

import dao.Order_DAO;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private String orderID;
    private LocalDate orderDate;
    private String shipToAddress;

    private Enum_PaymentMethod paymentMethod;
    private Employee employee;
    private Customer customer;
    private Prescription prescription;
    /**
     * Theo luật thì thuế đối với thuốc và thực phẩm chức năng là 5%
     *               thuế đối với thực phẩm chức năng là 10%
     *
     *  totalDue và totalLine hk cần xử lý ở giao diện, có trigger ở csdl r á
     */
    public Order() {
    }

    public Order(String orderID) {
        setOrderID(orderID);
    }

    public Order(String orderID, LocalDate orderDate, String shipToAddress, Enum_PaymentMethod paymentMethod, Employee employee, Customer customer, Prescription prescription) {
        setOrderID(orderID);
        setOrderDate(orderDate);
        this.shipToAddress = shipToAddress;
        this.paymentMethod = paymentMethod;
        this.employee = employee;
        this.customer = customer;
        this.prescription = prescription;
    }

    public double getToTalDue(){
        Order_DAO order_dao = new Order_DAO();
        double totalDue = order_dao.getTotalDue(orderID);
        return totalDue;

    }
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        if (orderID == null || orderID.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã hóa đơn không được rỗng");
        }
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        if (orderDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngày lập háo đơn phải nhỏ hơn ngày hiện tại");
        }
        this.orderDate = orderDate;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enum_PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Enum_PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
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
        final Order other = (Order) obj;
        return Objects.equals(this.orderID, other.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", orderDate=" + orderDate +
                ", shipToAddress='" + shipToAddress + '\'' +
                ", paymentMethod=" + paymentMethod +
                ", totalDue= " + getToTalDue() +
                ", employee=" + employee.getEmployeeID()+
                ", customer=" + customer.getPhoneNumber() +
                ", prescription=" + prescription.getPrescriptionID() +
                '}';
    }
}
