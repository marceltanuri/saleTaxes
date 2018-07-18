package app;

import java.util.Collection;

import model.ShoppingBasket;
import repository.ShoppingBasketsRepositoryMock;

public class App {

	public static void main(String[] args) {
		Collection<ShoppingBasket> shoppingBaskets = ShoppingBasketsRepositoryMock.findAll();
		for (ShoppingBasket shoppingBasket : shoppingBaskets) {
			System.out.println("Output: " + shoppingBasket.getId());
			System.out.println(shoppingBasket.getRecipt());
		}
	}
}