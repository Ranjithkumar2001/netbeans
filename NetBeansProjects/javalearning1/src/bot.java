import java.util.*;

public class bot {
    public static void main(String[] args)
    {
        //System.out.println("1.Connect to Support\n 2.Just Browsing\n 3.Enquiry");
        Scanner sc= new Scanner(System.in);
        int ch=sc.nextInt();
       
        final int val =1;// final key word is constant variable.
        final int val1 =2;
        final int val2 =3;
       /* float ch=sc.nextFloat();//-> In switch case  can't be use float.
        final float val =1.1;//-> final key word is constant variable.
        final float val1 =2.2;
        final float val2 =3.2;*///-> if use float ,it comes error.s
        switch(ch)
        {
            case val:
                System.out.println("Out repiler will join you");
                break;
            case val1:
                System.out.println("Great !! I am here if you need me");
                break;//optional
            case val2:
                System.out.println("Please drop your name and email will get in touch");
                break;
            default://optional
                System.out.println("Invalid entry");
        }
    }
}
