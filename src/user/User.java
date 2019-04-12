package user;

import java.util.Date;

public class User {
	protected int userId;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected Date birthday;
	protected String phonenumber;
	protected String password;
	
	public User() {
	}
	
	public User(int userId) {
		this.userId = userId;
	}
	
    public int getId() {
        return userId;
    }
 
    public void setId(int userId) {
        this.userId = userId;
    }
    
    public String getFirstname() {
  	  	return firstname;
    }
  
    public void setfirstname(String firstname) {
  	  	this.firstname = firstname;
  	}
    
    public String getLastname() {
  	  	return lastname;
    }
  
    public void setLastname(String lastname) {
  	  	this.lastname = lastname;
  	}
    
    public String getEmail() {
    	  return email;
    }
    
    public void setEmail(String email) {
    	  this.email = email;
    }
    
    public Date getBirthday() {
    	  return birthday;
    }
    
    public void setBirthday(Date birthday) {
    	  this.birthday = birthday;
    }
    
    public String getPhonenumber() {
    	  return phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
    	  this.phonenumber = phonenumber;
    }
    
    public String getPassword() {
    	  return password;
    }
    
    public void setPassword(String password) {
    	  this.password = password;
    }
    
}
