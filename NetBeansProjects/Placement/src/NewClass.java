import  java.util.*;
public class NewClass {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        StringTokenizer st=new StringTokenizer(str);
        while(st.hasMoreTokens())
        { 
            String str1=st.nextToken();
            String rev=new StringBuffer(str1).reverse().toString();
            if(str1.equals(rev))
                count++;
        }
        System.out.println(count);
        
    }
    
}
