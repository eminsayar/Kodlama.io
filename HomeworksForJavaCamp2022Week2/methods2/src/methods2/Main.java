package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bug�n hava �ok g�zel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 6);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("G�ncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
