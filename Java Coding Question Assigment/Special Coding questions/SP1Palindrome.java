/*
1. Note: a palindrome is a sequence of characters that reads the same forwards and 
backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true
*/
import java.util.*;
class SP1Palindrome
{ 
    String wrd; 
    int len; 
 
    SP1Palindrome() 
    { 
        wrd=""; 
        len=0; 
    } 
 
    void acceptword() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the word:"); 
        wrd=sc.nextLine(); 
        wrd=wrd.trim(); 
        len=wrd.length(); 
    } 
 
    boolean palindrome() 
    { 
        int i; 
        String f=""; 
        for(i=len-1;i>=0;i--) 
        { 
            char ch=wrd.charAt(i); 
            f=f+ch; 
        } 
        if(wrd.equalsIgnoreCase(f)) 
            return true; 
        else  
            return false; 
    } 
 
    void display() 
    { 
 
        if(palindrome()==true) 
            System.out.println("Yes it is palindrome"); 
        else  
            System.out.println("no it is not palindrome"); 
    } 
 
    public static void main(String args[]) 
    { 
        SP1Palindrome obj=new SP1Palindrome(); 
        obj.acceptword(); 
        obj.display(); 
    } 

}