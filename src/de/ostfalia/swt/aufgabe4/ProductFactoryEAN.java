package de.ostfalia.swt.aufgabe4;

import java.util.List;

public class ProductFactoryEAN extends ProductFactory {

	private ProductFactoryEAN() {
	}

	public static ProductFactoryEAN newInstance() {
		return new ProductFactoryEAN();
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
