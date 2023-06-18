import java.util.*;



public class condition {
    public static void main (String[] args)/*
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
        System.out.println("positive");}
        else if(num<0){
        System.out.println("Negative");}
        else
        System.out.println("Either positive or negative");
    }*/
    {
      System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt(); 
         System.out.println("Enter the number:");
          int num2=sc.nextInt(); 
         // if(num1>num2)
          //{
              System.out.println("num1 is greater");
          //}
          //if(num2>num1)
          //{
              System.out.println("num2 is greater");
         // }
          System.out.println(num1>num2?num1+"is greater":num2+"is greater");
    } 
    
}
