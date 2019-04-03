package tienda;

import java.io.File;

/**
 * Esta es la Superclase. Se hace la clase Persona abstracta para que las
 * Subclases puedan heradar los atributos y metodos de la misma.
 */
public abstract class Persona {

    String codigo;
    long id;
    String nombre;
    String apellidos;
    long celular;
    
    public Persona(){
    }

    public Persona(String codigo, long id, String nombre, String apellidos, long celular) {
        this.codigo = codigo; //utiliza el metodo this para asignarle al atributo codigo el valor del parametro codigo
        this.id = id; //utiliza el metodo this para asignarle al atributo id el valor del parametro id
        this.nombre = nombre; //utiliza el metodo this para asignarle al atributo nombre el valor del parametro nombre
        this.apellidos = apellidos; //utiliza el metodo this para asignarle al atributo apellidos el valor del parametro apellidos
        this.celular = celular; //utiliza el metodo this para asignarle al atributo celular el valor del parametro celular
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getCodigo() {
        return this.codigo; //metodo de consultar. Retorna el atributo
    }

    public void setId(long id) {
        this.id = id; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public long getId() {
        return this.id; //metodo de consultar. Retorna el atributo
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getNombre() {
        return this.nombre; //metodo de consultar. Retorna el atributo
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public String getApellidos() {
        return this.apellidos; //metodo de consultar. Retorna el atributo
    }

    public void setCelular(long celular) {
        this.celular = celular; //metodo de modificar. Recibe un parametro y lo asigna
    }

    public long getCelular() {
        return this.celular; //metodo de consultar. Retorna el atributo
    }

    /**
     * Se hacen abstractos los metodos para asi ser re-escritos desde la
     * Subclase que los hereda, es decir, se obliga a la subclase a utilizar los
     * Metodos abstractos y se le da el derecho de re-escribirlos.
     *
     * @param f
     */
    //Metodo para guardar en un archivo
    abstract public void guardarDatos(File f);

    //Metodo para consultar en un archivo
    abstract public void consultarDatos(File f);
}
