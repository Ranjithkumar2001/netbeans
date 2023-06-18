import java.util.*;

public class countzero {
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row&Col");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[5][5];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                   count++;
                }
            }
        }
         System.out.println("No. of Zero :  "+count);

    }
    
}
