package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ContactoEliminarInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	JTextField id;
	JLabel mensaje;

	public ContactoEliminarInterfaz() {
		setResizable(false);
		setTitle("Eliminar contacto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("AGENDA");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\agregar-contacto.png"));
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIconTextGap(6);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel.setBackground(new Color(204, 204, 204));
		lblNewLabel.setAlignmentX(0.5f);
		lblNewLabel.setBounds(10, 11, 111, 239);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("ELIMINAR CONTACTO");
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_2.setBackground(new Color(204, 204, 204));
		lblNewLabel_2.setAlignmentX(1.0f);
		lblNewLabel_2.setBounds(131, 11, 293, 27);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("ID Contacto");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_1.setBounds(131, 50, 293, 27);
		contentPane.add(lblNewLabel_1);

		id = new JTextField();
		id.setText("");
		id.setColumns(10);
		id.setBounds(131, 76, 293, 20);
		contentPane.add(id);

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		JButton eliminar = crearBotonEliminar();
		contentPane.add(eliminar);

		mensaje = new JLabel("");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setForeground(new Color(153, 204, 153));
		mensaje.setFont(new Font("Consolas", Font.BOLD, 15));
		mensaje.setBounds(131, 185, 293, 27);
		contentPane.add(mensaje);
	}

	public JButton crearBotonSalir() {
		JButton salir = new JButton("SALIR");
		salir.setHorizontalTextPosition(SwingConstants.CENTER);
		salir.setForeground(Color.WHITE);
		salir.setFont(new Font("Consolas", Font.BOLD, 15));
		salir.setBorder(null);
		salir.setBackground(new Color(255, 153, 153));
		salir.setBounds(131, 223, 144, 27);
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		return salir;
	}

	public JButton crearBotonEliminar() {
		JButton eliminar = new JButton("ELIMINAR");
		eliminar.setHorizontalTextPosition(SwingConstants.CENTER);
		eliminar.setForeground(Color.WHITE);
		eliminar.setFont(new Font("Consolas", Font.BOLD, 15));
		eliminar.setBorder(null);
		eliminar.setBackground(new Color(153, 204, 153));
		eliminar.setBounds(280, 223, 144, 27);
		eliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ContactoModel contactoModel = new ContactoModel();
					int id_contacto = Integer.parseInt(id.getText());
					int n = contactoModel.deleteById(id_contacto);
					if (n > 0) {
						setMensaje("CONTACTO ELIMINADO.");
					} else {
						setMensaje("NO SE HA PODIDO ELIMINAR CONTACTO.");
					}
				} catch (SQLException e1) {
					setMensaje("NO SE HA PODIDO ELIMINAR CONTACTO.");
					// e1.printStackTrace();
				} catch (NumberFormatException e1) {
					setMensaje("EL ID DEBE SER NUMERICO.");
				}

			}
		});
		return eliminar;
	}

	public int getId() {
		int d = 0;
		if (!id.getText().isBlank()) {
			d = Integer.parseInt(id.getText());
		}
		return d;
	}

	public void limpiarMensaje() {
		mensaje.setText("");
	}

	public void setMensaje(String mensaje) {
		this.mensaje.setText(mensaje);
	}

}
