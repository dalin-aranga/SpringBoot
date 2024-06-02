package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Entity.Products;
import com.ecommerce.ecommerce.DTO.ProductDTO;
import com.ecommerce.ecommerce.DTO.ProductSaveDTO;
import com.ecommerce.ecommerce.DTO.ProductUpdateDTO;
import com.ecommerce.ecommerce.ProductRepo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceIMPL implements ProductService{
    @Autowired
    private ProductRepo productRepo;
    @Override
    public String addCustomer(ProductSaveDTO productSaveDTO) {
        Products product = new Products(
                productSaveDTO.getName(),
                productSaveDTO.getPrice(),
                productSaveDTO.getDescription(),
                productSaveDTO.getImage()

        );
        productRepo.save(product);
        return  product.getName();

    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Products>getProducts = productRepo.findAll();
        List<ProductDTO>productDTOList = new ArrayList<>();
        for(Products a:getProducts){
            ProductDTO productDTO = new ProductDTO(
                    a.getProduct_id(),
                    a.getName(),
                    a.getPrice(),
                    a.getDescription(),
                    a.getImage()
            );
            productDTOList.add(productDTO);

        }
        return productDTOList;
    }

    @Override
    public String updateProduct(ProductUpdateDTO productUpdateDTO) {
        if (productRepo.existsById(productUpdateDTO.getProduct_id())){
            Products product = productRepo.getById(productUpdateDTO.getProduct_id());
            product.setName(productUpdateDTO.getName());
            product.setPrice(productUpdateDTO.getPrice());
            product.setDescription(productUpdateDTO.getDescription());
            product.setImage(productUpdateDTO.getImage());
            productRepo.save(product);
        }
        else {
            System.out.printf("Product Not there");
        }
        return null;
    }

    @Override
    public boolean deleteCustomer(int product_id) {
        if(productRepo.existsById(product_id)){
            productRepo.deleteAllById(Collections.singleton(product_id));
        }
        else {
            System.out.printf("Product Delete Failed");

        }
        return true;
    }

    @Override
    public List<ProductDTO> getProductsById(int product_id) {
        List<Products>getProducts = productRepo.findAll();
        List<ProductDTO>productDTOList = new ArrayList<>();
        for(Products a:getProducts){
            if(a.getProduct_id()==product_id){
                ProductDTO productDTO = new ProductDTO(
                        a.getProduct_id(),
                        a.getName(),
                        a.getPrice(),
                        a.getDescription(),
                        a.getImage()
                );
                productDTOList.add(productDTO);
            }



        }
        return productDTOList;
    }
}
