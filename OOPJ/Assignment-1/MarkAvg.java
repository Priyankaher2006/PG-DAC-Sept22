/*
	Write a program to calculate sum of 5 subject’s marks & find percentage. 
	Take the obtained marks from user using Scanner class. 
	Output should be in this format [ percentage marks = 99 % ]. 
	Use concatenation operator here.
*/
import java.util.Scanner;

class MarkAvg 
{
 
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks for five subject");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
	
		
		
        float total = s1+s2+s3+s4+s5;
		System.out.println(total);
		
		float percentage= (total / 500) * 100;
		
        System.out.println("Total= "+total);
		System.out.println("Percentage= "+percentage+" %");
	}
}