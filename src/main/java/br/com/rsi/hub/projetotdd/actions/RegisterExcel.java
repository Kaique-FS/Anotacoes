package br.com.rsi.hub.projetotdd.actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsi.hub.projetotdd.pageobjects.RegisterPage;
import br.com.rsi.hub.projetotdd.utility.Constant;
import br.com.rsi.hub.projetotdd.utility.Driver;
import br.com.rsi.hub.projetotdd.utility.ExcelUtils;
import br.com.rsi.hub.projetotdd.utility.ScreenShot;

public class RegisterExcel {

	private static WebDriver driver;
	
	@Test
	public void Execute() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.findElement(By.id("menuUserLink")).click();
		System.out.println("clique no login/cadastro");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);
		System.out.println("entro em novo usuario");

		ExcelUtils.setExcelFile(Constant.Path_TestData, "Planilha1");

		String sUserName = ExcelUtils.getCellData(2, 0);
		String sEmail = ExcelUtils.getCellData(2, 1);
		String sPassword = ExcelUtils.getCellData(2, 2);
		String sConfirmPassword = ExcelUtils.getCellData(2, 3);
		String sFirstName = ExcelUtils.getCellData(2, 4);
		String sLastName = ExcelUtils.getCellData(2, 5);
		String sTelNumber = ExcelUtils.getCellData(2, 6);
		String sCountry = ExcelUtils.getCellData(2, 7);
		String sCity = ExcelUtils.getCellData(2, 8);
		String sAddress = ExcelUtils.getCellData(2, 9);
		String sPostalCode = ExcelUtils.getCellData(2, 10);
		String sState = ExcelUtils.getCellData(2, 11);

		RegisterPage.txt_username(driver).sendKeys(sUserName);
		RegisterPage.txt_email(driver).sendKeys(sEmail);
		RegisterPage.txt_password(driver).sendKeys(sPassword);
		RegisterPage.txt_confirmpassword(driver).sendKeys(sConfirmPassword);
		RegisterPage.txt_firstname(driver).sendKeys(sFirstName);
		RegisterPage.txt_lastname(driver).sendKeys(sLastName);
		RegisterPage.txt_phone(driver).sendKeys(sTelNumber);
		RegisterPage.txt_country(driver).sendKeys(sCountry); // (verificar outro metodo)
		RegisterPage.txt_city(driver).sendKeys(sCity);
		RegisterPage.txt_address(driver).sendKeys(sAddress);
		RegisterPage.txt_postalcode(driver).sendKeys(sPostalCode); //int - string (validar)
		RegisterPage.txt_state(driver).sendKeys(sState);
		
		RegisterPage.btn_checkbox1(driver).click();
		RegisterPage.btn_checkbox2(driver).click();
		RegisterPage.btn_register(driver).sendKeys(Keys.ENTER);
		
	}
	@BeforeMethod
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void Finaliza() throws IOException {
		ScreenShot.ScreenShotCapture(driver);
		Driver.closeBrowser(driver);
	}
}
