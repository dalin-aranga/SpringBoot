package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.AuthDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AuthService {


    List<AuthDTO> allAuth() ;
}
