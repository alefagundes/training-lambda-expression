package entities;

public class Product {
	 private String name;
	 private Double price;
	 
	 public Product() {
		 
	 }
	 public Product(String name, Double price) {
		 this.price = price;
		 this.name = name;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	 
	 public String toString() {
		 return "Product name: " + name + ", price: " + String.format("%.2f", price);
	 }
	 
	 public static boolean staticProductPredicate(Product p) {
		 return p.getPrice() >= 100.0;
	 }
	 
	 public boolean nonStaticProductPredicate() {
		 return price >= 100.0;
	 }
 
 
}
