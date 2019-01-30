
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
import javax.swing.JComboBox;

public class InterfazRentar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private final JTextField txtBuscar = new JTextField();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtLicencia;
	private JTextField txtCedula;
	private JTextField txtDireccion;
	
	private JButton btnBuscar; 
	private JButton btnRentar;
	private JButton btnRegistrar;
	private JTextField txtfecha_Expiracion;
	private JTextField txttarjeta;
	private JTextField txttitular;

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
		setBounds(100, 100, 526, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtBuscar.setBounds(10, 11, 128, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(163, 10, 89, 23);
		btnBuscar.addActionListener(this);
		btnBuscar.setActionCommand("btnBuscar");
		contentPane.add(btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 60, 61, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(10, 85, 61, 14);
		contentPane.add(lblApellido);
		
		JLabel lblCedula = new JLabel("Cedula: ");
		lblCedula.setBounds(10, 110, 61, 14);
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
		txtLicencia.setBounds(105, 171, 147, 20);
		contentPane.add(txtLicencia);
		txtLicencia.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(81, 107, 128, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion: ");
		lblDireccion.setBounds(272, 60, 66, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(348, 57, 128, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(10, 313, 89, 23);
		btnRegistrar.addActionListener(this);
		btnRegistrar.setActionCommand("btnRegistrar");
		contentPane.add(btnRegistrar);
		
		btnRentar = new JButton("Rentar");
		btnRentar.setBounds(120, 313, 89, 23);
		btnRentar.addActionListener(this);
		btnRentar.setActionCommand("btnRentar");
		contentPane.add(btnRentar);
		
		JLabel lblLicencia_1 = new JLabel("Licencia");
		lblLicencia_1.setBounds(10, 145, 61, 14);
		contentPane.add(lblLicencia_1);
		
		JLabel lblTipoDeSangre = new JLabel("Tipo de sangre: ");
		lblTipoDeSangre.setBounds(10, 209, 124, 14);
		contentPane.add(lblTipoDeSangre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 202, 108, 20);
		contentPane.add(comboBox);
		
		JLabel lblTipoDeLicencia = new JLabel("Tipo de licencia: ");
		lblTipoDeLicencia.setBounds(10, 234, 124, 14);
		contentPane.add(lblTipoDeLicencia);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(144, 233, 108, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNumero = new JLabel("numero: ");
		lblNumero.setBounds(10, 174, 61, 14);
		contentPane.add(lblNumero);
		
		JLabel lblFechaDeExpiracion = new JLabel("fecha de expiracion: ");
		lblFechaDeExpiracion.setBounds(10, 265, 128, 14);
		contentPane.add(lblFechaDeExpiracion);
		
		txtfecha_Expiracion = new JTextField();
		txtfecha_Expiracion.setBounds(144, 262, 108, 20);
		contentPane.add(txtfecha_Expiracion);
		txtfecha_Expiracion.setColumns(10);
		
		JLabel lblTipoDeTarjeta = new JLabel("Tipo de tarjeta: ");
		lblTipoDeTarjeta.setBounds(272, 209, 96, 14);
		contentPane.add(lblTipoDeTarjeta);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(378, 206, 98, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblNumero_1 = new JLabel("numero:");
		lblNumero_1.setBounds(272, 174, 66, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblTarjeta = new JLabel("Tarjeta");
		lblTarjeta.setBounds(272, 145, 46, 14);
		contentPane.add(lblTarjeta);
		
		txttarjeta = new JTextField();
		txttarjeta.setBounds(378, 171, 98, 20);
		contentPane.add(txttarjeta);
		txttarjeta.setColumns(10);
		
		JLabel lblTitular = new JLabel("Titular: ");
		lblTitular.setBounds(272, 239, 46, 14);
		contentPane.add(lblTitular);
		
		txttitular = new JTextField();
		txttitular.setBounds(378, 236, 98, 20);
		contentPane.add(txttitular);
		txttitular.setColumns(10);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		System.out.println("clic sobre el boton \t" + comando);
		switch(comando) {
		case "btnBuscar":
			buscar();
			break;
		case "btnRegistrar":
			registrar();
			break;
		case "btnRentar":
			rentar();
			break;
			default:
			break;
		}
		
		
	}
	private void buscar() {
		// TODO Auto-generated method stub
		
	}

	private void rentar() {
		// TODO Auto-generated method stub
		
	}

	private void registrar() {
		// TODO Auto-generated method stub
		
	}
}
