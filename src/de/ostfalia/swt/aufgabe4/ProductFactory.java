package de.ostfalia.swt.aufgabe4;

import java.util.List;

public abstract class ProductFactory {

	/**
	 *  Das Property 'product-factory' definiert den zu verwendenden Klassennamen  
	 */
	public static ProductFactory newInstance() {
		String productfactory = "";
		if ( productfactory == "SID") {
			return new ProductFactoryString();
		} else if (productfactory == "EAN") {
			return new ProductFactoryEAN();
		} else {
			return null;
		}
		// hier kommt Ihr Code rein
	}
	
	public abstract List<Product> getProducts();

}
