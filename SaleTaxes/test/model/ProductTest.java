package model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void all_products_must_have_10_percent_basic_tax() {
		Product subject = new Product(9L, "imported box of chocolates", 11.25, ProductType.FOOD, true);
		assertEquals(new Double(11.85), subject.getFinalPrice());
	}

	@Test
	void food_medical_and_books_products_must_be_exempt_of_basic_tax() {
		Product subject = new Product(8L, "packet of headache pills", 9.75, ProductType.MEDICAL, false);
		assertEquals(new Double(9.75), subject.getFinalPrice());

		subject = new Product(1L, "book", 12.49, ProductType.BOOKS, false);
		assertEquals(new Double(12.49), subject.getFinalPrice());

		subject = new Product(3L, "chocolate bar", 0.85, ProductType.FOOD, false);
		assertEquals(new Double(0.85), subject.getFinalPrice());

		subject = new Product(9L, "imported box of chocolates", 11.25, ProductType.FOOD, true);
		assertEquals(new Double(11.85), subject.getFinalPrice());
	}

	@Test
	void imported_products_must_have_5_percent_importation_tax_plus_basic_tax() {
		Product subject = new Product(6L, "imported box of perfume", 27.99, ProductType.GENERAL, true);
		assertEquals(new Double(32.19), subject.getFinalPrice());
	}
}