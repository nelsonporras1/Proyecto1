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
    
      String[] cols ={ "Numero","Monto", "Plazo","Descripcion","Deudor"};
      Cliente cliente;
   
    PrestamoTableModel(Cliente cliente){
        
        this.cliente= cliente;
    }
      
    @Override
    public int getRowCount() {
        return cliente.getPrestamos().size();
    }
    
      @Override
      public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getColumnCount() {
      return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     
        Prestamo prestamo= cliente.getPrestamos().get(rowIndex);
        
        switch(columnIndex){
            
            //  String[] cols ={ "Numero","Monto", "Plazo","Descripcion","Deudor"};
            case 0: return ""+prestamo.getNumber();
            case 1: return ""+prestamo.getMonto();
            case 2: return ""+prestamo.getPlazo();
            case 3: return prestamo.getDescripcion();
            case 4: return cliente.getNombre();
            default: return "";
        }
    }
    
}
