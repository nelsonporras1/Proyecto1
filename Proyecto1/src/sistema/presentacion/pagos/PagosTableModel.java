/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.pagos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistema.logic.Facturas;
import sistema.logic.Mensualidad;
import sistema.logic.Prestamo;

/**
 *
 * @author 50663
 */
public class PagosTableModel extends AbstractTableModel implements TableModel {

    String[] cols ={ "Numero","Fecha", "Monto","Interes","Amortizacion"};
    Prestamo prestamo;
    List<Facturas> facturas;
    
    PagosTableModel(Prestamo prestamo){
       this.prestamo=prestamo;
       this.facturas = prestamo.getListaFacturas();
    }
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
       return facturas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
       Facturas factura= facturas.get(rowIndex);
        
        switch(columnIndex){
            
            case 0: return ""+1;
            case 1: return ""+factura.getFecha();
            case 2: return ""+factura.getMonto();
            case 3: return ""+factura.getMensualidad().getInteres();
            default: return ""+factura.getMensualidad().getAmortizacion();
        }
    }

}
