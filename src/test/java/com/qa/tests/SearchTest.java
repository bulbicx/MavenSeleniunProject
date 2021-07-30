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

public class SearchTest {
	
private WebDriver driver;
	
	@Before
	public void setup () {
		
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(false);
		
		this.driver = new ChromeDriver(opts);
		
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		this.driver.get("http://localhost:5500/webProject/html/search.html");
			
	}
	
	@Test
	public void HomeBtnTest() throws InterruptedException {
		
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		searchPage.clickHome();
		

		assertTrue(indexPage.getTitle().contains("Home Page"));
	}
	
	@Test
	public void SearchBtnTest() throws InterruptedException {

		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		
		searchPage.clickSearch();

		assertTrue(searchPage.getTitle().contains("Search Page"));
	}
	
	@Test
	public void ProductBtnTest() throws InterruptedException {

		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		searchPage.clickProduct();

		assertTrue(productPage.getTitle().contains("Products Page"));
	}
	
	@Test
	public void ContactBtnTest() throws InterruptedException {

		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		searchPage.clickContact();

		assertTrue(contactPage.getTitle().contains("Contact Us Page"));
	}
	
	@Test
	public void CheckFooter() {
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		
		assertTrue(searchPage.getFooter().contains("DA, LC & MC"));
	}

	
	@After
	public void teardown() {
		this.driver.close();
	}

}
