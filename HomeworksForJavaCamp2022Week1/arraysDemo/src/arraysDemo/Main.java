package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Emin";
		ogrenciler[1] = "Ýpek";
		ogrenciler[2] = "Yasin";
		ogrenciler[3] = "Defne";
		
		
		for(int i = 0;i < ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}

		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
