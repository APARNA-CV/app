package firstprojectpackage;

public class Scanner {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in) ;
		System.out.println("Enter your rollno"); 
		 int rollno=sc.nextInt(); 
		 System.out.println("Enter your name"); 
		 String name=sc.next(); 
		 System.out.println("Enter your fee"); 
		 double fee=sc.nextDouble(); 
		 System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee); 
		 sc.close();
	}

}
