/*
24. Write a Program to sort String on their length in Java?
 Your method should accept an array of String and return a sorted array based upon the length of String.
 Don't forget to write unit tests for your solution.
*/

import java.util.Arrays;  
public class Q24SortStringArray 
{  
	public static void main(String args[])   
	{  
		//defining an array of type String  
		String[] countries = {"Zimbabwe", "South-Africa", "India", "America", 
		"Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
		int size = countries.length;  
		//logic for sorting   
		for(int i = 0; i<size-1; i++)   
		{  
			for (int j = i+1; j<countries.length; j++)   
			{  
				//compares each elements of the array to all the remaining elements  
				if(countries[i].compareTo(countries[j])>0)   
				{  
				//swapping array elements  
				String temp = countries[i];  
				countries[i] = countries[j];  
				countries[j] = temp;  
				}  
			}  
		}  
		//prints the sorted array in ascending order  
		System.out.println(Arrays.toString(countries));  
	}  
}  