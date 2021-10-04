/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;
import java.util.List;
import sistema.logic.Canton;
import sistema.logic.Distrito;
import sistema.logic.Service;

/**
 *
 * @author 50663
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    
    public static sistema.presentacion.cliente.Model model;
    public static sistema.presentacion.cliente.View view;
    public static sistema.presentacion.cliente.Controller controller;
    
    public static void main(String[] args) throws Exception {
       
       model = new sistema.presentacion.cliente.Model();
       view = new sistema.presentacion.cliente.View();
       controller = new sistema.presentacion.cliente.Controller(model, view);
       
       sistema.logic.Service service = new sistema.logic.Service();
       
       System.out.println(service.buscarCliente("222"));
      // controller.show();
    }
    
}
