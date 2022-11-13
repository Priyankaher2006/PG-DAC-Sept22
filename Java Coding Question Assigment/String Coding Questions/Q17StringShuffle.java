/*17. How to check if a String is a valid shuffle of two String?*/
class Q17StringShuffle
{

	// check if result string is valid shuffle of string first and second
	static boolean shuffleCheck(String first, String second, String result) 
	{
		// check length of result is same as sum of result of first and second
		if(first.length() + second.length() != result.length()) 
		{
			return false;
		}
		// variables to track each character of 3 strings
		int i = 0, j = 0, k = 0;

		// iterate through all characters of result
		while (k != result.length()) 
		{

			// check if first character of result matches with first character of first string
			if (i < first.length() && first.charAt(i) == result.charAt(k))
						i++;

			// check if first character of result matches the first character of second string
			else if (j < second.length() && second.charAt(j) == result.charAt(k))
						j++;

			// if the character doesn't match
			else
			{
			return false;
			}

			// access next character of result
			k++;
		}

		// after accessing all characters of result if either first or second has some characters left
		if(i < first.length() || j < second.length()) 
		{
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

	String first = "ab";
	String second = "cd";
	String[] results = {"acdb", "cabd"};

	// call the method to check if result string is
	// shuffle of the string first and second
	for (String result : results) {
	if (shuffleCheck(first, second, result) == true) {
	System.out.println(result + " is a valid shuffle of " + first + " and " + second);
	}
	else {
	System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
	}
	}
	}
}
/*
acdb is a valid shuffle of ab and cd
cabd is a valid shuffle of ab and cd
*/