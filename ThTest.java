import java.lang.*;

class BGJob implements Runnable
{
	public void run()
	{
		for(int i =1;i<=20;i++)
		{
			System.out.println("Playing music   "+i);
			try{
			Thread.sleep(500);
			}catch(InterruptedException e){}
		}
	}
}

class ThTest
{
	public static void main(String [] args)
	{
		System.out.println("Hello from main");
		BGJob j = new BGJob();	
		Thread th1 = new Thread(j);
		th1.start();
		try{
		th1.join(2000);   // th1.join()
		}catch(InterruptedException e){}		
		for(int i =1;i<=50;i++)
		{
			System.out.println("Game is running..."+i);
			try{
			Thread.sleep(100);
			}catch(InterruptedException e){}
		}

	}
}