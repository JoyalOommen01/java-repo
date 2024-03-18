import java.util.*;
class sortst
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int total,i,j;
    String temp;
    System.out.println("enter the no of words");
    total= sc.nextInt();
    String []words= new String[total];
    for(i=0;i<total;i++)
    {
      words[i]= sc.next();   
    }
    for(i=0;i<total;i++)
    {
       for(j=0;j<total;j++)
      {
        if((words[i].compareTo(words[j]))<0)
        {
          temp= words[i];
          words[i]= words[j];
          words[j]= temp; 
        }
       }
     }
    for(i=0;i<total;i++)
    {
        System.out.println( words[i]);
    }
  }
}
