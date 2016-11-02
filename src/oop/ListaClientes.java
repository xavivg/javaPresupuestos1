package oop;
import java.io.Serializable;
import java.util.ArrayList;


public class ListaClientes implements Serializable{
    private ArrayList<Cliente> lista;
    
    public ListaClientes(){
        
        lista = new ArrayList<>();
    }
    public void altaClientes(Cliente p) {
        lista.add(p);
    }
    public void bajaClientes(Cliente p) {
        lista.remove(p);
    }
     public Cliente ObtenerClientePorNombre(String nombre) {
        for (Cliente p : lista) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
     public Cliente ObtenerClientePorTelf(String telf) {
        for (Cliente p : lista) {
            if (p.getTelefono().equals(telf)) {
                return p;
            }
        }
        return null;
    }
  public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }
    public boolean clienteExists(String clienteNum){
        boolean found=false;
        for(Cliente cliente:lista){
            if(cliente.getTelefono().equalsIgnoreCase(clienteNum)){
                found=true;
            }
        }
        return found;
    }
    public Cliente getclientebytelf(String telf){
        for(Cliente cliente:lista){
            if(cliente.getTelefono().equalsIgnoreCase(telf)){
                return cliente;
            }
        }
        return null;
    }

}