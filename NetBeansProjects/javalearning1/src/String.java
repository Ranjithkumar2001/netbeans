

public class String 
{
    
        public static void main(String[] args)
       /* {
            java.lang.String s = "java";
            java.lang.String s2 = "code";
          // s=s+s2;//explicity assign value
            System.out.println(s+s2);// string is immutable because string never change the value unless assign the any value for string.
            System.out.println(s.concat(s2));//concat->+operator
            System.out.println(s);
           // String s3="java code";
            System.out.println(s.length());
            //System.out.println(s2.length());
            //System.out.println(s3.length());
            
            
           
            
        }*/
           /* {
            String s="java";
            String s2="java";
            String s3= new String("java");
           // System.out.println(s==s2);//refer the address of the data
           // System.out.println(s2==s3);//refer the address of the data
            //System.out.println(s.equals(s2));//refer the data
            //System.out.println(s2.equals(s3));//refer the data
            System.out.println(s2.compareTo(s3));//output=> 0->equal; +ve->greater; -ve->smaller.
        }*/

        /*{
            String name[]={"james","jacob","priya","meenu","yale","vinu"};
            int size=name.length;
            String temp=null;
            
            for(int i=0;i<size;i++)
            {
                for(int j=i+1;j<size;j++)
                {
                    if(name[j].compareTo(name[i])<0)
                    {
                        temp=name[i];
                        name[i]=name[j];
                        name[j]=temp;
                        
                    }
                }
            }
        }*/
        /*{
            String s="This is java programing";
            String arr[]= s.split(" ");
            for(String val:arr)
                System.out.println(val);//string buffer is thread safe.,but string builder is not thread safe.
            char c_arr[]=new char[s.length()];
            s.getChars(8, 20, c_arr, 0);//start index,end index, destination array, destination place the array.
            System.out.println(c_arr);
        }*/
   //string buffer is thread safe.,but string builder is not thread safe.
       /* {
             String s="This is java programing";
             String s2="Java";
             String s3=" Java";
             String s4="java";
             System.out.println(s.charAt(2));//index{i}
             System.out.println(s.indexOf("is"));//2
             System.out.println(s.lastIndexOf("is"));//5
             System.out.println(s.replace("java","Python"));
             System.out.println(s);
             System.out.println(s.substring(8));
              System.out.println(s.substring(8,11));
               System.out.println(s.startsWith("Th"));
                System.out.println(s.endsWith("ing"));
                System.out.println(s2.equals(s3));
                System.out.println(s2.equals(s3.trim()));//trim->remove the empty space;
                System.out.println(s2.equals(s4));
                System.out.println(s2.equalsIgnoreCase(s4));//ignor-> remove the case sensitive
                System.out.println(s2.compareTo(s4));
                System.out.println(s2.compareToIgnoreCase(s4));
        }*/
                
                
                   //STRING BUFFER
        {
            StringBuffer sb=new StringBuffer();
            sb.append("java code");
            System.out.println(sb.length());
            sb.insert(5, "pratice ");//where to insert, what to insert.
            System.out.println(sb);
            System.out.println(sb.indexOf("cod"));
            System.out.println(sb.lastIndexOf("a"));
            System.out.println(sb.replace(0,3,"Python"));
            System.out.println(sb.substring(0));//print  till last
            System.out.println(sb.substring(0,6));//start index , end index
            System.out.println(sb.delete(17,21));//delete start index , delete end index
            System.out.println(sb.reverse());
            
        }      
}
