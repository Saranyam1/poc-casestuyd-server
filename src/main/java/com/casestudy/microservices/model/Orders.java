package com.casestudy.microservices.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	private String username;
    private String orderid;
    private String model;
    private String orderdate;
    
    public Orders() {
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "Orders [username=" + username + ", orderid=" + orderid + ", model=" + model + ", orderdate=" + orderdate
				+ "]";
	}


}