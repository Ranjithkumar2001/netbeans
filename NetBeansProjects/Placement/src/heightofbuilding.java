import java.util.*;
public class heightofbuilding {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int height=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        } 
        
        for(int i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
                height++;
        }
        
        System.out.println(height);
    }
    
}
