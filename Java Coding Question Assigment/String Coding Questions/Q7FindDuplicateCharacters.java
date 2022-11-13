/*
	7. You need to write a program to print all duplicate character and their count in Java. 
	For example, if given String is Programming then your program should print
	g : 2
	r : 2
	m : 2
*/
class Q7FindDuplicateCharacters
{
	public static void main(String args[])
	{
		String string1 = "JavaProgramming";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) 
		{  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
			{  
                if(string[i] == string[j] && string[i] != ' ') 
				{  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]+":-"+count);  
        }  
	}
}
/*
Duplicate characters in a given string:
a:-3
r:-2
g:-2
m:-2
*/


