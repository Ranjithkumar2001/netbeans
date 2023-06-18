import java.util.*;

public class hole 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of holes:");
        int nh=sc.nextInt();
        System.out.println("Enter the diameter of holes:");
        int hol[]=new int[nh];
        int cap[]=new int[nh];
        for(int i=0;i<nh;i++)
        {
            hol[i]=sc.nextInt();
            cap[i]=i+1;
        }
        System.out.println("Enter the number of balls:");
        int nb=sc.nextInt();
        System.out.println("Enter the diameter of balls:");
        int bal[]=new int[nb];
     
        for(int i=0;i<nb;i++)
        {
            bal[i]=sc.nextInt(); 
        }
        int pos[]=new int[nb];
        for(int i=0;i<nb;i++)
        {
            for(int j=nh-1;j>=0;j--)
            {
              if(hol[j]>=bal[i]&&cap[j]!=0)
              {
                  cap[j]--;
                  pos[i]=j+1;
                  break;
                  
              }
            }
        }
        for(int val:pos)
           System.out.print(val+" ");
        
    }
}
