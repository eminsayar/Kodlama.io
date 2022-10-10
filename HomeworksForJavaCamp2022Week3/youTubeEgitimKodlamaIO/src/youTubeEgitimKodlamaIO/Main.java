package youTubeEgitimKodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 =new int[] {1, 2, 3};
		int[] sayilar2 =new int[] {10, 20, 30};
		
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);*/
		
		/*CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer(); // örneğini öluşturma, instance creation
		customer.id = 1;
		customer.city = "İzmir"; 
	
		
		Company company = new Company();
		company.taxNumber = "123456789";
		company.companyName = "Vestel";
		company.id = 100;
		
		CustomerManager customerManager = new CustomerManager(company);
		customerManager.save();
		customerManager.delete();
		
		
		Person person = new Person();
		person.nationaIdentity = "123456";*/
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
		
		
		
 	}

}
