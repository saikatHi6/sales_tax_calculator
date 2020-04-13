package org.sale.tax.client;

import org.sale.tax.service.CdTaxCalculation;
import org.sale.tax.service.MedicalTaxCal;
import org.sale.tax.service.StandardTaxCalculation;
import org.sale.tax.service.TaxCalculation;

public class TaxFactory {
	
	private TaxCalculation tC = null;
	
	public TaxCalculation getTaxInstance(String itemName){
		
		if(itemName.contains("CD")){
			tC = new CdTaxCalculation();
		}
		else if(itemName.contains("pills")){
			tC = new MedicalTaxCal();
		}
		else{
			tC = new StandardTaxCalculation();
		}
		return tC;
	}

}
