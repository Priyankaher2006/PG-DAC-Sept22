// Java Program to Calculate Sum of Two Byte Values using Type Casting

class CAO26{
	
	public static void main(String[] args){
		
		byte num1 = 126; // 120 is within the range of byte -128 to 127
		byte num2 = 30;
		
		// byte res = num1 + num2; // error: incompatible types: possible lossy conversion from int to byte
		byte res = (byte)(num1 + num2);	//Type Casting
		
		System.out.println("Res = " + res);
	}
	
}