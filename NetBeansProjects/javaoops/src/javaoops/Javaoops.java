package javaoops;
class math{
    math(){
        
    }
    public static int add(int x,int y){
        return x+y;
    }
    math(int x){
        System.out.println("x="+x);
    }
    public int sub(int x,int y){
        return x-y;
    }
}
class muldiv extends math{
    public int multi(int x,int y){
        return x*y;
    }
    
    public int div(int x,int y){
    return x/y;
    }
}

public class Javaoops {

    public static void main(String[] args) {
        muldiv as=new muldiv();
       // math();
       math ad=new math();
       math aa=new math(34);
        System.out.println(math.add(5, 8));
        System.out.println(as.div(6,2));
        
    }
    
}
