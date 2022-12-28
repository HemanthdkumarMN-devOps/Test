package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//setup
@Test(priority = 1)
public class App {
	@SuppressWarnings("deprecation")
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless");
		 options.addArguments("--window-size=1920x1080");
		 options.addArguments("--no-sandbox");
		 options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//Login
	
		driver.get("https://immutly.ml/");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("techbone702@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.name("action")).click();
	
// Create NFT Page [Private]	
		//Create NFT Setup
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div[1]/img")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div/span/div")).click();
		// Give file Path..
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div[1]/div/div[1]/div/input"))
				.sendKeys("/var/lib/jenkins/workspace/Qa/test/test-output/passed.png");
			
		driver.findElement(By.id("createnft-title-field")).click();
		driver.findElement(By.id("createnft-title-field")).click();
		driver.findElement(By.id("createnft-title-field")).clear();
		driver.findElement(By.id("createnft-title-field")).sendKeys("Selenium NFT Title");
		driver.findElement(By.id("createnft-description-field")).click();
		driver.findElement(By.id("createnft-description-field")).clear();
		driver.findElement(By.id("createnft-description-field")).sendKeys("Selenium NFT description");
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[1]/div[1]/div[2]/span[1]")).click();
		driver.findElement(By.id("createnft-property-name")).click();
		driver.findElement(By.id("createnft-property-name")).clear();
		driver.findElement(By.id("createnft-property-name")).sendKeys("test Property");
		driver.findElement(By.id("createnft-property-value")).click();
		driver.findElement(By.id("createnft-property-value")).clear();
		driver.findElement(By.id("createnft-property-value")).sendKeys("testvalue1");		
		driver.findElement(By.id("createnft-price-field")).click();
		driver.findElement(By.id("createnft-price-field")).clear();
		driver.findElement(By.id("createnft-price-field")).sendKeys("1000");
		driver.findElement(By.id("createnft-royality-field")).click();
		driver.findElement(By.id("createnft-royality-field")).clear();
		driver.findElement(By.id("createnft-royality-field")).sendKeys("15");
		driver.findElement(By.id("createnft-preview-details")).click();
		driver.findElement(By.id("createnft-reviewmodal-mint")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[5]/div/div/table/tbody/tr[1]/td[6]/button"))
			.click();
//Public List Created NFT 

		driver.findElement(By.id("nftpage-list-nft")).click();
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/span[2]"))
			.click();
		driver.findElement(By.id("listnftmodal-submit")).click();		
		driver.get("https://immutly.ml/discover");
		driver.findElement(By.id("nav-discover")).click();
	 
// BuyNFT
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div[3]/div/div/div[1]/img")).click();
		driver.findElement(By.id("nftpage-buynow")).click(); 
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div/div/div[3]/div[2]/button[1]")).click();
	
//list Purchased NFT
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[5]/div/div/table/tbody/tr[1]/td[6]/button"))
			.click();
		driver.findElement(By.id("nftpage-list-nft")).click();
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/span[2]"))
			.click();
		driver.findElement(By.id("list-public-price")).click();
		driver.findElement(By.id("list-public-price")).click();
		driver.findElement(By.id("list-public-price")).clear();
		driver.findElement(By.id("list-public-price")).sendKeys("100");
		driver.findElement(By.id("listnftmodal-submit")).click();
	

//List Old NFT from profile
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div/div[3]/div/span[1]/img")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div/div[3]/div[2]/div/div/a/div/div[1]/img")).click();
		driver.get("https://immutly.ml/profile");
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[3]/div[3]/div[3]/div/div/div[1]/img")).click();
		driver.findElement(By.id("nftpage-list-nft")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div/div/div/div/div[2]/div[2]/span[2]")).click();
		driver.findElement(By.id("list-public-price")).click();
		driver.findElement(By.id("list-public-price")).click();
		driver.findElement(By.id("list-public-price")).clear();
		driver.findElement(By.id("list-public-price")).sendKeys("999");
		driver.findElement(By.id("listnftmodal-submit")).click();
	
		
//deposit UPI
 		driver.findElement(By.xpath("//img[@alt='wallet']")).click();
		driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div/div[2]/span")).click();
		driver.findElement(By.id("withdraw-amount-input")).click();
		driver.findElement(By.id("withdraw-amount-input")).clear();
		driver.findElement(By.id("withdraw-amount-input")).sendKeys("10000");
		driver.findElement(By.xpath("//span[@id='withdraw-continue-btn']/button")).click();
		driver.findElement(By.xpath("//div[@id='deposit-upi-btn']/p[2]")).click();
		driver.findElement(By.xpath("//span[@id='upi-continue-btn']/button")).click();
		driver.findElement(By.id("withdraw-amount-input")).click();
		driver.findElement(By.id("withdraw-amount-input")).clear();
		driver.findElement(By.id("withdraw-amount-input")).sendKeys("xyz@okicici");
		driver.findElement(By.xpath("//span[@id='withdraw-continue-btn']/button")).click();
		driver.findElement(By.id("withdraw-okay-btn")).click();
		   
////deposit Bank
//		    driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div/div/span[1]")).click();
//		    driver.findElement(By.id("withdraw-amount-input")).click();
//		    driver.findElement(By.id("withdraw-amount-input")).clear();
//		    driver.findElement(By.id("withdraw-amount-input")).sendKeys("1000");
//		    driver.findElement(By.xpath("//span[@id='withdraw-continue-btn']/button")).click();
//		    driver.findElement(By.id("deposit-banktransfer-btn")).click();
//		    driver.findElement(By.xpath("//span[@id='withdraw-continue-btn']/button")).click();
//		    driver.findElement(By.id("transaction id input")).click();
//		    driver.findElement(By.id("transaction id input")).clear();
//		    driver.findElement(By.id("transaction id input")).sendKeys("xyz123");
//		    driver.findElement(By.xpath("//span[@id='withdraw-continue-btn']/button")).click();
//		    driver.findElement(By.id("withdraw-okay-btn")).click();  
	    
//withdraw
		driver.findElement(By.xpath("//img[@alt='wallet']")).click();
		driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/div/div/div[2]/span[2]")).click();
		driver.findElement(By.id("withdraw-amount-input")).click();
		driver.findElement(By.id("withdraw-amount-input")).clear();
		driver.findElement(By.id("withdraw-amount-input")).sendKeys("500");
		driver.findElement(By.xpath("//span[@id='withdraw-continue-btn']/button")).click();
		driver.findElement(By.id("withdraw-okay-btn")).click();
		

//change Name,username,DP and cover imgae from profile settings
		
		 
		    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div/div[3]/div/span[1]/img")).click(); 
		    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/a")).click(); 
			driver.get("https://immutly.ml/setting");
		    driver.findElement(By.name("name")).click();
		    driver.findElement(By.name("name")).clear();
		    driver.findElement(By.name("name")).sendKeys("test automation");
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).clear();
		    driver.findElement(By.name("username")).sendKeys("auto selenium");
				    
// Give file Path..
		driver.findElement(By.xpath("//div[@id='root']/div/div/div[3]/div[2]/div[2]/input")).sendKeys("/var/lib/jenkins/workspace/Qa/test/test-output/passed.png");
		driver.findElement(By.name("bio")).click();
	        driver.findElement(By.name("bio")).clear();
		driver.findElement(By.name("bio")).sendKeys("test bio auto jenkins");
		   	
// Give file Path.. 
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]")).click(); 
     		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div[1]/div/div/button")).sendKeys("/var/lib/jenkins/workspace/Qa/test/test-output/passed.png");
		driver.findElement(By.xpath("//button[@type='submit']")).click();		    

	}

}
