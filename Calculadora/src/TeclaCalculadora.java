import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class TeclaCalculadora extends JButton {
	private String text;

	static final int TECLA_DIGITO = 0;
	static final int ADICAO = 1;
	static final int SUBTRACAO = 2;
	static final int DIVISAO = 3;
	static final int MULTIPLICACAO = 4;

	public TeclaCalculadora(String text, int funcao) {
		super(text);

		this.text = text;
	}

	public String getText() {
		return this.text;
	}

}
