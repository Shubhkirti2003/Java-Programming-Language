import java.util.*;

class Prac6Q1
{
 public static void main(String[] args) 
 {
  C obj = new C();
  obj.funcA();
  obj.funcB();
  G obj1 = new G();
  obj1.funcD();
  obj1.funcE();
  obj1.funcF();
 }
}

interface A 
{
   void funcA();
}
interface B extends A 
{
   void funcB();
}
class C implements B 
{
   public void funcA()
    {
      System.out.println("This is funcA");
   }
   public void funcB()
    {
      System.out.println("This is funcB");
   }
}

interface D 
{
 void funcD();
}
interface E 
{
 void funcE();
}
interface F extends D, E
{
 void funcF();
}
class G implements F
{
 public void funcD()
 {
  System.out.println("This is funcD");
 }
 public void funcE()
 {
  System.out.println("This is funcE");
 }
 public void funcF()
 {
  System.out.println("This is funcF");
 }
}
