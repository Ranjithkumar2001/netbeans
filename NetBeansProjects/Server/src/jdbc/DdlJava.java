package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DdlJava {
   
      static Scanner sc=new Scanner(System.in);
     static String dbname;
     static Connection con = null;
    
      public static Connection getConnection(String db) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbase="jdbc:mysql://localhost:3306/"+db;
            con = DriverManager.getConnection(dbase, "root", "root");
            System.out.println("Connected to db="+db);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return con;
    }
       
      public static void insert(String tb){
          try{
             
            String table="select * from "+DdlJava.dbname+"."+tb;
            Statement st=con.createStatement();
            ResultSet rt=st.executeQuery(table);
            System.out.println("Currently on table---> "+tb);
            ResultSetMetaData md=rt.getMetaData();
            int size=md.getColumnCount();
            String rh="";
            for(int i=1;i<=size;i++)
                rh=rh+md.getColumnName(i)+" : "; 
                            
            System.out.println("Enter Data for-->"+rh);
           
            String tmp;
              tmp = sc.nextLine();
            System.out.println(tmp);
 
          }catch(SQLException e){
            System.out.println(e);
          }
        }
      
      public static void update(String tb){
          try{
            String table="select * from "+DdlJava.dbname+"."+tb;
            Statement st=con.createStatement();
            ResultSet rt=st.executeQuery(table);
            System.out.println("On table = "+tb);
            System.out.print("Enter key to update--> ");
            String key=sc.nextLine();
            System.out.print("Enter value to update--> ");
            String val=sc.nextLine();
            
            String update="update "+tb+"set "+key+"= "+val;
          }catch(SQLException e){
              System.out.println(e);
          }
          
      }
       
      public static void delete(String tb){
          try{
              
          }catch(Exception e){
              System.out.println(e);
          }
          
      }
      
       public static void display(String tb){
        try{
            String table="select * from "+DdlJava.dbname+"."+tb;
            Statement st=con.createStatement();
            ResultSet rt=st.executeQuery(table);
            System.out.println("On table = "+tb);
            ResultSetMetaData md=rt.getMetaData();
            int size=md.getColumnCount();
            int n=0;
            String rd="",rh="";
            while(rt.next()){
                n++;
                
                for(int i=1;i<=size;i++){
                    if(i==size){
                        rh=rh+md.getColumnName(i);
                        
                        rd=rd+rt.getString(i);
                    }else{
                    rh=rh+md.getColumnName(i)+" : ";
                    
                    rd=rd+rt.getString(i)+" : ";
                    }
                }
                if(n==1)
                    System.out.println(rh);
                System.out.println(rd);
                rd="";
                rh="";
            
        }
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
      
      public static void main(String args[]){
  
        System.out.print("Enter Database Name to connect---> ");
        dbname=sc.nextLine();
        getConnection(dbname);
        System.out.print("Enter the Table name---> ");
        String tb=sc.nextLine();
        boolean rep=true;
        do{
        System.out.println("<--- SELECT OPERATION --->");
        System.out.println(" 1--> INSERT\n 2--> UPDATE\n 3--> DELETE\n 4--> DISPLAY\n");
        System.out.print("ENTER OPERATION-->");
        int ch=sc.nextInt();
        try{
        switch(ch){
            case 1 -> insert(tb);
            case 2 -> update(tb);
            case 3 -> delete(tb);
            case 4 -> display(tb);
            default -> System.out.println("Select valid operation");
        }
        }catch(Exception e){
              System.out.print(e);
              }
        System.out.println("\n\n\nENTER 1-->Continue\n\t2-->Exit");
        int c=sc.nextInt();
        if(c==1)
            rep=true;
        else if(c==2)
            rep=false;
        }while(rep);
        
    }
}
