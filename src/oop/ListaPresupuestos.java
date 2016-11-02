package oop;
import java.io.Serializable;
import java.util.ArrayList;


public class ListaPresupuestos implements Serializable{
    private ArrayList<Presupuesto> lista;
    
    public ListaPresupuestos() {
        lista = new ArrayList<>();
    }
    public void altaPelicula(Presupuesto p) {
        lista.add(p);
    }
    public void bajaPelicula(Presupuesto p) {
        lista.remove(p);
    }
}