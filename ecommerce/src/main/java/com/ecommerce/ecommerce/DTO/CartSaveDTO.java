package com.ecommerce.ecommerce.DTO;

public class CartSaveDTO {
    private int car;
    private String productName;
    private int quantity;


    private double eachPrice;


    private double total;

    private double subTotal;

    public CartSaveDTO(String productName, int quantity, double eachPrice, double total, double subTotal) {

        this.productName = productName;
        this.quantity = quantity;
        this.eachPrice = eachPrice;
        this.total = total;
        this.subTotal = subTotal;
    }

    public CartSaveDTO() {
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getEachPrice() {
        return eachPrice;
    }

    public void setEachPrice(double eachPrice) {
        this.eachPrice = eachPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    @Override
    public String toString() {
        return "CartDTO{" +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", eachPrice=" + eachPrice +
                ", total=" + total +
                ", subTotal=" + subTotal +
                '}';
    }
}
