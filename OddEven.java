import java.util.Scanner;
class OddEven
{
	public static void main(String [] args)
	{
		int [] num; int [] even; int [] odd;
		int n, numSize;
		int x=0; int y=0; int m=0; int q=0;
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
		for(int i=0;i<numSize;i++)
		{
			if(num[i]%2==0)
			{
				x++;
			}
			else if(num[i]%2!=0)
			{
				y++;
			}
		}
		System.out.println("There are "+numSize+" numbers in the array.");
		System.out.println("There are "+x+" even numbers in the array.");
		System.out.println("There are "+y+" odd numbers in the array.");
		even=new int[x];
		odd=new int[y];
		for(int i=0;i<numSize;i++)
		{
			if(num[i]%2==0)
			{
				even[m]=num[i];
				m++;
			}
			else if(num[i]%2!=0)
			{
				odd[q]=num[i];
				q++;
			}
		}
		System.out.println("\n");
		System.out.println("Original Array.");
		for(int i=0;i<numSize;i++)
			System.out.println(""+num[i]);
		System.out.println("\n");
		System.out.println("Even Array.");
		for(int i=0;i<x;i++)
			System.out.println(""+even[i]);
		System.out.println("\n");
		System.out.println("Odd Array.");
		for(int i=0;i<y;i++)
			System.out.println(""+odd[i]);
		System.out.println("\n"); 
	}
}	