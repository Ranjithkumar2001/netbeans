import java.util.*;
public class login {
    public static void main(String[] args)
    {
        java.lang.String username="user123";
        int password=1234;
        System.out.println("user name:");
        Scanner sc=new Scanner(System.in);
        java.lang.String in_user=sc.next();
        System.out.println("password");
        int in_pass=sc.nextInt();
        if(username.equals(in_user)&&password==in_pass)
        {
            System.out.println("Login successfully");
        }
         else if(!(username.equals(in_user))||(password!=in_pass))
         {
            System.out.println("Either the username and password in incorrect");
        }
      /*  else if(!(username.equals(in_user))&&password==in_pass)
        {
            System.out.println("Incorrect username");
        }
        else if(username.equals(in_user)&&(password!=in_pass))
        {
            System.out.println("Incorrect password");
        }*/
        else
        {
            System.out.println("Incorrect credit");
        }
        
    }
}
