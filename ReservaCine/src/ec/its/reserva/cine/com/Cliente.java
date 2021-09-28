
package ec.its.reserva.cine.com;

import java.util.Random;

public class Cliente {
private Integer id;
private int edad;
private String nombre;
private String apellido;
private String telefono;
private String correo;
private String direccion;

    public Integer getId() {
    	Random r = new Random();
    	int low = 10;
    	int high = 100000;
    	id = r.nextInt(high-low) + low;
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
