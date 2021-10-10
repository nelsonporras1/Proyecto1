/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.pagos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import sistema.Application;
import sistema.logic.Facturas;
import sistema.logic.Prestamo;
import sistema.logic.Service;

/**
 *
 * @author 50663
 */
public class Controller {
    
    Model model;
    View view;

public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
    
      model.setPrestamo(new Prestamo());
      
      view.setModel(model);
      view.setController(this);
    }

public void setPrestamo(Prestamo prestamo){

  model.setPrestamo(prestamo);
  model.commit();
}

 public void show(){
    this.view.setVisible(true);
 }

 public void exit(){
        this.view.setVisible(false);
        Application.controllerPrestamo.show();
    }
 
 public void pagoCuota(double monto){
        
        try{
            Calendar fecha = new GregorianCalendar();
            
            if(!this.model.getPrestamo().getListaMensualidades().isEmpty()){
            Facturas factura= new Facturas(""+fecha.get(Calendar.DAY_OF_MONTH) +"/"+ fecha.get(Calendar.MONTH) +"/"+
            fecha.get(Calendar.YEAR), monto, model.getPrestamo().getListaMensualidades().get(0));
            Service.instance().retornaFacturas().add(factura);
            this.model.getPrestamo().getListaFacturas().add(factura);
            this.model.getPrestamo().getListaMensualidades().remove(0);
            model.commit();
            }
        }catch(Exception ex){}
 }
 
  public void pagoCuotaExtraordinario(double monto){
        
        try{
            Calendar fecha = new GregorianCalendar();
            
            if(!this.model.getPrestamo().getListaMensualidades().isEmpty()){
            Facturas factura= new Facturas(""+fecha.get(Calendar.DAY_OF_MONTH) +"/"+ fecha.get(Calendar.MONTH) +"/"+
            fecha.get(Calendar.YEAR), monto, model.getPrestamo().getListaMensualidades().get(0));
            Service.instance().retornaFacturas().add(factura);
            this.model.getPrestamo().getListaFacturas().add(factura);
            this.model.getPrestamo().getListaMensualidades().remove(0);
            this.model.getPrestamo().restaMonto(monto);
            model.commit();
            }
            
        }catch(Exception ex){}
 }

}