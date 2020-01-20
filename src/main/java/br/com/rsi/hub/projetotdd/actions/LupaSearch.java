package br.com.rsi.hub.projetotdd.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LupaSearch {

	private static WebElement element = null;

	public static WebElement btn_lupa(WebDriver driver) {
		element = driver.findElement(By.id("menuSearch"));
		System.out.println("Clicou na lupa");
		return element;
	}
	
	public static WebElement txt_pesquisa(WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		System.out.println("Clicou na pesquisa");
		return element;
	}
}
