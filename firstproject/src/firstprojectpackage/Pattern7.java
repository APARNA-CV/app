package firstprojectpackage;

public class Pattern7 {

	public static void main(String[] args) {
		int i,j,row=8;
		for(i=0;i<row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(i=0;i<row;i++)
		{
			for(j=row-1;j>i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
