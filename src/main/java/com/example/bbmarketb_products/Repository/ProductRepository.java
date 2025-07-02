package com.example.bbmarketb_products.Repository;


import com.example.bbmarketb_products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
