import java.util.*;
import java.lang.String;
public class oddoreven {
    public static void main (String[] args)
    {
        int even_count=0;
        int odd_count=0;
        System.out.println("Enter the integer:");
        Scanner sc= new Scanner(System.in);
        String s1= sc.next();
        StringTokenizer st=new StringTokenizer(s1,",");
        int num1=Integer.parseInt(st.nextToken());
        int num2=Integer.parseInt(st.nextToken());
        int num3=Integer.parseInt(st.nextToken());
        int num4=Integer.parseInt(st.nextToken());
        int num5=Integer.parseInt(st.nextToken());
        int num6=Integer.parseInt(st.nextToken());
        if(num1%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
        if(num2%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
        if(num3%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
        if(num4%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
        if(num5%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
        if(num6%2==0)
        {
            even_count++;
        }
        else
        {
            odd_count++;
        }
        System.out.println(even_count +"even numbers");
        System.out.println(odd_count +"odd numbers");
    }
}
