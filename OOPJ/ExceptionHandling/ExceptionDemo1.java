class ExceptionDemo
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		//int b=0;    //will give error  
		System.out.println("Calculating Result... ");
		int res=a/b;                   // if b=0, then  / by zero  //Exception generated...Logical Error...Runtime error
		System.out.println("Result : "+ res);
		
		System.out.println("**********************************************************************");
		
		int arr[]={5,10,15,20,25};
		System.out.println("arr[4] "+ arr[4]);
		System.out.println("arr[0] "+ arr[0]);
		//System.out.println("arr[6] : "+ arr[6]);    //ArrayIndexOutOfBoundsException: 6 //Runtime 
		
		System.out.println("Program Runned Successfully.....");
		
		
	}




}

/*
Calculating Result...
Result : 2
**********************************************************************
arr[4] 25
arr[0] 5
Program Runned Successfully.....

*/