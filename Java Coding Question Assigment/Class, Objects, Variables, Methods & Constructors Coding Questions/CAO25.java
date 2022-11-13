// Java Program to Check Whether Which One is Executed First, Static Block or the Static Method

class CAO25{
	
	static {
		System.out.println("Static Block");
		// myFun(); //Allowed
		// static block is executed first and then the static method
	}
	
	static void myFun(){
		System.out.println("static myFun method");
	}
	
	public static void main(String[] args){
		
		 myFun();	// static method will only be executed when it is called
	}
	
}


