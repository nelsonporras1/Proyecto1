/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

/**
 *
 * @author 50663
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {
    
  @XmlID      
  private String cedula;
  private String nombre;
   @XmlIDREF
  private Provincia provincia;
   @XmlIDREF
  private Canton canton;
   @XmlIDREF
  private Distrito distrito;

    public Cliente(String cedula, String nombre, Provincia provincia, Canton canton, Distrito distrito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
    }

    public Cliente() {
        this.cedula = "";
        this.nombre = "";
        this.provincia = null;
        this.canton = null;
        this.distrito = null;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }    
}
