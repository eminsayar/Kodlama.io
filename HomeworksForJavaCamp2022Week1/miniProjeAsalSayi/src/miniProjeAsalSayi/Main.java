package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 31;
		
		int remainder = 0;
		boolean isPrime = true;
		
		if(number < 2)
			System.out.println(number + " asal de�ildir");
		
		for(int i = 2; i < number; i++) {
			remainder = number % i;
			if(remainder == 0) {
				System.out.println(number + " asal de�ildir.");
				break;
			}
			else if(i == (number - 1)){
				System.out.println(number + " asald�r");
			}
			
		}
		
		/*for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println(number + " asald�r");
		}
		else {
			System.out.println(number + " say� asald�r");
		}*/
		
	}

}
