package com.ecommerce.ecommerce.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.awt.*;

public class ProductDTO {

    private int product_id;
    private String name;

    private String price;

    private String description;
    private String image;

    public ProductDTO(int product_id, String name, String price, String description,String image) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image=image;
    }

    public ProductDTO() {
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
        this.image = image;
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
        return "ProductDTO{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
