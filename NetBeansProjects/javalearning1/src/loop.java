import java.util.*;
public class loop {
    public static void main(String[] args)
    {
       // for(int i=0;i<11;i++)
      /*  int i,j;
        for(i=0,j=3 ;( i<4 && j>0 ) ; i++, j--)
        {
            System.out.println(i+" "+j);
        }*/
        for(int i=0;i<6;i++)
        {
            if(i==3)
            {
               // break;//-> exit the loop
                continue;//->skip 3
            }
            System.out.println(i);
        }
    }
    
}
