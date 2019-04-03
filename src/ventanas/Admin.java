/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tienda.Bono;
import tienda.Empleado;
import tienda.Producto;

/**
 *
 * @author LENOVO
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    private String barra = File.separator;
    private String location1 = System.getProperty("user.dir") + this.barra + "Registros" + this.barra;
    private String location2 = this.location1 + "Administrador" + this.barra;
    private String location3 = this.location1 + "Empleados" + this.barra;
    private String location4 = this.location1 + "Clientes" + this.barra;
    private String location5 = this.location1 + "Bonos" + this.barra;
    private String location6 = this.location1 + "Productos" + this.barra;

    public Admin() {
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

        jButtonSalir = new javax.swing.JButton();
        jButtonListCodes = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonState = new javax.swing.JButton();
        jButtonGet = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButtonSetPro = new javax.swing.JButton();
        jButtonAddCode = new javax.swing.JButton();
        jButtonAddPro = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setSize(new java.awt.Dimension(550, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSalir.setText("Regresar");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 30));

        jButtonListCodes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonListCodes.setText("Listar Bonos");
        jButtonListCodes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonListCodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCodesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListCodes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 200, -1));

        jButtonAdd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAdd.setText("Agregar Empleado");
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, -1));

        jButtonState.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonState.setText("Estado Empleado");
        jButtonState.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonState, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, -1));

        jButtonGet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonGet.setText("Consultar Empleado");
        jButtonGet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, -1));

        jButtonList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonList.setText("Listar Empleados");
        jButtonList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, -1));

        jButtonSetPro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSetPro.setText("Editar Producto");
        jButtonSetPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSetPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetProActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSetPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 200, -1));

        jButtonAddCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAddCode.setText("Crear Bono");
        jButtonAddCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, -1));

        jButtonAddPro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAddPro.setText("Agregar Producto");
        jButtonAddPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 200, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondotoldo.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
        Tienda in = new Tienda();
        in.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAddProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProActionPerformed
        String codigo, nombre, precio;
        codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo del producto", "Solicitando datos",
                JOptionPane.INFORMATION_MESSAGE);
        File producto = new File(this.location6 + codigo + ".Registro");
        if (!producto.exists()) {
            try {
                producto.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto", "Solicitando datos",
                    JOptionPane.INFORMATION_MESSAGE);
            precio = JOptionPane.showInputDialog(rootPane, "Ingrese el precio del producto", "Solicitando datos",
                    JOptionPane.INFORMATION_MESSAGE);
            Producto p = new Producto(codigo, nombre, precio);
            p.guardarDatos(producto);
            JOptionPane.showMessageDialog(rootPane, "Producto creado con exito",
                    "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el codigo de un producto nuevo",
                    "El producto ya existe", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddProActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String codigo, nombre, apellidos, identificacion;
        long id, celular;
        int numeroVentas = 0;
        Boolean activo = true;
        Empleado e;
        identificacion = JOptionPane.showInputDialog(null, "Introduzca el id",
                "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
        File empleado = new File(this.location3 + identificacion + ".Registro");
        id = Long.parseLong(identificacion);
        if (!empleado.exists()) {
            try {
                empleado.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            codigo = JOptionPane.showInputDialog(null, "Introduzca la contraseña",
                    "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
            nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre",
                    "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
            apellidos = JOptionPane.showInputDialog(null, "Introduzca los apellidos",
                    "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
            celular = Long.parseLong(JOptionPane.showInputDialog(null, "Introduzca el numero de celular",
                    "Solicitando datos", JOptionPane.INFORMATION_MESSAGE));
            e = new Empleado(codigo, id, nombre, apellidos, celular, numeroVentas, activo);
            e.guardarDatos(empleado);
            JOptionPane.showMessageDialog(null, "Empleado creado con exito", "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
        } else {
            e = new Empleado();
            e.consultarDatos(empleado);
            codigo = e.getCodigo();
            id = e.getId();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            activo = e.getActivo();
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\nIdentificacion: " + id + "\nNombre: " + nombre
                    + "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nNumero de ventas: " + numeroVentas
                    + "\nEstado del empleado: " + activo, "El empleado ya existe", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStateActionPerformed
        String identificacion, seleccion[] = {"True", "False"}, codigo, nombre, apellidos;
        Boolean activo[] = {true, false};
        Empleado e;
        int opcion1, opcion2;
        long id, celular;
        int numeroVentas;
        identificacion = JOptionPane.showInputDialog(null, "Introduzca el id",
                "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
        id = Long.parseLong(identificacion);
        File empleado = new File(this.location3 + identificacion + ".Registro");
        if (empleado.exists()) {
            e = new Empleado();
            e.consultarDatos(empleado);
            codigo = e.getCodigo();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            opcion1 = JOptionPane.showConfirmDialog(rootPane, "Desea cambiar el estado del empleado?", "Cambio de estado",
                    JOptionPane.YES_NO_OPTION);
            if (opcion1 == JOptionPane.YES_OPTION) {
                opcion2 = JOptionPane.showOptionDialog(rootPane, "Seleccione una opcion",
                        "Cambio de estado", 0, JOptionPane.INFORMATION_MESSAGE, null, seleccion, null);
                if (opcion2 == JOptionPane.YES_OPTION) {
                    e.modificarActivo(empleado, activo[0]);
                    JOptionPane.showMessageDialog(null, "Empleado activado con exito",
                            "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    e.modificarActivo(empleado, activo[1]);
                    JOptionPane.showMessageDialog(null, "Empleado bloqueado con exito",
                            "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El empleado no se encuentra en la base de datos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonStateActionPerformed

    private void jButtonGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetActionPerformed
        String identificacion, codigo, nombre, apellidos;
        Boolean activo;
        Empleado e;
        long id, celular;
        int numeroVentas;
        identificacion = JOptionPane.showInputDialog(null, "Introduzca el id",
                "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
        id = Long.parseLong(identificacion);
        File empleado = new File(this.location3 + identificacion + ".Registro");
        if (empleado.exists()) {
            e = new Empleado();
            e.consultarDatos(empleado);
            codigo = e.getCodigo();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            activo = e.getActivo();
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\nIdentificacion: " + id + "\nNombre: " + nombre
                    + "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nNumero de ventas: " + numeroVentas
                    + "\nEstado del empleado: " + activo, "Mostrando datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "El empleado no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGetActionPerformed

    private void jButtonSetProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetProActionPerformed
        String codigo, precio;
        codigo = JOptionPane.showInputDialog(rootPane, "Ingrese el codigo del producto", "Solicitando datos",
                JOptionPane.INFORMATION_MESSAGE);
        File producto = new File(this.location6 + codigo + ".Registro");
        if (producto.exists()) {
            Producto p = new Producto();
            p.consultarDatos(producto);
            precio = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo precio", "Solicitando datos",
                    JOptionPane.INFORMATION_MESSAGE);
            p.modificarDatos(producto, precio);
            JOptionPane.showMessageDialog(null, "Precio modificado con exito",
                    "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo de un producto existente",
                    "El producto no existe", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSetProActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        File listado = new File(this.location3);
        String[] archivos = listado.list(), continuar = {"Continuar", "Salir"};
        String codigo, nombre, apellidos;
        long identificacion, celular;
        int numeroVentas, opcion;
        Boolean estado;
        
        for (String archivo : archivos) {
            File lista = new File(this.location3 + archivo);
            Empleado e = new Empleado();
            e.consultarDatos(lista);
            codigo = e.getCodigo();
            identificacion = e.getId();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            estado = e.getActivo();
            opcion = JOptionPane.showOptionDialog(rootPane, "Codigo: " + codigo + "\nIdentificacion: " + identificacion + "\nNombre: " + nombre
                    + "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nNumero de ventas: " + numeroVentas
                    + "\nEstado del empleado: " + estado, "Mostrando datos", 0, JOptionPane.INFORMATION_MESSAGE, 
                    null, continuar, null);
            if(opcion == JOptionPane.NO_OPTION){
                break;
            }
        }
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonAddCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCodeActionPerformed
        String codigo, descuento;
        codigo = JOptionPane.showInputDialog(rootPane, "Ingrese el codigo para el bono",
                "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
        File bono = new File(this.location5 + codigo + ".Registro");
        if (!bono.exists()) {
            try {
                bono.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            descuento = JOptionPane.showInputDialog(rootPane, "Ingrese el descuento para el bono",
                    "Solicitando datos", JOptionPane.INFORMATION_MESSAGE);
            Bono b = new Bono(codigo, descuento);
            b.guardarDatos(bono);
            JOptionPane.showMessageDialog(rootPane, "Bono creado con exito", 
                    "Operacion satisfactoria", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el codigo de un bono nuevo", 
                    "El bono ya existe", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddCodeActionPerformed

    private void jButtonListCodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCodesActionPerformed
        File listado = new File(this.location5);
        String[] archivos = listado.list(), continuar = {"Continuar", "Salir"};
        String codigo, descuento;
        int opcion;
        
        for (String archivo : archivos) {
            File lista = new File(this.location5 + archivo);
            Bono b = new Bono();
            b.consultarDatos(lista);
            codigo = b.getCodigo();
            descuento = b.getDescuento();
            opcion = JOptionPane.showOptionDialog(rootPane, "Codigo: " + codigo + "\nDescuento: " + descuento, 
                    "Mostrando datos", 0, JOptionPane.INFORMATION_MESSAGE, null, continuar, null);
            if(opcion == JOptionPane.NO_OPTION){
                break;
            }
        }
    }//GEN-LAST:event_jButtonListCodesActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddCode;
    private javax.swing.JButton jButtonAddPro;
    private javax.swing.JButton jButtonGet;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonListCodes;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSetPro;
    private javax.swing.JButton jButtonState;
    private javax.swing.JLabel jLabelfondo;
    // End of variables declaration//GEN-END:variables
}
