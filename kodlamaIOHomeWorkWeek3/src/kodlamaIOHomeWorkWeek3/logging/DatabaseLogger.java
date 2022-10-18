package kodlamaIOHomeWorkWeek3.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Veri tabanýna gönderildi : " + data);
		
	}

}
