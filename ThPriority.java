class PrintJob implements Runnable
{
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{
System.out.println(Thread.currentThread().getName()+ " is at Number  : "+i);
		}
	}
}


class ThPriority
{
	public static void main(String []args)
	{
		PrintJob j = new PrintJob();
		Thread t1 = new Thread(j,"Gaurav");
		Thread t2 = new Thread(j,"Dhairya");
		Thread t3 = new Thread(j);
		t3.setName("Kirti");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(5);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		}
}