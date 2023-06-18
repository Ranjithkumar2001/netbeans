import java.util.*;
import java.lang.String;
public class ScannerClass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name , ID , Salary");
        //String name= sc.next();// read one line
        String name= sc.nextLine();// read line by line
        int id = sc.nextInt();
        float sal=sc.nextFloat();
        System.out.println(name + id + sal);
               
        
    }
    
}
