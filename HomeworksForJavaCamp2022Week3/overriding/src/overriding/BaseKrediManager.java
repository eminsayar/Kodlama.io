package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

//final anahtar kelimesi kullanılırsa alt sınıflar override edemez