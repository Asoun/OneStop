package io.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.PaymentDetails;

@Repository
public interface PaymentDetailsRpositoory extends JpaRepository<PaymentDetails,Long>{

}
