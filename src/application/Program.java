package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Product;
import util.PriceUpdate;
import util.ProductPredicate;

public class Program {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(new ProductPredicate());
		//list.removeif(p -> p.getPrice() >= 100.0);
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);
		
		list.removeIf(pred);
		
		for(Product p : list) {
			System.out.println(p);
		}*/
		
		Consumer<Product> con = p -> p.setPrice(p.getPrice()*1.1);
		
		//list.forEach(new PriceUpdate());
		//list.forEach(p -> p.setPrice(p.getPrice()*1.1));
		//list.forEach(Product::updateValue);
		//list.forEach(Product::Uvalue);
		list.forEach(con);
		
		list.forEach(System.out::println);
	}
}
