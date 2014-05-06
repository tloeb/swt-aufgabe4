package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;

public class ProductAdapterString implements Product {

	private ProduktMitStringId prod;
	private int id;

	public ProductAdapterString(ProduktMitStringId prod)
			throws IllegalArgumentException {

		Integer i = null;
		try {
			i = prod.getId()!= null ? Integer.parseInt(prod.getId()) : null;
		} catch (Exception e) {
		}

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
