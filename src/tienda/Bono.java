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

public class Bono {

    private String codigo;
    private String descuento;

    public Bono() {
    }

    public Bono(String codigo, String descuento) {
        String porcentaje = "%"; //Signo de porcentaje
        this.codigo = codigo; //utiliza el metodo this para asignarle al atributo codigo el valor del parametro codigo
        this.descuento = porcentaje + descuento; //utiliza el metodo this para asignarle al atributo descuento el valor del parametro descuento
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getCodigo() {
        return this.codigo; //metodo de consultar. Retorna el atributo
    }

    public void setDescuento(String descuento) {
        String porcentaje = "%"; //Signo de porcentaje
        this.descuento = porcentaje + descuento; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getDescuento() {
        return this.descuento; //metodo de consultar. Retorna el atributo
    }

    public void guardarDatos(File f) {
        try {
            FileWriter escribir;
            PrintWriter linea;
            escribir = new FileWriter(f, true);
            linea = new PrintWriter(escribir);
            linea.println("Codigo: " + this.codigo + "\nDescuento: " + this.descuento);
            linea.close();
            escribir.close();
        } catch (IOException ex) {
            Logger.getLogger(Bono.class.getName()).log(Level.SEVERE, null, ex);
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
            this.descuento = linea.substring(11);
            lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bono.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDatos(File f, String descuento) {
        PrintWriter linea;
        setDescuento(descuento);
        try {
            linea = new PrintWriter(f, "utf-8");
            linea.println("Codigo: " + this.codigo + "\nDescuento: " + this.descuento);
            linea.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Bono.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
