import java.util.*;

class employee
{
  int empid;
  String name,address;
  float salary;
  
  employee(int emp_id,String _name_,String addrs,float sal)
  {
    this.empid= emp_id;
    this.name= _name_;
    this.address= addrs;
    this.salary= sal;
  }
}
class Teacher extends employee
{
  
   String department,subject;
   Teacher(int empid,String name,String address,float salary,String dept,String sub)
   { 
     super(empid,name,address,salary);
     this.department= dept;
     this.subject= sub;
   }
   
   public void display()
	{
	        Scanner sc= new Scanner(System.in);
		System.out.println("Employee id = "+empid);
		System.out.println("Name = "+name);
		System.out.println("Salary= "+salary);
		System.out.println("Address= "+address);
		System.out.println("Department= "+department);
		System.out.println("Subject ="+subject);
	}
   
  
  public static void main(String args[])
  { 
    Scanner sc= new Scanner(System.in);
   
    System.out.println("enter the no of employee");
    int n =sc.nextInt();
    Teacher objs[] =new Teacher[n];
    for(int i=0;i<n;i++)
    { 
      System.out.println("----------------");
      System.out.println("enter the id of the employee");
      int empid =sc.nextInt();
      System.out.println("enter the name of the employee");
      String name =sc.next();
      System.out.println("enter the address of the employee");
      String address =sc.next();
      System.out.println("enter the salary of the employee");
      float salary =sc.nextFloat();
      System.out.println("enter the department of the teacher");
      String dept =sc.next();
      System.out.println("enter the subject of the teacher");
      String sub =sc.next();
      
      objs[i]= new Teacher(empid,name,address,salary,dept,sub);
      
     }
     System.out.println("The details of the employees are");
     for (int i=0;i<n;i++)
		{
		       System.out.println("----------------");
			objs[i].display();
		}
    
    
  }
}
