package javalearning1;
//import java.lang.*;
import java.util.*;
public class repeattms {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=0;
        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=Math.max(arr[j], max);
            }
        }
        
        int rep[]=new int[max+1];
        for(int j=0;j<n;j++){
            rep[arr[j]]=0;
        }
        for(int j=0;j<n;j++){
            rep[arr[j]]++;
        }
        for(int j=0;j<=max;j++){
            if(rep[j]==k){
                System.out.println(j+1);
            }
        }
    }
}
