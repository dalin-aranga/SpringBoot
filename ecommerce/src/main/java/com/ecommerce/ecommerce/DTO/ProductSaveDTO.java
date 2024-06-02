package com.ecommerce.ecommerce.DTO;

import java.awt.*;

public class ProductSaveDTO {
    private String name;

    private String price;

    private String description;

    private String image;

    public ProductSaveDTO( String name, String price, String description,String image) {

        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public ProductSaveDTO() {
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
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", price='" + image + '\'' +
                '}';
    }
}
