/*Find max and min number*/
import java.util.*;
class MaxMin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b)
        {
			//greatest
			if(a>c){
				System.out.println("Max = a");
			}
			else{
				System.out.println("Max = c");
			}
			//smallest
			if(b>c){
				System.out.println("Min = c");
			}
			else{
				System.out.println("Min = b");
			}
		}
		else
		{
			//greatest
			if(b>c){
				System.out.println("Max = b");
			}
			else{
				System.out.println("Max = c");
			}
			//smallest
			if(a>c){
				System.out.println("Min = c");
			}
			else{
				System.out.println("Min = a");
			}
		}
	}
}  