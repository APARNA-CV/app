package firstprojectpackage;

public class Leapyear {

	public static void main(String[] args) {
		
		int year=1988;
		if(year % 400==0)
		{
			System.out.println("leap year");
		}
		else if(year %100==0)
		{
			System.out.println("not leap year");

		}
		else if(year %4==0)
		{
			System.out.println("leap year");

		}
		else
		{
			System.out.println("not leap year");

		}
	}

}
