/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.cliente;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.Application;
import sistema.logic.Cliente;
import sistema.logic.Provincia;
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
      
      public void showPrestamo(String cedula){
         
        try {
             Application.controllerPrestamo.setCliente(Service.instance().buscarCliente(cedula));
             this.view.setVisible(false);
             Application.controllerPrestamo.show();
        } catch (Exception ex) {
        }
         
      }
      
      public void exit(){
        Service.instance().store();
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
    public Cliente retornaCliente(String cedula) {
        
        try {
        Cliente cliente = Service.instance().buscarCliente(cedula);
        return cliente;
        
        } catch (Exception ex) {
    }
        return new Cliente();
}
    
    public Provincia buscaProvincia(String name) throws Exception{
        
        return Service.instance().buscaProvincia(name);
    }

}