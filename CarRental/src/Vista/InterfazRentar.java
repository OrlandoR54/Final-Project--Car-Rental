
package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class InterfazRentar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final JTextField txtBuscar = new JTextField();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtLicencia;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField textField;
	
	private JButton btnBuscar; 
	private JButton btnRentar;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRentar frame = new InterfazRentar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazRentar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtBuscar.setBounds(10, 11, 128, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(163, 10, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 60, 61, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(10, 85, 61, 14);
		contentPane.add(lblApellido);
		
		JLabel lblLicencia = new JLabel("Licencia: ");
		lblLicencia.setBounds(10, 110, 61, 14);
		contentPane.add(lblLicencia);
		
		JLabel lblCedula = new JLabel("Cedula: ");
		lblCedula.setBounds(10, 135, 61, 14);
		contentPane.add(lblCedula);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(81, 57, 128, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(81, 82, 128, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtLicencia = new JTextField();
		txtLicencia.setBounds(81, 107, 128, 20);
		contentPane.add(txtLicencia);
		txtLicencia.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(81, 132, 128, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setBounds(252, 60, 56, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(328, 57, 128, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setBounds(252, 85, 66, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(328, 82, 128, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTarjeta = new JLabel("Tarjeta: ");
		lblTarjeta.setBounds(252, 110, 46, 14);
		contentPane.add(lblTarjeta);
		
		textField = new JTextField();
		textField.setBounds(328, 107, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(10, 184, 89, 23);
		contentPane.add(btnRegistrar);
		
		btnRentar = new JButton("Rentar");
		btnRentar.setBounds(120, 184, 89, 23);
		contentPane.add(btnRentar);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		System.out.println("clic sobre el botOn " + comando);
		switch(comando) {
		case "btnBuscar":
			break;
		case "btnRegistrar":
			break;
		case "btnRentar":
			break;
			default:
			break;
		}
		
		
	}

}
