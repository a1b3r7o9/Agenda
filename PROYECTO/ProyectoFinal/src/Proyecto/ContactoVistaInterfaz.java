package Proyecto;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ContactoVistaInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	JLabel mensaje;

	public ContactoVistaInterfaz() {
		setResizable(false);
		setFont(new Font("Consolas", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Desktop\\telefono.png"));
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("AGENDA");
		lblNewLabel.setIconTextGap(6);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(204, 204, 204));
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\agregar-contacto.png"));
		lblNewLabel.setBounds(10, 11, 111, 239);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\usuario.png"));
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_1.setBounds(131, 49, 293, 27);
		contentPane.add(lblNewLabel_1);

		JButton entrar = crearBotonEntrar();
		contentPane.add(entrar);

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(131, 109, 293, 27);
		contentPane.add(lblNewLabel_1_1);

		textField = new JTextField("admin");
		textField.setFont(new Font("Consolas", Font.PLAIN, 15));
		textField.setForeground(new Color(153, 153, 153));
		textField.setBounds(131, 78, 293, 27);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField("12345");
		passwordField.setForeground(new Color(153, 153, 153));
		passwordField.setFont(new Font("Consolas", Font.PLAIN, 15));
		passwordField.setBounds(131, 137, 293, 27);
		contentPane.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel("INICIAR SESIÓN");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_2.setBackground(new Color(204, 204, 204));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(131, 11, 293, 27);
		contentPane.add(lblNewLabel_2);

		mensaje = new JLabel("");
		mensaje.setHorizontalTextPosition(SwingConstants.CENTER);
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setForeground(new Color(153, 204, 153));
		mensaje.setFont(new Font("Consolas", Font.BOLD, 15));
		mensaje.setBounds(131, 196, 293, 27);
		contentPane.add(mensaje);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar contraseña");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setFont(new Font("Consolas", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(127, 166, 186, 23);
		contentPane.add(chckbxNewCheckBox);
	}

	public JButton crearBotonSalir() {
		JButton salir = new JButton("SALIR");
		salir.setHorizontalTextPosition(SwingConstants.CENTER);
		salir.setForeground(new Color(255, 255, 255));
		salir.setBorder(null);
		salir.setBackground(new Color(255, 153, 153));
		salir.setFont(new Font("Consolas", Font.BOLD, 15));
		salir.setBounds(131, 223, 140, 27);
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		return salir;
	}

	public JButton crearBotonEntrar() {
		JButton entrar = new JButton("ENTRAR");
		entrar.setForeground(new Color(255, 255, 255));
		entrar.setBorder(null);
		entrar.setBackground(new Color(153, 204, 153));
		entrar.setFont(new Font("Consolas", Font.BOLD, 15));
		entrar.setBounds(281, 223, 143, 27);

		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String input = textField.getText();
				String inputPass = passwordField.getText();
				if (input.equals("admin") && inputPass.equals("12345")) {
					ContactoAccesoInterfaz accesoInterfaz = new ContactoAccesoInterfaz();
					accesoInterfaz.setVisible(true);
					dispose();
				} else {
					setMensaje("DATOS INCORRECTOS");
				}
			}

		});

		return entrar;

	}

	public void limpiarMensaje() {
		mensaje.setText("");
	}

	public void setMensaje(String mensaje) {
		this.mensaje.setText(mensaje);
	}
}
