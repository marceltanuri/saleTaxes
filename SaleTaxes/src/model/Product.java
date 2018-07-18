package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

	private Long id;
	private String name;
	private Double price;
	private ProductType type = ProductType.GENERAL;
	private Boolean imported = false;

	public Product(Long id, String name, Double price, ProductType type, Boolean imported) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.imported = imported;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Double getTaxes() {
		Double taxes = 0d;

		if (this.imported) {
			taxes = taxes + this.price * 0.05;
		}

		boolean isExempt = this.type == ProductType.BOOKS || this.type == ProductType.FOOD
				|| this.type == ProductType.MEDICAL;

		if (!isExempt) {
			taxes = taxes + this.price * 0.1;
		}

		return Math.ceil(taxes * 20.0) / 20.0;
	}

	public Double getFinalPrice() {
		return new BigDecimal(price + this.getTaxes()).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

	public ProductType getType() {
		return type;
	}

	public Boolean isImported() {
		return imported;
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
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}