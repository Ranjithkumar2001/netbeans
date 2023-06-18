package evening;
import java.util.*;
public class triplet{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int r=0;r<n;r++)
            arr[r]=sc.nextInt();
            
        for(int r=0;r<n;r++){
            for(int c=r+1;c<n;c++){
                for(int k=c+1;k<n;k++){
                    if(arr[r]+arr[c]+arr[k]==m){
                        System.out.println("{"+arr[r]+","+arr[c]+","+arr[k]+"}");
                    }
                }
            }
        }
        
    }
}