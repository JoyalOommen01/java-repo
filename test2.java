import java.util.Scanner;
class sum
{
  int a;
  int b;
  void displaysum()
  {
	System.out.println("sum of "+a+"and "+b+"is "+(a+b));	
   }
 
}
class test2
{ 
	public static void main(String args[])
	{
		sum r=new sum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first element");
		r.a=sc.nextInt();
		System.out.println("enter the second element");
		r.b=sc.nextInt();
		r.displaysum();
		
	  }
} 
