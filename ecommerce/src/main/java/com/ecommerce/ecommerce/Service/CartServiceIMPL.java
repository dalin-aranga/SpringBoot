package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CartDTO;
import com.ecommerce.ecommerce.Entity.Carts;
import com.ecommerce.ecommerce.ProductRepo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceIMPL implements CartService {

    @Autowired
    private CartRepo cartRepo;
    @Override
    public List<CartDTO> allCartItems() {
        List<Carts>getCarts = cartRepo.findAll();
        List<CartDTO>cartDTOList = new ArrayList<>();
        for(Carts a:getCarts){
            CartDTO cartDTO = new CartDTO(
                    a.getCart_id(),
                    a.getProductName(),
                    a.getQuantity(),
                    a.getEachPrice(),
                    a.getTotal(),
                    a.getTotal()

            );
            cartDTOList.add(cartDTO);

        }
        return cartDTOList;
    }
}
