package com.wipro.multithreading;

public class Test3 {
	
	public static void main(String[] args) {
		
		//public void run();
		Runnable obj = ()->{
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		};
		
		//convert Runnable object into Thread object 
		
		Thread t = new Thread(obj);
		t.setName("Rk");
		t.start();
		
		Thread t1 = new Thread(obj);
		t1.setName("wipro");
		t1.start();
		
	}

}
