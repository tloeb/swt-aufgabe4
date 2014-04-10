package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;

public class ProductAdapterEAN implements Product {

	private ProduktMitEAN prod;

	public ProductAdapterEAN(ProduktMitEAN prod)
			throws IllegalArgumentException {

		boolean magic = true;
		if (magic) { // magic working
			this.prod = prod;
		} else {
			throw new IllegalArgumentException();
		}

	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub

		// Long ---> to Int
		return null;
	}

	@Override
	public String getDescription() {
		return prod.getDescription();
	}

	@Override
	public void setDescription(String description) {
		prod.setDescription(description);

	}

	@Override
	public BigDecimal getPrice() {
		return prod.getPrice();
	}

	@Override
	public void setPrice(BigDecimal price) {
		prod.setPrice(price);
	}
}
