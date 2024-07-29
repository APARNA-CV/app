package firstprojectpackage;

public class largestamong3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.print("enter the firstnumber:");
		int n1=sc.nextInt();
		
		System.out.print("enter the secondnumber:");
		int n2=sc.nextInt();
		
		System.out.print("enter the thirdnumber:");
		int n3=sc.nextInt();
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1+" is largest");
		}
		else if(n2>=n1 &&n2>n3)
		{
			System.out.println(n2+" is largest");

		}
		else {
			System.out.println(n3+" is largest");

		}
		sc.close();
		
	}

}
