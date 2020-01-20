package br.com.rsi.hub.projetotdd.pageobjects;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsi.hub.projetotdd.actions.LupaSearch;
import br.com.rsi.hub.projetotdd.actions.Product;
import br.com.rsi.hub.projetotdd.actions.Search;
import br.com.rsi.hub.projetotdd.utility.Constant;

public class SearchProductLupa {

	private static WebDriver driver;
	
	@Before
	public void inicializa() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Execute() throws InterruptedException {
		HomePage.lnk_MyAccount(driver).click();
		LogInPage.txtbx_UserName(driver).sendKeys(Constant.Username);
		LogInPage.txtbx_Password(driver).sendKeys(Constant.Password);
		LogInPage.btn_LogIn(driver).sendKeys(Keys.ENTER);
		//Lupa
		LupaSearch.btn_lupa(driver).click();
		LupaSearch.txt_pesquisa(driver).sendKeys(Constant.Product + Keys.ENTER);
		Product.btn_mouse(driver).click();
		Product.btn_addcart(driver).click();
	}
	
	
}
