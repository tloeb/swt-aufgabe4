package de.ostfalia.swt.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class ProductFactoryEAN extends ProductFactory {


	public static ProductFactoryEAN newInstance() {
		return new ProductFactoryEAN();
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		List<ProduktMitEAN> eanProducts = ProduktMitEAN.getProdukte();
		for (ProduktMitEAN produktMitEAN : eanProducts) {
			try {
				products.add(new ProductAdapterEAN(produktMitEAN));
			} catch (Exception e) {
			}
			
		}
		return products;
	}

}
