class Greetings implements Runnable
{
	synchronized void sayHello(String name)
	{
		System.out.print(" Hello "+name);
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println("!!! Welcome to VIPS");
	}
	public void run()
	{
		 sayHello(Thread.currentThread().getName());
	}	
}

class SynchTest
{
	public static void main(String [] args)
	{	
		Greetings g = new Greetings();
		Thread th1 = new Thread(g,"Rahul");	
		Thread th2 = new Thread(g,"Mayank");	
		Thread th3 = new Thread(g,"Sagar");	
		
		th1.start();
		th2.start();
		th3.start();
	}
}