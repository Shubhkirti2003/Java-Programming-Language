import java.util.Scanner;
class Arrays
{
	public static void main(String [] args)
	{
		int [] marks;
		int n;
		marks=new int[5];
		for(int i=0;i<5;i++)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the marks of the students: ");
			n=input.nextInt();
			marks[i]=n;
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Marks are "+marks[i]);
		}
	}
}