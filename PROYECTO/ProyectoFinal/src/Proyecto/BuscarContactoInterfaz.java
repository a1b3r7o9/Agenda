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

public class BuscarContactoInterfaz extends JFrame {

	private JPanel contentPane;
	JTextField id;
	JLabel nombre;
	JLabel apellidos;
	JLabel telefono;
	JLabel correo;
	JLabel mensaje;

	public BuscarContactoInterfaz() {
		setTitle("Buscar contacto");
		setResizable(false);
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

		JLabel lblNewLabel_2 = new JLabel("BUSCAR CONTACTO");
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

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		JLabel lblNewLabel_1 = new JLabel("ID Contacto");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_1.setBounds(131, 49, 293, 27);
		contentPane.add(lblNewLabel_1);

		id = new JTextField();
		id.setText("");
		id.setBounds(131, 75, 293, 20);
		contentPane.add(id);
		id.setColumns(10);

		mensaje = new JLabel("");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setForeground(new Color(153, 204, 153));
		mensaje.setFont(new Font("Consolas", Font.BOLD, 15));
		mensaje.setBounds(131, 195, 293, 27);
		contentPane.add(mensaje);

		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4.setBounds(131, 106, 63, 27);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Apellido:");
		lblNewLabel_4_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(131, 125, 78, 27);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Telefono:");
		lblNewLabel_4_2.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(131, 144, 78, 27);
		contentPane.add(lblNewLabel_4_2);

		JLabel lblNewLabel_4_2_1 = new JLabel("Email:");
		lblNewLabel_4_2_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2_1.setBounds(131, 163, 53, 27);
		contentPane.add(lblNewLabel_4_2_1);

		nombre = new JLabel("");
		nombre.setFont(new Font("Consolas", Font.PLAIN, 15));
		nombre.setBounds(193, 108, 220, 22);
		contentPane.add(nombre);

		apellidos = new JLabel("");
		apellidos.setFont(new Font("Consolas", Font.PLAIN, 15));
		apellidos.setBounds(204, 127, 220, 22);
		contentPane.add(apellidos);

		telefono = new JLabel("");
		telefono.setFont(new Font("Consolas", Font.PLAIN, 15));
		telefono.setBounds(204, 146, 220, 22);
		contentPane.add(telefono);

		correo = new JLabel("");
		correo.setFont(new Font("Consolas", Font.PLAIN, 15));
		correo.setBounds(182, 165, 242, 22);
		contentPane.add(correo);

		JButton buscar = crearBotonBuscar();
		contentPane.add(buscar);
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

	public JButton crearBotonBuscar() {
		JButton buscar = new JButton("BUSCAR");
		buscar.setHorizontalTextPosition(SwingConstants.CENTER);
		buscar.setForeground(Color.WHITE);
		buscar.setFont(new Font("Consolas", Font.BOLD, 15));
		buscar.setBorder(null);
		buscar.setBackground(new Color(153, 204, 153));
		buscar.setBounds(280, 223, 144, 27);
		buscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					ContactoModel contactoModel = new ContactoModel();
					int id_contacto = Integer.parseInt(id.getText());
					Contacto contacto = contactoModel.getById(id_contacto);
					if (contacto != null) {
						limpiarMensaje();
						setContacto(contacto);
					} else {
						limpiarContacto();
						setMensaje("CONTACTO NO ENCONTRADO.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NumberFormatException e1) {
					setMensaje("DEBE ESCRIBIR UN NÚMERO.");
				}

			}

		});
		return buscar;
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

	public void limpiarContacto() {
		nombre.setText("");
		apellidos.setText("");
		telefono.setText("");
		correo.setText("");
	}

	public void setMensaje(String mensaje) {
		this.mensaje.setText(mensaje);
	}

	public void setContacto(Contacto contacto) {
		nombre.setText(contacto.getNombre());
		apellidos.setText(contacto.getApellidos());
		telefono.setText(contacto.getTelefono());
		correo.setText(contacto.getCorreo());
	}
}
