package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ContactoTodosInterfaz extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table1;
	JComboBox<String> combo;
	JLabel label;
	JScrollPane panel;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ContactoTodosInterfaz() throws SQLException {
		setResizable(false);
		setTitle("Mostrar todos ");
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
		lblNewLabel.setBounds(10, 11, 64, 239);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("CONTACTOS\r\n");
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 15));
		lblNewLabel_2.setBackground(new Color(204, 204, 204));
		lblNewLabel_2.setAlignmentX(1.0f);
		lblNewLabel_2.setBounds(84, 11, 340, 27);
		contentPane.add(lblNewLabel_2);

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		panel = new JScrollPane();
		panel.setBounds(84, 66, 338, 146);
		contentPane.add(panel);

		table = new JTable();
		table.setFont(new Font("Consolas", Font.PLAIN, 12));

		String[] columName = { "ID", "ID USUARIO", "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL" };
		DefaultTableModel model = new DefaultTableModel(columName, 0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		ContactoModel contactoModel = new ContactoModel();
		List<Contacto> contacto = null;
		try {
			contacto = contactoModel.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Contacto contactos : contacto) {
			Object[] rowData = { contactos.getId(), contactos.getIdUsuario(), contactos.getNombre(),
					contactos.getApellidos(), contactos.getTelefono(), contactos.getCorreo() };
			model.addRow(rowData);
		}
		table.setModel(model);

		panel.setViewportView(table);

		// TABLA USUARIO

		table1 = new JTable();
		table1.setFont(new Font("Consolas", Font.PLAIN, 12));

		String[] columName1 = { "ID", "NOMBRE", "CONTRASEÑA" };
		DefaultTableModel model1 = new DefaultTableModel(columName1, 0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		UsuarioModel userModel1 = new UsuarioModel();
		List<Usuario> usuario = null;
		try {
			usuario = userModel1.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Usuario usuarios : usuario) {
			Object[] rowData1 = { usuarios.getId(), usuarios.getNombreUsuario(), usuarios.getContrasena() };
			model1.addRow(rowData1);
		}
		table1.setModel(model1);

		ActionCombo escuchador = new ActionCombo();
		combo = new JComboBox();
		combo.addActionListener(escuchador);

		combo.setModel(new DefaultComboBoxModel(new String[] { "Contactos", "Mis datos" }));
		combo.setBounds(152, 41, 83, 22);
		contentPane.add(combo);

		label = new JLabel("Elegir tabla");
		label.setBounds(84, 45, 70, 14);
		contentPane.add(label);
	}

	public JButton crearBotonSalir() {
		JButton salir = new JButton("SALIR");
		salir.setHorizontalTextPosition(SwingConstants.CENTER);
		salir.setForeground(Color.WHITE);
		salir.setFont(new Font("Consolas", Font.BOLD, 15));
		salir.setBorder(null);
		salir.setBackground(new Color(255, 153, 153));
		salir.setBounds(84, 223, 340, 27);
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		return salir;
	}

	@SuppressWarnings("unused")
	private class ActionCombo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String color = (String) combo.getSelectedItem();
			switch (color) {
			case "Contactos":
				panel.setViewportView(table);
				break;
			case "Mis datos":
				panel.setViewportView(table1);

				break;
			default:

			}
		}
	}

}
