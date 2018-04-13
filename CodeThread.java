import java.lang.*;

class Job implements Runnable
{
	public void run()
	{	
		for(int i = 1;i<=100;i++)
		{
			System.out.println("play music  :"+i);
			try{
			Thread.sleep(10);
			}
			catch(InterruptedException e){}		
		}
	}	
}


class Code 
{
	public static void main(String args[])
	{	
		System.out.println("Game begins...");
		Job j = new Job(); 
		Thread th = new Thread(j);
		th.setDaemon(true);
		th.start();
	
		for(int i = 1;i<=100;i++)
		{
			System.out.println("Move Player  "+i);
		}

		
	}
}