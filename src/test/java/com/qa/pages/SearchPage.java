package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	public final String url ="http://127.0.0.1:5500/webProject/html/search.html";
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	private WebElement homeBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	private WebElement productBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	private WebElement contactBtn;
	
	@FindBy(xpath="/html/body/header/nav/div/a")
	private WebElement title;
	
	@FindBy(xpath="/html/body/footer/small")
	private WebElement footer;
	
	@FindBy(id="search")
	private WebElement searchBarBtn;
	
	@FindBy(xpath="//*[@id=\"searchInput\"]")
	private WebElement searchBar;
	
	@FindBy(xpath="//*[@id=\"postTitle1\"]")
	private WebElement firstResultHeader;
	
	@FindBy(xpath="//*[@id=\"post1\"]/p")
	private WebElement firstResultText;
	
	@FindBy(xpath="//*[@id=\"postTitle2\"]")
	private WebElement secondResultHeader;
	
	@FindBy(xpath="//*[@id=\"post2\"]/p")
	private WebElement secondResultText;
	
	@FindBy(xpath="//*[@id=\"postTitle3\"]")
	private WebElement thirdResultHeader;
	
	@FindBy(xpath="//*[@id=\"post3\"]/p")
	private WebElement thirdResultText;
	
	@FindBy(xpath="/html/body/footer/a[1]")
	private WebElement twitterLink;
	
	@FindBy(xpath="/html/body/footer/a[2]")
	private WebElement facebookLink;
	
	@FindBy(xpath="/html/body/footer/a[3]")
	private WebElement instagramLink;
	
	
	public void clickHome() {
		homeBtn.click();
	}
	
	public void clickSearch() {
		searchBtn.click();
	}
	
	public void clickProduct() {
		productBtn.click();
	}
	
	public void clickContact() {
		contactBtn.click();
	}
	
	public void clickBarButton() {
		searchBarBtn.click();
	}
	
	public void clickTwitter() {
		twitterLink.click();
	}
	
	public void clickFacebook() {
		facebookLink.click();
	}
	
	public void clickInstagram() {
		instagramLink.click();
	}
	
	public void search (String string) {
		searchBar.sendKeys(string);
	}
	
	
	public String getTitle() {
		return title.getText();
	}
	
	public String getFooter() {
		return footer.getText();
	}
	
	public String getFirstResult() {
		return firstResultHeader.getText().toLowerCase();
	}
	
	public String getFirstResultText() {
		return firstResultText.getText().toLowerCase();
	}
	
	public String getSecondResult() {
		return secondResultHeader.getText().toLowerCase();
	}
	
	public String getSecondResultText() {
		return secondResultText.getText().toLowerCase();
	}
	
	public String getThirdResult() {
		return thirdResultHeader.getText().toLowerCase();
	}
	
	public String getThirdResultText() {
		return thirdResultText.getText().toLowerCase();
	}
}
