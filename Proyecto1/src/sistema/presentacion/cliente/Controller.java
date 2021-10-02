/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.cliente;

import java.util.ArrayList;
import java.util.Arrays;
import sistema.logic.Cliente;
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
        
        model.setCliente(new Cliente());
        model.setClientes(new ArrayList<>());
        
        view.setModel(model);
        view.setController(this);
    }
    
      public void show(){
        this.view.setVisible(true);
    }
      
     public void buscarCliente(String cedula){
        try {
            Cliente cliente = Service.instance().buscarCliente(cedula);
            model.setCliente(cliente);
            model.commit();
        } catch (Exception ex) {
            model.setCliente(new Cliente());
            model.commit();
        }
    }
     
     public void addCliente(Cliente cliente){
         
         try{
         Service.instance().addCliente(cliente);
         model.setCliente(new Cliente());
         model.commit();
         }
          catch (Exception ex) {
            
        }
     }
    
}
