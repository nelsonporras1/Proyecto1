/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.text.Document;

/**
 *
 * @author 50663
 */

/*
public class PDF {

    public PDF() {}
    
    public static void crearPDF( List<Cliente> lista) throws IOException, DocumentException {
    
    
        Document document = new Document();
        
        FileOutputStream clientePDF= new FileOutputStream("Clientes.pdf");
        PdfWriter.getInstance(document, clientePDF);
        
        document.open();
        
        Paragraph titulo = new Paragraph("Lista de clientes \n\n", 
                           FontFactory.getFont("arial", 22, Font.BOLD,BaseColor.BLUE));
        
        document.add(titulo);
        
        PdfPTable tabla = new PdfPTable(lista.size());
        
        tabla.addCell("ID");
        tabla.addCell("Nombre");
        tabla.addCell("Provincia");
        tabla.addCell("Canton");
        tabla.addCell("Distrito");
        
        for(int i=0; i <  lista.size(); i++){
            
            tabla.addCell(lista.get(i).getCedula());
            tabla.addCell(lista.get(i).getNombre());
            tabla.addCell(lista.get(i).getProvincia().getNombre());
            tabla.addCell(lista.get(i).getCanton().getNombre());
            tabla.addCell(lista.get(i).getDistrito().getNombre());
        }
        
        document.add(tabla);
        
        document.close();
    
    
}

*/