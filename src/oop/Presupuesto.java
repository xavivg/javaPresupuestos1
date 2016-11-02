package oop;

import java.io.Serializable;
/**
 *
 * @author usu26
 */
public class Presupuesto  implements Serializable {
    
    private Integer id;
    private String concepto;
    private Integer precioTotal;
    private Boolean estado;
    
    public Presupuesto(){
}
    
    public Presupuesto(Integer id, String concepto, Integer precioTotal, Boolean estado){
        this.id = id;
        this.concepto = concepto;
        this.precioTotal = precioTotal;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
