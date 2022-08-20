class Time
{
	int hour, min, sec;
	Time()
	{
		hour=0;
		min=0;
		sec=0;
	}
	Time(int h, int m, int s)
	{
		hour=h;
		min=m;
		sec=s;
	}
	Time add(Time X){
		Time ob= new Time();
		ob.hour=this.hour+X.hour;
		ob.min=this.min+X.min;
		ob.sec=this.sec+X.sec;
		return ob;
	}
	void display()
	{
		System.out.println("Hour:"+h+"Minute:"+m+"Second:"+s);
	}
}
class TimeDemo
{
	public static void main(String[]args){
		Time t1=new Time(2,30,4);
		Time t2=new Time(2,20,4);
		Time result=t1.add(t2);
		result.display();
	}
}