package tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta es la subclase que hereda de la superclase Persona.
 */
public class Empleado extends Persona {

    private int numeroVentas;
    private Boolean activo;

    public Empleado() {
    }

    public Empleado(String codigo, String id, String nombre, String apellidos, String celular, int numeroVentas, Boolean activo) {
        super(codigo, id, nombre, apellidos, celular); //Es obligatorio el metodo super para utilizar los atributos de la clase Persona
        this.numeroVentas = numeroVentas; //utiliza el metodo this para asignarle al atributo numeroVentas el valor del parametro numeroVentas
        this.activo = activo; //utiliza el metodo this para asignarle al atributo activo el valor del parametro activo
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public int getNumeroVentas() {
        return this.numeroVentas; //metodo de consultar. Retorna el atributo
    }

    public void setActivo(Boolean activo) {
        this.activo = activo; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public Boolean getActivo() {
        return this.activo; //metodo de consultar. Retorna el atributo
    }

    @Override
    public void guardarDatos(File f) {
        FileWriter escribir;
        PrintWriter linea;
        try {
            escribir = new FileWriter(f, true);
            linea = new PrintWriter(escribir);
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular + "\nNumero de ventas: " + this.numeroVentas + "\nEstado: " + this.activo);
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
    @Override
    public void consultarDatos(File f) {
        RandomAccessFile lector;
        String linea;
        try {
            lector = new RandomAccessFile(f, "r");
            linea = lector.readLine();
            this.codigo = linea.substring(8);
            linea = lector.readLine();
            this.id = linea.substring(16);
            linea = lector.readLine();
            this.nombre = linea.substring(8);
            linea = lector.readLine();
            this.apellidos = linea.substring(11);
            linea = lector.readLine();
            this.celular = linea.substring(9);
            linea = lector.readLine();
            this.numeroVentas = Integer.parseInt(linea.substring(18));
            linea = lector.readLine();
            this.activo = Boolean.parseBoolean(linea.substring(8, 12));
            lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarDatos(File f, String celular, int numeroVentas, Boolean activo){
        PrintWriter linea;
        setCelular(celular);
        setNumeroVentas(numeroVentas);
        setActivo(activo);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular + "\nNumero de ventas: " + this.numeroVentas + "\nEstado: " + this.activo);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarActivo(File f, Boolean activo){
        PrintWriter linea;
        setActivo(activo);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular + "\nNumero de ventas: " + this.numeroVentas + "\nEstado: " + this.activo);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
