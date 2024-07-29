package firstprojectpackage;

public class calculatorswitch {

	public static void main(String[] args) {
		char operator;
		double n1,n2,result;
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
	
		System.out.println("enter first num");
		n1=sc.nextDouble();
		
		System.out.println("enter Second num");
		n2=sc.nextDouble();
		
		System.out.println("choose an operator: +,-,*,/");
		operator=sc.next().charAt(0);
		 switch(operator)
		 {
		 case '+':
			 result=n1+n2;
				System.out.println(result);
				break;
				
		 case '-':
			 result=n1-n2;
				System.out.println(result);
				break;
		 case '*':
			 result=n1*n2;
				System.out.println(result);
				break;
		 case '/':
			 result=n1/n2;
				System.out.println(result);
				break;
		 default:
			 System.out.println("invalid operator");
				break;
				
		 }
		 sc.close();
		
	}

}
