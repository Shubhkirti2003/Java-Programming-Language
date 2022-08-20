import java.util.Scanner;
class SortArray
{
	public static void main(String [] args)
	{
		int [] num;
		int n, numSize;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the limit of the array: ");
		numSize=input.nextInt();
		num=new int[numSize];
		for(int i=0;i<numSize;i++)
		{
			Scanner limit=new Scanner(System.in);
			System.out.println("Enter the numbers of the array: ");
			n=limit.nextInt();
			num[i]=n;
		}
		for(int i=0;i<numSize;i++)
			System.out.println(""+num[i]);
		System.out.println("\n");
		for(int i=0;i<numSize;i++)
		{
			for(int j=i+1;j<numSize;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Sorted List");
		for(int i=0;i<numSize;i++)
			System.out.println(""+num[i]);
		System.out.println(" ");
		System.out.println(""+num[0]);
		System.out.println(""+num[numSize-1]);

	}
}