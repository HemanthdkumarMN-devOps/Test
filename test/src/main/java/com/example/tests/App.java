package com.example.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@Test
public class App {
    private WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("https://google.com");
 
                Thread.sleep(1000);
 
                if (driver.getPageSource().contains("I'm Feeling Lucky")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
                driver.quit();
        }
}
   

    @Test(priority = 1)
    public void login() throws Exception {
          driver.get("https://immutly-dev.netlify.app/");
            driver.findElement(By.id("login-button")).click();
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys("cocseth9@gmail.com");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Test@123");
            driver.findElement(By.name("action")).click();
    
    }
    
    @Test(priority = 2)
    public void buyNFT() {
        
         driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div[1]/div/div/div[1]/img")).click();
            driver.findElement(By.id("nftpage-buynow")).click();
            driver.findElement(By.id("buynftmodal-confirm")).click();
            
    }

    
        
    }
