package HepsiOrada.bussiness;

import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import HepsiOrada.core.UserAuthenectionService;
import HepsiOrada.entities.User;


public class UserManager implements UserService{
final Pattern VALID_EMAIL_ADDRESS_REGEX =Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
		Pattern.CASE_INSENSITIVE);

private UserAuthenectionService  useauth;


	public UserManager(UserAuthenectionService useauth) {
	this.useauth = useauth;

}





	@Override
	public void add(User user) {
		boolean nameState=user.getName().length()<3?false:true;
		boolean lastState=user.getLastName().length()<2?false:true;
		boolean passwState=user.getPassword().length()<5?false:true;
		boolean emailState=validate(user.getEmail());
		if(nameState && lastState && passwState && emailState) {
		
			System.out.println("Bilgileriniz doðrudur Emaýl Postanýza yonlendýrýldýnýz");
			this.useauth.validPostEmail(user.getEmail());// kulanýcý gerý donusunde sýmule edýlmýs servis
		}
		else {
			System.out.println("Bilgileriniz Hatalý");
		}
		
		
	}
	
	public boolean valid(Vector<User> us,String mail) {
		boolean durum = false;
		for(User us2:us) {
			if( us2.getEmail().equals(mail)) {
			durum=true;
			break;
			}	
		}
		return durum;

		
	
	}
	

		public  boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		        return matcher.find();
		}





		@Override
		public void login(Vector<User> us, User user) {
			
			for(User user2:us) {
				if( (user2.getPassword().equals(user.getPassword()))
						&& (user2.getEmail().equals(user.getEmail()))){
					System.out.println("Basarýlý Býr Sekýlde Gýrýs Saglandý");
				
				
				}	
			}
			
		}





	
		

}
