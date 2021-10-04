/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.prestamo;

import java.util.ArrayList;
import sistema.logic.Cliente;

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
        model.setPrestamos(new ArrayList<>());
        
        view.setModel(model);
        view.setController(this);
    }
    
      public void show(){
        this.view.setVisible(true);
    }
}
