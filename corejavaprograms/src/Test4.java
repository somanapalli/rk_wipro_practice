
public class Test4 {
	
	public static void main(String[] args) {
		
		//child class object 
		Child obj = new Child();
		obj.sum(45,3);
		
		
		//parent class object
		
		Parent obj1 = new Parent();
		obj1.sum(3, 4);
		
		
		//runtime polymorphism
		Parent obj2 = new Child();
		obj2.sum(4, 5);
		
		
		
	}

}
