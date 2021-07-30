package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BeersPage {
	
	@FindBy(id="name")
	public WebElement name;
	
	@FindBy(id="description")
	public WebElement description;
	
	@FindBy(xpath="/html/body/footer/small")
	private WebElement footer;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li/a")
	private WebElement productBtn;
	
	@FindBy(id="imgProduct")
	private WebElement image;
	
	public String getName() {
		return name.getText();
	}
	
	public String getDesc() {
		return description.getText();
	}
	
	public String getFooter() {
		return footer.getText();
	}
	
	public void clickProduct() {
		productBtn.click();
	}
	
	public String getSrc() {
		return image.getAttribute("src");
	}

}
