package com.ecommerce.ecommerce.Controller;

import com.ecommerce.ecommerce.Service.ProductService;
import com.ecommerce.ecommerce.DTO.ProductDTO;
import com.ecommerce.ecommerce.DTO.ProductSaveDTO;
import com.ecommerce.ecommerce.DTO.ProductUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/ecommerce")
public class productController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/save")

    public String saveProduct(@RequestBody ProductSaveDTO productSaveDTO)
    {
        String id = productService.addCustomer(productSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllProducts")
    public List<ProductDTO> getAllProducts()
    {
        List<ProductDTO>allProducts = productService.getAllProducts();
        return  allProducts;
    }

    @GetMapping(path = "/getProductById/{product_id}")
    public List<ProductDTO> getProductById(@PathVariable("product_id") int product_id) {
        List<ProductDTO>Product = productService.getProductsById( product_id);

        return Product;
    }

    @PostMapping(path = "/update")
    public String updateProduct(@RequestBody ProductUpdateDTO productUpdateDTO)
    {
        String id = productService.updateProduct(productUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/delete/{product_id}")
    public String deleteProduct(@PathVariable(value = "product_id") int product_id )
    {
        System.out.printf("Deleteeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
       boolean deleteProduct = productService.deleteCustomer(product_id);
       return "Deleted";
    }
}
