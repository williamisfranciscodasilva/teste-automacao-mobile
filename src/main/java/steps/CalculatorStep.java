package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import pages.CalculatorPage;

public class CalculatorStep{
	
	CalculatorPage calculatorPage = new CalculatorPage();
	
	@Dado("^que eu clique em \"([^\"]*)\"$")
	public void dado_que_eu_clique_em(String num) {
		calculatorPage.calculator(num);
	}
	
	@Entao("devo validar o resultado")
	public void entao_devo_validar_o_resultado() {
		calculatorPage.validate();
	}
}
