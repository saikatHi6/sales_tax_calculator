package org.sale.tax.client;

import java.util.ArrayList;
import java.util.List;

import org.sale.tax.model.Product;
import org.sale.tax.service.TaxCalculation;

public class ShoppingCart {

	List<Product> items = new ArrayList<Product>();
	
	
	
	public void add(int noOfItem,String itemName,double price){
		Product item = new Product(noOfItem,itemName,price);
		items.add(item);
	}
	
	public void display() {
		TaxFactory tf = new TaxFactory();
		double total = 0;
		for (Product product : items) {
			TaxCalculation taxCal = tf.getTaxInstance(product.getItemName());
			product  = taxCal.afterTaxCalculation(product);
			total = total + product.getItemFinalPrice();
			System.out.println(product);
		}
		
		System.out.println(total);
	}
	
	public List<Product> getList(){
		return items;
	}
	
	
	public void clean(){
		items = new ArrayList<Product>();
	}
	
}
