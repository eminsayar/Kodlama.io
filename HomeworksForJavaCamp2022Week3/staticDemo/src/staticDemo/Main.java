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
//static ifadesi o class�n �rne�ni olu�turur birkere olu�turulup hep kullan�labilir.
//direk class ad�yla �a�r�labilir
//ProductManager.add()
//yard�mc� ara�larda kullan�l�r
//Bilgi i�eren nesneler i�in kullan�lmaz

//yap�c� bloklar newleyince �al���r