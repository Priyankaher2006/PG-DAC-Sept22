import java.util.Scanner;

public class ArrayUpdation 
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length= arr.length;
        Scanner sc=new Scanner(System.in);

        System.out.println("Array Elements Before modify");
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nEnter the position where you want to change in an array");
        int pos=sc.nextInt();

        System.out.println("Enter the value");
        int val=sc.nextInt();

        arr[pos]=val;

        System.out.println("Array Elements After modify");
        for(int j=0;j<length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}