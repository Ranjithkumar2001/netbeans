
package javalearning1;

import java.util.Scanner;

public class arrmax {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int rep[]=new int[Integer.MAX_VALUE];
        for(int j=0;j<rep.length;j++){
            rep[j]=j;
        }
        for(int j=0;j<rep.length;j++){
            System.out.println(rep[j]);
        }
    }
    
}
