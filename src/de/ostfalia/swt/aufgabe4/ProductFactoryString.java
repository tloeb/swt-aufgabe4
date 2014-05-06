package de.ostfalia.swt.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class ProductFactoryString extends ProductFactory {

//	

	public static ProductFactoryString newInstance() {
		return new ProductFactoryString();
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		List<ProduktMitStringId> stringProducts = ProduktMitStringId.getProdukte();
		for (ProduktMitStringId produktString : stringProducts) {
			try {
				products.add(new ProductAdapterString(produktString));
			} catch (Exception e) {
			}
			
		}
		return products;
	}

}
