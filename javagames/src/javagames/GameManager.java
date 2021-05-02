package javagames;

public class GameManager extends CrudManager{

    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }
    
    @Override
    public void add() {
    	System.out.println(""+game.getName());
    }
    
    @Override
	public void delete() {
    	System.out.println("Silindi "+game.getName());
			
	}
    
    @Override
	public void update() {	
		System.out.println("Güncelendi "+game.getName());
			
	}
	


	}


