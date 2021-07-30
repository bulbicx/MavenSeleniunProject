package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	public final String url ="http://127.0.0.1:5500/webProject/html/products.html";
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	private WebElement homeBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	private WebElement productBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	private WebElement contactBtn;
	
	@FindBy(xpath="/html/body/main/section/header/h2")
	private WebElement header;
	
	@FindBy(xpath="/html/body/header/nav/div/a")
	private WebElement title;
	
	@FindBy(xpath="/html/body/footer/small")
	private WebElement footer;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/a")
	private WebElement buzzBtn;
	
	@FindBy(xpath="/html/body/main/div/div/div[2]/a")
	private WebElement trashyBtn;
	
	@FindBy(xpath="/html/body/main/div/div/div[3]/a")
	private WebElement berlinerBtn;
	
	@FindBy(xpath="/html/body/main/div/div/div[4]/a")
	private WebElement pilsenBtn;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/img")
	private WebElement buzzImg;
	
	@FindBy(xpath="/html/body/main/div/div/div[2]/img")
	private WebElement trashyImg;
	
	@FindBy(xpath="/html/body/main/div/div/div[3]/img")
	private WebElement berlinerImg;
	
	@FindBy(xpath="/html/body/main/div/div/div[4]/img")
	private WebElement pilsenImg;
	
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
	
	public void clickBuzz() {
		buzzBtn.click();
	}
	
	public void clickTrashy() {
		trashyBtn.click();
	}
	
	public void clickBerliner() {
		berlinerBtn.click();
	}
	
	public void clickPilsen() {
		pilsenBtn.click();
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
	
	public String getHeader() {
		return header.getText();
	}
	
	public String getTitle() {
		return title.getText();
	}
	
	public String getFooter() {
		return footer.getText();
	}
	
	public String getBuzzSrc() {
		return buzzImg.getAttribute("src");
	}
	
	public String getTrashySrc() {
		return trashyImg.getAttribute("src");
	}
	
	public String getBerlinerSrc() {
		return berlinerImg.getAttribute("src");
	}
	
	public String getPilsenSrc() {
		return pilsenImg.getAttribute("src");
	}

}
