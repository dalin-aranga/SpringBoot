package com.ecommerce.ecommerce.Controller;
//import com.ecommerce.ecommerce.config.JwtUtil;
import com.ecommerce.ecommerce.DTO.AuthDTO;
import com.ecommerce.ecommerce.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("api/v1/ecommerce")
public class AuthController {


    @Autowired
    private AuthService authService;

    @GetMapping(path = "/auth")
    public List<AuthDTO> getAllAuth()
    {
        List<AuthDTO>allAuth = authService.allAuth();
        return  allAuth;
    }
}
