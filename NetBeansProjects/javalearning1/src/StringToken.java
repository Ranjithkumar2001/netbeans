import java.util.*;
import java.lang.String;
public class StringToken {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name id and salary:");
        String val=sc.nextLine();
        StringTokenizer st= new StringTokenizer(val,",");//strintokenizer-> split the value.
        String name = st.nextToken();
        int id=Integer.parseInt(st.nextToken());
        float sal=Float.parseFloat(st.nextToken());
        System.out.printf("%s\n%d\n%f",name,id,sal);
    }
  /*  {
        String str ="java";
        int i=10;
        int b=20;
        char c='A';
        System.out.println(str);
        System.out.print(str);
        System.out.println(str);
        System.out.printf("%s%d",str,i);
        System.out.println(str);
        System.out.println(str+i+b);
        System.out.println(c+i);
          System.out.println(i+c);
          System.out.println(str+(i+b));
          System.out.println("ja\bva");
          System.out.println("ja\"va");
          System.out.println("ja\tva");
          System.out.println("ja\nva");
          
        
    }
    */
}
   