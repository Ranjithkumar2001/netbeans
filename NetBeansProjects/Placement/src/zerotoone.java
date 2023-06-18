import java.util.*;
  
public class zerotoone {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tem=0,a=1;
        while(num!=0)
        {
            int rem=num%10;
            if(rem==0)
                rem=1;
            tem=rem*a+tem;
            num=num/10;
            a=a*10;
            
        }
        System.out.println(tem);
    }
    
}
