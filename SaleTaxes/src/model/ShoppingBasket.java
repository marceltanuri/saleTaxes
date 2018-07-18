package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.Locale;

public class ShoppingBasket {

	private Long id;
	private Collection<Sale> sales;

	public ShoppingBasket(Long id, Collection<Sale> sales) {
		super();
		this.id = id;
		this.sales = sales;
	}

	public Long getId() {
		return id;
	}

	public Collection<Sale> getSales() {
		return sales;
	}

	public String getRecipt() {

		StringBuilder recipt = new StringBuilder();

		Double total = 0d;
		Double saleTaxes = 0d;

		for (Sale sale : this.getSales()) {
			recipt.append(sale.getQuantity() + " " + sale.getProduct().getName() + ": "
					+ formatDecimalNumber(sale.getProduct().getFinalPrice()) + "\n");

			saleTaxes = saleTaxes + sale.getSaleTaxes();
			total = total + sale.getTotal();

		}

		recipt.append("Sale Taxes: " + formatDecimalNumber(saleTaxes) + "\n");
		recipt.append("Total: " + formatDecimalNumber(total) + "\n");

		return recipt.toString();
	}

	private static String formatDecimalNumber(Double value) {
		return new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US)).format(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingBasket other = (ShoppingBasket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}