import java.util.Scanner;
class ArithOp
{
	public static void main(String[]args)
	{
		int num1,num2,add,sub; 
		double mul, div, mod;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=input.nextInt();
		System.out.println("Enter second number");
		num2=input.nextInt();
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		System.out.println("Addition "+add);
		System.out.println("Subtraction "+sub);
		System.out.println("Multiplication "+mul);
		System.out.println("Division "+div);
		System.out.println("Mode "+mod);
	}
}