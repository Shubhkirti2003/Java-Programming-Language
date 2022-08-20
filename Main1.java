import.java.util.Scanner;
class Main{
	static int findMax(int arr[])
	{
		int max=arr[0];
		for (int i =1; i<arr.length; i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
			return max;
		}
	}
}

public static void main{String[]args}
{
	System.out.println("Enter the size if the array:");
	int n;
	int [] arr=new int[n];
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int max=findMax(arr);
	int Smax=-1;
	for (int i =0; i<arr.length; i++)
		{
			if (arr[i]>Smax && Smx<max)
			{
				if (arr[i]!=max)
			{
				Smax=arr[i];
			}
		}
	}
System.out.println(Smax);
}
