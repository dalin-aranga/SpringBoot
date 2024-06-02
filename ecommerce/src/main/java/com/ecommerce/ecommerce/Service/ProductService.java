package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.ProductDTO;
import com.ecommerce.ecommerce.DTO.ProductSaveDTO;
import com.ecommerce.ecommerce.DTO.ProductUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    String addCustomer(ProductSaveDTO productSaveDTO);

    List<ProductDTO> getAllProducts();

    String updateProduct(ProductUpdateDTO productUpdateDTO);

    boolean deleteCustomer(int product_id);


    List<ProductDTO> getProductsById(int product_id);
}
