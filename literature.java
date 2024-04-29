import java.util.*;
class Publisher
{
    static String pub_name;
}
 class Book extends Publisher
 { 
   static String book_name,author;
   static float price;
 }
 class Fiction extends Book
 {
  void display2()
  {
    System.out.println("fiction book details :");
    System.out.println("book name is:"+book_name);
    System.out.println("publisher name is:"+pub_name);
    System.out.println("author is:"+author);
    System.out.println("price is:"+price);
  }
 }
 class literature extends Book
 {
   void display1()
  {
    System.out.println("literature book details :");
    System.out.println("book name is:"+book_name);
    System.out.println("publisher name is:"+pub_name);
    System.out.println("author is:"+author);
    System.out.println("price is:"+price);
  }
   public static void main(String args[])
   {
       Scanner obj = new Scanner(System.in);
       
        System.out.println("enter literature book details:");
	System.out.println("enter the book name:");
	book_name= obj.next();
	System.out.println("enter the publisher name:");
	pub_name= obj.next();
	System.out.println("enter the author:");
	author= obj.next();
	System.out.println("enter the price:");
	price= obj.nextFloat();
	literature lite=new literature();
	lite.display1();
	
	
        System.out.println("enter fiction book details:");
	System.out.println("enter the book name:");
	book_name= obj.next();
	System.out.println("enter the publisher name:");
	pub_name= obj.next();
	System.out.println("enter the author:");
	author= obj.next();
	System.out.println("enter the price:");
	price= obj.nextFloat();
	Fiction fict=new Fiction();
	fict.display2();
     
   }
}
