/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;


import java.util.ArrayList;
import java.util.List;
import sistema.logic.Canton;
import sistema.logic.Cliente;
import sistema.logic.Distrito;
import sistema.logic.Prestamo;
import sistema.logic.Provincia;
import sistema.logic.Service;

/**
 *
 * @author 50663
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    
   
    public static sistema.presentacion.cliente.Controller controllerCliente;
    public static sistema.presentacion.mensualidad.Controller controllerMensualidad;
    public static sistema.presentacion.prestamo.Controller controllerPrestamo;
    
    
    public static void main(String[] args) throws Exception {
       
       sistema.presentacion.cliente.Model modelCliente;
       sistema.presentacion.cliente.View viewCliente;
       sistema.presentacion.mensualidad.Model modelMensualidad;
       sistema.presentacion.mensualidad.View viewMensualidad;
       sistema.presentacion.prestamo.Model modelPrestamo;
       sistema.presentacion.prestamo.View viewPrestamo;
       
       modelCliente = new sistema.presentacion.cliente.Model();
       viewCliente = new sistema.presentacion.cliente.View();
       controllerCliente = new sistema.presentacion.cliente.Controller(modelCliente, viewCliente);
    
       modelMensualidad = new sistema.presentacion.mensualidad.Model();
       viewMensualidad = new sistema.presentacion.mensualidad.View();
       controllerMensualidad = new sistema.presentacion.mensualidad.Controller(modelMensualidad,viewMensualidad);
       
       modelPrestamo= new sistema.presentacion.prestamo.Model();
       viewPrestamo= new sistema.presentacion.prestamo.View();
       controllerPrestamo= new sistema.presentacion.prestamo.Controller(modelPrestamo, viewPrestamo);
        
       
      
       //controllerMensualidad.show();
       //controllerPrestamo.show();
       
       Distrito distrito = new Distrito(1,"Lepanto");
       List<Distrito> distritos= new ArrayList<>();
       distritos.add(distrito);
             
       
       Canton canton= new Canton(1,"Paquera",distritos);
       List<Canton> cantones= new ArrayList<>();
       cantones.add(canton);
       
       
       Provincia provincia= new Provincia(1,"Guanacaste",cantones);
       
       Cliente cliente = new Cliente("111","Elias",2222,provincia,canton,distrito);
       
       
       
       Service.instance().retornaCantones().add(canton);
       Service.instance().retornaDistritos().add(distrito);
       
//       System.out.println(Service.instance().buscarCliente("111").getNombre());
       
       //Prestamo prestamo = new Prestamo(1, 20000, "Una bici", 12, 2);
       
       //cliente.getPrestamos().add(prestamo);
       
       Service.instance().addCliente(cliente);
       
        controllerCliente.show();

// 959b41abfb30a91721b55bc4622433f5e0fa62d8
    }
    
}
