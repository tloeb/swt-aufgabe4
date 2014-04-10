package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;

public class ProductAdapterString implements Product {

	private ProduktMitStringId prod;
	private int id;

	// throws IllegalArgumentException { }
	public ProductAdapterString(ProduktMitStringId prod)
			throws IllegalArgumentException {
		
		boolean magic = true;
		
		for (ProduktMitStringId iterable_element : prod.getProdukte()) {
			//berechnen
			// wenn eindeutig magic = true ;
		}
		if (magic) { // magic working
			
			int prüfsumme = 0;
			
			
			;
			
		/**
		 * mit der liste alle nummer berechnen 
		 * falls doppelt --> fuck mueller's mom
		 */
			this.prod = prod;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Integer getId() {
		// TODO String ---> to Int
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
