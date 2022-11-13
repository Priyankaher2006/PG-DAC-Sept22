//  Java Program to Illustrate Use of Constructor

public class CAO17 
{ 
    String name; 
    String schoolName; 
    int std; 
    String city; 


     public Student(String name, String schoolName, int std, String city) 
     { 

     System.out.println("Constructor called..."); 
     this.name = name; 
     this.schoolName = schoolName; 
     this.std = std; 
     this.city = city; 
	}
 

     public Student(String n, String scn, int s, String c)
     { 

      name = n; 
      schoolName = scn; 
      std = s; 
      city = c; 
	} 

    void display() 
    { 
       System.out.println(name+ " " +schoolName+ " " +std+ " " +city); 
    } 


   public static void main(String[] args) 
   { 
	  Student s = new Student("PRIYADARSHINI", "KENDRIYA VIDYALAYA", 12, "BALANGIR");// Const. called.
      s.display(); 
   }
 
 }