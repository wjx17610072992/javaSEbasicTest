package com.neuedu.java0816;

public class Product {
	
	
	private String proId;
	private String proName;
	private Float proPrice;
	
	
	
	// 无参数 构造器
	public Product() {
		
	}



	// 有参数 构造器
	public Product(String proId, String proName, Float proPrice) {
	
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
	}



	public String getProId() {
		return proId;
	}



	public void setProId(String proId) {
		this.proId = proId;
	}



	public String getProName() {
		return proName;
	}



	public void setProName(String proName) {
		this.proName = proName;
	}



	public Float getProPrice() {
		return proPrice;
	}



	public void setProPrice(Float proPrice) {
		this.proPrice = proPrice;
	}



	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
	
	
	
}
