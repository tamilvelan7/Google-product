package pkg.selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/tamil/Downloads/chromedriver_linux64/chromedriver");
		
		
		WebDriver brow=new ChromeDriver();
		
		brow.get("https://letcode.in/buttons");
		
		TakesScreenshot ts= (TakesScreenshot) brow;     
		
		File source = ts.getScreenshotAs(OutputType.FILE);
				
		File destination = new File("Pic\\imagename.png");
				
		FileUtils.copyFile(source, destination);
		
		String cssValue = brow.findElement(By.id("position")).getCssValue("color");
		
		System.out.println(cssValue);
		
		
		
		
	
		

	}

}
