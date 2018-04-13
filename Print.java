class EvenJob implements Runnable
{
	public void run()
	{
		for(int i =2;i<=10;i+=2)
		{
		System.out.println("Even no is : "+i);
		}
	}
		
}
class OddJob implements Runnable
{
	public void run()
	{
		for(int i =1;i<=10;i+=2)
		{
		System.out.println("\tOdd no is : "+i);
		}
	}		
}

class Print
{
	public static void main(String [] args)
	{
		EvenJob ej = new EvenJob();
		OddJob oj = new OddJob();
		Thread t1 = new Thread(ej);
		Thread t2 = new Thread(oj);
			t1.start();
			t2.start();
	}
}