package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.GestionKardex;


import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class interfazKardex extends JFrame implements ActionListener {
	
	    private GestionKardex gp;
	    private JTable tblPersonas;
	    
	    
	    public interfazKardex(){
	        
	        //Instancia de controlado de personas, para posibilitar la comunicación y llamar a las funcionalidades del programa
	        gp = new GestionKardex();
	        
	        //inicializa y añade componentes a la interfaz
	        setSize(576,300);
	        
	        JPanel pnlTitulo = new JPanel(new FlowLayout());
	        pnlTitulo.setBounds(0, 0, 560, 97);
	        
	        tblPersonas = new JTable();
	        tblPersonas.setModel(new ModelKardex());
	        
	        JScrollPane scrollPaneTabla = new JScrollPane(tblPersonas);
	        scrollPaneTabla.setBounds(0, 89, 560, 139);
	        
	        JPanel pnlBotones = new JPanel(new FlowLayout());        
	        pnlBotones.setBounds(0, 228, 560, 33);
	        JButton btnCargar = new JButton("Cargar");
	        btnCargar.setActionCommand("btnCargar");
	        btnCargar.addActionListener(this);
	        pnlBotones.add(btnCargar);
	        JButton btnSalir = new JButton("Salir");
	        btnSalir.setActionCommand("btnSalir");
	        btnSalir.addActionListener(this);
	        pnlBotones.add(btnSalir);
	        getContentPane().setLayout(null);
	        
	        getContentPane().add(pnlTitulo);
	        getContentPane().add(scrollPaneTabla);
	        
	        
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String comando = e.getActionCommand();
	        
	        switch(comando){
	            case "btnSalir":
	                salir();
	                break;                
	            case "btnCargar":
	                cargarDatos();
	                break;
	            default:
	                break;
	        }
	    }
	    
	    public void cargarDatos(){
	        tblPersonas.setModel(new ModelKardex(gp.getKardexs()));
	    }
	    
	    public void salir(){
	        System.exit(0);
	    }
}
