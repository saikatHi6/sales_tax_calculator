package org.sale.tax.test;

import org.junit.Test;
import org.sale.tax.client.ShoppingCart;

import junit.framework.TestCase;

public class TaxCalculationTest extends TestCase{

	ShoppingCart sc = new ShoppingCart();
	
	@Test
	public void testCalculation1(){
		sc.add(1, "book", 29.49);
		sc.add(1, "music CD", 15.99 );
		sc.add(1, "chocolate snack", 0.75);
		sc.display();
		sc.getList();
		sc.clean();
	}
	
	@Test
	public void testCalculation2(){
		sc.add(1, "bottle of wine", 20.99 );
		sc.add(1, "box of tooth ache pills",4.15 );
		sc.add(1, "box of pins", 11.25  );
		sc.add(1, "music CD", 14.99 );
		sc.display();
		sc.getList();
		sc.clean();
	}
	
}
