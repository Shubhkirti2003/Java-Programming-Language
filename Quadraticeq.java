import java.lang.Math;
import java.util.Scanner;
class Quadraticeq
{
	public static void main(String[]args)
	{
		
		double a, b, c, D, root1, root2, root3, root4;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first coefficient of the quadratic equation: ");
		a=input.nextInt();
		System.out.println("Enter second coefficient of the quadratic equation: ");
		b=input.nextInt();
		System.out.println("Enter third coefficient of the quadratic equation: ");
		c=input.nextInt();
		D=b*b-4*a*c;
		if (D>0) 
		{
			root1=(-b+Math.sqrt(D))/(2*a);
			root2=(-b-Math.sqrt(D))/(2*a);
			System.out.println("Real roots for this quadratic equation are: "+root1);
			System.out.println("Real roots for this quadratic equation are: "+root2);
		}
		else if(D==0)
		{
			root3=root4=-b/2*a;
			System.out.println("Imaginary roots for this quadratic equation are: "+root3);
			System.out.println("Imaginary roots for this quadratic equation are: "+root4);
		}
		else
		{
			
			System.out.println("Not real roots.");
		}
	}
}