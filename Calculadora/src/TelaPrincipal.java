import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal {

	private static JTextField txtVisor;
	public static boolean isResultado = false;
	public static Calculator calculadora = new Calculator();
	
	private TeclaCalculadora btn_0;
	private TeclaCalculadora btn_1;
	private TeclaCalculadora btn_2;
	private TeclaCalculadora btn_3;
	private TeclaCalculadora btn_4;
	private TeclaCalculadora btn_5;
	private TeclaCalculadora btn_6;
	private TeclaCalculadora btn_7;
	private TeclaCalculadora btn_8;
	private TeclaCalculadora btn_9;
	private TeclaCalculadora btnVirgula;
	private TeclaCalculadora btnDivisao;
	private TeclaCalculadora btnVezes;
	private TeclaCalculadora btnMenos;
	private TeclaCalculadora btnMais;

	private JButton btnIgual;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 487);
		frame.getContentPane().setLayout(null);

		txtVisor = new JTextField();
		txtVisor.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setText("0");
		txtVisor.setEditable(false);
		txtVisor.setBounds(10, 38, 286, 44);
		frame.getContentPane().add(txtVisor);
		txtVisor.setColumns(10);

		// BOTOES DE INPUT

		btn_0 = new TeclaCalculadora("0", TeclaCalculadora.TECLA_INPUT);
		btn_0.setBounds(80, 377, 60, 60);
		frame.getContentPane().add(btn_0);

		btn_1 = new TeclaCalculadora("1", TeclaCalculadora.TECLA_INPUT);
		btn_1.setBounds(10, 306, 60, 60);
		frame.getContentPane().add(btn_1);

		btn_2 = new TeclaCalculadora("2", TeclaCalculadora.TECLA_INPUT);
		btn_2.setBounds(80, 306, 60, 60);
		frame.getContentPane().add(btn_2);

		btn_3 = new TeclaCalculadora("3", TeclaCalculadora.TECLA_INPUT);
		btn_3.setBounds(150, 306, 60, 60);
		frame.getContentPane().add(btn_3);

		btn_4 = new TeclaCalculadora("4", TeclaCalculadora.TECLA_INPUT);
		btn_4.setBounds(10, 235, 60, 60);
		frame.getContentPane().add(btn_4);

		btn_5 = new TeclaCalculadora("5", TeclaCalculadora.TECLA_INPUT);
		btn_5.setBounds(80, 235, 60, 60);
		frame.getContentPane().add(btn_5);

		btn_6 = new TeclaCalculadora("6", TeclaCalculadora.TECLA_INPUT);
		btn_6.setBounds(150, 235, 60, 60);
		frame.getContentPane().add(btn_6);

		btn_7 = new TeclaCalculadora("7", TeclaCalculadora.TECLA_INPUT);
		btn_7.setBounds(10, 164, 60, 60);
		frame.getContentPane().add(btn_7);

		btn_8 = new TeclaCalculadora("8", TeclaCalculadora.TECLA_INPUT);
		btn_8.setBounds(80, 164, 60, 60);
		frame.getContentPane().add(btn_8);

		btn_9 = new TeclaCalculadora("9", TeclaCalculadora.TECLA_INPUT);
		btn_9.setBounds(150, 164, 60, 60);
		frame.getContentPane().add(btn_9);

		btnVirgula = new TeclaCalculadora(",", TeclaCalculadora.TECLA_INPUT);
		btnVirgula.setBounds(150, 377, 60, 60);
		frame.getContentPane().add(btnVirgula);

		// BOTOES DE OPERACAO

		btnMais = new TeclaCalculadora("+", TeclaCalculadora.TECLA_OPERACAO);
		btnMais.setBounds(236, 306, 60, 60);
		frame.getContentPane().add(btnMais);

		btnMenos = new TeclaCalculadora("-", TeclaCalculadora.TECLA_OPERACAO);
		btnMenos.setBounds(236, 235, 60, 60);
		frame.getContentPane().add(btnMenos);

		btnVezes = new TeclaCalculadora("X", TeclaCalculadora.TECLA_OPERACAO);
		btnVezes.setBounds(236, 164, 60, 60);
		frame.getContentPane().add(btnVezes);

		btnDivisao = new TeclaCalculadora("/", TeclaCalculadora.TECLA_OPERACAO);
		btnDivisao.setBounds(236, 93, 60, 60);
		frame.getContentPane().add(btnDivisao);


		// BOTOES ESPECIAIS

		JButton btnDrag = new JButton("<=");
		btnDrag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				drag();
			}
		});
		btnDrag.setFont(new Font("Verdana", Font.BOLD, 13));
		btnDrag.setBounds(150, 93, 60, 60);
		frame.getContentPane().add(btnDrag);

		JButton btnClean = new JButton("C");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaVisor();
			}
		});
		btnClean.setFont(new Font("Verdana", Font.BOLD, 13));
		btnClean.setBounds(80, 93, 60, 60);
		frame.getContentPane().add(btnClean);

		JButton btnInverteSinal = new JButton("+-");
		btnInverteSinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inverteSinal();
			}
		});
		btnInverteSinal.setFont(new Font("Verdana", Font.BOLD, 13));
		btnInverteSinal.setBounds(10, 377, 60, 60);
		frame.getContentPane().add(btnInverteSinal);

		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getResultado();
				isResultado = true;
			}
		});
		btnIgual.setFont(new Font("Verdana", Font.BOLD, 13));
		btnIgual.setBounds(220, 377, 76, 60);
		frame.getContentPane().add(btnIgual);
	}

	public static String getTxtVisorText() {
		return txtVisor.getText();
	}

	public static void setTxtVisorText(String text) {
		txtVisor.setText(text);
	}

	private void limpaVisor() {
		txtVisor.setText("0");
	}

	private void drag() {
		String textoVisor = txtVisor.getText();
		if (textoVisor.length() > 1) {
			textoVisor = textoVisor.substring(0, textoVisor.length() - 1);
		} else {
			limpaVisor();
			return;
		}

		txtVisor.setText(textoVisor);
	}

	private void inverteSinal() {
		String textoVisor = txtVisor.getText();
		double valor = Double.valueOf(textoVisor.replaceAll(",", "."));
		if (valor > 0) {
			txtVisor.setText("-" + textoVisor);
		}
		
		if(valor < 0) {
			txtVisor.setText(textoVisor.substring(1, textoVisor.length()));
		}
	}
	
	public void getResultado() {
		if(calculadora.isPrimeiroValorEntered()) {
			calculadora.setSegundoValor(Double.valueOf(txtVisor.getText().replaceAll(",", ".")));
		} else {
			calculadora.setPrimeiroValor(Double.valueOf(txtVisor.getText().replaceAll(",", ".")));
		}
		
		txtVisor.setText(String.valueOf(calculadora.getResultado()));
		calculadora.cleanMemory();
	}
}
