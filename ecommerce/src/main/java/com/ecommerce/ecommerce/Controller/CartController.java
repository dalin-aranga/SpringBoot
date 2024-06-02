package com.ecommerce.ecommerce.Controller;

import com.ecommerce.ecommerce.DTO.CartDTO;
import com.ecommerce.ecommerce.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("api/v1/ecommerce")
public class CartController {


    @Autowired
    private CartService cartService;

    @GetMapping(path = "/productCart")
    public List<CartDTO> getAllCart()
    {
        List<CartDTO>allCartItems = cartService.allCartItems();
        return  allCartItems;
    }
}
