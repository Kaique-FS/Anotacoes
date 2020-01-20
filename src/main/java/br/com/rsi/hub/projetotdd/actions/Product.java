package br.com.rsi.hub.projetotdd.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product {

	private static WebElement element = null;

	public static WebElement btn_tablet3(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Pro Tablet 608 G1"));
		System.out.println("Clicou no produto");
		return element;
	}
	
	public static WebElement btn_mouse(WebDriver driver) {
		element = driver.findElement(By.linkText("HP Z3200 Wireless Mouse"));
		System.out.println("Clicou no produto");
		return element;
	}
	
	public static WebElement btn_color(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"rabbit\"]"));
		System.out.println("Clicou na outra cor");
		return element;
	}
	
	public static WebElement btn_addcart(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.name("save_to_cart"));
		System.out.println("Adicionou no carrinho");
		return element;
	}
}