
package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.ups.conexion.Conexion;
import ec.edu.ups.conexion.SentenciasCRUD;
import modelo.Cliente;
import modelo.Licencia;
import modelo.Tarjeta;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.sql.PreparedStatement;

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
	private JTextField txtTarjeta;
	private JTextField txtTitular;
	
	private JComboBox JCtipoSangre;
	private JComboBox JCtipoLicencia;
	
	
	private JComboBox JCtipoTarjeta;
	

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
		setBounds(100, 100, 602, 386);
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
		txtDireccion.setBounds(348, 57, 166, 20);
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
		
		JCtipoSangre = new JComboBox();
		JCtipoSangre.addItem("O-");
		JCtipoSangre.addItem("O+");
		JCtipoSangre.addItem("A-");
		JCtipoSangre.addItem("A+");
		JCtipoSangre.addItem("B-");
		JCtipoSangre.addItem("B+");
		JCtipoSangre.addItem("AB-");
		JCtipoSangre.addItem("AB+");
		JCtipoSangre.setBounds(144, 202, 108, 20);
		contentPane.add(JCtipoSangre);
		
		JLabel lblTipoDeLicencia = new JLabel("Tipo de licencia: ");
		lblTipoDeLicencia.setBounds(10, 234, 124, 14);
		contentPane.add(lblTipoDeLicencia);
		
		JCtipoLicencia = new JComboBox();
		JCtipoLicencia.addItem("B");
		JCtipoLicencia.addItem("F");
		JCtipoLicencia.setBounds(144, 233, 108, 20);
		contentPane.add(JCtipoLicencia);
		
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
		
		JCtipoTarjeta = new JComboBox();
		JCtipoTarjeta.addItem("Credito");
		JCtipoTarjeta.addItem("Debito");
		JCtipoTarjeta.setBounds(378, 206, 136, 20);
		contentPane.add(JCtipoTarjeta);
		
		JLabel lblNumero_1 = new JLabel("numero:");
		lblNumero_1.setBounds(272, 174, 66, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblTarjeta = new JLabel("Tarjeta");
		lblTarjeta.setBounds(272, 145, 46, 14);
		contentPane.add(lblTarjeta);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(378, 171, 136, 20);
		contentPane.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		JLabel lblTitular = new JLabel("Titular: ");
		lblTitular.setBounds(272, 239, 46, 14);
		contentPane.add(lblTitular);
		
		txtTitular = new JTextField();
		txtTitular.setBounds(378, 236, 136, 20);
		contentPane.add(txtTitular);
		txtTitular.setColumns(10);
		
		JButton btnRealizarContrato = new JButton("Realizar Contrato");
		btnRealizarContrato.setBounds(229, 313, 124, 23);
		contentPane.add(btnRealizarContrato);
	
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
		
		SentenciasCRUD insertar = new SentenciasCRUD();
		
		Cliente cliente = new Cliente();
		
		int cliID = 8;
		cliente.setCliID(cliID);
		
		String nombre = txtNombre.getText();
		cliente.setNombre(nombre);
		
		String apellido = txtApellido.getText();
		cliente.setApellido(apellido);
		
		String cedula = txtCedula.getText();
		cliente.setCedula(cedula);
		
		String direccion = txtDireccion.getText();
		cliente.setDireccion(direccion);
		
		insertar.insertarCliente(cliente);
		
		
		
		/*
		Tarjeta tarjeta = new Tarjeta();
		
		int numT = 1;
		tarjeta.setTarjetaID(numT);
		
		String tipoT = String.valueOf(JCtipoTarjeta.getSelectedItem());
		tarjeta.setTipoTarjeta(String.valueOf(tipoT));
		
		int numTar =Integer.parseInt(txtTarjeta.getText());
		tarjeta.setNumeroTarjeta(numTar);
		
		String titular = txtTitular.getText();
		tarjeta.setTitular(titular);
		
		int numCliID = 1;
		tarjeta.setTarCliID(numCliID);
		
		insertar.insertarTarjeta(tarjeta);*/
		
		
		
		/*
		 * Insertar la licencia del cliente a la base datos
		Licencia licencia = new Licencia();
		
		int numero = Integer.parseInt(txtLicencia.getText());
		licencia.setNumero(numero);
		
		String sangre = String.valueOf(JCtipoSangre.getSelectedItem());
		licencia.setTipoSangre(sangre);
		
		String tLicencia = String.valueOf(JCtipoLicencia.getSelectedItem());
		licencia.setTipoLicencia(tLicencia);
		
		int num = 7;
		licencia.setIdCliente(num);
		
		String fExpiracion = txtfecha_Expiracion.getText();
		licencia.setFechaExpiracion(fExpiracion);
		
		insertar.InsertarLicencia(licencia);*/
		
		
		
		
		
		
		
		//cambio de privado a publico las clases: catalogo,contrado,devolucion,vehiculo
	}

	private void registrar() {
		// TODO Auto-generated method stub
		
	}
}
