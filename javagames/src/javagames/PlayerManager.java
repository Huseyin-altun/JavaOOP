package javagames;

public class PlayerManager extends CrudManager{

	private CheckValidation checkValidation;
	
	private  Player player;

	public PlayerManager(Player player,CheckValidation checkValidation) {
	        this.player = player;
	        this.checkValidation = checkValidation;
	   }
	
	
	@Override
	public void add() {
		if (checkValidation.isCorrect(player)) {
			System.out.println("Kaydedildi "+player.getFirstname());

		}
		else {
			System.out.println("B�yle Bir Kullan�c� Yok");

		}
		
	}

	@Override
	public void delete() {
		System.out.println("Silindi "+player.getFirstname());
		
	}

	@Override
	public void update() {
		System.out.println("G�ncelendi "+player.getFirstname());
		
	}

}
