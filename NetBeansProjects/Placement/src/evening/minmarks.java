package evening;

import java.util.Scanner;

public class minmarks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int j=0,i=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int min=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(i!=j){
                sum++;
            }
        }
        for(i=0;i<n;i++){
            min+=arr[i];
        }
        if(sum==0){
            System.out.println(min);
        }else{
            System.out.println((min+2*(sum)));
        }
    }
}
