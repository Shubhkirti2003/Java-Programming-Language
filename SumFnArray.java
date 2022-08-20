class SumFnArray
{
	public static int Sumofall(int [] arr){
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static int Sumofalt(int [] arr){
		int sum1=0;
		for(int i=0;i<5;i++)
		{
			if(arr[i]%2==0)
			{
				sum1=sum1+arr[i];
			}
			return sum1;
		}
	}
}
class Sum1
{
	public static void main(String [] args)
	{ 
		int a;
		int array[] = new int[5];
		int size=5;
		for(int i = 0; i<size; i++)
			{
				scanner input = new scanner(System.in);
				System.out.println("Enter "+(i+1)+"st element:");
				array[i]= input.nextInt();
			}
		scanner sc = new scanner(System.in);
		System.out.println("MENU");
		System.out.println("Choose from the following options: 1. Sum of array elements/n 2. Sum of alternate array elements");
		a=sc.nextInt();
		if (a==1)
		{
			System.out.println("Sum of all elements in the array "+ Sumofall(array));
		}
		if (a==2)
		{
			System.out.println("Sum of all elements in the array "+ Sumofalt(array));
		}
	}
}