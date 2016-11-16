package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        System.setProperty("webdriver.chrome.driver","/Users/joshik/chromedriver");

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		
		//driver.get("http://qaclickacademy.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
				
		


	}

}
