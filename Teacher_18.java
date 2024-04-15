import java.util.*;

class person
{
  int age;
  String pname,address,gender;
  person(String name,String address,String gender,int age)
  {
    this.pname=name;
    this.address=address;
    this.gender=gender;
    this.age=age;
  }
}

class employee extends person
{
  int emp_id;
  String cp_name,qualification;
  float salary;
  
  employee(String name,String address,String gender,int age,int empid,String company,String quali,float salary)
  { 
    super(name,address,gender,age);
    this.emp_id= empid;
    this.cp_name= company;
    this.qualification= quali;
    this.salary= salary;
  }
}
class Teacher_18 extends employee
{
   int teach_id;
   String department,subject;
   Teacher_18(String name,String address,String gender,int age,int empid,String company,String quali,float salary,int tcrid,String dept,String sub)
   { 
     super(name,address,gender,age,empid,company,quali,salary);
     this.teach_id=tcrid;
     this.department= dept;
     this.subject= sub;
   }
   
   public void display()
	{
	        Scanner sc= new Scanner(System.in);
		System.out.println("Name = "+pname);
		System.out.println("Address= "+address);
		System.out.println("Gender= "+gender);
		System.out.println("Age = "+age);
		System.out.println("Employee id = "+emp_id);
		System.out.println("Company ="+cp_name);
		System.out.println("Qualification ="+qualification);
		System.out.println("Salary= "+salary);
		System.out.println("teachers Id= "+teach_id);
		System.out.println("Department= "+department);
		System.out.println("Subject ="+subject);
		
	}
   
  
  public static void main(String args[])
  { 
    Scanner sc= new Scanner(System.in);
   
    System.out.println("enter the no of employee");
    int n =sc.nextInt();
    Teacher_18 objs[] =new Teacher_18[n];
    for(int i=0;i<n;i++)
    { 
      System.out.println("----------------");
      System.out.println("enter the name ");
      String name =sc.next();
      System.out.println("enter the address");
      String address =sc.next();
      System.out.println("enter the gender ");
      String gender =sc.next();
      System.out.println("enter the Age");
      int age =sc.nextInt();
      System.out.println("enter the id of the employee");
      int empid =sc.nextInt();
      System.out.println("enter the company name");
      String company =sc.next();
      System.out.println("enter the qualification");
      String quali =sc.next();
      System.out.println("enter the salary of the employee");
      float salary =sc.nextFloat();
      System.out.println("enter the teacher id ");
      int tcrid =sc.nextInt();
      System.out.println("enter the department of the teacher");
      String dept =sc.next();
      System.out.println("enter the subject of the teacher");
      String sub =sc.next();
      
      objs[i]= new Teacher_18(name,address,gender,age,empid,company,quali,salary,tcrid,dept,sub);
      
     }
     System.out.println("The details of the employees are");
     for (int i=0;i<n;i++)
		{
		       System.out.println("----------------");
			objs[i].display();
		}
    
    
  }
}
