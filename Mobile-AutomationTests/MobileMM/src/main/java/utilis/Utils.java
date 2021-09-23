package utilis;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.cucumber.java.Scenario;



public class Utils {
	
	public static AppiumDriver<WebElement> driver;

	public static void acessarApp() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.google.android.deskclock");
		desiredCapabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");

		driver = new AppiumDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static File gerarScreenshot(Scenario cenario) {
		
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		cenario.attach(screenshot, "image/png", "gerarScreenshot");
		
		File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, (new File("./target/screenshots", cenario.getName() + "-" + cenario.getStatus() + ".png")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return imagem;
	}
}
 