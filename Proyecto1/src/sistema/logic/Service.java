/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import sistema.data.Data;

/**
 *
 * @author 50663
 */
public class Service {
    
     private static Service theInstance;
    public static Service instance(){
        if (theInstance==null){ 
            theInstance=new Service();
        }
        return theInstance;
    }
    
    // Service data
      private Data data;
 
      //methods 
 
     public Cliente buscarCliente(String cedula) throws Exception{
          
        Cliente cliente = data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);
        if(cliente != null) {return cliente;  }
        else{ throw new Exception("Cliente no existe");  }
        
        
    }
     
     public void addCliente(Cliente cliente){
         
         Cliente newCliente = data.getClientes().stream().filter(c->c.getCedula().equals(cliente.getCedula())).findFirst().orElse(null);
         
         if(newCliente == null){
            data.getClientes().add(cliente);
         }
     }
      
      
      
     
}
