import java.util.*;
public class binaryReverse {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int j=0;
        int arr[]=new int[32];
         for(int i=31;i>=0;i--){
             int k=num>>i;
             if((k&1)>0)
             {
                 arr[j]=1;
                 j++;
             }
             else
             {
                 arr[j]=0;
                 j++;
             }
         }
         String revnum=Arrays.toString(arr);
        /* System.out.print(revnum);
         long dec=0;
         int base=2;
         int len=revnum.length();
         for(int i=len-1;i>=0;i--)
         {
             if(revnum.charAt(i)== '1')
             {
                dec+=base;
                base=base*2;
             }
         }
         System.out.println(dec);
*/
        System.out.print(Integer.parseInt(revnum));
    }
    
}
