package entity;

public enum Enum_PaymentMethod {
    CASH("CASH"), BANK_TRANSFER("BANK TRANSFER");
    private String paymentMethod;

    Enum_PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return paymentMethod;
    }
}
