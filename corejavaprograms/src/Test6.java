
//child class cum implementation class cum business logic class cum execution logic class
public class Test6 extends Test5 {

	public Test6()
	{
		//calling parent class parameterized constructor
		super(5);
	}
	
	@Override
	public void sum(int x, int y) {
		System.out.println("sum is: " + (x+y));

	}
	
	public static void main(String[] args) {
		//runtime polymorphism
		Test5 obj = new Test6();
		obj.sum(4, 5);
		
	}

}
