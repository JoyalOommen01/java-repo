import java.util.*;
class area
{
  void area(int a)
  {
    System.out.println("Area of square = "+a*a);   
  }
  void area(int a,int b)
  {
    System.out.println("Area of Rectangle = "+a*b);
  }
  void area(double r)
  {
    System.out.println("Area of circle = "+3.14*r*r);   
  }
  
}
class shapes
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
     area ar= new area();
     System.out.println("enter the side of square");
     int side =sc.nextInt();
     ar.area(side);
     System.out.println("enter the length and breadth of rectangle");
     int length =sc.nextInt();
     int breadth =sc.nextInt();
     ar.area(length,breadth);
     System.out.println("enter the radius of circle");
     double radius =sc.nextInt();
     ar.area(radius);
   }
}
