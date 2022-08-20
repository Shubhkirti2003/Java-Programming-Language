import java.util.*;
import java.lang.*;

class TwoPoint
{
	float x1, x2, y1, y2;
	double distance;
	TwoPoint(){
	}
	float getx1()
	{
		return x1;
	}
	void setx1()
	{
		this.x1 = x1;
	}
	float gety1()
	{
		return y1;
	}
	void sety1()
	{
		this.y1 = y1;
	}
	float getx2()
	{
		return x2;
	}
	void setx2()
	{
		this.x2 = x2;
	}
	float gety2()
	{
		return y2;
	}
	void sety2()
	{
		this.y2 = y2;
	}
	TwoPoint(float x1, float y1, float x2, float y2)
	{
		this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    void getDist()
    {
    	double point1 = Math.pow((x2-x1),2);
        double point2 = Math.pow((y2-y1),2);
        distance = Math.pow((point1 + point2),0.5);
    }
    void display()
    {
    	System.out.println("Distance between two points = " + (String.format("%.2f",distance)));
    } 
}

public class Point{
	public static void main(String[] args){
		float x1, x2, y1, y2;
		TwoPoint p = new TwoPoint();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the points of 1st coordinate (x1, y1) :");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        System.out.println("Enter the points of 2nd coordinate (x2, y2) :");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        TwoPoint p1 = new TwoPoint(x1,y1,x2,y2);
        p1.getDist();
        p1.display();
    }
}
