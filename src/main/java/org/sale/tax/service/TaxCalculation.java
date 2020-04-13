package org.sale.tax.service;

import org.sale.tax.model.Product;

public abstract class TaxCalculation {

	protected double baseTaxComputation(Product product){
		return product.getItemBasePrice() + product.getItemBasePrice()*0.176;
	}
	
	public abstract Product afterTaxCalculation(Product item);
	
}
