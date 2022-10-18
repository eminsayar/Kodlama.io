package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yapýcý blok çalýþtý");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static class BaskaBirClass { // inner class
		public static void sil() {
			
		}
	}
}
//classý static yapýnca içindeki herþey static olur
//Ana class static olamaz ama içindeki classlar static olabilir