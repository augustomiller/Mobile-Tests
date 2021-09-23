package pageObject;

import static org.junit.Assert.assertEquals;
import static utilis.Utils.driver;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ClockPage {
	
	public ClockPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Alarm")
	private MobileElement botaoAlarme;

	@AndroidFindBy(accessibility = "Add alarm")
	private MobileElement btnAddAlarm;

	@AndroidFindBy(id = "android:id/button1")
	private MobileElement btnOk;

	@AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
	private MobileElement campoLabel;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement campoEditText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Default (Cesium)']")
	private MobileElement textoCombo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Barium']")
	private MobileElement opcaoCombo;

	@AndroidFindBy(xpath = "//android.widget.Switch[@text='ON'][1]")
	private MobileElement switchApp;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Repeat']")
	private MobileElement campoCheckBox;

	public void acessarMenuAlarme() throws Exception {
		System.out.println("acessando menu alarme");
//		MobileElement botaoAlarme = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='ALARM']");
		botaoAlarme.click();
	}

	public void acionarBotaoNovoAlarme() throws Exception {
		System.out.println("adicionando novo alarme");
//		MobileElement btnAddAlarm = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Add alarm"));
		btnAddAlarm.click();

	}

	public void acionarBotaoOk() throws Exception {
//		MobileElement btnOk = (MobileElement) driver.findElement(MobileBy.id("android:id/button1"));
		btnOk.click();
	}

	public void interagirComEditText() throws Exception {
		System.out.println("interagindo com EditText");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement campoLabel = (MobileElement) driver.findElement(MobileBy.id("com.google.android.deskclock:id/edit_label"));
		campoLabel.click();

//		MobileElement campoEditText = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.EditText"));
		campoEditText.sendKeys("novo alarme");
	}

	public void interagirComCombo() throws Exception {
		System.out.println("interagindo com ComboBox");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement textoCombo = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Default (Cesium)']"));
		textoCombo.click();

//		MobileElement opcaoCombo = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Barium']"));
		opcaoCombo.click();

	}

	public void interagindoComSwitch() throws Exception {
		System.out.println("interagindo com Switch");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement switchApp = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.Switch[@text='ON'][1]"));
		switchApp.click();

		assertEquals("false", switchApp.getAttribute("checked"));
	}

	public void interagindoComCheckBox() throws Exception {
		System.out.println("interagindo com CheckBox");

		acessarMenuAlarme();
		acionarBotaoNovoAlarme();

//		MobileElement campoCheckBox = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.CheckBox[@text='Repeat']"));
		campoCheckBox.click();

		assertEquals("true", campoCheckBox.getAttribute("checked"));
	}

	public void clicarNaHora(String hora) throws Exception {
		MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
		clickHora.click();
	}

	public void clicarNoMinuto(String minuto) throws Exception {
		MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
		clickMinuto.click();
	}

	public void selecionaroPeriodo(String periodo) throws Exception {

		String periodModify = periodo.toLowerCase();

		MobileElement clickPeriodo = (MobileElement) driver
				.findElement(MobileBy.id("android:id/" + periodModify + "_label"));
		clickPeriodo.click();
	}
	
	public void validarInformacoes(List<String> dados) {
		
		MobileElement infos;
		
		for (String info : dados) {
			
			infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text='"+info+"']"));
			System.out.println("Infos Tela: " + infos.getText());
			assertEquals(info, infos.getText());
		}
	}

}
