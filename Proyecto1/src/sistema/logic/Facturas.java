/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

/**
 *
 * @author 50663
 */
public class Facturas {
    
   private String fecha;
   private double monto;
   Mensualidad mensualidad;

    public Facturas() {
        
        this.fecha="";
        this.mensualidad= new Mensualidad();
        this.monto=0;
    }

    public Facturas(String fecha, double monto, Mensualidad mensualidad) {
        this.fecha = fecha;
        this.mensualidad = mensualidad;
        this.monto= monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mensualidad getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(Mensualidad mensualidad) {
        this.mensualidad = mensualidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    
    
   
}
