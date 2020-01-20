package br.com.rsi.hub.projetotdd.page.actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsi.hub.projetotdd.utility.Constant;
import br.com.rsi.hub.projetotdd.utility.Driver;
import br.com.rsi.hub.projetotdd.utility.ScreenShot;

public class Register {
	
	public static WebDriver driver;

	@Test
	public void register() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.id("menuUserLink")).click();
		System.out.println("clique no login/cadastro");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")));
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);
		System.out.println("entro em novo usuario");
		//Account Details
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Coruja");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Sabedoria1");
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Sabedoria1");
		driver.findElement(By.name("emailRegisterPage")).sendKeys("athena@olimpo.com");
		//Personal Details
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Athena");
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Minerva");
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("+30 21 0321 4172");
		//Address
		Select oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		oSelect.selectByVisibleText("Greece");
		//driver.findElement(By.name("countryListboxRegisterPage")).sendKeys("Greece");
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Αθήνα");
		driver.findElement(By.name("addressRegisterPage")).sendKeys("Athens 105 58, Grécia");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("11700");
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Αθήνα");
		//Check Box
		driver.findElement(By.name("allowOffersPromotion")).click();
		driver.findElement(By.name("i_agree")).click();
		//Register
		driver.findElement(By.id("register_btnundefined")).sendKeys(Keys.ENTER);
	
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