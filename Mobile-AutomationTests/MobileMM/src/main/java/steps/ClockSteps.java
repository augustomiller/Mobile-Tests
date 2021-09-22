package steps;

//import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.ClockPage;
import static utilis.Utils.*;

public class ClockSteps {

	ClockPage cp = new ClockPage(driver);

	@E("acionar o menu alarme")
	public void acionarOMenuAlarme() throws Exception {
		cp.acessarMenuAlarme();
	}

	@Quando("o utilizador acionar o botao adicionar alarme")
	public void oUtilizadorAcionarOBotaoAdicionarAlarme() throws Exception {
		cp.acionarBotaoNovoAlarme();
	}
		
	@Quando("configurar a hora desejada para {string},{string}")
	public void configurarAHoraDesejadaPara(String hour, String period) throws Exception {
		
		String fullTime [] = hour.split(":");
		String hourH = fullTime[0];
		String minute = fullTime[1];
		
		cp.clicarNaHora(hourH);
		cp.clicarNoMinuto(minute);
		cp.selecionaroPeriodo(period);
		cp.acionarBotaoOk();
	}

	@Entao("o app adiciona o novo alarme")
	public void oAppAdicionaONovoAlarme() throws Exception {
		System.out.println("validação de um novo alarme");
		
		//cp.tearDown();
	}
}
