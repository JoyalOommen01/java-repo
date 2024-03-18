import java.util.Scanner;
public class leap
{
	
	
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter start year:");
		int startyear = sc.nextInt();
		System.out.println("enter end year:");
		int endyear = sc.nextInt();
		
		for(int year = startyear; year<=endyear; year++)
		{
			if((year % 4 == 0 && year % 100!=0)||(year%400 == 0 ))
			{
				System.out.println(year);
			}
		}
	}
}
