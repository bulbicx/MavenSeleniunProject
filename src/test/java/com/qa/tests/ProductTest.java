package com.qa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pages.BeersPage;
import com.qa.pages.ContactPage;
import com.qa.pages.IndexPage;
import com.qa.pages.ProductPage;
import com.qa.pages.SearchPage;

public class ProductTest {
private WebDriver driver;
	
	@Before
	public void setup () {
		
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(false);
		
		this.driver = new ChromeDriver(opts);
		
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		this.driver.get("http://127.0.0.1:5500/webProject/html/products.html");
			
	}
	
	@Test
	public void HomeBtnTest() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		
		productPage.clickHome();
		

		assertTrue(indexPage.getTitle().contains("Home Page"));
	}
	
	@Test
	public void SearchBtnTest() throws InterruptedException {
		
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
		
		productPage.clickSearch();

		assertTrue(searchPage.getTitle().contains("Search Page"));
	}
	
	@Test
	public void ProductBtnTest() throws InterruptedException {

		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		productPage.clickProduct();

		assertTrue(productPage.getTitle().contains("Products Page"));
	}
	
	@Test
	public void ContactBtnTest() throws InterruptedException {

		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
		
		productPage.clickContact();

		assertTrue(contactPage.getTitle().contains("Contact Us Page"));
	}
	
	@Test
	public void CheckFooter() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		assertTrue(productPage.getFooter().contains("DA, LC & MC"));
	}
	
	@Test
	public void TwitterLink() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		productPage.clickTwitter();
		assertEquals("https://twitter.com/",driver.getCurrentUrl());
	}
	
	@Test 
	public void FacebookLink() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		productPage.clickFacebook();
		assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	}
	
	@Test
	public void InstagramLink() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		productPage.clickInstagram();
		assertEquals("https://www.instagram.com/",driver.getCurrentUrl());
	}

	
	@Test
	public void CheckImages() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		
		assertEquals("https://images.punkapi.com/v2/keg.png",productPage.getBuzzSrc());
		assertEquals("https://images.punkapi.com/v2/2.png",productPage.getTrashySrc());
		assertEquals("https://images.punkapi.com/v2/keg.png", productPage.getBerlinerSrc());
		assertEquals("https://images.punkapi.com/v2/4.png",productPage.getPilsenSrc());
	}
	
	@Test
	public void BuzzTest() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickBuzz();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.description));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.name));
		//System.out.println(beersPage.getName());
		//System.out.println(beersPage.getDesc());
		assertTrue(beersPage.getName().contains("Buzz") && beersPage.getDesc().contains("A light, crisp and bitter IPA"));
		assertTrue(beersPage.getFooter().contains("DA, LC & MC"));
		assertEquals("https://images.punkapi.com/v2/keg.png", beersPage.getSrc());
	}
	
	@Test
	public void TrashyTest() throws InterruptedException {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickTrashy();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.description));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.name));
		//System.out.println(beersPage.getName());
		//System.out.println(beersPage.getDesc());
		assertTrue(beersPage.getName().contains("Trashy Blonde") && beersPage.getDesc().contains("A titillating, neurotic, peroxide punk of a Pale Ale."));
		assertTrue(beersPage.getFooter().contains("DA, LC & MC"));
		assertEquals("https://images.punkapi.com/v2/2.png", beersPage.getSrc());
	}
	
	@Test
	public void BerlinerTest() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickBerliner();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.description));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.name));
		//System.out.println(beersPage.getName());
		//System.out.println(beersPage.getDesc());
		assertTrue(beersPage.getName().contains("Berliner Weisse") && beersPage.getDesc().contains("Japanese citrus fruit intensifies"));
		assertTrue(beersPage.getFooter().contains("DA, LC & MC"));
		assertEquals("https://images.punkapi.com/v2/keg.png", beersPage.getSrc());
		
	}
	
	@Test
	public void PilsenTest() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickPilsen();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.description));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(beersPage.name));
		//System.out.println(beersPage.getName());
		//System.out.println(beersPage.getDesc());
		assertTrue(beersPage.getName().contains("Pilsen Lager") && beersPage.getDesc().contains("Our Unleash the Yeast series was an epic experiment"));
		assertTrue(beersPage.getFooter().contains("DA, LC & MC"));
		assertEquals("https://images.punkapi.com/v2/4.png", beersPage.getSrc());
	}
	
	@Test
	public void BuzzButtons() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickBuzz();
		beersPage.clickProduct();
		
		assertTrue(productPage.getTitle().contains("Products"));
		
	}
	
	@Test
	public void TrashyButtons() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickTrashy();
		beersPage.clickProduct();
		
		assertTrue(productPage.getTitle().contains("Products"));
		
	}
	
	@Test
	public void BerlinerButtons() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickBerliner();
		beersPage.clickProduct();
		
		assertTrue(productPage.getTitle().contains("Products"));
		
	}
	
	@Test
	public void PilsenButtons() {
		ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
		BeersPage beersPage = PageFactory.initElements(driver, BeersPage.class);
		
		productPage.clickPilsen();
		beersPage.clickProduct();
		
		assertTrue(productPage.getTitle().contains("Products"));
		
	}

	
	@After
	public void teardown() {
		this.driver.close();
	}
	

}
