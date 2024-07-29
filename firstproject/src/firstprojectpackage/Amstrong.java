package firstprojectpackage;
public class Amstrong {

	public static void main(String[] args) {
		int n=153,originalnum,remainder,result=0;
		originalnum=n;
		while(originalnum !=0)
		{
			remainder=originalnum % 10;
			result+=Math.pow(remainder,3);
			originalnum=originalnum/10;
			
		}
		if(result==n)
		{
			System.out.println(n +" is amstrong number");
			
		}
		else
		{
			System.out.println(n +" is not  amstrong number");

		}
		
	}

}
