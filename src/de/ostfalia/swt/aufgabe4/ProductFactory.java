package de.ostfalia.swt.aufgabe4;

import java.util.List;

public abstract class ProductFactory {
	
	public static ProductFactory newInstance() {
		return null;
	}

	public abstract List<Product> getProducts();
}
