import java.lang.*;
class Job implements Runnable
{
	public void run()
	{
		for(int i = 0;i<=10;i++)
		{
System.out.println(Thread.currentThread().getName()+ " is running  : "+i);
		try{
		Thread.sleep(1000);	
		}
		catch(InterruptedException e){}
		}
	}
}
class BGJob implements Runnable
{
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{
		System.out.println("Background changed "+i);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		}		
	}	
}

class Main
{
	public static void main(String args[])
	{
		Job j = new Job();	
		Thread th = new Thread(j,"Aparamjeet");
//		th.setName("Aparamjeet");
		th.start();
		Thread th1= new Thread(j);
		th1.setName("Aniket");
		th1.start();
		for(int i = 0;i<=10;i++)
		{
		System.out.println(" Main  : "+i);
		try{
			Thread.sleep(500);		
		}catch(InterruptedException e){}		

	}
	}
}


/**
 getName() setName()
join()
sleep()
wait() notify()
activeCount()
isAlive()
isDaemon()
setDaemon()
synchronization
setPriority()  getPriority()

*/