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
    
    public static sistema.presentacion.cliente.Model modelCliente;
    public static sistema.presentacion.cliente.View viewCliente;
    public static sistema.presentacion.cliente.Controller controllerCliente;
    
    public static sistema.presentacion.mensualidad.Model modelPrestamo;
    public static sistema.presentacion.mensualidad.View viewPrestamo;
      public static sistema.presentacion.mensualidad.Controller controllerPrestamo;
    
    
    public static void main(String[] args) throws Exception {
       
       modelCliente = new sistema.presentacion.cliente.Model();
       viewCliente = new sistema.presentacion.cliente.View();
       controllerCliente = new sistema.presentacion.cliente.Controller(modelCliente, viewCliente);
    
       modelPrestamo = new sistema.presentacion.mensualidad.Model();
       viewPrestamo = new sistema.presentacion.mensualidad.View();
       controllerPrestamo = new sistema.presentacion.mensualidad.Controller(modelPrestamo,viewPrestamo);
        
       controllerPrestamo.show();

       //System.out.println(service.buscarCliente("222"));
      // controller.show();
// 959b41abfb30a91721b55bc4622433f5e0fa62d8
    }
    
}
