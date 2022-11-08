import java.io.*;
import java.util.*;
class FileClassDemo
{
	public static void main(String args[])
	{
		File f = new File("/Test/OOPJ/Session/String");//object created  refence given to f
		//folder is also considered asd file here
		
		//exists() method
		if(f.exists())//does this file exists // 
		{
			System.out.println("Exists");
		}
		else
		{
			System.out.println("does not exists");
		}
		
		//isDirectory()
		if(f.isDirectory())//does the file is directory or not
		{
			System.out.println("it is directory");
			
			//list() method--returns an array of file names
			String filenames[] = f.list(); //f.lisl() will give all file names to filenames[]
			System.out.println(Arrays.toString(filenames));//will give names of all files in the folder
			//listFiles() method-- returns an array of file object
			File fileObj[] = f.listFiles();
			for(File fl : fileObj)
			{
				//getName() method 
				if(fl.isDirectory())
				{
					System.out.println(fl.getName() + "is a directory");
				}
				else
				{
					System.out.println(fl.getName() + "is a file");
				}
			}
		}
		if(f.isFile())
		{
			System.out.println("it is file");
			String filenames[] = f.list();
			System.out.println(Arrays.toString(filenames));//null as its a file 
		}
			
	}
}
/*
String filenames[] = f.list();
-->creating obj against file &stores refernce in list; returns that list as we studied in collection
File fileObj[] = f.listFiles();
--> will created object for all coresponding file and will return array of objects

*/