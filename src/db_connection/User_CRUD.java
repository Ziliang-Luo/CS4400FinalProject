package db_connection;

import java.sql.*;

public class User_CRUD {
	//check valid user for login
    public static boolean checkUser(String email,String password) {
     boolean state =false;
     Connection myConn = null;
     PreparedStatement ps = null;
     try{
    	myConn = Db_connection.getConnection();
    	String query = "select * from register where email=? and password=?";
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
    //create new user in User
    public void create_user(Integer UserID, String firstName, String lastName, Date birthday, String email, String password, String phonenumber) {
        Connection myConn = null;
        PreparedStatement ps = null;
        try {
            myConn = Db_connection.getConnection();
            String query = "INSERT INTO User()" + "VALUES(?,?,?,?,?,?,?)";
            ps = myConn.prepareStatement(query);
            ps.setInt(1, UserID);
            ps.setString(2, firstName);
            ps.setString(3, lastName);
            ps.setDate(4, birthday);
            ps.setString(5, email);
            ps.setString(6, password);
            ps.setString(7, phonenumber);
            ps.executeUpdate();
//          System.out.println("INSERT INTO person(UserID, firstName,lastName,birthday,email,password)" +
//                    "VALUES (?,?,?)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read_user(Integer UserID) {
        Connection myConn = null;
        //PreparedStatement ps = null;
        try {
            myConn = Db_connection.getConnection();
            String query = "select * from user where UserID ="+ UserID;
            Statement myStmt = myConn.createStatement();
            ResultSet rs = null;

            rs = myStmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2)
                        + rs.getString(3) + "," +rs.getString(4) + "," +
                        rs.getString(5) + "," + rs.getString(6) + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete_user(Integer UserID) {
        Connection myConn = null;
        PreparedStatement ps = null;
        try {
            myConn = Db_connection.getConnection();
            String query = "delete from user where UserID = ?";
            ps = myConn.prepareStatement(query);
            ps.setInt(1, UserID);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void update_user(String firstName, String lastName, Date DateOfBirth, String email, Integer flightID) {
        Connection myConn = null;
        PreparedStatement ps = null;
        try {
            myConn = Db_connection.getConnection();
            String query = "update user set firstName=?, lastName=?, DateofBirth=?, email=?, flightID=?";
            ps = myConn.prepareStatement(query);
            //ps.setInt(1, UserID);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setDate(3, DateOfBirth);
            ps.setString(4, email);
            ps.setInt(5, flightID);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
