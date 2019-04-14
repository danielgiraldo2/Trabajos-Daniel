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
public class ManejoEmpleado {
     
    private String barra = File.separator; 
    private String location1 = System.getProperty("user.dir") + this.barra + "Registros" + this.barra;
   
    private String location3 = this.location1 + "Empleados" + this.barra;
  
    
    public void AgregarEmpleado (String codigo, String identificacion, String nombre,String apellidos, String celular, int numeroVentas, Boolean activo){
        
         File empleado = new File(this.location3 + identificacion + ".Registro");
         Empleado e;
        
          if (!empleado.exists()) {
            try {
                empleado.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            Empleado c = new Empleado (codigo, identificacion , nombre, apellidos, celular, numeroVentas, activo);
                c.guardarDatos(empleado);
            JOptionPane.showMessageDialog(null, "Empleado creado con exito", "Operación satisfactoria", JOptionPane.INFORMATION_MESSAGE);
          }
          else {
            e = new Empleado();
            e.consultarDatos(empleado);
            codigo = e.getCodigo();
            identificacion = e.getId();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            activo = e.getActivo();
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\nIdentificacion: " + identificacion + "\nNombre: " + nombre
                    + "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nNumero de ventas: " + numeroVentas
                    + "\nEstado del empleado: " + activo, "El empleado ya existe", JOptionPane.INFORMATION_MESSAGE);
             
        }
          
    
          
}
    
   public void ConsultarEmpleado (String identificacion ){
          
          File empleado = new File(this.location3 + identificacion + ".Registro");
          Empleado e;
          String codigo, nombre, apellidos,celular;
          int numeroVentas;
          Boolean activo;
          
           if (empleado.exists()) {
            e = new Empleado();
            e.consultarDatos(empleado);
            codigo = e.getCodigo();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            activo = e.getActivo();
            JOptionPane.showMessageDialog(null, "Codigo: " + codigo + "\nIdentificacion: " + identificacion + "\nNombre: " + nombre
                    + "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nNumero de ventas: " + numeroVentas
                    + "\nEstado del empleado: " + activo, "Mostrando datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
              Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "El empleado no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
        }
   
   public void Estadoempleado (String identificacion){
        String seleccion[] = {"True", "False"}, codigo, nombre, apellidos;
        Boolean activo[] = {true, false};
        
        Empleado e;
        int opcion1, opcion2;
        String id, celular;
        int numeroVentas;
       
        
        File empleado = new File(this.location3 + identificacion + ".Registro");
        if (empleado.exists()) {
            e = new Empleado();
            e.consultarDatos(empleado);
            codigo = e.getCodigo();
            nombre = e.getNombre();
            apellidos = e.getApellidos();
            celular = e.getCelular();
            numeroVentas = e.getNumeroVentas();
            Component rootPane = null;
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
       
       
       
   }
   
  public void ListarEmpleados (){
        File listado = new File(this.location3);
        String[] archivos = listado.list(), continuar = {"Continuar", "Salir"};
        String codigo, nombre, apellidos;
        String identificacion, celular;
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
            Component rootPane = null;
            opcion = JOptionPane.showOptionDialog(rootPane, "Codigo: " + codigo + "\nIdentificacion: " + identificacion + "\nNombre: " + nombre
                    + "\nApellidos: " + apellidos + "\nCelular: " + celular + "\nNumero de ventas: " + numeroVentas
                    + "\nEstado del empleado: " + estado, "Mostrando datos", 0, JOptionPane.INFORMATION_MESSAGE, 
                    null, continuar, null);
            if(opcion == JOptionPane.NO_OPTION){
                break;
            }
        }
  } 
  
  
  
  
 
}