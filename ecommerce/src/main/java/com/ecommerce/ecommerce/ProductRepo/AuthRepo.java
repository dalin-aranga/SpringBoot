package com.ecommerce.ecommerce.ProductRepo;

import com.ecommerce.ecommerce.Entity.LoginAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;



@EnableJpaRepositories
@Repository
public interface AuthRepo extends JpaRepository<LoginAuth,Integer> {
}