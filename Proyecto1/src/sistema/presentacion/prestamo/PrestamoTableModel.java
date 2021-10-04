/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.prestamo;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistema.logic.Prestamo;
/**
 *
 * @author 50689
 */
public class PrestamoTableModel extends AbstractTableModel implements TableModel {
    String[] cols ={"Mensualidad","Saldo","Interes","Amortizacion" };
    List<Prestamo> rows;

    public  PrestamoTableModel(List<Prestamo> rows){
        this.rows=rows;
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int col){
        return cols[col];
    }

    public int getRowCount() {
        return rows.size();
    }
    
    public Object getValueAt(int row, int col) {
        Prestamo p = rows.get(row);
        switch (col){
            case 0: return p.getMonto();
            case 1:return p.getPlazo();
            case 2:return p.getTasaInteres();
            case 3:return p.llenarMensualidades();
            default: return "";
        }
    }    
}