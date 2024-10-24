package entity;

import java.util.Objects;

public class OrderDetails {
    private int orderQuantity;

    private Order order;
    private Product product;

    public OrderDetails() {
    }

    public OrderDetails(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public OrderDetails(int orderQuantity, Order order, Product product) {
        setOrderQuantity(orderQuantity);
        this.order = order;
        this.product = product;
    }

    public double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        if(orderQuantity <= 0){
            throw new IllegalArgumentException("Số lượng sản phẩm phai lớn hơn 0");
        }
        this.orderQuantity = orderQuantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getLineTotal(){
        return product.getSellPrice() * orderQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderQuantity=" + orderQuantity +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
