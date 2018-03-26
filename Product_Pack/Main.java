package Product_Pack;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Names List");
		List<String> names = List.of("Names 1", "Names 2", "Names 3");
		names.forEach(name -> {
			System.out.print(name + " ");
		});
		System.out.println("\n\n Sources List");
		List<Double> scores = List.of(5.4, 7.8, 8.5, 9.2);
		scores.forEach(score -> {
			System.out.print(score + " ");
		});
		System.out.println("\n\n Product List");
		List<Product> products = List.of(
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

