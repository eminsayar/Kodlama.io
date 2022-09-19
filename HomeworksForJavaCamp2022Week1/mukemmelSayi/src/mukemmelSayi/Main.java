package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6 --> 1,2,3
		//28--> 1,2,4,7,14
		
		long number;
		long total = 0;
		
		for (number = 1; number < 1000000000; number++) {
			for (long i = 1; i < number; i++) {
				if (number % i == 0) {
					total= total + i;
				}
			}
			if ( total == number) {
				System.out.println(number + " mükemmel sayýdýr");
			}
			total = 0;
		}
		
		/*for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total= total + i;
			}
		}
		
		if ( total == number) {
			System.out.println(number + " mükemmel sayýdýr");
		}
		else {
			System.out.println(number + " mükemmel sayý deðildir");
		}*/

	}

}
