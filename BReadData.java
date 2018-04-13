import java.io.*;
class BReadData
{
	public static void main(String []args) throws Exception
	{
		FileReader fr = new FileReader("ReadData.java");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			str = br.readLine();
		}	
		fr.close();
		br.close();
		FileWriter fw = new FileWriter("testing.txt");
		fw.write("Hello Everyone !!!");
		fw.close();
	}
}