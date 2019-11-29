package com.casestudy.microservices.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.casestudy.microservices.model.Orders;
import com.casestudy.microservices.model.Repository.OrderDetailsRepository;

@Controller
public class EmployeeController {

	
	@Autowired
		private OrderDetailsRepository orderDetailsRepository;
	
    @RequestMapping(value = "/user/getOrderList", produces = "application/json")
    @ResponseBody
    public List<Orders> getEmployeesList() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	String userName = auth.getName();
    	Orders order = orderDetailsRepository.findOne(userName);
    	System.out.println("order-------------" +order.toString());
        List<Orders> orders = new ArrayList<>();
        orders.add(order);
        return orders;

    }

}