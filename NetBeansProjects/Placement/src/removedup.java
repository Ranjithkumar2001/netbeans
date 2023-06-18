
import java.util.Scanner;


public class removedup {
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int m=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    continue;   
                }else
                {
                    arr[k]=arr[i];
                    k=k+1;
                }
            }
             m=k;
        }
        for(int i=0;i<m;i++)
        {
           System.out.print(arr[i]+" ");
        } 
        }
        
    
}
