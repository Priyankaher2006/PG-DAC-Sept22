public class ReverseString 
{  
	//recursive function to reverse a string      
	public static String reverseString(String str)  
	{  
		//checks if the string is empty   
		if(str.isEmpty())  
		{  
			System.out.println("String is empty.")  ;
			//if the above condition is true returns the same string      
			return str;  
		} 
		else   
		{  
			System.out.println("String to be passed in Recursive Function: "+str.substring(1));		
			return reverseString(str.substring(1))+str.charAt(0);  
		}  
	}  
	public static void main(String[] args)   
	{  
		String resultantSting1 = reverseString("JAVATPOINT");  
		String resultantSting2 = reverseString("COMPUTER");  
		String resultantSting3 = reverseString("INDIA");  
		System.out.println(resultantSting1);  
		System.out.println(resultantSting2);  
		System.out.println(resultantSting3);   
	}  
}