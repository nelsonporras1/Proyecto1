/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

/**
 *
 * @author 50689
 */
public class Mensualidad {
    private double numero;
    private double saldo;
    private double interes;
    private double amortizacion;
    
    
    public Mensualidad( double numero,double saldo,double interes,double amortizacion){
        this.numero=numero;
        this.saldo=saldo;
        this.interes=interes;
        this.amortizacion=amortizacion;
    }
    
    public void setNumero( double numero){
        this.numero=numero;
    };
    
     public void setSaldo( double saldo){
        this.saldo=saldo;
    };
     
      public void setInteres( double interes){
        this.interes=interes;
    };
    
       public void setAmortizacion( double amortizacion){
        this.amortizacion=amortizacion;
    };
    
        public double getNumero(){
            return numero;
        };

        public double getSaldo(){
            return saldo;
        };

        public double getInteres(){
            return interes;
        };

        public double getAmortizacion(){
        return amortizacion;
        };
    
       public String toString(){
    return " numero :" + getNumero()+"\n"+" Saldo :" + getSaldo()+"\n"+" monto interes :" + getInteres()+"\n"+" amortizacion: " + getAmortizacion()+"\n";
   
    
       }
       }