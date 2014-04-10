package de.ostfalia.swt.aufgabe4;

import java.util.List;

public abstract class ProductFactory {

	/**
	 * Das Property 'product-factory' definiert den zu verwendenden Klassennamen
	 */
	public static ProductFactory newInstance() {
		String factoryType = System.getProperty("product-factory");
		Class<ProductFactoryEAN> ean = ProductFactoryEAN.class;
		Class<ProductFactoryString> sid = ProductFactoryString.class;
		if (factoryType == ean.getName()) {
			return ProductFactoryEAN.newInstance();
		} else if (factoryType == sid.getName()) {
			return ProductFactoryString.newInstance();
		} else {
			return null;
		}
	}

	public abstract List<Product> getProducts();

}
