package org.banking.banking_application;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
	public static void main( String[] args )throws Throwable
    {
    	System.out.println("Script Started");
    	WebDriverManager.chromedriver().setup();
        //setting properties
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        // open url
        System.out.println("Driver opening up the url in browser");	
        WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	driver.get("http://3.106.214.151:8083/contact.html");
//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);     	
		System.out.println("Entering details in the form");     	
		driver.manage().window().maximize();     
		System.out.println("entering the name");
		driver.findElement(By.name("Name")).sendKeys("prasanth");
		Thread.sleep(5000);
		System.out.println("entering the contact number");
		driver.findElement(By.name("Phone Number")).sendKeys("9949824454");
    	Thread.sleep(5000);
    	System.out.println("entering the mail");
		driver.findElement(By.name("Email")).sendKeys("pujari123@gmail.com");
    	Thread.sleep(5000);
    	System.out.println("entering the message");
		driver.findElement(By.name("Message")).sendKeys("opening the account");
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/a")).click();
    	System.out.println("Logging in");
    	Thread.sleep(9000);
    	System.out.println("response");
    	System.out.println("test cases are executed");
    	
    	TakesScreenshot scrShot = ((TakesScreenshot)driver);
    	
    	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
    	
    	File destFile = new File("/var/lib/jenkins/workspace/banking-project/banking.jpg");
    	
    	FileUtils.copyFile(srcFile, destFile);
    	
    	Thread.sleep(1000);
    	
    	
    	driver.quit();

     
     
     
     
     
     
     
     //submit form
     	
     //validate results
     	
     //take and store screenshots.
   
    }

	

	
}
