package com.example.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//setup
@Test(priority = 1)
public class App {
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--window-size=1920x1080");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Login
		driver.get("https://immutly.ml/");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("techbone702@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.name("action")).click();

	// BuyNFT
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div[1]/img")).click();
		driver.findElement(By.id("nftpage-buynow")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div/div/div[3]/div[2]/button[1]")).click();

	//list
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[5]/div/div/table/tbody/tr[1]/td[5]/button")).click();
		driver.findElement(By.id("nftpage-list-nft")).click();
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/span[2]"))
				.click();
		driver.findElement(By.id("list-public-price")).click();
		driver.findElement(By.id("list-public-price")).click();
		driver.findElement(By.id("list-public-price")).clear();
		driver.findElement(By.id("list-public-price")).sendKeys("1000");
		driver.findElement(By.id("listnftmodal-submit")).click();
		
	//Create NFT Setup
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/span[3]/a/div")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div[1]/img")).click();
		
	// Create NFT Page
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div/span/div")).click();
		    driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div[1]/div/div[1]/div/input")).sendKeys("/var/lib/jenkins/workspace/Qa/test/test-output/jenkins.png");
		    driver.findElement(By.id("createnft-title-field")).click();
		    driver.findElement(By.id("createnft-title-field")).click();
		    driver.findElement(By.id("createnft-title-field")).clear();
		    driver.findElement(By.id("createnft-title-field")).sendKeys("test Jenkins");
		    driver.findElement(By.id("createnft-description-field")).click();
		    driver.findElement(By.id("createnft-description-field")).clear();
		    driver.findElement(By.id("createnft-description-field")).sendKeys("test jenkins");
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[3]/div[2]/div/div/div[2]/span")).click();
		    driver.findElement(By.id("createnft-property-name")).click();
		    driver.findElement(By.id("createnft-property-name")).clear();
		    driver.findElement(By.id("createnft-property-name")).sendKeys("test");
		    driver.findElement(By.id("createnft-property-value")).click();
		    driver.findElement(By.id("createnft-property-value")).clear();
		    driver.findElement(By.id("createnft-property-value")).sendKeys("testvalue1");
		    driver.findElement(By.xpath("//div[@id='root']/div/div/div[3]/div[3]/div[2]/span[2]")).click();
		    driver.findElement(By.id("createnft-price-field")).click();
		    driver.findElement(By.id("createnft-price-field")).clear();
		    driver.findElement(By.id("createnft-price-field")).sendKeys("10");
		    driver.findElement(By.id("createnft-royality-field")).click();
		    driver.findElement(By.id("createnft-royality-field")).clear();
		    driver.findElement(By.id("createnft-royality-field")).sendKeys("15");
		    driver.findElement(By.id("createnft-preview-details")).click();
		    driver.findElement(By.id("createnft-reviewmodal-mint")).click();
		

	}

}
