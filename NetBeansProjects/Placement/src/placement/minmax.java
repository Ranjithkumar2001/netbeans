package placement;

import java.util.Scanner;

public class minmax {
    
     
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tem=0;
        int min=9;
        int max=0;
        while(num!=0)
        {
            int rem=num%10;
            if(rem>max)
                max=rem;
            if(rem<min)
                min=rem;
            num=num/10;
        }
        System.out.println(max+min);
    }

    
}
