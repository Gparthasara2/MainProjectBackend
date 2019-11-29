package com.model;

import org.springframework.data.annotation.Id;

public class OrderModel {

	@Id
	private String id;
	private String rqstName;
	private String svcName;
	private int quantity;
	private double price;
	private String bName;
	private String spName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRqstName() {
		return rqstName;
	}

	public void setRqstName(String rqstName) {
		this.rqstName = rqstName;
	}

	public String getSvcName() {
		return svcName;
	}

	public void setSvcName(String svcName) {
		this.svcName = svcName;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

}
