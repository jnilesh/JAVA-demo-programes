class Greetings implements Runnable
{
	synchronized void sayHello(String name)
	{
	System.out.print(" Hello "+ name);
	try
	{
		Thread.sleep(1000);	
	}
	catch(InterruptedException e){}
	System.out.println(" !!! Welcome to VIPS");
	}
	public void run()
	{
		sayHello(Thread.currentThread().getName());
	}
}


class ThSynch
{
	public static void main(String []args)
	{
		Greetings  j = new Greetings();
		Thread t1 = new Thread(j,"Gaurav");
		Thread t2 = new Thread(j,"Dhairya");
		Thread t3 = new Thread(j);
		t3.setName("Kirti");
		t1.start();
		t2.start();
		t3.start();
		}
}