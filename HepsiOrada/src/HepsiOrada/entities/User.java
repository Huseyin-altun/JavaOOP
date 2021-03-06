package HepsiOrada.entities;

public class User implements Entity{
private int id;
private String email;
private String name;
private String lastName;
private String password;



public User(int id, String email, String name, String lastName, String password) {
	super();
	this.id = id;
	this.email = email;
	this.name = name;
	this.lastName = lastName;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}





}
