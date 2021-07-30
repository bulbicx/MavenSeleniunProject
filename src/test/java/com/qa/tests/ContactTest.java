package com.qa.tests;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.ContactPage;
import com.qa.pages.IndexPage;
import com.qa.pages.ProductPage;
import com.qa.pages.SearchPage;

public class ContactTest {

private WebDriver driver;
	
	@Before
	public void setup () {
		
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(false);
		
		this.driver = new ChromeDriver(opts);
		
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		this.driver.get("http://localhost:5500/webProject/html/contact.html");
			
	}
	
	@Test
	public void HomeBtnTest() throws InterruptedException {
		
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		contactPage.clickHome();
		

		assertTrue(indexPage.getTitle().contains("Home Page"));
	}
	
	@Test
	public void SearchBtnTest() throws InterruptedException {

		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		contactPage.clickSearch();

		assertTrue(searchPage.getTitle().contains("Search Page"));
	}
	
	@Test
	public void ProductBtnTest() throws InterruptedException {

		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		contactPage.clickProduct();

		assertTrue(productPage.getTitle().contains("Products Page"));
	}
	
	@Test
	public void ContactBtnTest() throws InterruptedException {

		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		contactPage.clickContact();

		assertTrue(contactPage.getTitle().contains("Contact Us Page"));
	}
	
	@Test
	public void CheckFooter() {
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		assertTrue(contactPage.getFooter().contains("DA, LC & MC"));
	}

	
	@After
	public void teardown() {
		this.driver.close();
	}
	
}
