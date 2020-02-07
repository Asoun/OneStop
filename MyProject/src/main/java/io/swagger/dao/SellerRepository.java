package io.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.Seller;



@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{

}
