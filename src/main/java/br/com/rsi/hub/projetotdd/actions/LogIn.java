package br.com.rsi.hub.projetotdd.actions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsi.hub.projetotdd.pageobjects.HomePage;
import br.com.rsi.hub.projetotdd.pageobjects.LogInPage;
import br.com.rsi.hub.projetotdd.utility.Constant;

public class LogIn {

	private static WebDriver driver;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.get(Constant.URL);
	}
	
	@Test
	public void Execute() {
		HomePage.lnk_MyAccount(driver).click();
		LogInPage.txtbx_UserName(driver).sendKeys(Constant.Username);
		LogInPage.txtbx_Password(driver).sendKeys(Constant.Password);
		LogInPage.btn_LogIn(driver).sendKeys(Keys.ENTER);
		//HomePage.lnk_LogOut(driver).click();
	}

}