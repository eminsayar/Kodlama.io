package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new  ProductValidator();
		if(ProductValidator.isValid(product)) {
			System.out.println("�r�n eklendi");			
		}
		else {
			System.out.println("�r�n bilgileri ge�ersiz");
		}
	}
}
