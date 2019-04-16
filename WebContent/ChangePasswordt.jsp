<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<body>
<div align = "center">
 <h1>Change Password</h1>
<form method=”POST” action=”ChangePassword”>
            <table>
                <tr>
                    <td>Enter Old Password: </td>
                    <td><input type=”password” name=”password”/></td>
                </tr>
                <tr>
                    <td>Enter New password :</td>
                    <td><input type=”password” name=”newpassword”/></td>
                </tr>
                <tr>
                    <td>Enter Conform Password:  </td>
                    <td><input type=”password” name=”confirmpassword” /></td>
                </tr>
                <tr>
                    <td><input type=”submit” value=”submit” />
                    
                    </td>
                </tr>
            </table>
        </form>
 </div>>
</body>
</html>
     
     
     
     
     
     
