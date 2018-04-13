import java.lang.*;

class Job implements Runnable
{
	public void run()
	{	
		for(int i = 1;i<=10;i++)
		{
			System.out.println("play music  :"+i);
			try{
			Thread.sleep(500);
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
		th.start();
		try{	
		th.join(2000);
		}catch(InterruptedException e){}
		for(int i = 1;i<=10;i++)
		{
			System.out.println("Move Player  "+i);
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e){}				
		}

		
	}
}