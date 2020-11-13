package pages;

import org.junit.Assert;

import config.PageBase;
import utils.Utils;
import static utils.Utils.result;

public class CalculatorPage extends PageBase {
	
	Utils utils = new Utils(); 
	
	public void calculator(String param) {
		utils.calculator(param);
	}
	
	public void validate() {
		boolean bool = true;
		System.out.println(bool);
		String msg = bool ? "SUCESSO": "ERROR";
		Assert.assertTrue(msg, bool);
	}
	
}
