import java.util.*;


class Boxx{
	double height;
	double length;
	double width;

	Boxx(Boxx b){
		this.height=b.height;
		this.length=b.length;
		this.width=b.width;
	}

	Boxx(double height,double length,double width){
		this.height=height;
		this.length=length;
		this.width=width;
	}

	Boxx(){
		height=55.5;
		length=70.0;
		width=30.5;
	}

	void get(){
		System.out.println("Length,Width,Height:"+length+width+height);
	}

	void set(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		length=s.nextDouble();
		System.out.println("Enter width:");
		width=s.nextDouble();
		System.out.println("Enter height:");
		height=s.nextDouble();
	}

	void vol(){
		System.out.println("Volume:"+(length*width*height));
	}

}

class Boxweight extends Boxx{
	double weight;

	Boxweight(Boxweight bw){
		this.weight=bw.weight;
	}

	Boxweight(double weight){
		this.weight=weight;
	}

	Boxweight(){
		super();
		weight=30.0;
	}

	void getw(){
		System.out.println("Weight:"+weight);
	}

	void setw(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter weight:");
		weight=s.nextDouble();
	}

	void disweight(){
		System.out.println("Weight:"+weight);
	}
}

class BoxWeightDemo{
	public static void main(String args[]){
		Boxweight bw=new Boxweight();
		bw.vol();
		bw.disweight();
	}
	
}