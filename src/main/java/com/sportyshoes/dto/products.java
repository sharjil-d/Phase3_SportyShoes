package com.sportyshoes.dto;

public class products {
	private int sno;
	private String brand;
	private String type;
	private String color;
	private int size;
	public products(int sno,String brand, String type, String color, int size) {
		super();
		this.sno=sno;
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "products [sno=" + sno + ", brand=" + brand + ", type=" + type + ", color=" + color + ", size=" + size
				+ "]";
	}
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
