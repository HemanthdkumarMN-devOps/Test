package com.example.tests;



import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



@Test(priority = 1)
public class App {
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
           "/usr/local/bin/chromedriver");     
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920x1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



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



       driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div/div/div[5]/div/div/div[1]/img")).click();
        driver.findElement(By.id("nftpage-buynow")).click();
        driver.findElement(By.id("buynftmodal-confirm")).click();



   }



}




