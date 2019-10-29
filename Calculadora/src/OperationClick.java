import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class OperationClick implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		String visor = TelaPrincipal.getTxtVisorText();
		String op = ((JButton) e.getSource()).getText();

		TelaPrincipal.calculadora.setPrimeiroValor(Double.valueOf(visor.replaceAll(",", ".")));

		CalculatorOperation operacao;

		switch (op) {
		case "+":
			operacao = CalculatorOperation.SOMA;
			break;
		case "-":
			operacao = CalculatorOperation.SUBTRACAO;
			break;
		case "X":
			operacao = CalculatorOperation.MULTIPLICACAO;
			break;
		case "/":
			operacao = CalculatorOperation.DIVISAO;
			break;
		default:
			operacao = CalculatorOperation.MULTIPLICACAO;
		}

		TelaPrincipal.calculadora.setOperacao(operacao);
		
		TelaPrincipal.setTxtVisorText("0");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
