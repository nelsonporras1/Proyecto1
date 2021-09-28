/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import java.util.List;

/**
 *
 * @author 50663
 */
public class Canton {
    
    String nombre;
    List<Distrito> distritos;

    public Canton(String nombre, List<Distrito> distritos) {
        this.nombre = nombre;
        this.distritos = distritos;
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

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", distritos=" + distritos + '}';
    }
    
    
    
    
    
}
