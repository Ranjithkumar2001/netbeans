
import java.util.*;

public class Array_code 
{
    public static void main(String[] args)
    
   /* {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[3]=50;
        //int arr[5]={10,20,30,40,50};
        for(int var:arr)
           System.out.println(var);
       // for(int i=0;i<arr.length;i++)
         //   System.out.println(arr[i]);
    }*/
   /* {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        int k=10;
        for(int i=0;i<n;i++)
        {
            arr[i]=k;
            k+=10;
            
        }
        
        for(int val:arr)
            System.out.println(val);
        
    }*/
            //integer array
    /* {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
     
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        
        for(int val:arr)
            System.out.println(val);
        
    }*/
            //character array
            
    {
        System.out.println("Enter the size of the array");
       // Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        
        char arr[]=new char[5];
     
        arr[0]='a';
        arr[1]='b';
        
        
        for(char val:arr)
            System.out.println(val);//remaing 3 values NULL
        
    }    
    
}
