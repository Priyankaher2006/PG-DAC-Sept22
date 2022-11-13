// Java Program to Illustrate Use of Final Keyword

final class Demo{
	
	final int x;
	
	Demo() { 
		this.x = 5;
	}	
	
	Demo(int x){
		this.x = x;
	}
}

class First extends Demo{ } // error: final class cannot be inherited

class Second{
	final void myFun(){
		System.out.println("myFun of Second");
	}
}

class Third extends Second{
	void myFun(){ // not allowed to override myFun of Second class : method is final
		System.out.println("myFun of Second");
	}
}


class CAO16{

	public static void main(String[] args){
		
		final int x = 16;
		x = 75; // not allowed.. BECAUSE OF FINAL
	
	}
}

