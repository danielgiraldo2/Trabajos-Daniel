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

public class Producto {

    private String codigo;
    private String nombre;
    private String precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String precio) {
        String signo = "$"; //Signo de pesos
        this.codigo = codigo; //utiliza el metodo this para asignarle al atributo codigo el valor del parametro codigo
        this.nombre = nombre; //utiliza el metodo this para asignarle al atributo nombre el valor del parametro nombre
        this.precio = signo + precio; //utiliza el metodo this para asignarle al atributo precio el valor del parametro precio
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getCodigo() {
        return this.codigo; //metodo de consultar. Retorna el atributo
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getNombre() {
        return this.nombre; //metodo de consultar. Retorna el atributo
    }

    public void setPrecio(String precio) {
        String signo = "$"; //Signo pesos
        this.precio = signo + precio; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getPrecio() {
        return this.precio; //metodo de consultar. Retorna el atributo
    }

    public void guardarDatos(File f) {
        try {
            FileWriter escribir;
            PrintWriter linea;
            escribir = new FileWriter(f, true);
            linea = new PrintWriter(escribir);
            linea.println("Codigo: " + this.codigo + "\nNombre: " + this.nombre + "\nValor unitario: " + this.precio);
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void consultarDatos(File f) {
        RandomAccessFile lector;
        String linea;
        try {
            lector = new RandomAccessFile(f, "r");
            linea = lector.readLine();
            this.codigo = linea.substring(8);
            linea = lector.readLine();
            this.nombre = linea.substring(8);
            linea = lector.readLine();
            this.precio = linea.substring(16);
            lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarDatos(File f, String precio){
        PrintWriter linea;
        setPrecio(precio);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nNombre: " + this.nombre + "\nValor unitario: " + this.precio);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
