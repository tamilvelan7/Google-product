package pkg.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/tamil/Downloads/chromedriver_linux64/chromedriver");
		WebDriver brow=new ChromeDriver();
		brow.get("https://www.facebook.com/");
		
		//username or email
		WebElement element = brow.findElement(By.xpath("//input[contains(@aria-label,'n')]"));
		element.sendKeys("Jose ");
		
		
		//password
		brow.findElement(By.xpath("//input[contains(@aria-label,'P')]")).sendKeys("987654345");
		
		brow.findElement(By.xpath("//button[contains(text(),'L')]")).click();
		
//		String attribute = brow.findElement(By.partialLinkText("For")).getAttribute("href");
//		
//		System.out.println(attribute);
//		
		//brow.close();
		
		
	}

}
