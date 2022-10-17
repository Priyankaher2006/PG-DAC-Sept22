/*
	WAP to accept percentage and display the class in which category it is 
	First Class, Second Class, Fail, Distinction
*/

import java.util.Scanner;  
class PercentClass 
{

   public static void main(String[] args) 
   {
      System.out.print("Enter a number: ");  
      Scanner sc = new Scanner(System.in); 
      int marks = sc.nextInt();
	  int num=0;
	  if(marks>=85)
	  {
		  num=1;
	  }
	  else if(marks>=60 && marks<85)
	  {
		  num=2;
	  }
	  else if(marks>=50 && marks<60)
	  {
		  num=3;
	  }
	  else if(marks>=40 && marks<50)
	  {
		  num=4;
	  }
      switch(num) 
      {
        //for >=85
		
		case 1:
				System.out.println("Dist");
				break;
		//for >=60 & <85
		
		case 2:
				System.out.println("First");
				break;
		//for >=50 & <60
		case 3:
				System.out.println("Second");
				break;
		//for >=40 & <50
		case 4:
				System.out.println("third");
				break;
		//for <40
		default:
				System.out.println("Fail");
				break;
      }
   }

}