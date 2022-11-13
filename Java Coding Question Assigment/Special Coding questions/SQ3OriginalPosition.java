/*
3. This question is asked by Amazon. Given a string representing the sequence of moves a 
robot vacuum makes, return whether or not it will return to its original position. The 
string will only contain L, R, U, and D characters, representing left, right, up, and down 
respectively.
Ex: Given the following strings...
"LR", return true
"URURD", return false
"RUULLDRD", return true
*/
class SQ3OriginalPosition
{
	/* Solution */
    static boolean judgeCircle(String moves) 
	{
        char[] array = moves.toCharArray();
        int U = 0;
        int R = 0;
        for(int i=0; i<array.length; i++)
		{
            if(array[i] == 'U')
			{
                U++;
            }
			else if(array[i] == 'D')
			{
                U--;
            }
			else if(array[i] == 'R')
			{
                R++;
            }
			else if(array[i] == 'L')
			{
                R--;
            }
        }        
        if(U == 0 && R == 0)
		{
            return true;
        }
        return false;        
    }
    public static void main(String[] args)
	{        
        boolean result = judgeCircle("LR");
        System.out.println(result);
		boolean result1 = judgeCircle("URURD");
        System.out.println(result1);
		boolean result2 = judgeCircle("RUULLDRD");
        System.out.println(result2);
    }
}
/*
true
false
true
*/
