public class Test1 {
	// class level variables
	int a, b;
	
	//default constructor
	public Test1(){
		
		//call the parameterized constructor
		
		this(300,400);
		//initialization logic
		a=100;
		b=200;
		this.sum();
	}

	// parameterized constructor
	public Test1(int a, int b) {
		//initialization logic 
		this.a = a;
		this.b = b;
		//call sum()
		this.sum();
	}

	public void sum() {
		System.out.println("sum is : " + (this.a + this.b));
	}

	public static void main(String[] args) {
       //create the object using default constructor
		Test1 obj1 = new Test1();
		
		
		
		
		
	}
}