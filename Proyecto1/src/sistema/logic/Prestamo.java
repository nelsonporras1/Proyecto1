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

 private double monto;
 private double plazo;
 private double tasaInteres;

    public Prestamo(double monto, double plazo, double tasaInteres) {
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
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
        return plazo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
 

    
    public double calculaCuota(){
       double num1=monto*tasaInteres;
       double base=(1+tasaInteres);
       double exponente=plazo*-1;
       double num2= 1-(Math.pow(base,exponente));
       double cuota= num1/num2;
    return cuota;
    }
    
    public String llenarMensualidades(){
        double saldoActual =monto;
        int num=1;
        double mI=saldoActual*getTasaInteres();
        double mA=calculaCuota()-mI;
        List<Mensualidad> mensualidades= new ArrayList<>();
        
        for(int i=1;i<= getPlazo();i++){
            Mensualidad m =new Mensualidad(num,saldoActual,mI,mA);
            mensualidades.add(m);
            saldoActual=m.getSaldo()-m.getAmortizacion();
           mI=saldoActual*getTasaInteres();
           mA=calculaCuota()-mI;
            num++;
    
    }
        return mensualidades.toString();
    }
    
    
    
    
    
    
    
    @Override
    public String toString(){
    return "monto :" + getMonto()+"\n"+"plazo :" + getPlazo()+"\n"+"tasa interes :" + getTasaInteres()+"\n"+"Cuota :" + calculaCuota()+"\n";
   
    }
    
}