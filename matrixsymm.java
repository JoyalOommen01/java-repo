import java.util.Scanner;
class matrixsymm
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("enter the number of cols:");
		int cols = sc.nextInt();
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];
		
		System.out.println("enter the elements of matrix1");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix2[j][i]=matrix1[i][j];
			}
		
		}
		int flag=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix2[i][j]!=matrix1[i][j])
				{
					 flag=1;
				}
				
			}
		
		}
		if(flag==1)
		{
			System.out.println("matrix is not symmetric");
		}
		else
		{
			System.out.println("matrix is  symmetric");
		}
	}
}	
		
		
