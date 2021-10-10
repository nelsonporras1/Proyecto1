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
    
    public Mensualidad(){
        this.numero=0;
        this.saldo=0;
        this.interes=0;
        this.amortizacion=0;
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
            return (int)numero;
        };

        public double getSaldo(){
            return Math.round(saldo);
        };

        public double getInteres(){
            return Math.round(interes);
        };

        public double getAmortizacion(){
        return Math.round(amortizacion);
        };
    
       public String toString(){
    return " numero :" + getNumero()+"\n"+" Saldo :" + getSaldo()+"\n"+" monto interes :" + getInteres()+"\n"+" amortizacion: " + getAmortizacion()+"\n";
   
    
       }
       }