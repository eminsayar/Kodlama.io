package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WomanGameCalculator womanCalculator = new WomanGameCalculator();
		womanCalculator.hesapla();
		womanCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
//abstract sınıflar newlenemez