package placement;
import java.util.*;
public class calculator {
    static int result(int a,char o,int b){
        if(o=='+')
           return a+b;
         if(o=='-')
            return b-a;
          if(o=='*')
            return a*b;
           if(o=='/')
            return b/a;
      return 0; 
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        char token[]=exp.toCharArray();
        Stack<Character> op=new Stack<Character>();
        Stack<Integer> val=new Stack<Integer>();
        for(int i=0;i<exp.length();i++){
            if(token[i]=='('){
                op.push(token[i]);
            }
            else if(token[i]>='0'&&token[i]<='9'){
                val.push((int)token[i]);
            }else if(token[i]=='+'||token[i]=='-'||token[i]=='*'||token[i]=='/'){
              while(!op.empty()){
                   val.push(result(val.pop(),op.pop(),val.pop()));
                op.push(token[i]);
              }
            }
            else if(token[i]==')'){
                while(op.pop()!='('){
                   val.push(result(val.pop(),op.pop(),val.pop()));
                }
            }
        }
       System.out.print(val.pop());
    }
}
