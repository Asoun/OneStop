package io.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long > {

}
