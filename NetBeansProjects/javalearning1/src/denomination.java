import java.util.*;
public class denomination {
    
        public static void main(String[] args)
       /* {
            int no_2000=0;
            int no_500=0;
            int no_200=0;
            int no_100=0;
            int no_50=0;
            int no_20=0;
            int no_10=0;
            int no_5=0;
            int no_2=0;
            int no_1=0;
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int amt=sc.nextInt();
            if(amt>=2000)
            {
                no_2000=amt/2000;
                amt=amt-(no_2000*2000);
            }
            if(amt>=500)
            {
                no_500=amt/500;
                amt=amt-(no_500*500);
            }
            if(amt>=200)
            {
                no_200=amt/200;
                amt=amt-(no_200*200);
            }
             if(amt>=100)
            {
                no_100=amt/100;
                amt=amt-(no_100*100);
            }
              if(amt>=50)
            {
                no_50=amt/50;
                amt=amt-(no_50*50);
            }
              if(amt>=20)
            {
                no_20=amt/20;
                amt=amt-(no_20*20);
            }
              if(amt>=10)
            {
                no_10=amt/10;
                amt=amt-(no_10*10);
            }
               if(amt>=5)
            {
                no_5=amt/5;
                amt=amt-(no_5*5);
            }
                if(amt>=2)
            {
                no_2=amt/2;
                amt=amt-(no_2*2);
            }
              if(amt>=1)
            {
                no_1=amt/1;
                amt=amt-(no_1*1);
            }
              total=
        }*/
        {
            int no_5=0;
            int no_1=0;
            System.out.println("Enter the available 5 rupees:");
            Scanner sc = new Scanner(System.in);
            int avil_5=sc.nextInt();
            System.out.println("Enter the available 1 rupees:");
            int avil_1=sc.nextInt();
            System.out.println("Enter the amount:");
            int amt=sc.nextInt();
            if(amt>5)
            {
                no_5=amt/5;
                if(no_5>avil_5)
                {
                   no_5= avil_5;
                }
               amt=amt-(5*no_5); 
                    
            }
            if(amt>1)
            {
                no_1=amt/1;
                if(no_1>avil_1)
                {
                   no_1= avil_1;
                }
               amt=amt-(1*no_1);
                    
            }
            if(amt>0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(no_5);
                System.out.println(no_1);
            }
        }
    
    
}
