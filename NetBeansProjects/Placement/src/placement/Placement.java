/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
public class Placement {

   static int reverse(int num)
   {
       int rev_num=0;
       while(num>0)
       {
           rev_num=rev_num*10+rev_num%10;
           num=num/10;
       }
       return rev_num;
   }
   
   static int isPalinidrome(int num)
   {
       int rev_num=reverse(num);
       if (rev_num==num)
           return 1;
       else
           return 0;
   }
    
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(isPalinidrome(num)==1)
        {
            System.out.println("Yes");
        }
        
    }        

    
}
