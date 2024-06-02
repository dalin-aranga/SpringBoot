package com.ecommerce.ecommerce.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class Carts {
    @Id
    @Column(name = "cart_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cart_id;

    @Column(name = "productName", length = 50)
    private String productName;

    @Column(name = "quantity", length = 50)
    private int quantity;

    @Column(name = "eachPrice", length = 50)
    private double eachPrice;

    @Column(name = "total", length = 50)
    private double total;
    @Column(name = "subTotal", length = 50)
    private double subTotal;

    public Carts(int cart_id, String productName, int quantity, double eachPrice, double total, double subTotal) {
        this.cart_id = cart_id;
        this.productName = productName;
        this.quantity = quantity;
        this.eachPrice = eachPrice;
        this.total = total;
        this.subTotal = subTotal;
    }

    public Carts() {
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
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
}
