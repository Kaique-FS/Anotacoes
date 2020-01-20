package br.com.rsi.hub.projetotdd.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	public static WebElement lnk_MyAccount(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.id("menuUserLink"));
		System.out.println("clique no login/cadastro");
		return element;
	}

	public static WebElement lnk_LogOut(WebDriver driver) {
		element = driver.findElement(By.id("menuUserLink"));
		//element = driver.findElement(By.xpath("//*[@id=\'loginMiniTitle\']/label[3]"));
		System.out.println("Clicou no Boneco");
		return element;
	}
	
	public static WebElement lnk_SingOut(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\'loginMiniTitle\']/label[3]"));
		System.out.println("Saiu");
		return element;
	}
}
