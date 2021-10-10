/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.prestamo;

import sistema.Application;
import sistema.logic.Cliente;
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
        model.setCliente(new Cliente());
        
        view.setModel(model);
        view.setController(this);
    }
    
    public void setCliente(Cliente cliente){
        model.setCliente(cliente);
        model.commit();
    }
    
      public void show(){
        this.view.setVisible(true);
    }
      
    public void exit(){
        this.view.setVisible(false);
        Application.controllerCliente.show();
    }
    
    public void showPagos(int row){
        
        try{
             Prestamo prestamo= model.getCliente().getPrestamos().get(row);
            Application.controllerPagos.setPrestamo(prestamo);
             this.view.setVisible(false);
             Application.controllerPagos.show();
            
        }catch(Exception ex){}
    }
    
    public void agregarPrestamo(String cedula, Prestamo prestamo){
        
        try{
        Service.instance().buscarCliente(cedula).setPrestamo(prestamo);
        model.commit();
        }catch(Exception ex){}
    }
   
}
