package firstprojectpackage;

public class Pattern2 {

	public static void main(String[] args) {
		int i,j,row=5;
		for(i=0;i<row;i++)
		{
			for(j=row-2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*"); 
			}
			System.out.println();
				
		}
	}

}
