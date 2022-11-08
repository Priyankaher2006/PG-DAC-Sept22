import java.io.*;

class ByteStreamReadWriteDemo
{
	public static void main(String args[]) throws IOException
	{
		File fin = new File("/Test/OOPJ/Session/JavaInputoutput/input.txt");//object created of File  which will be  read by FileInputStream
		File fout = new File("/Test/OOPJ/Session/JavaInputoutput/target.txt");//object created of File  FileOutputStream will write on it
		
		if(!fin.exists())//file doesnot exists
		{
			System.out.println("does not Exists");
			return;	//returns control
		}
		
		FileInputStream fis = new FileInputStream(fin);
		FileOutputStream fos = new FileOutputStream(fout,true);
		//will append(add) the content to the file i.e how many times you run  content will get add on old content
		
		//FileOutputStream fos = new FileOutputStream(fout); 
		//will always create a new file i.e wwill replace old content with new content
		
		//read() : returns integer value of read byte from the file onput stream
		//flow is File ----->FileInputStream ------> read() method
		int ch;
		//fis will read from File input stream in byte form n return it to ch which is in interger format
		while((ch=fis.read()) != -1)//when ch ==-1 means reading is over and control will come outof whileloop
		{
			System.out.print((char)ch);//casting as ch will print ascii value
			fos.write(ch);//dont need to do casting while writing
		}
		fis.close();//for closing stream as we can't keep stream open
		fos.close();
		
		System.out.println("File copied successfully to target.txt!!");
	}
}