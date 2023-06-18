package jdbc;
import java.sql.*;
public class jdbccheck {
    
    Connection con=null;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cfb", "root", "root");
             System.out.println("Connection sucess");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
    
    public void display(){
        try{
            String uid,pass;
            Statement st=con.createStatement();
            ResultSet rt=st.executeQuery("select * from cfb.college");
            while(rt.next()){
                uid=rt.getString("collegename");
                pass=rt.getString("address");
                System.out.println(uid+"  :  "+pass);
            
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void login(String uid,String pass) throws SQLException{
        Statement st=con.createStatement();
        ResultSet rt=st.executeQuery("select username,password from student");
        while(rt.next()){
        if(rt.getString(1).equals(uid) && rt.getString(2).equals(pass)){
                System.out.println("Sucess");
            }
    }
    }
    
    public static void main(String args[]) throws SQLException{
        
        jdbccheck jd=new jdbccheck();
        jd.getConnection();
        jd.login("Ranjith","1234");
        //jd.display();
    }
}
