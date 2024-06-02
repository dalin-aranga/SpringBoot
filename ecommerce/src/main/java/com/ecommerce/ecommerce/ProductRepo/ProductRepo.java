package com.ecommerce.ecommerce.ProductRepo;


import com.ecommerce.ecommerce.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {
}
