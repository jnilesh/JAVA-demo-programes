class Task implements Runnable
{
	public void run()
	{     	for(int i = 1;i<=100;i++)
		{
	
		System.out.println("New Thread running : "+i);
		}
	}	
}
class ThDemo
{
	public static void main(String []args)
	{
		System.out.println("First Statement in main");		
		Task t = new Task();
		
		Thread th = new Thread(t);
		th.start();		

		for(int i = 1;i<=100;i++)
		{
			System.out.println("Main running... "+i);
		}
		System.out.println("last Statement in main");
	}
}

