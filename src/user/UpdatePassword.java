package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class UpdatePassword extends HttpServlet{
       public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException

       {
        doPost(request,response);

     }
}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String password = request.getParameter("current");
        String newPass = request.getParameter("new");
        String newPass2 = request.getParameter("confirm");
        String connurl = "jdbc:mysql://localhost:3306/user";

    //Connection con = null;
    String pass = "";
    int id = 0;
    try{
        ps = DB_Connection.getConnection();
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(connurl, "root", "");
try {
    PreparedStatement ps = con.prepareStatement(“update login set password = ? where email=? and password= ?”);
try {

}
}
      Statement myStmt = ps.createStatement();
    ResultSet rs=st.executeQuery("select * from login where password='"password+"'");
    while(rs.next()){
    id=rs.getInt(1);
    pass=rs.getString(3);
    } System.out.println(id+ " "+ pass);

    if(pass.equals(password)){
    Statement myStmt=ps.createStatement();
    int i=st1.executeUpdate("update login set password='"+newPass+"' where id='"+id+"'");
    out.println("Password changed successfully");
    st1.close();
    con.close();
    }
    else{
    out.println("Invalid Current Password");
    }
    }
    catch(Exception e){
    out.println(e);
    }
    }