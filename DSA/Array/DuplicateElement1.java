import java.util.*; 
public class DuplicateElement1 
{
  public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
        int arr[] = new int[size];
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.print("Duplicate Element : "+arr[j]);
					System.out.println(" at position "+j+" & "+i);
                }
            }
        }
    }    
}