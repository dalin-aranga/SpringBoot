package com.ecommerce.ecommerce.ProductRepo;

import com.ecommerce.ecommerce.Entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;



@EnableJpaRepositories
@Repository
public interface CartRepo extends JpaRepository<Carts,Integer> {
}