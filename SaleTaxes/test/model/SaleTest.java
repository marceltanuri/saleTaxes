package model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SaleTest {

	@Test
	void must_compute_the_total_price_based_on_the_quantity() {
		Product product = new Product(9L, "imported box of chocolates", 11.25, ProductType.FOOD, true);
		Sale subject = new Sale(1L, product, 2L);
		assertEquals(new Double(23.7), subject.getTotal());
	}

	@Test
	void must_compute_the_total_cost_of_taxes_based_on_the_quantity() {
		Product product = new Product(9L, "imported box of chocolates", 11.25, ProductType.FOOD, true);
		Sale subject = new Sale(1L, product, 2L);
		assertEquals(new Double(1.2), subject.getSaleTaxes());
	}
}