package pageObject;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ClockPage {

	private AndroidDriver driver;

	public void acessarApp() throws MalformedURLException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.google.android.deskclock");
		desiredCapabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}

	public void acessarMenuAlarme() throws Exception {

		System.out.println("acessando menu alarme");

		MobileElement botaoAlarme = (MobileElement) driver
				.findElementByXPath("//android.widget.TextView[@text='ALARM']");
		botaoAlarme.click();
	}

	public void acionarBotaoNovoAlarme() throws Exception {
		System.out.println("adicionando novo alarme");

		MobileElement btnAddAlarm = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Add alarm"));
		btnAddAlarm.click();

		Thread.sleep(2000);

	}

	public void acionarBotaoOk() throws Exception {
		MobileElement btnOk = (MobileElement) driver.findElement(MobileBy.id("android:id/button1"));
		btnOk.click();

		Thread.sleep(2000);
	}

	public void interagirComEditText() throws Exception {
		System.out.println("interagindo com EditText");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		MobileElement campoLabel = (MobileElement) driver
				.findElement(MobileBy.id("com.google.android.deskclock:id/edit_label"));
		campoLabel.click();
		Thread.sleep(2000);

		MobileElement campoEditText = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.EditText"));
		campoEditText.sendKeys("novo alarme");
		Thread.sleep(2000);
	}

	public void interagirComCombo() throws Exception {
		System.out.println("interagindo com ComboBox");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		MobileElement textoCombo = (MobileElement) driver
				.findElement(MobileBy.xpath("//android.widget.TextView[@text='Default (Cesium)']"));
		textoCombo.click();

		MobileElement opcaoCombo = (MobileElement) driver
				.findElement(MobileBy.xpath("//android.widget.TextView[@text='Barium']"));
		opcaoCombo.click();
		Thread.sleep(2000);
	}

	public void interagindoComSwitch() throws Exception {
		System.out.println("interagindo com Switch");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		MobileElement switchApp = (MobileElement) driver
				.findElement(MobileBy.xpath("//android.widget.Switch[@text='ON'][1]"));
		switchApp.click();

		assertEquals("false", switchApp.getAttribute("checked"));
	}

	public void interagindoComCheckBox() throws Exception {
		System.out.println("interagindo com CheckBox");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

		MobileElement campoCheckBox = (MobileElement) driver
				.findElement(MobileBy.xpath("//android.widget.CheckBox[@text='Repeat']"));
		campoCheckBox.click();
		Thread.sleep(2000);

		assertEquals("true", campoCheckBox.getAttribute("checked"));
	}

	public void clicarNaHora(String hora) throws Exception {
		MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
		clickHora.click();
		Thread.sleep(2000);
	}

	public void clicarNoMinuto(String minuto) throws Exception {
		MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
		clickMinuto.click();
		Thread.sleep(2000);
	}

	public void selecionaroPeriodo(String periodo) throws Exception {

		String periodModify = periodo.toLowerCase();

		MobileElement clickPeriodo = (MobileElement) driver
				.findElement(MobileBy.id("android:id/" + periodModify + "_label"));
		clickPeriodo.click();
		Thread.sleep(2000);
	}

	public void tearDown() {
		driver.quit();
	}
}
