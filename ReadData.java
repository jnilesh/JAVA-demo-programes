import java.io.*;

class ReadData
{
	public static void main(String []args) throws Exception
	{
		FileReader fr = new FileReader("ReadData.java");
		int i = fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = fr.read();
		}	
		fr.close();
	}
}