package br.com.rsi.hub.projetotdd.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	private static WebElement element = null;

	public static WebElement btn_Tablet(WebDriver driver) {
		element = driver.findElement(By.id("tabletsImg"));
		//element = driver.findElement(By.xpath(".//*[@id='tabletsImg']"))
		//element = driver.findElement(By.xpath(".//*[contains (@id, 'tablets'"))
		//JavascriptExecutor ex = (JavascriptExecutor) driver;
        //ex.executeScript("arguments[0].click();", element);
		System.out.println("Clicou na imagem 'Tablet' ");
		return element;
	}
	
	public static WebElement btn_Speakers(WebDriver driver) {
		element = driver.findElement(By.id("speakersImg"));
		System.out.println("Clicou no produto 'Speakers' ");
		return element;
	}

	public static WebElement btn_Laptops(WebDriver driver) {
		element = driver.findElement(By.id("laptopsImg"));
		System.out.println("Clicou no produto 'Laptops' ");
		return element;
	}

	public static WebElement btn_Mice(WebDriver driver) {
		element = driver.findElement(By.id("miceImg"));
		System.out.println("Clicou no produto 'Mice' ");
		return element;
	}

	public static WebElement btn_HeadPhones(WebDriver driver) {
		element = driver.findElement(By.id("headphonesImg"));
		System.out.println("Clicou no produto 'HeadPhones' ");
		return element;
	}
	
	public static WebElement btn_LupaSearch(WebDriver driver) { //throws InterruptedException 
		//Thread.sleep(5000);
		element = driver.findElement(By.xpath(".//*[@data-ng-click='openSearchProducts()']"));
		System.out.println("Clicou na 'Lupa'");
		return element;
	}

	public static WebElement btn_Search(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		System.out.println("Clicou no 'Search' dentro da lupa ");
		return element;
	}
	
}
