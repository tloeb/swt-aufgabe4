package de.ostfalia.swt.aufgabe4;

import java.util.List;

public class ProductFactoryString extends ProductFactory {

	private ProductFactoryString() {
	}

	public static ProductFactoryString newInstance() {
		return new ProductFactoryString();
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
