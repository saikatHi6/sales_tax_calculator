package org.sale.tax.service;

import org.sale.tax.model.Product;

public class MedicalTaxCal extends TaxCalculation {

	@Override
	public Product afterTaxCalculation(Product item) {
		// TODO Auto-generated method stub
		item.setItemFinalPrice(item.getItemBasePrice());
		return item;
	}

}
