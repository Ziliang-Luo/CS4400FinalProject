package user;

import java.sql.*;
import db_connection.Db_connection;

public class Validate
 {
	//check valid user for login
    public static boolean checkUser(String email,String password) {
     boolean state =false;
     Connection myConn = null;
     PreparedStatement ps = null;
     try{
    	myConn = Db_connection.getConnection();
    	String query = "select * from User where email=? and password=?";
        ps = myConn.prepareStatement (query);                        
        ps.setString(1, email);
        ps.setString(2, password);
        ResultSet rs =ps.executeQuery();
        state = rs.next();
       
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return state;                 
 }   
}
