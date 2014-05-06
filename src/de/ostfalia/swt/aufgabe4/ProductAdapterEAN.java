package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;

public class ProductAdapterEAN implements Product {

	private ProduktMitEAN prod;
	private int id;

	public ProductAdapterEAN(ProduktMitEAN prod)
			throws IllegalArgumentException {

		Integer i = prod.getEan()!= null ? prod.getEan().intValue() : null;
	    if (i == null || i == 0) {
	        throw new IllegalArgumentException();
	    } else {
	    	this.id = i;
	    	this.prod = prod;
	    }
	}

	@Override
	public Integer getId() {
		return id;
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
