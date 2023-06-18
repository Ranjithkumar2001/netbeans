import java.io.*;
import java.lang.String;
public class JavaLearning {

public static void main(String args[]) throws IOException
{
    //InputStreamReader inp = new InputStreamReader(System.in);
    //OR
    InputStreamReader inp = new InputStreamReader(System.in);
   // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br = new BufferedReader(inp);
    System.out.println("Enter Name:");
   String nam=br.readLine();
    
    System.out.println("Enter Id:");
    int id=Integer.parseInt(br.readLine());
    
     System.out.println("Enter Gender:");//bottel neck problem-> size difference
   // char gen=(char)br.read();//read()-> read single stroke
   //char gen= br.readLine().charAt(0);  
   char gen =(char)br.read();
   br.skip(1);
    System.out.println("Enter salary:");
    float sal=Float.parseFloat(br.readLine());//readLine-> read a string
    
    
    System.out.println(nam+id+sal+gen);
    
    
}
}
