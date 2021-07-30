package com.qa.tests;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertEquals;
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


public class IndexTest {

	private WebDriver driver;
	
	@Before
	public void setup () {
		
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(false);
		
		this.driver = new ChromeDriver(opts);
		
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		this.driver.get("http://localhost:5500/webProject/html/index.html");
			
	}
	
	@Test
	public void HomeBtnTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		indexPage.clickHome();
		

		assertTrue(indexPage.getTitle().contains("Home Page"));
	}
	
	@Test
	public void SearchBtnTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		
		indexPage.clickSearch();

		assertTrue(searchPage.getTitle().contains("Search Page"));
	}
	
	@Test
	public void ProductBtnTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		indexPage.clickProduct();

		assertTrue(productPage.getTitle().contains("Products Page"));
	}
	
	@Test
	public void ContactBtnTest() throws InterruptedException {

		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		indexPage.clickContact();

		assertTrue(contactPage.getTitle().contains("Contact Us Page"));
	}
	
	@Test
	public void CheckFooter() {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		assertTrue(indexPage.getFooter().contains("DA, LC & MC"));
	}
	
	@Test
	public void TwitterLink() {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		indexPage.clickTwitter();
		assertEquals("https://twitter.com/",driver.getCurrentUrl());
	}
	
	@Test 
	public void FacebookLink() {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		indexPage.clickFacebook();
		assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	}
	
	@Test
	public void InstagramLink() {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		indexPage.clickInstagram();
		assertEquals("https://www.instagram.com/",driver.getCurrentUrl());
	}
	
	@Test
	public void CheckContents() {
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		assertEquals("Welcome to the Home Page!", indexPage.getHeader());
		assertEquals("Some Posts...", indexPage.getTitlePost());
		assertTrue(indexPage.getBlogPost().contains("driven"));
	}

	
	@After
	public void teardown() {
		this.driver.close();
	}


}
