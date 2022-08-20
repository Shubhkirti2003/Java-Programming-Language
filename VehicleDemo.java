import java.util.Scanner;
class Vehicle
{
	public void display()
	{
		System.out.println("This is a vehicle.");
	}
}

class Car extends Vehicle{
	public void display()
	{ 
		System.out.println("This is a car.");
	}
}

class Bike extends Vehicle{
	public void display()
	{ 
		System.out.println("This is a bike.");
	}
}

public class VehicleDemo{
	public static void main(String[] args)
	{
		int x;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of tyres: ");
		x= input.nextInt();
		if(x==2)
		{
			Bike B= new Bike();
			B.display();
		}
		else if (x==4)
		{
			Car C= new Car();
			C.display();
		}
		else  
		{
			Vehicle V= new Vehicle();
			V.display();
		}
	}
	
}