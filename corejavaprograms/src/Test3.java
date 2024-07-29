

public class Test3{

	public void operation(int x, int y)
	{
		System.out.println("integer sum is: " + (x+y));
	}
	
	public void operation(double x, double y) {
		System.out.println("double sum is: " + (x+y));
	}
	
	public static void main(String[] args) {
		
		Test3 obj = new Test3();
		obj.operation(3, 4);
		obj.operation(4.5, 5.6);
	}
}
