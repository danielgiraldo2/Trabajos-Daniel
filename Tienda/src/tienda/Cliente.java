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
public class Cliente extends Persona {

    private int puntos;

    public Cliente() {
    }

    public Cliente(String codigo, String id, String nombre, String apellidos, String celular, int puntos) {
        super(codigo, id, nombre, apellidos, celular); //Es obligatorio el metodo super para utilizar los atributos de la clase Persona
        this.puntos = puntos;  //utiliza el metodo this para asignarle al atributo puntos el valor del parametro puntos
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public int getPuntos() {
        return this.puntos; //metodo de consultar. Retorna el atributo
    }

    @Override
    public void guardarDatos(File f) {
        try {
            FileWriter escribir;
            PrintWriter linea;
            escribir = new FileWriter(f, true);
            linea = new PrintWriter(escribir);
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular + "\nPuntos acumulados: " + this.puntos);
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
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
            this.id =linea.substring(16);
            linea = lector.readLine();
            this.nombre = linea.substring(8);
            linea = lector.readLine();
            this.apellidos = linea.substring(11);
            linea = lector.readLine();
            this.celular =linea.substring(9);
            linea = lector.readLine();
            this.puntos = Integer.parseInt(linea.substring(19));
            lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDatos(File f, String celular, int puntos) {
        PrintWriter linea;
        setCelular(celular);
        setPuntos(puntos);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular + "\nPuntos acumulados: " + this.puntos);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarPuntos(File f, int puntos) {
        PrintWriter linea;
        setPuntos(puntos);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nIdentificacion: " + this.id + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nCelular: " + this.celular + "\nPuntos acumulados: " + this.puntos);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
