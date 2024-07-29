package firstprojectpackage;


public class oddoreven {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		if(n%2==0) 
			System.out.println("number is even");
			else
			System.out.println("number is odd");
		
	}

}
