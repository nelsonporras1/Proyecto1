/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.mensualidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sistema.Application;
import sistema.logic.Cliente;
import sistema.logic.Prestamo;
import sistema.logic.Service;

public class Controller {
    Model model;
    View view;
    private Prestamo prestamo;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        // invoke Model sets for initialization before linking to the view
        // problably get the data from Service
        model.setPrestamo(new Prestamo(0.0,0.0,0.0, new Cliente()));
        model.setFacturas(new ArrayList<>());
        
        
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        this.view.setVisible(true);
    }
    
   
    
    // Controller methods that respond to View events
    // probably invoke methods from Service,
    // and set data to Model, which in turn causes the View to update 
    
     
     
     
     public void addPrestamo(Prestamo prestamo){
         
         try{
      //   Service.instance().addPrestamo(prestamo);
         model.setPrestamo(new Prestamo());
         model.commit();
         }
          catch (Exception ex) {
            
        }
     }
    
}
