package br.com.rsi.hub.projetotdd.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot extends Driver{
	
	public static void ScreenShotCapture(WebDriver driver) throws IOException{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\kaique.silva\\eclipse-workspace\\projetotdd\\screenshot\\" + System.currentTimeMillis() + ".png"));
		
		}
}