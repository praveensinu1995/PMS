package com.wells.pms.model;

public class Product {

	private int productid;
	private String productName;
	private String details;
	private double cost;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", details=" + details + ", cost="
				+ cost + "]";
	}
	
}
