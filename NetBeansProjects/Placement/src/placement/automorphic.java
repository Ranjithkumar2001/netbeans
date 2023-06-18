
package placement;
import java.util.*;
public class automorphic {
    
    public static boolean check(int n){
        int sq=n*n;
        while(n!=0){
        if(n%10!=sq%10)
            return false;
        n/=10;
        sq/=10;
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       /* int temp=n;
        int tem=0,a=1;
        int sqnum=n*n;
        int no=sqnum/100;
        while(sqnum>no){
            int rem=sqnum%10;
            tem=rem*a+tem;
            sqnum=sqnum/10;
            a*=10;
        }
        if(temp==tem)
        System.out.println("YES");
        else
            System.out.println("NO");
    */
       if(check(n)==true)
            System.out.println("YES");
        else
            System.out.println("NO");

           }
    
}
