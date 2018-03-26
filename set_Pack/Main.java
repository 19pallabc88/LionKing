package set_Pack;

import java.util.Set;

import Product_Pack.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("Names List");
		Set<String> names = Set.of("Names 1", "Names 2", "Names 3");
		names.forEach(name -> {
			System.out.print(name + " ");
		});
		System.out.println("\n\n Sources List");
		Set<Double> scores = Set.of(5.4, 7.8, 8.5, 9.2);
		scores.forEach(score -> {
			System.out.print(score + " ");
		});
		System.out.println("\n\n Product List");
		Set<Product> products = Set.of(
				new Product("p01", "name 1", 20),
				new Product("p02", "name 2", 21),
				new Product("p03", "name 3", 22)
		);
		products.forEach(p -> {
			System.out.print("Id: " + p.getId());
			System.out.print("Name: " + p.getName());
			System.out.print("Price: " + p.getPrice());
			System.out.print(" ========= ");
		});
		
	}
	

}
