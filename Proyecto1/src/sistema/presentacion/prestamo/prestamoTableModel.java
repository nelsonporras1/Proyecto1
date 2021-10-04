/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.prestamo;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistema.logic.Cliente;
import sistema.logic.Prestamo;

/**
 *
 * @author 50663
 */
public class PrestamoTableModel extends AbstractTableModel implements TableModel {
    
      String[] cols ={ "Numero","Descripcion","Deudor"};
      Cliente cliente;
      List<Prestamo> prestamos;
   
    PrestamoTableModel(Cliente cliente){
        
        this.cliente = cliente;
    }
      
    @Override
    public int getRowCount() {
        return cliente.getPrestamos().size();
    }
    
      public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getColumnCount() {
      return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     
        Prestamo prestamo= prestamos.get(rowIndex);
        
        switch(columnIndex){
            
            case 0: return ""+prestamo.getNumber();
            case 1: return prestamo.getDescripcion();
            case 2: return "";
            
            default: return "";
        }
    }
    
}
