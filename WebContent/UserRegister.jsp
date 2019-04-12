<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewUser</title>
</head>
<body>
<div align = "center">
 <h1>Create a New Account</h1>
      <form >
       <table>
        <tr>
         <td>FirstName :</td> <td><input type="text" name="firstname" required></td>
        </tr>
        <tr>
         <td>LastName :</td> <td><input type="text" name="lastname" required></td>
        </tr>
        <tr>
         <td>Birthday:</td> <td><input type="date" name="Birthday" required></td>
        </tr>
        <tr>
         <td>Email :</td> <td><input type="email" name="email" required></td>
        </tr>
        <tr>
         <td>PhoneNumber :</td> <td><input type="tel" name="phone" required></td>
        </tr>
        <tr>
         <td>Password :</td> <td><input type="password" name="password" required></td>
        </tr>
        <tr>
         <td>Confirm Password :</td> <td><input type="password" name="cpwd" required>
        </tr>
        <tr>
         <td><input type="submit" value="Submit"></td>
        </tr>
       </table>
      </form>
</div>>
</body>
</html>