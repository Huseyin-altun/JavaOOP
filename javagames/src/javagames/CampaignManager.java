package javagames;

public class CampaignManager extends CrudManager {

	private  Campaign  campaign;

	public CampaignManager( Campaign  campaign) {
	        this.campaign = campaign;
	   }
	@Override
	public void add() {
		System.out.println("Eklendi "+campaign.getCampaignName());
		
	}

	@Override
	public void delete() {
		System.out.println("Silindi  "+campaign.getCampaignName());
		
	}

	@Override
	public void update() {
		System.out.println("Güncellendi  "+campaign.getCampaignName());
		
	}

}
