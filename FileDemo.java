import java.util.*;
import java.io.*;

class FileDemo
{
	public static void main(String []args) throws IOException
	{	
	File f = new File("c:\\data\\javaprogs\\CodeThread.java");
	System.out.println(" File  : "+f.isFile());
	System.out.println(" Folder  : "+f.isDirectory());
	System.out.println(" parent  : "+f.getParent());
	System.out.println(" size  : "+f.length()+"bytes");
    	System.out.println(" last modified  : "+new Date(f.lastModified()));
	File f1= new File("sample.java");
	boolean result=  f1.createNewFile();
	System.out.println(" File created : "+result);
	f1=new File("my_folder1");
 	result=f1.mkdir();
	System.out.println("my folder created: "+result);
	result=f1.delete();
	System.out.println("file deleted: "+result);
	}
}