/**
 * Created by CarlosAdrián on 11/06/2018.
 */
public class Titular {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String documento;

    public Titular(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido= apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        //validar mail
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
