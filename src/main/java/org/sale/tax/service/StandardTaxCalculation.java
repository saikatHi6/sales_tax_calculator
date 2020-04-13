package org.sale.tax.service;

import org.sale.tax.model.Product;

public class StandardTaxCalculation extends TaxCalculation {

	@Override
	public Product afterTaxCalculation(Product item) {
		double afterTax = baseTaxComputation(item);
		item.setItemFinalPrice(afterTax);
		return item;
	}

}
