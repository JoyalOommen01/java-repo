import java.util.Scanner;
class rectangles
{
	double length;
	double breadth;
    void setData(double l,double b)
    {
	length=l;
	breadth=b;
     }
	void display()
	{
		System.out.println("area of rectangle is"+(length*breadth));
	}
}
class rectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		rectangles obj1=new rectangles();
	        obj1.setData(12.48,13);
		obj1.display();
		
		
		
	}
}

