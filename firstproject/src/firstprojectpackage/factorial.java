package firstprojectpackage;

public class factorial {

	public static void main(String[] args) {
		int i,fact=1,n=6;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
