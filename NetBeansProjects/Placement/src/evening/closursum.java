package evening;

import java.util.Scanner;
public class closursum {
//    public static int clusure(n){
//        int sum=0;
//        
//        return sum;
//    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        String str=Integer.toString(n);
        int f=0;
        for(int i=0;i<str.length()/2;i++){
            //f+="(str.charAt(i))"+"(str.charAt(str.length()-1-i))";
            f=(str.charAt(i)-'0')*10+(str.charAt(str.length()-i-1)-'0');
            System.out.println(f);
            sum+=f;
           // f="";
        }
        System.out.println(sum);
    }
    
}
