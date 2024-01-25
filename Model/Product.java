package Model;

import java.sql.Timestamp;

public class Product {

    private int productId;
    private String productName;
    private String supplier;
    private double price;
    private int quantity;
    private int createdByUserId;
    private Timestamp createdOn;
    private Integer modifiedByUserId; // Nullable
    private Timestamp modifiedOn;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(int createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Integer getModifiedByUserId() {
        return modifiedByUserId;
    }

    public void setModifiedByUserId(Integer modifiedByUserId) {
        this.modifiedByUserId = modifiedByUserId;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Product() {
        // Default constructor
    }

    public Product(int productId, String productName, String supplier, double price, int quantity, int createdByUserId,
            Timestamp createdOn, Integer modifiedByUserId, Timestamp modifiedOn) {
        this.productId = productId;
        this.productName = productName;
        this.supplier = supplier;
        this.price = price;
        this.quantity = quantity;
        this.createdByUserId = createdByUserId;
        this.createdOn = createdOn;
        this.modifiedByUserId = modifiedByUserId;
        this.modifiedOn = modifiedOn;
    }

    
}
