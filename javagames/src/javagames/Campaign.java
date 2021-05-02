package javagames;

import java.sql.Date;

public class Campaign {
private int id;
private String campaignName;
private String campaignDescription;
private Date campaignDate;

public Campaign(int id, String campaignName, String campaignDescription, Date campaignDate) {
	super();
	this.id = id;
	this.campaignName = campaignName;
	this.campaignDescription = campaignDescription;
	this.campaignDate = campaignDate;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCampaignName() {
	return campaignName;
}

public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}

public String getCampaignDescription() {
	return campaignDescription;
}

public void setCampaignDescription(String campaignDescription) {
	this.campaignDescription = campaignDescription;
}

public Date getCampaignDate() {
	return campaignDate;
}

public void setCampaignDate(Date campaignDate) {
	this.campaignDate = campaignDate;
}
}
