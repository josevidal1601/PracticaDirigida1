package pe.uni.fiis.dirigida.bean;

/**
 * Created by JOSE on 28/05/2015.
 */
public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String correo;

    public String getDatos(){
        String datos=null;
        datos= "Nombre: "+ nombre + " Apellido Paterno: " + apellidoPaterno + " Correo: " + correo;
        return datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
