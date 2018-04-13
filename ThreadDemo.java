class Job implements Runnable
{
	public void run()
	{
		for(int i =1;i<=10;i++)
		{
			try{
			Thread.sleep(1000);
			}
			catch(InterruptedException e){}
			System.out.println(" Play Music "+i);
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		System.out.println("Hello  from Main Thread ");
			Job j = new Job();
			Thread th = new Thread(j);
			th.start();
		for(int i =1;i<=10;i++)
		{
			System.out.println("Game running "+i);
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e){}
	
		}
	}
}

