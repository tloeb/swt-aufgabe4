/**
 * 
 */
package de.ostfalia.swt.aufgabe4.test;

import static org.junit.Assert.*;
import org.junit.Test;
import de.ostfalia.swt.aufgabe4.ProductFactory;
import de.ostfalia.swt.aufgabe4.ProductFactoryEAN;
import de.ostfalia.swt.aufgabe4.ProductFactoryString;

/**
 * @author sirmonkey
 * 
 */
public class ProductFactoryTest {

	Class<ProductFactoryEAN> ean = ProductFactoryEAN.class;
	Class<ProductFactoryString> sid = ProductFactoryString.class;
	String[] factories = { ean.getName(), sid.getName() };

	/**
	 * Test method for
	 * {@link de.ostfalia.swt.aufgabe4.ProductFactory#newInstance()}.
	 */
	@Test
	public void testNewInstance() {
		
		ProductFactory factory = ProductFactory.newInstance();
		assertNull("Property was set!", factory);
		
		System.setProperty("product-factory", "qweqw");
		assertNull("Last Property should be unknown!", factory);
		
		for (String factoryType : factories) {
			System.setProperty("product-factory", factoryType);
			System.out.println(factoryType);
			factory = ProductFactory.newInstance();
			String factoryName = factory.getClass().getName();
			assertEquals("The Factory should be " + factoryType + "it was "
					+ factoryName, factoryName, factoryType);
		}
	}

	/**
	 * Test method for
	 * {@link de.ostfalia.swt.aufgabe4.ProductFactory#getProducts()}.
	 */
	@Test
	public void testGetProducts() {
		fail("Not yet implemented");
	}

}
