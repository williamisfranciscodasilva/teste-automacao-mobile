package pages;

import static utils.Utils.result;

import org.junit.Assert;

import config.PageBase;
import io.appium.java_client.MobileElement;
import utils.Utils;

public class CalculatorPage extends PageBase {
	
	
	Utils utils = new Utils(); 
	MobileElement element;
	
	public static int count=0;
	
	public void calculator(String param) {
		switch (count) {
		case 0:
			this.element = driver.findElementById("com.google.android.calculator:id/digit_" + param);
			break;
		
		case 1:
			this.element = driver.findElementByAccessibilityId(param);
			break;
			
		case 2:
			this.element = driver.findElementById("com.google.android.calculator:id/digit_" + param);
			break;
			
		default:
			this.element = driver.findElementByAccessibilityId(param);
			break;
		}
		this.element.click();
		utils.calculator(param);
		count++;
	}
	
	public void validate() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MobileElement resultado = driver.findElementById("com.google.android.calculator:id/result_final");
		boolean bool = result == Integer.parseInt(resultado.getText());
		String msg = bool ? "SUCESSO": "ERROR";
		Assert.assertTrue(msg, bool);
	}
	
	
	
}
