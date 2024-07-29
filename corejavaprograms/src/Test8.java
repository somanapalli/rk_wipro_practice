
public class Test8 {
	
	public static void main(String[] args) {
		
		//runtime polymorphism
		Bank sbi = new SBI();
		Bank cb = new CityBank();
		
		System.out.println("sbi rate of interest is: " + sbi.rateOfInterest());
		System.out.println("city bank rate of interst is: " + cb.rateOfInterest());
	}

}
