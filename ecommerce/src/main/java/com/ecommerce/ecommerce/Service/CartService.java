package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.CartDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CartService {


     List<CartDTO> allCartItems() ;
}
