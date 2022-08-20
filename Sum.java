import java.util.Scanner;

class Sum{
	public static int addAll(int [] arr){
		int s=0;
		for(int i=0;i<5;i++){
			s=s+arr[i];
		}
		return s;
	}
	
	public static int addAlt(int [] arr){
		int s=0;
		for(int i=0;i<5;i=i+2){
			s=s+arr[i];
		}
		return s;
	}
	public static void main(String[] args){
		int array[] = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i=0;i<5;i++){
			array[i]=input.nextInt();
		}
		System.out.println("MENU");
		System.out.println("Choose from the following options: 1. Sum of array elements/n 2. Sum of alternate array elements");
		a=input.nextInt();
		if (a==1)
		{
			System.out.println("Sum of all elements in the array "+ Sumofall());
		}
		if (a==2)
		{
			System.out.println("Sum of all elements in the array "+ Sumofalt());
		}
		System.out.println("Sum of all elements: "+addAll(array));
		System.out.println("Sum of alternate elements: "+addAlt(array));
	}
}