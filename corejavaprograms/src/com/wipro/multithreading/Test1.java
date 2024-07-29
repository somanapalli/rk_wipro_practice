package com.wipro.multithreading;

public class Test1 extends Thread{
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + "-->"  + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		
		//creating the thread
		Test1 obj = new Test1();//new state
		obj.setName("rk");
		
		//creating one more thread
		
		Test1 obj1 = new Test1();
		obj1.setName("wipro");
		
		obj.start();//runnable state
		obj1.start();
		
	}

}
