import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class InputClick implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		String visor = TelaPrincipal.getTxtVisorText();
		String digito = ((JButton) e.getSource()).getText();
		boolean isVirgula = digito.equalsIgnoreCase(",");

		if (TelaPrincipal.isResultado) {
			if (!isVirgula) {
				TelaPrincipal.setTxtVisorText(digito);
			} else {
				TelaPrincipal.setTxtVisorText("0" + digito);
			}
			
			TelaPrincipal.isResultado = false;
		} else {

			if (!isVirgula) {
				if (visor.equalsIgnoreCase("0")) {
					TelaPrincipal.setTxtVisorText(digito);
				} else {
					TelaPrincipal.setTxtVisorText(visor + digito);
				}
			} else {
				if (!visor.contains(",")) {
					TelaPrincipal.setTxtVisorText(visor + digito);
				}
			}
		}
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
