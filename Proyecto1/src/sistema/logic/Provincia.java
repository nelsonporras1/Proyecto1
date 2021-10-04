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

@XmlAccessorType(XmlAccessType.FIELD)
public class Provincia {
    
    @XmlID      
    private int numero;
    private String nombre;
    @XmlIDREF 
    private List<Canton> cantones;

    public Provincia(int numero,String nombre, List<Canton> cantones) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantones = cantones;
    }

    public Provincia() {
        this.numero=0;
        this.nombre="";
        this.cantones = new ArrayList<>();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCanton(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Canton> getCanton() {
        return cantones;
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
