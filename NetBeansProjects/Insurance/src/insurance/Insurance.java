package insurance;
import java.util.*;
class Signin{
 
    HashMap<String,String> info=new HashMap<String,String>();
 
    static Scanner sc=new Scanner(System.in);
    String  uid,pass;

    public boolean login(){
        
        System.out.println("Enter User ID :");
        uid=sc.nextLine();
        if(info.containsKey(uid)){
        } else {
            System.out.println("User id not found...");
            return false;
        }
        System.out.println("Enter Password :");
        pass=sc.nextLine();
        
        if(info.get(uid).equals(pass)){
            return true;
        }
    return false;
    } 
}
class GetData{
    static String type;
    static int year,isv;
    static float gst=0.18f,x=0.1f, ncb;
    
    public static void getData(){
        System.out.print("Type:");
        type=Signin.sc.nextLine();
        System.out.print("Year:");
        year=Signin.sc.nextInt();
        System.out.print("Insured Value:");
        isv=Signin.sc.nextInt();
        //ncb=calcncb(type,year);
    }   
    
}
class Premium{  
    
    public float premium(int isv,float x,float ncb){
        return (isv*x)-((isv*x)*ncb/100);
    }
    
    public float premium(int isv,float x,float ncb,float gst){
        float p=this.premium(isv, x, ncb);
        return p+p*gst;
    }
    
}

public class Insurance {
    
    public static void main(String[] args) {
        
        Signin lg=new  Signin();
        //GetData gd=new GetData();
        lg.info.put("Ranjith","1234");
        lg.info.put("Abi","12345");
        System.out.println(lg.info);
        System.out.println("...WELCOME TO INSURANCE PORTAL...");
        if(lg.login()){
            System.out.println("Login Sucess...");
            GetData.getData();
        }
        else{
            System.out.println("Try again...");
            lg.login();
        }  
    }
}
