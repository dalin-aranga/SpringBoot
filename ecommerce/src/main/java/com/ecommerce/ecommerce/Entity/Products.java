package com.ecommerce.ecommerce.Entity;


import jakarta.persistence.*;

import java.awt.*;

@Entity
@Table(name = "product")
public class Products {
    @Id
    @Column(name = "product_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_id;

    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "price", length = 50)
    private String price;
    @Column(name = "description", length = 100)
    private String description;
    @Column(name = "image",columnDefinition = "TEXT")
    private String image;




    public Products(String name, String price, String description,String image) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Products() {
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", price='" + image + '\'' +
                '}';
    }
}
