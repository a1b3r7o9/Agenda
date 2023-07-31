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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ContactoAccesoInterfaz extends JFrame {

	private JPanel contentPane;

	public ContactoAccesoInterfaz() {
		setResizable(false);
		setTitle("Agenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		JButton salir = crearBotonSalir();
		contentPane.add(salir);

		JButton editar = crearBotonEditar();
		contentPane.add(editar);

		JButton dele = crearBotonEliminar();
		contentPane.add(dele);

		JButton buscar = crearBotonBuscar();
		contentPane.add(buscar);
		JButton crear = crearBotonCrear();
		contentPane.add(crear);

		JLabel lblNewLabel_2 = new JLabel("ADMINISTRAR");
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

		JButton todo = crearBotonTodos();
		contentPane.add(todo);
	}

	public JButton crearBotonSalir() {
		JButton salir = new JButton("SALIR");
		salir.setHorizontalTextPosition(SwingConstants.CENTER);
		salir.setForeground(Color.WHITE);
		salir.setFont(new Font("Consolas", Font.BOLD, 15));
		salir.setBorder(null);
		salir.setBackground(new Color(255, 153, 153));
		salir.setBounds(131, 223, 293, 27);
		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		return salir;
	}

	public JButton crearBotonBuscar() {
		JButton buscar = new JButton("BUSCAR");
		buscar.setForeground(new Color(255, 255, 255));
		buscar.setBackground(new Color(153, 204, 153));
		buscar.setBorder(null);
		buscar.setFont(new Font("Consolas", Font.BOLD, 13));
		buscar.setIconTextGap(8);
		buscar.setVerticalTextPosition(SwingConstants.BOTTOM);
		buscar.setHorizontalTextPosition(SwingConstants.CENTER);
		buscar.setIcon(new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\buscar.png"));
		buscar.setBounds(131, 43, 95, 81);

		buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				BuscarContactoInterfaz buscarInterfaz = new BuscarContactoInterfaz();
				buscarInterfaz.setVisible(true);
			}

		});

		return buscar;
	}

	public JButton crearBotonCrear() {
		JButton crear = new JButton("CREAR");
		crear.setIconTextGap(8);
		crear.setForeground(new Color(255, 255, 255));
		crear.setBackground(new Color(153, 204, 153));
		crear.setBorder(null);
		crear.setHorizontalTextPosition(SwingConstants.CENTER);
		crear.setBounds(230, 43, 95, 81);
		crear.setVerticalTextPosition(SwingConstants.BOTTOM);
		crear.setIcon(
				new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\agregar-usuario.png"));
		crear.setFont(new Font("Consolas", Font.BOLD, 13));
		crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CrearContactoInterfaz crearInterfaz = new CrearContactoInterfaz();
				crearInterfaz.setVisible(true);
			}

		});

		return crear;
	}

	public JButton crearBotonEditar() {
		JButton editar = new JButton("MODIFICAR\r\n");
		editar.setIconTextGap(8);
		editar.setForeground(new Color(255, 255, 255));
		editar.setBackground(new Color(153, 204, 153));
		editar.setBorder(null);
		editar.setVerticalTextPosition(SwingConstants.BOTTOM);
		editar.setHorizontalTextPosition(SwingConstants.CENTER);
		editar.setIcon(new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\editar.png"));
		editar.setFont(new Font("Consolas", Font.BOLD, 13));
		editar.setBounds(329, 43, 95, 81);
		editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				EditarContactoInterfaz editarInterfaz = new EditarContactoInterfaz();
				editarInterfaz.setVisible(true);
			}

		});

		return editar;
	}

	public JButton crearBotonTodos() {
		JButton todo = new JButton("CONTACTOS");
		todo.setIconTextGap(8);
		todo.setIcon(new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\seguidores.png"));
		todo.setVerticalTextPosition(SwingConstants.BOTTOM);
		todo.setHorizontalTextPosition(SwingConstants.CENTER);
		todo.setForeground(Color.WHITE);
		todo.setFont(new Font("Consolas", Font.BOLD, 13));
		todo.setBorder(null);
		todo.setBackground(new Color(153, 204, 153));
		todo.setBounds(131, 131, 194, 81);
		todo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContactoTodosInterfaz todoInterfaz = null;
				try {
					todoInterfaz = new ContactoTodosInterfaz();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				todoInterfaz.setVisible(true);
			}
		});
		return todo;
	}

	public JButton crearBotonEliminar() {
		JButton dele = new JButton("ELIMINAR");
		dele.setIconTextGap(8);
		dele.setForeground(new Color(255, 255, 255));
		dele.setVerticalTextPosition(SwingConstants.BOTTOM);
		dele.setHorizontalTextPosition(SwingConstants.CENTER);
		dele.setIcon(new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\ProyectoFinal\\src\\Proyecto\\usuario.png"));
		dele.setFont(new Font("Consolas", Font.BOLD, 13));
		dele.setBorder(null);
		dele.setBackground(new Color(255, 153, 153));
		dele.setBounds(329, 131, 95, 81);
		dele.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContactoEliminarInterfaz deleteInterfaz = new ContactoEliminarInterfaz();
				deleteInterfaz.setVisible(true);
			}
		});
		return dele;
	}

}
