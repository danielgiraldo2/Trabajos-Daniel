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
public class Administrador extends Persona {

    //private Empleado e;
    //private Cliente c;
    //private Bono b;
    //private Producto p;

    public Administrador() {
    }

    public Administrador(String codigo, long id, String nombre, String apellidos, long celular) {
        super(codigo, id, nombre, apellidos, celular); //Es obligatorio el metodo super para utilizar los atributos de la clase Persona
    }

    @Override
    public void guardarDatos(File f) {
        try {
            FileWriter escribir;
            PrintWriter linea;
            escribir = new FileWriter(f, true);
            linea = new PrintWriter(escribir);
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular);
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
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
            this.id = Long.parseLong(linea.substring(16));
            linea = lector.readLine();
            this.nombre = linea.substring(8);
            linea = lector.readLine();
            this.apellidos = linea.substring(11);
            linea = lector.readLine();
            this.celular = Long.parseLong(linea.substring(9));
            lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDatos(File f, long celular) {
        PrintWriter linea;
        setCelular(celular);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
