package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
	
	public final String url ="http://127.0.0.1:5500/webProject/html/contact.html";
	
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
	
	@FindBy(id="txtName")
	private WebElement nameBar;
	
	@FindBy(id="txtEmail")
	private WebElement emailBar;
	
	@FindBy(id="txtTitle")
	private WebElement titleBar;
	
	@FindBy(id="txtDesc")
	private WebElement descBar;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	private WebElement submitBtn;
	
	@FindBy(id="p1")
	private WebElement nameResult;
	
	@FindBy(id="p2")
	private WebElement emailResult;
	
	@FindBy(id="p3")
	private WebElement titleResult;
	
	@FindBy(id="p4")
	private WebElement descResult;
	
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
	
	public void clickSubmit() {
		submitBtn.click();
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
	
	public String getTitle() {
		return title.getText();
	}
	
	public String getFooter() {
		return footer.getText();
	}
	
	public String getNameResult() {
		return nameResult.getText();
	}
	
	public String getEmailResult() {
		return emailResult.getText();
	}
	
	public String getTitleResult() {
		return titleResult.getText();
	}
	
	public String getDescResult() {
		return descResult.getText();
	}
	
	public void enterName(String string) {
		nameBar.sendKeys(string);
	}
	
	public void enterEmail(String string) {
		emailBar.sendKeys(string);
	}
	
	public void enterTitle(String string) {
		titleBar.sendKeys(string);
	}
	
	public void enterDesc(String string) {
		descBar.sendKeys(string);
	}

}
