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
	
	private JTextField txtVisor;
	private JLabel lblNewLabel;
	private JButton btnDivisao;
	private JButton btnVezes;
	private JButton btn_9;
	private JButton btn_8;
	private JButton btn_7;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btnMenos;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btnMais;
	private JButton btnIgual;
	private JButton btn_0;

	private boolean isCompleto;
	private boolean isResultado;
	private int operacao;

	private ArrayList<Integer> operacoes = new ArrayList<Integer>();
	private ArrayList<Double> valores = new ArrayList<Double>();

	public class ClickNumero implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			String visor = txtVisor.getText();
			String digito = ((JButton) e.getSource()).getText();
			
			if (visor.equalsIgnoreCase("0") && !digito.equalsIgnoreCase(",")) {
					txtVisor.setText(digito);
			} else {
				txtVisor.setText(visor + digito);
			}
			
			visor = visor.replaceAll(",",".");
			System.out.println(Double.parseDouble(visor) + 1);
			

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
		frame.setLayout(null);

		btn_0 = new JButton("0");
		btn_0.addMouseListener(new ClickNumero());
		btn_0.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_0.setBounds(80, 377, 60, 60);
		frame.add(btn_0);

		btn_1 = new JButton("1");
		btn_1.addMouseListener(new ClickNumero());
		btn_1.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_1.setBounds(10, 306, 60, 60);
		frame.add(btn_1);

		btn_2 = new JButton("2");
		btn_2.addMouseListener(new ClickNumero());
		btn_2.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_2.setBounds(80, 306, 60, 60);
		frame.add(btn_2);

		btn_3 = new JButton("3");
		btn_3.addMouseListener(new ClickNumero());
		btn_3.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_3.setBounds(150, 306, 60, 60);
		frame.add(btn_3);

		btn_4 = new JButton("4");
		btn_4.addMouseListener(new ClickNumero());
		btn_4.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_4.setBounds(10, 235, 60, 60);
		frame.add(btn_4);

		btn_5 = new JButton("5");
		btn_5.addMouseListener(new ClickNumero());
		btn_5.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_5.setBounds(80, 235, 60, 60);
		frame.add(btn_5);

		btn_6 = new JButton("6");
		btn_6.addMouseListener(new ClickNumero());
		btn_6.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_6.setBounds(150, 235, 60, 60);
		frame.add(btn_6);

		btn_7 = new JButton("7");
		btn_7.addMouseListener(new ClickNumero());
		btn_7.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_7.setBounds(10, 164, 60, 60);
		frame.add(btn_7);

		btn_8 = new JButton("8");
		btn_8.addMouseListener(new ClickNumero());
		btn_8.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_8.setBounds(80, 164, 60, 60);
		frame.add(btn_8);

		btn_9 = new JButton("9");
		btn_9.addMouseListener(new ClickNumero());
		btn_9.setFont(new Font("Verdana", Font.BOLD, 13));
		btn_9.setBounds(150, 164, 60, 60);
		frame.add(btn_9);

		btnMais = new JButton("+");
		btnMais.setFont(new Font("Verdana", Font.BOLD, 13));
		btnMais.setBounds(236, 306, 60, 60);
		frame.add(btnMais);

		btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Verdana", Font.BOLD, 13));
		btnMenos.setBounds(236, 235, 60, 60);
		frame.add(btnMenos);

		btnVezes = new JButton("X");
		btnVezes.setFont(new Font("Verdana", Font.BOLD, 13));
		btnVezes.setBounds(236, 164, 60, 60);
		frame.add(btnVezes);

		btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Verdana", Font.BOLD, 13));
		btnIgual.setBounds(220, 377, 76, 60);
		frame.add(btnIgual);

		btnDivisao = new JButton("/");
		btnDivisao.setFont(new Font("Verdana", Font.BOLD, 13));
		btnDivisao.setBounds(236, 93, 60, 60);
		frame.add(btnDivisao);

		txtVisor = new JTextField();
		txtVisor.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setText("0");
		txtVisor.setEditable(false);
		txtVisor.setBounds(10, 38, 286, 44);
		frame.add(txtVisor);
		txtVisor.setColumns(10);

		lblNewLabel = new JLabel("2 + 2");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 5, 279, 26);
		frame.add(lblNewLabel);

		JButton btnDrag = new JButton("<=");
		btnDrag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDrag.setFont(new Font("Verdana", Font.BOLD, 13));
		btnDrag.setBounds(150, 93, 60, 60);
		frame.add(btnDrag);

		JButton btnClean = new JButton("C");
		btnClean.setFont(new Font("Verdana", Font.BOLD, 13));
		btnClean.setBounds(80, 93, 60, 60);
		frame.add(btnClean);

		JButton btnInverteSinal = new JButton("+-");
		btnInverteSinal.setFont(new Font("Verdana", Font.BOLD, 13));
		btnInverteSinal.setBounds(10, 377, 60, 60);
		frame.add(btnInverteSinal);

		JButton btnVirgula = new JButton(",");
		btnVirgula.addMouseListener(new ClickNumero());
		btnVirgula.setFont(new Font("Verdana", Font.BOLD, 13));
		btnVirgula.setBounds(150, 377, 60, 60);
		frame.add(btnVirgula);
	}

}
