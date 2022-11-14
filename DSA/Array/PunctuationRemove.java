import java.util.*;
class PunctuationRemove
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
        s = s.replaceAll("\\p{Punct}","");
        System.out.println(s);
	}
}
