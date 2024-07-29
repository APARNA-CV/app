package firstprojectpackage;

public class Pattern9 {

	public static void main(String[] args) {
		int i,j,row=5;
		for(i=0;i<row;i++)
		{
			for(j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
			System.out.println();
		}
	}

}
