import java.util.Scanner;
class products
{
	int prdcod;
	String prdname;
	double prdprice;
	Scanner sc=new Scanner(System.in);
	products()
	{
		System.out.println("enter the product code :" );
		prdcod=sc.nextInt();
		System.out.println("enter the name of the product " );
		prdname=sc.nextLine();
		System.out.println("enter the price of the product " );
		prdprice=sc.nextDouble();
	}
	void display()
	{
		System.out.println("details of the product has lower price" );
		System.out.println("product code :"+prdcod);
		System.out.println("product name:"+prdname);
		System.out.println("product price :"+prdprice);
	}
}
class product
{
	public static void main(String args[])
	{
		
		products obj1=new products();
		products obj2=new products();
		products obj3=new products();
			
		if(obj1.prdprice<obj2.prdprice)
		{
			if(obj1.prdprice<obj3.prdprice)
			{
				obj1.display();
			}
			else
			{
				obj3.display();
			}
		}
		else
		{
			if(obj2.prdprice<obj3.prdprice)
			{
				obj2.display();
			}
			else
			{
				obj3.display();
			}
		}
		
		
	}
}

