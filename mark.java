import java.util.*;

class mark
{
  public static void main(String args[])
  {
    int total=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of subjects");
    int n=s.nextInt();
    int []marks=new int[n];
    System.out.println("enter the marks out of 100");
    for(int i=0;i<n;i++)
    {
      marks[i]=s.nextInt();
      total = total+ marks[i];
    }
    int perc= total/n;
    
    System.out.println("sum= "+ total); 
     System.out.println("percentage = "+ perc);    
  }
}
