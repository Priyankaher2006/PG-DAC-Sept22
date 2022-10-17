/*
	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, 
	then HRA = 10% of basic salary and DA = 90% of basic salary. 
	If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
	If the employee's salary is input by the user write a program to find his gross salary. 
	[ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
		float HRA, DA, GS;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary=");
		float basic = sc.nextFloat();

		if(basic<10000)
		{
			HRA=basic*10/100;
			DA=basic*90/100;
		}
		else
		{
			HRA=2000;            
			DA=basic*98/100;
		}
	GS=basic+HRA+DA;
	System.out.println("Gross salary = "+GS);
}
}