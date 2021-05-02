package javagames;

import java.sql.Date;

public class Player {
private int tc;
private String firstname;
private String lastname;
private Date birthday;




public Player(int tc, String firstname, String lastname, Date birthday) {
	this.tc = tc;
	this.firstname = firstname;
	this.lastname = lastname;
	this.birthday = birthday;
}


public int getTc() {
	return tc;
}
public void setTc(int tc) {
	this.tc = tc;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}



}
