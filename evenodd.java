import java.util.Scanner;
class check
{
	int num;
	
	void display()
	{
		if(num%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is even");
	}
}
class evenodd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		check obj1=new check();
	
		System.out.println("enter the number");
		obj1.num=sc.nextInt();
		obj1.display();
		
		
		
	}
}

