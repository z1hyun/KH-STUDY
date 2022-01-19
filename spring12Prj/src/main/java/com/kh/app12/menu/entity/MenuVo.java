package com.kh.app12.menu.entity;

public class MenuVo {
	
	private String menu;
	private String price;
	
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MenuVo [menu=" + menu + ", price=" + price + "]";
	}
	
	
}
