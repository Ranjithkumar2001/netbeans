/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning1;
   /*  class Test
    {
        void display()
        {
            System.out.println("This is display");
        }
         static void display1()
        {
            System.out.println("This is  static display");
        }
    }
public class Static {
    
   public static void main(String[] args)
   {
       Test t1=new Test();
       t1.display();
       t1.display1();
       //Test.display();//error non static method display
       Test.display1();
       
   }
}*/
 class Test
    {
         static int a=10;
        void display()
        {
            System.out.println("This is display");
            System.out.println("Display:" +a);
        }
         static void display1()
        {
            System.out.println("This is  static display");
            System.out.println("Display:" +a); // error-> non static variable cannot be access
        }
    }
public class Static {
    
   public static void main(String[] args)
   {
       Test t1=new Test();
       t1.display();
       t1.display1();
       //Test.display();//error non static method display
       Test.display1();
       
   }
}
