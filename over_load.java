class over_load

{

    int x;

    double y;

    void addition(int a , int b)

    {

        x = a + b;

    }

    void addition(double c , double d)

    {

        y = c + d;

    }

    over_load()

    {

        this.x = 0;

        this.y = 0;

    }

}

 

 

public class Main {

 

    public static void main(String[] args) {

            // write your code here

 

        over_load obj = new over_load();

        int a = 4;

        double b = 4.2;

        obj.addition(a, a);

        obj.addition(b, b);

        System.out.println(obj.x + " " + obj.y);

 

    }

}