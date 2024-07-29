package firstprojectpackage;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j,row=8;
		for(i=0;i<row;i++)
		{
			for(j=row;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
		}
	}

}
