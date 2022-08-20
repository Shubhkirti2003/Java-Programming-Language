import java.lang.Math;
class Triangle{
	int s1 = 3;
	int s2 = 4;
	int s3 = 5;
	double area(){
		float s=(s1+s2+s3)/2;
		double ar=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		return ar;
	}
	int peri(){
		return s1+s2+s3;
	}
}

class Dim{
	public static void main(String[] args){
		Triangle obj=new Triangle();
		System.out.println("Area of Triangle is \t"+obj.area());
		System.out.println("Perimeter of Triangle is \t"+obj.peri());
	}
}