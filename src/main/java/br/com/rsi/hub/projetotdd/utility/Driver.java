package br.com.rsi.hub.projetotdd.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver openBrowser(String navegador, String url) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver) {
	
		if (driver != null) {
			driver.close();
		}
		
	}
	
}