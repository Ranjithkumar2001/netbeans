package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ReLoUp {
    
    static Connection con;
  
    public static Connection getConnection() {
        con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
   
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return con;
    }
    
    public static Connection login(String uid,String pass ){
       //con=null;
       try{
            getConnection();
            Statement st=con.createStatement();
            ResultSet rt=st.executeQuery("select uid,pass from userdata");
            while(rt.next()){
            if(rt.getString(1).equals(uid) && rt.getString(2).equals(pass)){
               return con;
            }
            }
       }catch (SQLException e){
           System.out.println(e);
       }
       return null;
    }
    public static Connection register(String uid,String pass){
        con=null;
        try{
            getConnection();
            String query="insert into userdata values(?,?)";
            PreparedStatement dml=con.prepareStatement(query);
            dml.setString(1,uid);
            dml.setString(2,pass);
            if(dml.executeUpdate()>0)
                return con;
    
       }catch (SQLException e){
           System.out.println(e);
       }
        return null;
    }
    
    public static Connection update(String uid,String pass){
        con =null;
        try{
            getConnection();
            String query="update userdata set pass=? where uid=?";
            PreparedStatement dml=con.prepareStatement(query);
            dml.setString(1,pass);
            dml.setString(2,uid);
            if(dml.executeUpdate()>0)
                return con;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    } 
}
//    public static void main(String args[]){
//        
//       if(update("sri","1234")!=null)
//           System.out.println("Sucess");
//       else
//           System.out.println("Failed");
//    }
//}
