class CountJob implements Runnable
{
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{	
			System.out.println(i);
		}
	}
}

class RevCountJob implements Runnable
{
	public void run()
	{
		for(int i = 10;i>=1;i--)
		{	
			System.out.println("\t\t\t\t"+i);
		}
	}
}
class ThCount
{
	public static void main(String []args)
	{
		CountJob cj = new CountJob();						RevCountJob rcj = new RevCountJob();					Thread th1 = new Thread(cj);
		Thread th2 = new Thread(rcj);
		th1.start();
		th2.start();
	}
}