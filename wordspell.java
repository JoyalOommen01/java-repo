import java.util.*;
class wordspell
{
  public static void main(String args[])
  {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string:");
    String name = sc.nextLine();
    char chararray[] = name.toCharArray();
    Arrays.sort(chararray);
    String newname="";
    newname = newname.valueOf(chararray);
    System.out.println("old string:"+name);
    System.out.println("sorted string:"+newname);
   }
}
