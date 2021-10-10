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
    public static sistema.presentacion.prestamo.Controller controllerPrestamo;
    public static sistema.presentacion.pagos.Controller controllerPagos;
    
    
    public static void main(String[] args) throws Exception {
       
       sistema.presentacion.cliente.Model modelCliente;
       sistema.presentacion.cliente.View viewCliente;
       sistema.presentacion.prestamo.Model modelPrestamo;
       sistema.presentacion.prestamo.View viewPrestamo;
       sistema.presentacion.pagos.View viewPagos;
       sistema.presentacion.pagos.Model modelPagos;
       
       modelCliente = new sistema.presentacion.cliente.Model();
       viewCliente = new sistema.presentacion.cliente.View();
       controllerCliente = new sistema.presentacion.cliente.Controller(modelCliente, viewCliente);
    
       modelPrestamo= new sistema.presentacion.prestamo.Model();
       viewPrestamo= new sistema.presentacion.prestamo.View();
       controllerPrestamo= new sistema.presentacion.prestamo.Controller(modelPrestamo, viewPrestamo);
       
       viewPagos= new sistema.presentacion.pagos.View();
       modelPagos= new sistema.presentacion.pagos.Model();
       controllerPagos= new sistema.presentacion.pagos.Controller(modelPagos,viewPagos);
       
       Distrito distrito = new Distrito(1,"Cañas Dulces");
       Distrito distrito7 = new Distrito(2,"Mayorga");
       Distrito distrito3 = new Distrito(1,"Bejuco");
       Distrito distrito8 = new Distrito(2,"San Pablo");
       
       List<Distrito> distritos= new ArrayList<>();
       List<Distrito> distritos2= new ArrayList<>();
       List<Distrito> distritos3= new ArrayList<>();
       List<Distrito> distritos4= new ArrayList<>();
       List<Distrito> distritos5= new ArrayList<>();
       List<Distrito> distritos6= new ArrayList<>();
       List<Distrito> distritos7= new ArrayList<>();
       List<Distrito> distritos8= new ArrayList<>();
       List<Distrito> distritos9= new ArrayList<>();
       List<Distrito> distritos10= new ArrayList<>();
       List<Distrito> distritos11= new ArrayList<>();
       List<Distrito> distritos12= new ArrayList<>();
       List<Distrito> distritos13= new ArrayList<>();
       List<Distrito> distritos14= new ArrayList<>();
       List<Distrito> distritos15= new ArrayList<>();
       distritos3.add(distrito3);
       distritos3.add(distrito8);
       distritos.add(distrito);
       distritos.add(distrito7);
             
       
       Canton canton= new Canton(1,"Liberia",distritos);
       Canton canton3= new Canton(2,"Nandayure",distritos3);
       List<Canton> cantones= new ArrayList<>();
       List<Canton> cantones2= new ArrayList<>();
       List<Canton> cantones4= new ArrayList<>();
       List<Canton> cantones5= new ArrayList<>();
       List<Canton> cantones6= new ArrayList<>();
       List<Canton> cantones7= new ArrayList<>();
       List<Canton> cantones8= new ArrayList<>();
       cantones.add(canton);
       cantones.add(canton3);
       
       
       Provincia provincia= new Provincia(5,"Guanacaste",cantones);
       
       Cliente cliente = new Cliente("111","Mario",2222,provincia,canton,distrito);
       
      
       //-------------------------------------------------
       Distrito distrito2 = new Distrito(1,"Concepcion");
       Distrito distrito4 = new Distrito(2, "Escobal");
     
       distritos2.add(distrito2);
       distritos2.add(distrito4);      
       
       Canton canton2= new Canton(1,"Atenas",distritos2);
       
       
       Distrito distrito5 = new Distrito(1,"Bolivar");
       Distrito distrito6 = new Distrito(2, "San Isidro");
      
       distritos4.add(distrito5);
       distritos4.add(distrito6);
       
       Canton canton4= new Canton(2,"Grecia",distritos4);
       cantones2.add(canton4);
       cantones2.add(canton2);
       
       Provincia provincia2= new Provincia(2,"Alajuela",cantones2);
    //--------------------------------------------------------------------
    
       Distrito distrito9 = new Distrito(1,"San Antonio");
       Distrito distrito10 = new Distrito(2, "San Rafael");
     
       distritos6.add(distrito9);
       distritos6.add(distrito10);      
       
       Canton canton5= new Canton(1,"Escazu",distritos6);
    
       
       Distrito distrito11 = new Distrito(1,"San Miguel");
       Distrito distrito12 = new Distrito(2, "San Antonio");
      
       distritos7.add(distrito11);
       distritos7.add(distrito12);
       
       Canton canton6= new Canton(2,"Desamparados",distritos7);
       cantones4.add(canton5);
       cantones4.add(canton6);
       
       Provincia provincia3= new Provincia(1,"San Jose",cantones4);
    
       //-----------------------------------------------------------
       
       Distrito distrito13 = new Distrito(1,"Dulce Nombre");
       Distrito distrito14 = new Distrito(2, "Tres Rios");
     
       distritos8.add(distrito13);
       distritos8.add(distrito14);      
       
       Canton canton7= new Canton(1,"La Union",distritos8);
    
       
       Distrito distrito15 = new Distrito(1,"Orosi");
       Distrito distrito16 = new Distrito(2, "Cachi");
      
       distritos9.add(distrito15);
       distritos9.add(distrito16);
       
       Canton canton8= new Canton(2,"Paraiso",distritos9);
       cantones5.add(canton7);
       cantones5.add(canton8);
       
       Provincia provincia4= new Provincia(4,"Cartago",cantones5);
       
       //--------------------------------------------------------------
       
       Distrito distrito17 = new Distrito(1,"Duacari");
       Distrito distrito18 = new Distrito(2, "Mercedez");
     
       distritos10.add(distrito17);
       distritos10.add(distrito18);      
       
       Canton canton9= new Canton(1,"Guacimo",distritos10);
    
       
       Distrito distrito19 = new Distrito(1,"Batan");
       Distrito distrito20 = new Distrito(2, "Carrandi");
      
       distritos11.add(distrito19);
       distritos11.add(distrito20);
       
       Canton canton10= new Canton(2,"Matina",distritos11);
       cantones6.add(canton9);
       cantones6.add(canton10);
       
       Provincia provincia5= new Provincia(7,"Limon",cantones6);
       //-----------------------------------------------------------
       
       Distrito distrito21 = new Distrito(1,"Biolley");
       Distrito distrito22 = new Distrito(2, "Brunka");
     
       distritos12.add(distrito21);
       distritos12.add(distrito22);      
       
       Canton canton11= new Canton(1,"Buenos Aires",distritos12);
    
       
       Distrito distrito23 = new Distrito(1,"La Cuesta");
       Distrito distrito24 = new Distrito(2, "Laurel");
      
       distritos13.add(distrito23);
       distritos13.add(distrito24);
       
       Canton canton12= new Canton(2,"Corredores",distritos13);
       cantones7.add(canton11);
       cantones7.add(canton12);
       
       Provincia provincia6= new Provincia(6,"Puntarenas",cantones7);
      
       //------------------------------------------------------------------------
       
       Distrito distrito25 = new Distrito(1,"Mercedez");
       Distrito distrito26 = new Distrito(2, "San Frascisco");
     
       distritos14.add(distrito25);
       distritos14.add(distrito26);     
       
       Canton canton13 = new Canton(1,"Barba",distritos14);
    
       
       Distrito distrito27 = new Distrito(1,"La Ribera");
       Distrito distrito28 = new Distrito(2, "La Asuncion");
      
       distritos15.add(distrito27);
       distritos15.add(distrito28);
       
       Canton canton14= new Canton(2,"Belen",distritos15);
       cantones8.add(canton13);
       cantones8.add(canton14);
       
       Provincia provincia7= new Provincia(3,"Heredia",cantones8);
     
       //-----------------------------------------------------------------------
        Service.instance().retornaProvincias().add(provincia);
              
        Service.instance().retornaProvincias().add(provincia2);
        
        Service.instance().retornaProvincias().add(provincia3);
        
        Service.instance().retornaProvincias().add(provincia4);
        
        Service.instance().retornaProvincias().add(provincia5);
        
        Service.instance().retornaProvincias().add(provincia6);
        
        Service.instance().retornaProvincias().add(provincia7);
       
        Service.instance().retornaCantones().add(canton);
        
        Service.instance().retornaDistritos().add(distrito);
       
        Service.instance().retornaCantones().add(canton2);
        
        Service.instance().retornaDistritos().add(distrito2);
       
        Service.instance().addCliente(cliente);
       
        Cliente cliente2 = new Cliente("222","Maria",1111,provincia2,canton2,distrito2);
        
        Service.instance().addCliente(cliente2);
          
        controllerCliente.show();
      
    }
    
}
