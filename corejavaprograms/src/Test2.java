

public class Test2  {

	//business logic method
	public void sum(int x, int y)
	{
		System.out.println("sum is: " + (x+y));
	}
	
	
	
	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		obj.sum(4, 5);
		
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
		System.out.println(obj.toString());
		
		
	}
}
