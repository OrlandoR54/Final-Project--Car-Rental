/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
        licencia = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
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
        getContentPane().add(buscar);
        buscar.setBounds(520, 30, 100, 30);

        registrar.setText("registrar cliente");
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
        getContentPane().add(licencia);
        licencia.setBounds(500, 90, 100, 30);
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
        jLabel2.setBounds(70, 110, 50, 20);

        jLabel3.setText("Licencia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 90, 60, 30);

        jLabel4.setText("Tipo de licencia:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 150, 76, 14);

        jLabel5.setText("Titular Tarjeta:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 200, 80, 14);

        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 190, 41, 14);

        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 250, 47, 14);

        jLabel11.setText("Tarjeta tipo");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 320, 56, 14);

        jLabel1.setText("Modelo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(384, 264, 40, 20);

        jLabel6.setText("Color:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 320, 29, 14);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizar_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizar_contratoActionPerformed
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
  public void catalogo (String placa, String modelo ,String color ){
             modeloj.setText(modelo);
             placaj.setText(placa);
             colorj.setText(color);
             
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField licencia;
    private javax.swing.JTextField modeloj;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField placaj;
    private javax.swing.JButton realizar_contrato;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField tarjeta_tipo;
    private javax.swing.JTextField tipo_licencia;
    private javax.swing.JTextField titular_tarjeta;
    // End of variables declaration//GEN-END:variables
}
