package steps;

import clock.Clock;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ClockSteps {

	Clock ck = new Clock();

	@Dado("que o utilizador esteja acessando o App Clock")
	public void queOUtilizadorEstejaAcessandoOAppClock() throws Exception {
		ck.acessarApp();
	}

	@E("acionar o menu alarme")
	public void acionarOMenuAlarme() throws Exception {
		ck.acessarMenuAlarme();
	}

	@Quando("o utilizador acionar o botao adicionar alarme")
	public void oUtilizadorAcionarOBotaoAdicionarAlarme() throws Exception {
		ck.acionarBotaoNovoAlarme();
	}
		
	@Quando("configurar a hora desejada para {string},{string}")
	public void configurarAHoraDesejadaPara(String hour, String period) throws Exception {
		
		String fullTime [] = hour.split(":");
		String hourH = fullTime[0];
		String minute = fullTime[1];
		
		ck.clicarNaHora(hourH);
		ck.clicarNoMinuto(minute);
		ck.selecionaroPeriodo(period);
		ck.acionarBotaoOk();
	}

	@Entao("o app adiciona o novo alarme")
	public void oAppAdicionaONovoAlarme() throws Exception {
		System.out.println("validação de um novo alarme");
		
		ck.tearDown();
	}
}
