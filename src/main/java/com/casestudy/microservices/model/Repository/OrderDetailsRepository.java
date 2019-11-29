package com.casestudy.microservices.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.microservices.model.Orders;

@Repository
public interface OrderDetailsRepository extends JpaRepository<Orders, String>{

}
