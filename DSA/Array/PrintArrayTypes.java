public class PrintArrayTypes
{ 
	public static void main(String args[]) 
	{ 
		int i;
		// type of one dimensional array in Java 
		int[] arrayOfInts = new int[] { 101, 102, 103, 104, 105 }; 
		int n=arrayOfInts.length;
		for (i = 0; i < n; i++)  
			System.out.println(arrayOfInts[i]); 
	
		short[] arrayOfShorts = new short[] { 20, 30, 40, 50, 60 }; 
		int n1=arrayOfShorts.length;
		for (i = 0; i < n1; i++)  
			System.out.println(arrayOfShorts[i]); 
	
		float[] arrayOfFloats = new float[] { 2.0f, 3.0f, 4.0f, 5.0f, 6.0f }; 
		int n2=arrayOfFloats.length;
		for (i = 0; i < n2; i++)  
			System.out.println(arrayOfFloats[i]); 
	
		// type of two dimensional array in Java 
		int[][] arrayOfArrayOfInts = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } }; 
		System.out.println(arrayOfArrayOfInts); 
	
		double[][] arrayOfArrayOfDoubles = { { 2.0, 3.0 }, { 4.0, 5.0 } }; 
		System.out.println(arrayOfArrayOfDoubles); } }

