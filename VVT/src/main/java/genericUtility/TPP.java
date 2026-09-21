package genericUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TPP {

	public TPP() {

	}

	@FindBy(linkText = "Organization")
	private WebElement contactsLink;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getOrganization() {
		// TODO Auto-generated method stub
		return contactsLink;

	}

}
