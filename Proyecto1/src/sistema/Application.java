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
    
    public static sistema.presentacion.mensualidad.Model modelMensualidad;
    public static sistema.presentacion.mensualidad.View viewMensualidad;
    public static sistema.presentacion.mensualidad.Controller controllerMensualidad;
      
    public static sistema.presentacion.prestamo.Model modelPrestamo;
    public static sistema.presentacion.prestamo.View viewPrestamo;
    public static sistema.presentacion.prestamo.Controller controllerPrestamo;
    
    
    public static void main(String[] args) throws Exception {
       
       modelCliente = new sistema.presentacion.cliente.Model();
       viewCliente = new sistema.presentacion.cliente.View();
       controllerCliente = new sistema.presentacion.cliente.Controller(modelCliente, viewCliente);
    
       modelMensualidad = new sistema.presentacion.mensualidad.Model();
       viewMensualidad = new sistema.presentacion.mensualidad.View();
       controllerMensualidad = new sistema.presentacion.mensualidad.Controller(modelMensualidad,viewMensualidad);
       
       modelPrestamo= new sistema.presentacion.prestamo.Model();
       viewPrestamo= new sistema.presentacion.prestamo.View();
       controllerPrestamo= new sistema.presentacion.prestamo.Controller(modelPrestamo, viewPrestamo);
        
       
       controllerCliente.show();
       //controllerMensualidad.show();
       //controllerPrestamo.show();
       //System.out.println(service.buscarCliente("222"));

// 959b41abfb30a91721b55bc4622433f5e0fa62d8
    }
    
}
