package utils;

public class Utils {
	
	public static int count = 0;
	public static int number1;
	public static int number2;
	public static String op;
	public static int result;

	public void calculator(String param) {
		
		switch (count) {
		case 0:
			number1 = Integer.parseInt(param);
			break;
		case 1:
			op = param;
			break;
		case 2:
			number2 = Integer.parseInt(param);
			break;
		default:
			exec();
			break;
		}
		count++;
	}
	
	public void exec() {
		if(op.equals("mais")) {
			result = number1 + number2;
		}
		else if(op.equals("menos")) {
			result = number1 - number2;
		}
		else if(op.equals("multiplicar")) {
			result = number1 * number2;
		}
		else if(op.equals("dividir")) {
			result = number1 / number2;
		}	
		else {
			System.out.println("Não suportado");
		}
			
	}
}
