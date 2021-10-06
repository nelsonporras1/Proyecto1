/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.List;
import sistema.data.Data;
import sistema.data.XmlPersister;

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
    
     public Service() {
        try{
            data=XmlPersister.instance().load();
        }
        catch(Exception e){
            data =  new Data();
        }
    }
     
       public void store(){
        try {
            XmlPersister.instance().store(data);
        } catch (Exception ex) {
        }
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
     
     public List<Cliente> retornaClientes(){
         
        return data.getClientes();
     }
      
    public List<Provincia> retornaProvincias(){
         
        return data.getProvincias();
     }
      
    public List<Distrito> retornaDistritos(){
         
        return data.getDistritos();
     }
        
     public List<Canton> retornaCantones(){
         
        return data.getCantones();
     }
     
     
}
