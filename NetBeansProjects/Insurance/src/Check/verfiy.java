package Check;
import db.ReLoUp;
import java.util.Scanner;
public class verfiy {
//    
//    public static String getData(){
//      
//    }
//   
    public static void main(String []args){
        //ReLoUp ob=new ReLoUp();
        Scanner sc=new Scanner(System.in);
        String uid= sc.nextLine();
        String pass=sc.nextLine();
        int ch=sc.nextInt();
        
        switch(ch){
            case 1 -> { 
                if(ReLoUp.login(uid,pass)!=null)
                    System.out.println("Success");
                else
                    System.out.println("fail");
            }
            case 2 -> { 
                if(ReLoUp.register(uid,pass)!=null)
                    System.out.println("Success");
            }
            case 3 -> { 
                if(ReLoUp.update(uid,pass)!=null)
                    System.out.println("Success");
            }
            
            default -> System.out.println("Select valid operation");
        }
    }
}
