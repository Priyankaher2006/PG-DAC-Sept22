//6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it

class BankAccount{
	String accountHolderName = "User1";
	long accountNumber = 1234567891011L;
	double totalBalance = 52500.00;

	class Interest {
		double interestRate=5.0;
		double interestEarned=2500.00 ;
	}

}

class CAO6{
	public static void main(String[] args){
		
		BankAccount user1 = new BankAccount();
		System.out.println("Name of Account Holder: "+user1.accountHolderName);
		System.out.println("Account Number: "+user1.accountNumber);
		System.out.println("Total Availavle Balance: "+user1.totalBalance);

		BankAccount.Interest interestDetails = user1.new Interest(); 

		
		System.out.println("Interst rate; "+interestDetails.interestRate); 
		System.out.println("Interest earned: "+interestDetails.interestEarned); 
	}
}

/*	
	THE ABOVE PROGRAM WILL SHOW ERROR
	
	EXPLAINATION
	
  	- since both the variables interestRate and interestEarned are inside instance class Interest
  	which is an inner class of class BankAccount hence we cannot access these two contents
  	directly through outer class object reference from some other outside class.
  	To access these variables it is mandatory to create inner class object.
  	while accssing these variables using inner class objects it got accessed(no more error)
*/