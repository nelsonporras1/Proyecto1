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

/**
 *
 * @author 50663
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        sistema.logic.Distrito D1=new sistema.logic.Distrito("San Lorenzo") ;
        sistema.logic.Distrito D2=new sistema.logic.Distrito("San Joaquin") ;
        sistema.logic.Distrito D3=new sistema.logic.Distrito("Llorente") ;
        sistema.logic.Distrito D4=new sistema.logic.Distrito("San Juan") ;
        sistema.logic.Distrito D5=new sistema.logic.Distrito("San Pedro") ;
        
         List<Distrito> distritos = new ArrayList<Distrito>();
         List<Distrito> distritos2 = new ArrayList<Distrito>();
        distritos.add(D1);
        distritos.add(D2);
        distritos.add(D3);
        distritos2.add(D4);
        distritos2.add(D5);
        
        
        sistema.logic.Canton C1 =new sistema.logic.Canton("Flores",distritos) ;
        sistema.logic.Canton C2 =new sistema.logic.Canton("Santa Barbara",distritos2) ;
        List<Canton> cantones = new ArrayList<Canton>();
        
         cantones.add(C1);
         cantones.add(C2);
         
         sistema.logic.Provincia P1 =new sistema.logic.Provincia("Heredia",cantones) ;
       
        
           
          System.out.println( P1.toString());
         
         
        sistema.presentacion.cliente.View view = new sistema.presentacion.cliente.View();
        view.setVisible(true);
    }
    
}
