package HepsiOrada;

import java.util.Vector;

import HepsiOrada.bussiness.UserManager;
import HepsiOrada.core.GoogleAuthenectionAdapter;
import HepsiOrada.core.UserAuthenection;
import HepsiOrada.core.UserAuthenectionService;
import HepsiOrada.entities.User;

public class Main {

	public static void main(String[] args) {
	Vector<User> us=new Vector<>();
	User user=new User(1,"asda@gmail.com","Hsyn","Altn","45646565");
	
	User user2=new User(2,"a2sda@gmail.com","Hsyn","Altn","45646565");
	
	UserManager usermanager=new UserManager(new GoogleAuthenectionAdapter());
	us.add(user);
	
	boolean state=usermanager.valid(us,user2.getEmail());
	if(!state) {
	usermanager.add(user);
	System.out.println("Basarýlý Sekýlde Kayýt Oldunuz");
	us.add(user2);
	}
	
	usermanager.login(us, user2);

	
	}

}
