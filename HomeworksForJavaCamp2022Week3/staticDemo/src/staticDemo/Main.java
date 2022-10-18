package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Mouse";
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();

	}

}
//static ifadesi o classýn örneðni oluþturur birkere oluþturulup hep kullanýlabilir.
//direk class adýyla çaðrýlabilir
//ProductManager.add()
//yardýmcý araçlarda kullanýlýr
//Bilgi içeren nesneler için kullanýlmaz

//yapýcý bloklar newleyince çalýþýr