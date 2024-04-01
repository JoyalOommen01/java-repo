
import java.util.*;

class Employee
{
  int eno;
  String ename;
  float salary;
  
  void input()
  {
       Scanner s =new Scanner(System.in);
       System.out.println("Enter the details of the Employee:");
       System.out.println("Enter the number of the Employee:");
       eno =s.nextInt();
       System.out.println("Enter the name of the Employee:");
       ename =s.next();
       System.out.println("Enter the salary of the Employee:");
       salary =s.nextFloat();
  }
  
  void display()
  {
    System.out.println("Employee no: "+eno);
    System.out.println("Employee name: "+ename);
    System.out.println("Salary information: "+salary);
  }
  
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the no of Employees:");
    int n= sc.nextInt();
    
    Employee emp[] = new Employee[n];
    
    for(int i=0;i<n;i++)
    {
       emp[i] = new Employee();
       emp[i].input();
       
    }
    
     System.out.println("Enter the number of the Employee to search:");
      int searcheno =sc.nextInt();
     int flag=0;
     for(int i=0;i<n;i++) 
     {
       if(emp[i].eno== searcheno)
       {
         emp[i].display();
         flag=1;
         break;
       }
     }
    if(flag==0)
       {
         System.out.println("Employee not found:");
       }
  }
}
