/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;

/**
 *
 * @author 50663
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Distrito {
    
    @XmlID      
    private int numero;
    private String nombre;

    public Distrito(int numero, String nombre) {
        this.numero=numero;
        this.nombre = nombre;
    }
    
    public Distrito(){
        this.numero=0;
        this.nombre="";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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
        hash = 71 * hash + this.numero;
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
        final Distrito other = (Distrito) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

  
    
    
    
}
