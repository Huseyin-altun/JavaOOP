package javagames;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		Player player=new Player(122112, "hsyn", "altn", new Date(10, 2, 3000));
		PlayerManager playerManager=new PlayerManager(player,new CheckValidation());
		playerManager.add();
		PaymanentManager paymanent=new PaymanentManager();
		paymanent.buy(new Game(1,"GTA 5","G�zel",1000));
		paymanent.free(new Campaign(3, "�cretsiz �ndirim Kodu", "A��klamalar", new Date(10, 2, 3000)));

	}

}
