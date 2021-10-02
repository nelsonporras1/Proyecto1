/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.List;


public class Provincia {
       int numero;
       String nombre;
       List<Canton> cantones;

    public Provincia(String nombre, List<Canton> cantones) {
        this.nombre = nombre;
        this.cantones = cantones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Canton> getCantones() {
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
        return "Provincia{" + "nombre=" + nombre + ", cantones=" + cantones + '}';
    }
    
    
}
