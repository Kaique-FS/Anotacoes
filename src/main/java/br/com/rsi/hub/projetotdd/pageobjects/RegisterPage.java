package br.com.rsi.hub.projetotdd.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	private static WebElement element = null;

	public static WebElement txt_username(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		element = driver.findElement(By.name("usernameRegisterPage"));
		System.out.println("Preencheu o nome");
		return element;
	}
	
	public static WebElement txt_password(WebDriver driver) {
		element = driver.findElement(By.name("passwordRegisterPage"));
		System.out.println("Preencheu a senha");
		return element;
	}
	
	public static WebElement txt_confirmpassword(WebDriver driver) {
		element = driver.findElement(By.name("confirm_passwordRegisterPage"));
		System.out.println("Confirmou a senha preenchidade anteriormente");
		return element;
	}
	
	public static WebElement txt_email(WebDriver driver) {
		element = driver.findElement(By.name("emailRegisterPage"));
		System.out.println("Preencheu o email");
		return element;
	}
	
	public static WebElement txt_firstname(WebDriver driver) {
		element = driver.findElement(By.name("first_nameRegisterPage"));
		System.out.println("Preencheu o primeiro nome");
		return element;
	}
	
	public static WebElement txt_lastname(WebDriver driver) {
		element = driver.findElement(By.name("last_nameRegisterPage"));
		System.out.println("Preencheu o ultimo nome");
		return element;
	}
	
	public static WebElement txt_phone(WebDriver driver) {
		element = driver.findElement(By.name("phone_numberRegisterPage"));
		System.out.println("Preencheu o numero de telefone");
		return element;
	}
	
	public static WebElement txt_country(WebDriver driver) {
		element = driver.findElement(By.name("countryListboxRegisterPage"));
		//Select oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		//oSelect.selectByVisibleText("Greece");
		System.out.println("Preencheu com o país");
		return element;
	}
	
	public static WebElement txt_city(WebDriver driver) {
		element = driver.findElement(By.name("cityRegisterPage"));
		System.out.println("Preencheu com a cidade");
		return element;
	}
	
	public static WebElement txt_address(WebDriver driver) {
		element = driver.findElement(By.name("addressRegisterPage"));
		System.out.println("Preencheu com o endereço");
		return element;
	}
	
	public static WebElement txt_postalcode(WebDriver driver) {
		element = driver.findElement(By.name("postal_codeRegisterPage"));
		System.out.println("Preencheu o codigo postal");
		return element;
	}
	
	public static WebElement txt_state(WebDriver driver) {
		element = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		System.out.println("Preencheu com o estado");
		return element;
	}
	
	public static WebElement btn_checkbox1(WebDriver driver) {
		element = driver.findElement(By.name("allowOffersPromotion"));
		System.out.println("Clicou no botão 'propaganda' ");
		return element;
	}
	
	public static WebElement btn_checkbox2(WebDriver driver) {
		element = driver.findElement(By.name("i_agree"));
		System.out.println("Clicou no botão 'termos' ");
		return element;
	}
	
	public static WebElement btn_register(WebDriver driver) {
		element = driver.findElement(By.id("register_btnundefined"));
		System.out.println("Registrou");
		return element;
	}
	
}