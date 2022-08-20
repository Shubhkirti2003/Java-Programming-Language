import java.util.Scanner;
class Complex{
	int real,img;
	Complex(int r, int i){
		real=r;
		img=i;
	}
	Complex sum(Complex c1, Complex c2){
		Complex temp=new Complex(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	Complex diff(Complex c1,Complex c2){
		Complex temp=new Complex(0,0);
		temp.real=c1.real-c2.real;
		temp.img=c1.img-c2.img;
		return temp;
	}
	Complex product(Complex c1,Complex c2){
		Complex temp=new Complex(0,0);
		temp.real=(c1.real*c2.real)-(c1.img*c2.img);
		temp.img=(c1.real*c2.img)+(c1.img*c2.real);
		return temp;
	}
}
class complexmain{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r1,r2,i1,i2;
		System.out.println("For 1st Complex Number");
		System.out.print("Enter Real Value: ");
		r1=input.nextInt();
		System.out.print("Enter Imaginary Value: ");
		i1=input.nextInt();

		System.out.println();

		System.out.println("For 2nd Complex Number");
		System.out.print("Enter Real Value: ");
		r2=input.nextInt();
		System.out.print("Enter Imaginary Value: ");
		i2=input.nextInt();

		Complex c1=new Complex(r1,i1);
		Complex c2=new Complex(r2,i2);
		Complex c3=new Complex(0,0);

		System.out.println("Sum of Complex Numbers is: "+ c3.sum(c1,c2).real +" + "+c3.sum(c1,c2).img+"i");
		System.out.println("Difference of Complex Numbers is: "+ c3.diff(c1,c2).real +" + "+c3.diff(c1,c2).img+"i");
		System.out.println("Product of Complex Numbers is: "+ c3.product(c1,c2).real +" + "+c3.product(c1,c2).img+"i");
	}
}