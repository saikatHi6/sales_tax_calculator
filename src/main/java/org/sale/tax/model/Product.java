package org.sale.tax.model;

public class Product {
	
	private int noOfItem;
	private String itemName;
	private double itemBasePrice;
	private double itemFinalPrice;
	
	
	
	
	public Product(int noOfItem, String itemName, double itemBasePrice) {
		super();
		this.noOfItem = noOfItem;
		this.itemName = itemName;
		this.itemBasePrice = itemBasePrice;
	}
	public int getNoOfItem() {
		return noOfItem;
	}
	public void setNoOfItem(int noOfItem) {
		this.noOfItem = noOfItem;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemBasePrice() {
		return itemBasePrice;
	}
	public void setItemBasePrice(double itemBasePrice) {
		this.itemBasePrice = itemBasePrice;
	}
	public double getItemFinalPrice() {
		return itemFinalPrice;
	}
	public void setItemFinalPrice(double itemFinalPrice) {
		this.itemFinalPrice = itemFinalPrice;
	}
	@Override
	public String toString() {
		return "Product [noOfItem=" + noOfItem + ", itemName=" + itemName + ", itemBasePrice=" + itemBasePrice
				+ ", itemFinalPrice=" + itemFinalPrice + "]";
	}
	
	
	

}
