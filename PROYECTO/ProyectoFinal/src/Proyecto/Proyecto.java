package Proyecto;

public class Proyecto {

	public static void main(String[] args) {
		// Visualiza correctamente la ventana al iniciar la aplicacion
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactoVistaInterfaz frame = new ContactoVistaInterfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
