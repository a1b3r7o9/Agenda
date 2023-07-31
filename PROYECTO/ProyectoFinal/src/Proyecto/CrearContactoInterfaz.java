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
public class CrearContactoInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	JTextField id;
	JLabel nombre;
	JLabel apellidos;
	JLabel telefono;
	JLabel correo;
	JLabel mensaje;

	JTextField cajaNombre;
	JTextField cajaApellidos;
	JTextField cajaTelefono;
	JTextField cajaCorreo;

	public CrearContactoInterfaz() {
		setResizable(false);
		setTitle("Crear contacto");
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

		JLabel lblNewLabel_2 = new JLabel("CREAR CONTACTO");
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

		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4.setBounds(131, 80, 63, 27);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Apellido:");
		lblNewLabel_4_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(131, 107, 78, 27);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Telefono:");
		lblNewLabel_4_2.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(131, 132, 78, 27);
		contentPane.add(lblNewLabel_4_2);

		JLabel lblNewLabel_4_2_1 = new JLabel("Email:");
		lblNewLabel_4_2_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2_1.setBounds(131, 160, 53, 27);
		contentPane.add(lblNewLabel_4_2_1);

		cajaNombre = new JTextField();
		cajaNombre.setBounds(231, 82, 193, 20);
		contentPane.add(cajaNombre);
		cajaNombre.setColumns(10);

		cajaApellidos = new JTextField();
		cajaApellidos.setColumns(10);
		cajaApellidos.setBounds(231, 109, 193, 20);
		contentPane.add(cajaApellidos);

		cajaTelefono = new JTextField();
		cajaTelefono.setColumns(10);
		cajaTelefono.setBounds(231, 134, 193, 20);
		contentPane.add(cajaTelefono);

		cajaCorreo = new JTextField();
		cajaCorreo.setColumns(10);
		cajaCorreo.setBounds(231, 162, 193, 20);
		contentPane.add(cajaCorreo);

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		JButton crear = crearBotonCrear();
		contentPane.add(crear);

		mensaje = new JLabel("");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setHorizontalTextPosition(SwingConstants.CENTER);
		mensaje.setFont(new Font("Consolas", Font.BOLD, 15));
		mensaje.setForeground(new Color(153, 204, 153));
		mensaje.setBounds(131, 198, 293, 20);
		contentPane.add(mensaje);

		JLabel lblNewLabel_4_2_1_1 = new JLabel("ID Usuario:");
		lblNewLabel_4_2_1_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2_1_1.setBounds(131, 49, 93, 27);
		contentPane.add(lblNewLabel_4_2_1_1);

		// ESTA PREDEFINIDO EN 1, DEBIDO A QUE SOLO TENEMOS UN USUARIO
		id = new JTextField();
		id.setText("1");
		id.setColumns(10);
		id.setBounds(231, 49, 193, 20);
		contentPane.add(id);
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

	public JButton crearBotonCrear() {
		JButton crear = new JButton("CREAR");
		crear.setHorizontalTextPosition(SwingConstants.CENTER);
		crear.setForeground(Color.WHITE);
		crear.setFont(new Font("Consolas", Font.BOLD, 15));
		crear.setBorder(null);
		crear.setBackground(new Color(153, 204, 153));
		crear.setBounds(280, 223, 144, 27);
		crear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ContactoModel contactoModel = new ContactoModel();
					Contacto contacto = new Contacto(getIdUsuario(), getNombre(), getApellidos(), getTelefono(),
							getCorreo());
					contactoModel.create(contacto);
					setMensaje("CONTACTO CREADO.");
					System.out.println(contacto);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		return crear;
	}

	public int getIdUsuario() {
		int d = 0;
		if (!id.getText().isBlank()) {
			d = Integer.parseInt(id.getText());
		}
		return d;
	}

	public String getNombre() {
		return cajaNombre.getText();
	}

	public String getApellidos() {
		return cajaApellidos.getText();
	}

	public String getTelefono() {
		return cajaTelefono.getText();
	}

	public String getCorreo() {
		return cajaCorreo.getText();
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
