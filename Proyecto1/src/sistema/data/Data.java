/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import sistema.logic.Canton;
import sistema.logic.Cliente;
import sistema.logic.Distrito;
import sistema.logic.Facturas;
import sistema.logic.Prestamo;
import sistema.logic.Provincia;

/**
 *
 * @author 50663
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    
    private List<Cliente> clientes;
    private List<Provincia> provincias;
    private List<Canton> cantones;
    private List<Distrito> distritos;
    private List<Prestamo> prestamos;
    private List<Facturas> facturas;
   
    public Data(){
        
         clientes = new ArrayList<>();
         provincias= new ArrayList<>();
         cantones= new ArrayList<>();
         distritos= new ArrayList<>();
         facturas= new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Facturas> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Facturas> facturas) {
        this.facturas = facturas;
    }
 
    
    
}
