import java.awt.Font;

import javax.swing.JButton;

public class TeclaCalculadora extends JButton {
	private String text;

	static final int TECLA_INPUT = 0;
	static final int TECLA_OPERACAO = 1;

	public TeclaCalculadora(String text, int funcao) {
		super(text);
		this.text = text;

		setFont(new Font("Verdana", Font.BOLD, 13));

		if (funcao == TECLA_INPUT) {
			addMouseListener(new InputClick());
		} else if (funcao == TECLA_OPERACAO) {
			addMouseListener(new OperationClick());
		}
	}

	public String getText() {
		return this.text;
	}

}