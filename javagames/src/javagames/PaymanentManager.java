package javagames;

public class PaymanentManager implements PaymanentService{

	 public void buy(Game game) {
		System.out.println("Sat�n Al�nd� "+game.getName());
		
	}

	@Override
	public void free(Campaign campaign) {
		System.out.println("Kampanya Entegrasyonu "+campaign.getCampaignName());
		
	}


}
