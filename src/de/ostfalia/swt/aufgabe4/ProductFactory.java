package de.ostfalia.swt.aufgabe4;

import java.util.List;

public abstract class ProductFactory {

	// Ich wette man kann den ServiceLoader dafuer benutzen....
	/**
	 * Das Property 'product-factory' definiert den zu verwendenden Klassennamen
	 */
	public static ProductFactory newInstance() {
		try {
			String factoryType = System.getProperty("product-factory");
			if(factoryType != null) {
				Class<?> productClass = Class.forName(factoryType);
				return (ProductFactory)productClass.newInstance();	
			} else {
				return null;
			}
			
		} catch (NullPointerException |ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
			e.printStackTrace();
			return null;
		}
		
	}

	public abstract List<Product> getProducts();

}
