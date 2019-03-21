package testBaidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenBaidu {

	WebDriver driver;
	String url = "http://www.baidu.com";
	@BeforeClass
	public void openChrome() {
		//Chromeä¯ÀÀÆ÷
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void openBaidu(){
		driver.get(url);
		
	}

}
