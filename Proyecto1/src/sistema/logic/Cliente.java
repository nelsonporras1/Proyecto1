/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
  private int telefono;
   @XmlIDREF
  private Provincia provincia;
   @XmlIDREF
  private Canton canton;
   @XmlIDREF
  private Distrito distrito;
  private List<Prestamo> prestamos; 
   
    public Cliente(String cedula, String nombre, int telefono, Provincia provincia, Canton canton, Distrito distrito) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono= telefono;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.prestamos= new ArrayList<>();

    }

    public Cliente() {
        this.cedula = "";
        this.nombre = "";
        this.provincia = new Provincia();
        this.canton = new Canton();
        this.distrito = new Distrito();
        this.prestamos= new ArrayList<>();
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }  
    
    public String toString() {
        return nombre;
    }
    
    public void asignaNumeros(){
        
        for(int i=0; i< this.getPrestamos().size(); i++){
            
            this.getPrestamos().get(i).setNumber(i+1);
        }
    }
    
    public void setPrestamo(Prestamo prestamo){
        
        this.getPrestamos().add(prestamo);
        asignaNumeros();
    }
    
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cedula);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
}
