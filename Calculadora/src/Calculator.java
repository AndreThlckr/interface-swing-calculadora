import java.util.ArrayList;

public class Calculator {
	private double resultado;
	private ArrayList<String> memoria = new ArrayList<String>();
	
	public double getResultado() {
		return resultado;
	}
	
	public void addToMemory(String value) {
		
	}
	
	public void addToMemory(double value) {
		addToMemory(String.valueOf(value));
	}
}
