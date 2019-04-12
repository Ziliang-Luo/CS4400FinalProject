package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_connection {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    public static Connection getConnection(){
        Connection myConn = null;
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useTimezone=true&serverTimezone=UTC", "root", "Lzl382097831");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return myConn;
    }
}
