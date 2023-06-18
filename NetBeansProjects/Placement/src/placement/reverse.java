
import java.util.*;


/**
 *
 * @author ELCOT
 */
public class reverse {
    
    int rev(String str)
    {

        return Integer.parseInt(str);
  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverse r=new reverse();
        System.out.println(r.rev(str));
    }
    
}
