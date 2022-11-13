/*11. How to convert a byte array to String?*/
import java.util.*;
class Q11ArraytoString
{
	public static void main(String args[])
	{
		//Getting bytes from the custom input string using getBytes() method and
        // storing it in a byte array
		byte[] bytes = "Kharghar".getBytes();
  
        System.out.println(Arrays.toString(bytes));
  
        // Creating a string from the byte array
        String string = new String(bytes);
  
        // Printing the string
        System.out.println(string);
		
	}
}