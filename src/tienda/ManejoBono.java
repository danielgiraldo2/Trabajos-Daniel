/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanas.Admin;
import ventanas.Compra;

/**
 *
 * @author vgirr
 */
public class  ManejoBono {
    
    private String barra = File.separator;
    private String location1 = System.getProperty("user.dir") + this.barra + "Registros" + this.barra;
    private String location5 = this.location1 + "Bonos" + this.barra;
    
    
    
    public void CrearBono (String codigo, String descuento){
         
        File bono = new File(this.location5 + codigo + ".Registro");
    
        try {
                bono.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
           Bono b = new Bono(codigo, descuento);
            b.guardarDatos(bono);
           JOptionPane.showMessageDialog(null, "Bono creado con exito", 
                    "Operacion satisfactoria", JOptionPane.INFORMATION_MESSAGE);
        
     
  
    }
    
     public boolean ConsultarBonoExistente (String codigo){
         
        File bono = new File(this.location5 + codigo + ".Registro");
          return bono.exists();
        
        
    }
     
     
     public void UtilizarBono (String codigo, int var2){
        
         String descuento;
        float var1, var, var3,var4;
      
       File bono = new File(this.location5 + codigo + ".Registro");
            if (bono.exists()) {
                RandomAccessFile lector;
                try {
                    lector = new RandomAccessFile(bono, "r");
                    lector.readLine();
                    descuento = lector.readLine().substring(12);
                    lector.close();
                    var1 = Integer.parseInt(descuento);
                    var = var1/100;
                   // var2 = Integer.parseInt(this.jLabelTotal.getText().substring(1));
                    var3 = var2*var;
                   // var2 *= var;
                    var4 = var2-var3;
                    
                    JOptionPane.showMessageDialog(null, "$" + Integer.toString((int) var4) ,"TOTAL A PAGAR", JOptionPane.INFORMATION_MESSAGE);
                  //  this.jLabelTotal.setText("$" + Integer.toString(var3));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo de un bono existente",
                        "El producto no se encuentra registrado", JOptionPane.ERROR_MESSAGE);
            }
     }
     
     
     public void ListarBonos (){
         
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
            opcion = JOptionPane.showOptionDialog(null, "Codigo: " + codigo + "\nDescuento: " + descuento, 
                    "Mostrando datos", 0, JOptionPane.INFORMATION_MESSAGE, null, continuar, null);
            if(opcion == JOptionPane.NO_OPTION){
                break;
            }
        }
         
    }  
}
