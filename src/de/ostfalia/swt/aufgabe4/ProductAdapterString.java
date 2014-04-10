package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;

public class ProductAdapterString implements Product {

	private ProduktMitStringId prod;
	private int id;

	public ProductAdapterString(ProduktMitStringId prod)
			throws IllegalArgumentException {
		
		boolean magic = true;

		if (magic) { // magic working
			this.prod = prod;
			this.id = 00; // TODO Change this shit
		} else {
			throw new IllegalArgumentException();
		}
		
//		
//		for (ProduktMitStringId iterable_element : prod.getProdukte()) {
//			//berechnen
//			// wenn eindeutig magic = true ;
//		}
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
