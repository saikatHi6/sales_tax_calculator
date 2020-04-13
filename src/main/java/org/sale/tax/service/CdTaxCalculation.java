package org.sale.tax.service;

import org.sale.tax.model.Product;

public class CdTaxCalculation extends TaxCalculation {

	@Override
	public Product afterTaxCalculation(Product item) {
		double afterTax = baseTaxComputation(item);
		item.setItemFinalPrice(afterTax+1.25);
		return item;
	}

}
