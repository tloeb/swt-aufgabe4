package de.ostfalia.swt.aufgabe4;

import java.math.BigDecimal;
import java.util.List;

public class ProduktMitStringId {
	private String id;
	private String description;
	private BigDecimal price;

	public static List<ProduktMitStringId> getProdukte() {
		return null;
	}
	
	
	// Getter und Setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
