package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String phoneNumber;
    private LocalDate birthDate;

    private Account account;

    public Employee() {
    }

    public Employee(String employeeID) {
        setEmployeeID(employeeID);
    }

    public Employee(String employeeID, String employeeName, String phoneNumber, LocalDate birthDate, Account account) {
        setEmployeeID(employeeID);
        setEmployeeName(employeeName);
        setPhoneNumber(phoneNumber);
        setBirthDate(birthDate); //TODO: need update, chưa mô tả tuổi nhân viên từ bao nhiêu ts bao nhiêu
        setAccount(account);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if(employeeID == null || employeeID.trim().isEmpty()){
            throw new IllegalArgumentException("Mã nhân viên không được rỗng");
        }
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if(employeeName == null || employeeName.trim().isEmpty()){
            throw new IllegalArgumentException("Tên nhân viên không được rỗng");
        }
        this.employeeName = employeeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Số điện thoại không được rỗng");
        }
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        final Employee other = (Employee) obj;
        return Objects.equals(this.employeeID, other.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
