/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ec.edu.ups.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jhon
 */
public class interfazclientecontrato extends javax.swing.JFrame {

    /**
     * Creates new form interfazclientecontrato
     */
    public interfazclientecontrato() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        realizar_contrato = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        tarjeta_tipo = new javax.swing.JTextField();
        licencia_expiracion = new javax.swing.JTextField();
        tipo_licencia = new javax.swing.JTextField();
        titular_tarjeta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modeloj = new javax.swing.JTextField();
        colorj = new javax.swing.JTextField();
        placaj = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        garantia = new javax.swing.JTextField();
        tanque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        realizar_contrato.setText("Realizar contrato");
        realizar_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizar_contratoActionPerformed(evt);
            }
        });
        getContentPane().add(realizar_contrato);
        realizar_contrato.setBounds(630, 410, 130, 40);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(520, 30, 100, 30);

        registrar.setText("registrar cliente");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(60, 400, 130, 40);
        getContentPane().add(cedula);
        cedula.setBounds(230, 30, 240, 30);
        getContentPane().add(nombre);
        nombre.setBounds(150, 110, 110, 30);

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(apellido);
        apellido.setBounds(150, 180, 110, 30);
        getContentPane().add(direccion);
        direccion.setBounds(150, 240, 110, 30);
        getContentPane().add(tarjeta_tipo);
        tarjeta_tipo.setBounds(150, 310, 110, 30);
        getContentPane().add(licencia_expiracion);
        licencia_expiracion.setBounds(500, 90, 100, 30);
        getContentPane().add(tipo_licencia);
        tipo_licencia.setBounds(500, 140, 100, 30);

        titular_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titular_tarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(titular_tarjeta);
        titular_tarjeta.setBounds(500, 190, 100, 30);

        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 80, 20);

        jLabel3.setText("Licencia:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 90, 90, 30);

        jLabel4.setText("Tipo de licencia:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(346, 150, 100, 20);

        jLabel5.setText("Titular Tarjeta:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 200, 90, 20);

        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(41, 190, 80, 20);

        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(37, 250, 90, 20);

        jLabel11.setText("Tarjeta tipo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(26, 320, 80, 20);

        jLabel1.setText("Modelo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(374, 264, 50, 20);

        jLabel6.setText("Color:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(379, 320, 40, 14);

        jLabel7.setText("Placa vehiculo");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(274, 420, 80, 14);

        modeloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelojActionPerformed(evt);
            }
        });
        getContentPane().add(modeloj);
        modeloj.setBounds(500, 260, 100, 30);
        getContentPane().add(colorj);
        colorj.setBounds(500, 310, 100, 30);
        getContentPane().add(placaj);
        placaj.setBounds(370, 410, 90, 30);

        jLabel9.setText("Garantia");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(680, 80, 80, 40);

        jLabel12.setText("ESTADO TANQUE GASOLINA");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(640, 180, 170, 60);
        getContentPane().add(garantia);
        garantia.setBounds(650, 130, 110, 40);
        getContentPane().add(tanque);
        tanque.setBounds(680, 240, 50, 40);

        jLabel13.setText("F. FULL  - E. EMPTY");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(660, 290, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizar_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizar_contratoActionPerformed
int id_contrato=retornar_id()+1;
        System.out.println(id_contrato);
double total_garantia=Double.parseDouble(garantia.getText());
        System.out.println(total_garantia);
        System.out.println(fechadedevolucion);
        System.out.println(fechadeentrega);
int empleado=1;

        
        try {
		   String insertarcontarto= "INSERT INTO ren_contratos VALUES"
				   					+ "(?,?,?,?,?,?,?,?)";
		   
		   Conexion con = new Conexion();
		    con.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        con.setUsername("DBCARENTAL");
        con.setPassword("dbcarrental");
        con.Conectar();
		   
		   System.out.println(insertarcontarto);
		   
		   psentencia = con.getConexion().prepareStatement("INSERT INTO ren_contratos VALUES"
				   					+ "(?,?,?,?,?,?,?,?)");
                   
		   psentencia.setInt(1, id_contrato);
		   psentencia.setString(2, fechadeentrega);
		   psentencia.setString(3, fechadedevolucion);
		   psentencia.setInt(4, id_cliente);
		   psentencia.setDouble(5, total_garantia);
		   psentencia.setInt(6, empleado);
                    psentencia.setInt(7, id_vehiculo);
                     psentencia.setString(8, tanque.getText());
                     
                     
		   psentencia.executeQuery();
		   
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}

// TODO add your handling code here:


    }//GEN-LAST:event_realizar_contratoActionPerformed

    private void titular_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titular_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titular_tarjetaActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void modelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelojActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
          Conexion con = new Conexion();
        con.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        con.setUsername("DBCARENTAL");
        con.setPassword("dbcarrental");
        con.Conectar();
        
        
        if (con.getConexion() != null){
            System.out.println("Base de datos conectada");
        
            
        }
        
        
              try{
            psentencia = con.getConexion().prepareStatement("  select v.veh_id,c.us_id,c.us_cedula,c.us_nombre,c.us_apellido,c.us_direccion,t.tar_tipo_de_tarjeta,l.lic_fecha_expiracion,l.lic_tipo_de_licencia,t.tar_titular\n" +
"from ren_clientes c,ren_licencias l,ren_tarjetas t,ren_vehiculos v\n" +
"where c.us_id=l.ren_clientes_us_id and t.ren_clientes_us_id(+)=c.us_id and c.us_cedula=? and v.veh_placa=?");
     
            
            psentencia.setString(1,cedula.getText());
            psentencia.setString(2, placaj.getText());
            
            resultado = psentencia.executeQuery();
            
            //Se presenta el resultado
            while (resultado.next()){
                
                 id_vehiculo=resultado.getInt(1);
                id_cliente=resultado.getInt(2);
        nombre.setText(resultado.getString(4));
        apellido.setText(resultado.getString(5));
        direccion.setText(resultado.getString(6));
     
            tarjeta_tipo.setText(resultado.getString(7));
              licencia_expiracion.setText(resultado.getString(8));
                tipo_licencia.setText(resultado.getString(9));
                  titular_tarjeta.setText(resultado.getString(10));
                  
     
        
       
            }
            con.CerrarConexion();
        }
        catch(SQLException e){
            e.printStackTrace();
        }    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
  
        
        
        
        
        
    }//GEN-LAST:event_buscarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        InterfazRentar registar= new InterfazRentar();
        registar.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_registrarActionPerformed
  
    public int retornar_id (){
    
    int res = 0;
    	try {
        Conexion con = new Conexion();
        con.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        con.setUsername("DBCARENTAL");
        con.setPassword("dbcarrental");
        con.Conectar();
		    
    		psentencia = con.getConexion().prepareStatement("select max(con_id)\n" +
                  "from ren_contratos");
    		resultado = psentencia.executeQuery();
    		while(resultado.next()) {
    			res = resultado.getInt(1);
    		}
    		
    	
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
 	   return res;
    
    }
    
    public void catalogo (String placa, String modelo ,String color ){
             modeloj.setText(modelo);
             placaj.setText(placa);
             colorj.setText(color);
             
         }
    public void recuperarfechas (String fechaentrega,String fechadevolucion){
    fechadeentrega=fechaentrega;
    fechadedevolucion=fechadevolucion;
    
    }
    public void recuperar_id_empleado(int id){
        id_empleado=id;
        
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfazclientecontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazclientecontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazclientecontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazclientecontrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazclientecontrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField colorj;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField garantia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField licencia_expiracion;
    private javax.swing.JTextField modeloj;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField placaj;
    private javax.swing.JButton realizar_contrato;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField tanque;
    private javax.swing.JTextField tarjeta_tipo;
    private javax.swing.JTextField tipo_licencia;
    private javax.swing.JTextField titular_tarjeta;
    // End of variables declaration//GEN-END:variables
private int id_cliente;
private int id_vehiculo;
private String fechadeentrega;
private String fechadedevolucion;
private int id_empleado;



 private ResultSet resultado = null;
   private PreparedStatement psentencia = null;


 public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    public PreparedStatement getPsentencia() {
        return psentencia;
    }

    public void setPsentencia(PreparedStatement psentencia) {
        this.psentencia = psentencia;
    }


}
