package repository;

import java.util.Arrays;
import java.util.Collection;

import model.Product;
import model.ProductType;
import model.Sale;
import model.ShoppingBasket;

public class ShoppingBasketsRepositoryMock {

	public static Collection<ShoppingBasket> findAll() {
		ShoppingBasket shoppingCart1 = new ShoppingBasket(1L,
				Arrays.asList(new Sale(1L, new Product(1L, "book", 12.49, ProductType.BOOKS, false), 1L),
						new Sale(2L, new Product(2L, "music CD", 14.99, ProductType.GENERAL, false), 1L),
						new Sale(3L, new Product(3L, "chocolate bar", 0.85, ProductType.FOOD, false), 1L)));

		ShoppingBasket shoppingCart2 = new ShoppingBasket(2L, Arrays.asList(
				new Sale(4L, new Product(4L, "imported box of chocolates", 10.00, ProductType.FOOD, true), 1L),
				new Sale(5L, new Product(5L, "imported bottle of perfume", 47.50, ProductType.GENERAL, true), 1L)));

		ShoppingBasket shoppingCart3 = new ShoppingBasket(3L, Arrays.asList(
				new Sale(6L, new Product(6L, "imported box of perfume", 27.99, ProductType.GENERAL, true), 1L),
				new Sale(7L, new Product(7L, "bottle of perfume", 18.99, ProductType.GENERAL, false), 1L),
				new Sale(8L, new Product(8L, "packet of headache pills", 9.75, ProductType.MEDICAL, false), 1L),
				new Sale(9L, new Product(9L, "imported box of chocolates", 11.25, ProductType.FOOD, true), 1L)));

		return Arrays.asList(shoppingCart1, shoppingCart2, shoppingCart3);
	}
}