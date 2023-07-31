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
public class EditarContactoInterfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtA;
	private JTextField txtT;
	private JTextField txtE;
	private JTextField textField_4;
	private JTextField txtId;

	JTextField id;
	JTextField idUsuario;
	JLabel nombre;
	JLabel apellidos;
	JLabel telefono;
	JLabel correo;
	JLabel mensaje;

	JTextField cajaNombre;
	JTextField cajaApellidos;
	JTextField cajaTelefono;
	JTextField cajaCorreo;

	public EditarContactoInterfaz() {
		setResizable(false);
		setTitle("Actualizar contacto");
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

		JLabel lblNewLabel_2 = new JLabel("ACTUALIZAR CONTACTO");
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
		lblNewLabel_4.setBounds(131, 93, 63, 20);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Apellido:");
		lblNewLabel_4_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(131, 116, 78, 22);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Telefono:");
		lblNewLabel_4_2.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(131, 142, 78, 22);
		contentPane.add(lblNewLabel_4_2);

		JLabel lblNewLabel_4_2_1 = new JLabel("Email:");
		lblNewLabel_4_2_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2_1.setBounds(131, 164, 53, 22);
		contentPane.add(lblNewLabel_4_2_1);

		cajaNombre = new JTextField();
		cajaNombre.setText("");
		cajaNombre.setColumns(10);
		cajaNombre.setBounds(231, 92, 193, 20);
		contentPane.add(cajaNombre);

		cajaApellidos = new JTextField();
		cajaApellidos.setText("");
		cajaApellidos.setColumns(10);
		cajaApellidos.setBounds(231, 116, 193, 20);
		contentPane.add(cajaApellidos);

		cajaTelefono = new JTextField();
		cajaTelefono.setText("");
		cajaTelefono.setColumns(10);
		cajaTelefono.setBounds(231, 142, 193, 20);
		contentPane.add(cajaTelefono);

		cajaCorreo = new JTextField();
		cajaCorreo.setText("");
		cajaCorreo.setColumns(10);
		cajaCorreo.setBounds(231, 166, 193, 20);
		contentPane.add(cajaCorreo);

		JLabel lblNewLabel_4_2_1_1 = new JLabel("ID Usuario:");
		lblNewLabel_4_2_1_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2_1_1.setBounds(131, 69, 93, 20);
		contentPane.add(lblNewLabel_4_2_1_1);

		idUsuario = new JTextField();
		idUsuario.setText("1");
		idUsuario.setColumns(10);
		idUsuario.setBounds(231, 68, 193, 20);
		contentPane.add(idUsuario);

		JLabel lblNewLabel_4_2_1_1_1 = new JLabel("ID:");
		lblNewLabel_4_2_1_1_1.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_4_2_1_1_1.setBounds(131, 46, 93, 20);
		contentPane.add(lblNewLabel_4_2_1_1_1);

		id = new JTextField();
		id.setText("");
		id.setColumns(10);
		id.setBounds(231, 45, 193, 20);
		contentPane.add(id);

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		JButton editar = crearBotonActualizar();
		contentPane.add(editar);

		mensaje = new JLabel("");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setForeground(new Color(153, 204, 153));
		mensaje.setFont(new Font("Consolas", Font.BOLD, 15));
		mensaje.setBounds(131, 197, 293, 27);
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

	public JButton crearBotonActualizar() {
		JButton editar = new JButton("ACTUALIZAR");
		editar.setHorizontalTextPosition(SwingConstants.CENTER);
		editar.setForeground(Color.WHITE);
		editar.setFont(new Font("Consolas", Font.BOLD, 15));
		editar.setBorder(null);
		editar.setBackground(new Color(153, 204, 153));
		editar.setBounds(280, 223, 144, 27);
		editar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ContactoModel contactoModel = new ContactoModel();
					Contacto contacto = new Contacto(getId(), getIdUsuario(), getNombre(), getApellidos(),
							getTelefono(), getCorreo());
					int c = contactoModel.updateById(contacto);
					if (c > 0) {
						setMensaje("CONTACTO ACTUALIZADO");
						limpiarContacto();
					} else {
						setMensaje("NO SE HA PODIDO ACTUALIZAR");
					}
					System.out.println(contacto);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		return editar;
	}

	public int getId() {
		int d = 0;
		if (!id.getText().isBlank()) {
			d = Integer.parseInt(id.getText());
		}
		return d;
	}

	public int getIdUsuario() {
		int d = 0;
		if (!idUsuario.getText().isBlank()) {
			d = Integer.parseInt(idUsuario.getText());
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
		id.setText("");
		cajaNombre.setText("");
		cajaApellidos.setText("");
		cajaTelefono.setText("");
		cajaCorreo.setText("");
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
