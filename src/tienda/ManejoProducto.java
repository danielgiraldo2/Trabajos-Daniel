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
import ventanas.Admin;

/**
 *
 * @author vgirr
 */
public class ManejoProducto {
    
    
     private String barra = File.separator;
     private String location1 = System.getProperty("user.dir") + this.barra + "Registros" + this.barra;
     private String location6 = this.location1 + "Productos" + this.barra;
     
     
    public void AgregarProducto(String codigo, String nombre, String precio){
        
        File producto = new File(this.location6 + codigo + ".Registro");
         if (!producto.exists()) {
            try {
                producto.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
             Producto p = new Producto(codigo,nombre,precio);
             p.guardarDatos(producto);
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "Producto creado con exito",
                    "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
    } 
    else {
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el codigo de un producto nuevo",
                    "El producto ya existe", JOptionPane.INFORMATION_MESSAGE);
        }
   }
    
    
       public void  EditarProducto ( String codigo, String precio){
        String nombre1,precio1, nombre2, precio2;
     File producto = new File(this.location6 + codigo + ".Registro");
        if (producto.exists()) {
            Producto p = new Producto();
            p.consultarDatos(producto);
            nombre1 = p.getNombre();
            precio1 = p.getPrecio();
            p.modificarDatos(producto, precio);
            nombre2 = p.getNombre();
            precio2 = p.getPrecio();
            
            
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\nNombre: " + nombre1 + "\nPrecio: " + precio1
                    , "El PRODUCTO ANTIGUO ERA ASI", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\nNombre: " + nombre2 + "\nPrecio: " + precio2
                    , "El PRODUCTO NUEVO QUEDA ASI", JOptionPane.INFORMATION_MESSAGE);
                
            JOptionPane.showMessageDialog(null, "Precio modificado con exito",
                    "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
    
               }
        
           
        
           
             
       }
       
       
   public boolean ConsultarProductoExistente (String codigo){
       
        
       File producto = new File(this.location6 + codigo + ".Registro");
            return producto.exists();
           
    
   }
   
     public void ConsultarProducto (String codigo){
        String nombre,precio;
        
       File producto = new File(this.location6 + codigo + ".Registro");
       
       if (producto.exists()) {
                Producto p = new Producto();
                p.consultarDatos(producto);
                nombre = p.getNombre();
                precio = p.getPrecio();
                
            JOptionPane.showMessageDialog(null, "Nombre: " + nombre  + "\nPrecio: " + precio
                    , "INFORMACION DEL PRODUCTO", JOptionPane.INFORMATION_MESSAGE);
       
            }
       else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo de un producto existente",
                        "El producto no se encuentra registrado", JOptionPane.ERROR_MESSAGE);
            }
            
           
    
   }
     
     
     public String DevolverTotal (String codigo){
          String precio;
      File producto = new File(this.location6 + codigo + ".Registro");
      Producto p = new Producto();
                p.consultarDatos(producto);
               
                precio = p.getPrecio() ;
               return precio;
         
     }


















} 

    






    
    
    
    
    
    
    
    
    
    
    
    
    

