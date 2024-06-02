package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.AuthDTO;
import com.ecommerce.ecommerce.Entity.LoginAuth;
import com.ecommerce.ecommerce.ProductRepo.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthServiceIMPL implements AuthService {

    @Autowired
    private AuthRepo authRepo;
    @Override
    public List<AuthDTO> allAuth() {
        List<LoginAuth>getAuth = authRepo.findAll();
        List<AuthDTO>authDTOList = new ArrayList<>();
        for(LoginAuth a:getAuth){
            AuthDTO authDTO = new AuthDTO(

                    a.getLogin_id(),
                    a.getEmail(),
                    a.getPassword(),
                    a.getRole()


            );
            authDTOList.add(authDTO);

        }
        return authDTOList;
    }
}
