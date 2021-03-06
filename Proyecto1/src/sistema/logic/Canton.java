/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.ArrayList;
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
    List<Distrito> distritos;

    public Canton(int numero, String nombre, List<Distrito> distritos) {
        this.numero= numero;
        this.nombre = nombre;
        this.distritos = distritos;
    }

    public Canton() { 
        this.numero=0;
        this.nombre= "";
        this.distritos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Distrito> getDistritos() {
        return distritos;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Canton other = (Canton) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
