package org.javaselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	
	static WebDriver driver;
	
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot scr= (TakesScreenshot) driver;
		File src = scr.getScreenshotAs(OutputType.FILE);
		File des=new File("ScreenShot\\"+filename+".png");
		FileUtils.copyFile(src, des);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/tamil/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		screenshot("result3");
		driver.findElement(By.id("email")).sendKeys("Tamil");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
		screenshot("result5");
		
		
		driver.close();
		
		
		
		
	}
}
