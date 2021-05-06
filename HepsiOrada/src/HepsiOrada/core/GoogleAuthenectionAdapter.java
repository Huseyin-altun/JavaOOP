package HepsiOrada.core;

import HepsiOrada.googleAuthenection.GoogleAuthenection;

public class GoogleAuthenectionAdapter implements UserAuthenectionService{

	@Override
	public void validPostEmail(String mail) {
		GoogleAuthenection googleAuth=new GoogleAuthenection();
		googleAuth.valid();
		
	}

}
