
public class Test7 extends Test5 {

	@Override
	public void sum(int x, int y) {
		System.out.println("substraction is: " +(x-y));

	}
	
	public static void main(String[] args) {
		
		Test5 obj = new Test7();
		obj.sum(8,7);
	}

}
