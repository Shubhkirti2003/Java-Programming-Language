import java.util.Scanner;
class Pattern1
{
	public static void main(String[]args)
	{
		int n,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		n=input.nextInt();
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}