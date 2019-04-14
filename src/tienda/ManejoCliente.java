/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanas.Compra;
import ventanas.RegistroCliente;

/**
 *
 * @author vgirr
 */
public class ManejoCliente {
     
    private String barra = File.separator;
    private String location1 = System.getProperty("user.dir") + this.barra + "Registros" + this.barra;
    private String location2 = this.location1 + "Clientes" + this.barra;
    Component rootPane = null;
     
    public void AgregarCliente (String codigo ,String  id, String nombre, String apellidos ,String celular,int puntos ){
       
        
            File cliente = new File(this.location2 + id + ".Registro");
            if(!cliente.exists()){
                try {
                    cliente.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                Cliente c = new Cliente(codigo, id, nombre, apellidos, celular, puntos);
                c.guardarDatos(cliente);
                JOptionPane.showMessageDialog(rootPane, "Cliente creado con exito", "Operacion satisfactoria", 
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                Cliente c = new Cliente();
                c.consultarDatos(cliente);
                id = c.getId();
                nombre = c.getNombre();
                apellidos = c.getApellidos();
                celular = c.getCelular();
                puntos = c.getPuntos();
                JOptionPane.showMessageDialog(rootPane, "Identificacion: " + id + "\nNombre: " + nombre + 
                        "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nPuntos: " + 
                                Integer.toString(puntos), "El cliente ya existe", JOptionPane.INFORMATION_MESSAGE);
            }
        }
       
    
  public void UtilizarPuntos (String codigo, int var){
     
             int descuento;
            File puntos = new File(this.location2 + codigo + ".Registro");
            if (puntos.exists()) {
                Cliente c = new Cliente();
                c.consultarDatos(puntos);
                descuento = c.getPuntos();
                descuento *= 100;
                if (descuento != 0) {
                   // var = Integer.parseInt(this.jLabelTotal.getText().substring(1));
                    if (descuento > var) {
                      JOptionPane.showMessageDialog(rootPane, "$" + 0 ,"", JOptionPane.INFORMATION_MESSAGE);
                     //   this.jLabelTotal.setText("$" + 0);
                    } else {
                        var -= descuento;
                        
                    JOptionPane.showMessageDialog(rootPane, "$" + Integer.toString(var) ,"TOTAL A PAGAR", JOptionPane.INFORMATION_MESSAGE);
                      //  this.jLabelTotal.setText("$" + Integer.toString(var));
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


public void  AgregarCompra (String codigo, int total)  {
     int puntos;
     File cliente = new File(this.location2 + codigo + ".Registro");
        if (cliente.exists()) {
            Cliente c = new Cliente();
            c.consultarDatos(cliente);
            
            total /= 1000;
            puntos = c.getPuntos();
            puntos += total;
            c.modificarPuntos(cliente, puntos);
            JOptionPane.showMessageDialog(rootPane, "Gracias por su compra", "Operacion satisfactoria", JOptionPane.INFORMATION_MESSAGE);
          
                
            
        }
        else 
          JOptionPane.showMessageDialog(rootPane, "no se sumaron puntos por que el cliente no esta registrado", "OPERACION SATISFACTORIA", JOptionPane.INFORMATION_MESSAGE);
      
}

    
    
    
    
    
}
