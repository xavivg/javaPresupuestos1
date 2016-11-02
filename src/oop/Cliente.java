package oop;

import java.io.Serializable;
/**
 *
 * @author usu26
 */
public class Cliente  implements Serializable {
    
    private String nombre;
    private String apellidos;
    private String telefono;
    private Boolean VIP;
    private ListaPresupuestos ListaPresupuestos;
    
    public Cliente(){
}
    
    public Cliente(String nombre, String apellidos, String telefono,Boolean VIP){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.VIP = VIP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getVIP() {
        return VIP;
    }

    public void setVIP(Boolean VIP) {
        this.VIP = VIP;
    }
    
    
}
