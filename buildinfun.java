import java.util.*;
class buildinfun
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first array");
    String str1= sc.next();
    System.out.println("Enter first array");
    String str2= sc.next();
    System.out.println("concatenation::-"+str1.concat(str2));
    System.out.println("length of string one is:- "+str1.length());
    System.out.println("String one in Uppercase:-"+str1.toUpperCase());
    System.out.println("replace o to i in string1:-"+str1.replace('o','i'));
    System.out.println("index of lo in string:-"+str1.indexOf("lo"));
    char chararray[]=str1.toCharArray();
    System.out.print("string one to char:-");
    for(int i=0;i<str1.length();i++)
    {
      System.out.print(chararray[i]+" ");
    }
      System.out.println("");
    System.out.println("String buffer class:-");
    StringBuffer string1= new StringBuffer("hello");
    StringBuffer temp1= new StringBuffer("hello");
    StringBuffer string2= new StringBuffer("hello");
    StringBuffer temp2= new StringBuffer("hello");
    System.out.println("appending string one to string two:-"+string1.append(string2));
    System.out.println("length of string one in stringbuffer:- "+string1.length()); 
     System.out.println("insert operation :-"+string1.insert(3,temp2));
  }
}
