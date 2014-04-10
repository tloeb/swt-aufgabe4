package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;
import java.util.List;

public class ProduktMitEAN {
	private Long ean;
	private String description;
	private BigDecimal price;

	public static List<ProduktMitEAN> getProdukte() {
		return null;
	}
	
	
	// Getter fund Setter

	public Long getEan() {
		return ean;
	}

	public void setEan(Long ean) {
		this.ean = ean;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
