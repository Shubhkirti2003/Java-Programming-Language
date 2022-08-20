import java.util.Scanner;
class IndexArray
{
	public static void main(String [] args)
	{
		int [] num;
		int n, numSize, search;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		numSize=input.nextInt();
		num=new int[numSize];
		for(int i=0;i<numSize;i++)
		{
			Scanner limit=new Scanner(System.in);
			System.out.println("Enter the numbers of the array: ");
			n=limit.nextInt();
			num[i]=n;
		}
		System.out.println("\n");
		for(int i=0;i<numSize;i++)
			System.out.println(""+num[i]);
		System.out.println("\n");
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the value to be searched: ");
		search=value.nextInt();
		for(int i=0;i<numSize;i++)
		{
			if(num[i]==search)
			{
				System.out.println("The index is "+ i);
				break;
			}
			else  
			{
				System.out.println("-1, Number not present.");
			}
		}
	}
}
