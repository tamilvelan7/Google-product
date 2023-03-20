package youtube.com.full;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
 
  @Test
  public void shouldAnswerWithTrue() {
	System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
    WebDriver browser=new ChromeDriver();
    browser.get("https://quillbot.com/grammar-check");
    browser.manage().window();
  }
}
