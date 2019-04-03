/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tienda.Bono;
import tienda.Cliente;
import tienda.Producto;

/**
 *
 * @author LENOVO
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    private String barra = File.separator;
    private String location1 = System.getProperty("user.dir") + this.barra + "Registros" + this.barra;
    private String location2 = this.location1 + "Productos" + this.barra;
    private String location3 = this.location1 + "Bonos" + this.barra;
    private String location4 = this.location1 + "Clientes" + this.barra;

    public Compra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image setValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/shop_40505.png"));
        return setValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldBono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonBuscarBono = new javax.swing.JButton();
        jButtonPuntos = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabePrecio = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 300, 30));

        jTextFieldBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 300, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Descuento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Total Acumulado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 20));

        jButtonComprar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonComprar.setText("Comprar");
        jButtonComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        jButtonFinalizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSalir.setText("Regresar");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 110, 30));

        jButtonBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 90, -1));

        jButtonBuscarBono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonBuscarBono.setText("Bono");
        jButtonBuscarBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarBonoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarBono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 90, -1));

        jButtonPuntos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonPuntos.setText("Puntos");
        jButtonPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 90, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 40));

        jLabePrecio.setBackground(new java.awt.Color(255, 255, 255));
        jLabePrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jLabePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 180, 50));

        jLabelTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 80, 20));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondotoldo.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
        Tienda i = new Tienda();
        i.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        String precio = this.jLabePrecio.getText();
        int total;
        if (!this.jLabelTotal.getText().equals("")) {
            total = Integer.parseInt(this.jLabelTotal.getText().substring(1));
            total += Integer.parseInt(precio.substring(1));
            this.jLabelTotal.setText("$" + Integer.toString(total));
        } else {
            this.jLabelTotal.setText(precio);
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        String codigo;
        int puntos, total;
        codigo = JOptionPane.showInputDialog(rootPane, "Ingrese el id", "Solicitando datos",
                JOptionPane.INFORMATION_MESSAGE);
        File cliente = new File(this.location4 + codigo + ".Registro");
        if (cliente.exists()) {
            Cliente c = new Cliente();
            c.consultarDatos(cliente);
            total = Integer.parseInt(this.jLabelTotal.getText().substring(1));
            total /= 1000;
            puntos = c.getPuntos();
            puntos += total;
            c.modificarPuntos(cliente, puntos);
        }
        JOptionPane.showMessageDialog(rootPane, "Gracias por su compra", "Operacion satisfactoria", JOptionPane.INFORMATION_MESSAGE);
        this.jLabePrecio.setText("");
        this.jLabelNombre.setText("");
        this.jLabelTotal.setText("");
        this.jTextFieldBono.setText("");
        this.jTextFieldCodigo.setText("");
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String codigo = this.jTextFieldCodigo.getText(), nombre, precio;
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca el codigo", "Error - caja de texto vacia",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            File producto = new File(this.location2 + codigo + ".Registro");
            if (producto.exists()) {
                Producto p = new Producto();
                p.consultarDatos(producto);
                nombre = p.getNombre();
                precio = p.getPrecio();
                this.jLabelNombre.setText(nombre);
                this.jLabePrecio.setText(precio);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el codigo de un producto existente",
                        "El producto no se encuentra registrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBonoActionPerformed

    private void jButtonBuscarBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarBonoActionPerformed
        String codigo = this.jTextFieldBono.getText(), descuento;
        float var;
        int var2, var3;
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor introduzca un bono de descuento", "Error - caja de texto vacia",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            File bono = new File(this.location3 + codigo + ".Registro");
            if (bono.exists()) {
                RandomAccessFile lector;
                try {
                    lector = new RandomAccessFile(bono, "r");
                    lector.readLine();
                    descuento = lector.readLine().substring(12);
                    lector.close();
                    var = Integer.parseInt(descuento);
                    var /= 100;
                    var2 = Integer.parseInt(this.jLabelTotal.getText().substring(1));
                    var3 = var2;
                    var2 *= var;
                    var3 -= var2;
                    this.jLabelTotal.setText("$" + Integer.toString(var3));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el codigo de un bono existente",
                        "El producto no se encuentra registrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonBuscarBonoActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        dispose();
        RegistroCliente rc = new RegistroCliente();
        rc.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntosActionPerformed
        String codigo = this.jTextFieldBono.getText();
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese una identificacion",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int descuento, var;
            File puntos = new File(this.location4 + codigo + ".Registro");
            if (puntos.exists()) {
                Cliente c = new Cliente();
                c.consultarDatos(puntos);
                descuento = c.getPuntos();
                descuento *= 100;
                if (descuento != 0) {
                    var = Integer.parseInt(this.jLabelTotal.getText().substring(1));
                    if (descuento > var) {
                        this.jLabelTotal.setText("$" + 0);
                    } else {
                        var -= descuento;
                        this.jLabelTotal.setText("$" + Integer.toString(var));
                    }
                    c.modificarPuntos(puntos, 0);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No tiene puntos acumulados", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El cliente no se encuentra en la base de datos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonPuntosActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarBono;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonPuntos;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabePrecio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JTextField jTextFieldBono;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}