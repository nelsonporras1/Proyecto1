/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author 50663
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Canton {
    
    @XmlID      
    int numero;
    String nombre;
    @XmlIDREF 
    Distrito distrito;

    public Canton(int numero, String nombre, Distrito distritos) {
        this.numero= numero;
        this.nombre = nombre;
        this.distrito = distrito;
    }

    public Canton() { 
        this.numero=0;
        this.nombre= "";
        this.distrito = new Distrito();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getNombre() {
        return nombre;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
