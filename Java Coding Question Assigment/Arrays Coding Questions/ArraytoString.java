import java.util.*;
  
class ArraytoString
{
    public static void main(String[] args)
    {
        // print their contents using Arrays.toString()
        boolean[] boolArr = new boolean[] { true, true, false, true };
        char[] charArr = new char[] { 'c', 'd', 'a', 'c', 'k' , 'h'};
        double[] dblArr = new double[] { 1, 2, 3, 4 };
        int[] intArr = new int[] { 1, 2, 3, 4 };
        Object[] objArr = new Object[] { 1, 2, 3, 4 };
  
        System.out.println("Boolean Array: "+Arrays.toString(boolArr));
        System.out.println("Character Array: "+Arrays.toString(charArr));
        System.out.println("Double Array: "+Arrays.toString(dblArr));
        System.out.println("Integer Array: "+Arrays.toString(intArr));
        System.out.println("Object Array: "+Arrays.toString(objArr));
    }
}