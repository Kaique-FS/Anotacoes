package br.com.rsi.hub.projetotdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.name("username"));
		System.out.println("Escreveu nome usuario");
		return element;
	}

	public static WebElement txtbx_Password(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		System.out.println("Inseriu a senha do usuario");
		return element;
	}

	public static WebElement btn_LogIn(WebDriver driver) {	
		element = driver.findElement(By.id("sign_in_btnundefined"));
		System.out.println("Clicou no botão login");
		return element;
	}
}
