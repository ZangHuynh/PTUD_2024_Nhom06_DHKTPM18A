package entity;

import java.util.Objects;

public class Product {
    private String productID;
    private String productName;
    private String registrationNumber;
    private int quantityInStock;
    private double purchasePrice;
    private double taxPercentage;

    private Promotion promotion;
    private Vendor vendor;
    private Category category;

    public Product() {
    }

    public Product(String productID) {
        setProductID(productID);
    }

    public Product(String productID, String productName, String registrationNumber, int quantityInStock, double purchasePrice, double taxPercentage, Vendor vendor, Category category, Promotion promotion) {
        setProductID(productID);
        setProductName(productName);
        setRegistrationNumber(registrationNumber);
        setPurchasePrice(purchasePrice);
        setQuantityInStock(quantityInStock);
        setTaxPercentage(taxPercentage);
        this.promotion = promotion;
        this.vendor = vendor;
        this.category = category;
    }

    public double getSellPrice() {
        if (purchasePrice >= 5000 && purchasePrice < 100000) {
            return purchasePrice + 0.1 * purchasePrice + taxPercentage * purchasePrice;
        } else if (purchasePrice >= 100000 && purchasePrice < 1000000) {
            return purchasePrice + 0.07 * purchasePrice + taxPercentage * purchasePrice;
        } else {
            return purchasePrice + 0.05 * purchasePrice + taxPercentage * purchasePrice;
        }
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        if (productID == null || productID.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã sản phẩm không được rỗng");
        }
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được rỗng");
        }
        this.productName = productName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã đăng ký không được rỗng");
        }
        this.registrationNumber = registrationNumber;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Số lượng tồn kho phải lớn hơn 0");
        }
        this.quantityInStock = quantityInStock;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (purchasePrice < 0) {
            throw new IllegalArgumentException("Giá nhập của sản phẩm phải lớn hơn 0");
        }
        this.purchasePrice = purchasePrice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
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
        final Product other = (Product) obj;
        return Objects.equals(this.productID, other.productID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", purchasePrice=" + purchasePrice +
                ", sellPrice=" + getSellPrice() +
                ", taxPercentage=" + taxPercentage +
                ", vendor=" + vendor +
                ", category=" + category +
                ", promotion=" + promotion +
                '}';
    }
}
