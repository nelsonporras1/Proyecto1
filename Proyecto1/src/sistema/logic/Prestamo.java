/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 50689
 */
public class Prestamo {

 private int number;
 private double monto;
 private String descripcion;
 private double plazo;
 private double tasaInteres;
 private List<Mensualidad> listaMensualidades= new ArrayList<>();
 private List<Facturas> listaFacturas= new ArrayList<>();

    public Prestamo() {
        this.number=0;
        this.monto=0;
        this.descripcion="";
        this.plazo=0;
        this.tasaInteres=0;
        llenarMensualidades();
    }

    public Prestamo(double monto, String descripcion, double plazo, double tasaInteres) {
        this.monto = monto;
        this.descripcion= descripcion;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
        llenarMensualidades();
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double getMonto() {
        return monto;
    }

    public double getPlazo() {
        return Math.round(plazo);
    }

    public double getTasaInteres() {
        return tasaInteres *100;
    }
 
   public double cuotaMensual(){
    
    return (int)((monto*(tasaInteres/100)) / (1 - Math.pow(1+(tasaInteres/100),-plazo)));
    }
    
   public void restarPlazo(){
       this.plazo = plazo-1;
   }
   
   public void restaMonto(double cuota){
       this.monto = monto-cuota;
   }
    
    public void llenarMensualidades(){
     
  
   Mensualidad mensualidad;
   double saldo=monto;
   double cuotaMes= this.cuotaMensual();
   double montoInteres=0;
   double amortizacion=0;
   
   for(int i=0; i<plazo; i++){
       
   montoInteres= saldo*tasaInteres/100;
   amortizacion= cuotaMes-montoInteres;
   
   mensualidad= new Mensualidad(i+1,saldo,montoInteres,amortizacion);

   listaMensualidades.add(mensualidad);
   saldo = saldo - amortizacion;
    }
    
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Mensualidad> getListaMensualidades() {
        return listaMensualidades;
    }

    public void setListaMensualidades(List<Mensualidad> listaMensualidades) {
        this.listaMensualidades = listaMensualidades;
    }

    public List<Facturas> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Facturas> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
    
    
    
}