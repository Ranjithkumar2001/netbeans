/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) {

	Scanner sc=new Scanner(System.in);
   int m=sc.nextInt();
   while(m>0){
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[k];
      int sum=0;
      for(int i=0;i<k;k++){
         arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      for(int i=0;i<n;i++){
         sum+=arr[i];
      }
      System.out.println(sum);
m--;
   }

   }
}
