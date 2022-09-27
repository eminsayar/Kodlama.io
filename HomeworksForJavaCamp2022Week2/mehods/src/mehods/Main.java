package mehods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 20;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayý mevcuttur: " + aranacak;
			mesajVer(mesaj);
		}
		else {
			System.out.println(aranacak + " mevcut deðildir.");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
