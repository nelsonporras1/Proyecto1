/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.logic;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.*;
import java.util.List;




public class PDF{
  public static final String DEST = "CLIENTES.pdf";
  public static final String DEST2 = "CLIENTES_PRESTAMOS.pdf";
 // public static void main(String args[]) throws IOException {
 //   createPdf3(DEST);
 // }

public static void createPdf3( String dest, List<Cliente> lista) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4.rotate());
        document.setMargins(20, 20, 20, 20);

        ImageData data = ImageDataFactory.create("logo.png");        
        Image img = new Image(data); 
        document.add(img);
        
        document.add(new Paragraph(""));
        document.add(new Paragraph("CLIENTES PRESTAMOS PERSONALES S.A").setFont(font).setBold().setFontSize(20f));

        Table table = new Table(10);
        Cell c; 
        Color bkg = ColorConstants.BLUE;
        Color frg= ColorConstants.WHITE;
        c= new Cell(); c.add(new Paragraph("Cedula")).setBackgroundColor(bkg).setFontColor(frg); 
        table.addHeaderCell(c);
        c= new Cell(); c.add(new Paragraph("Nombre")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);     
        c= new Cell(); c.add(new Paragraph("Provincia")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Canton")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Distrito")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);                    
        
        for(int i=0; i <  lista.size(); i++){
            
            table.addCell(lista.get(i).getCedula());
            table.addCell(lista.get(i).getNombre());
            table.addCell(lista.get(i).getProvincia().getNombre());
            table.addCell(lista.get(i).getCanton().getNombre());
            table.addCell(lista.get(i).getDistrito().getNombre());
           table.startNewRow();
        }
         
        document.add(table);
        document.close();
    }

public static void createPdf2( String dest2, List<Prestamo> lista) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter(dest2);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf, PageSize.A4.rotate());
        document.setMargins(20, 20, 20, 20);

        ImageData data = ImageDataFactory.create("logo.png");        
        Image img = new Image(data); 
        document.add(img);
        
        document.add(new Paragraph(""));
        document.add(new Paragraph("PRESTAMOS PERSONALES S.A").setFont(font).setBold().setFontSize(20f));

        Table table = new Table(10);
        Cell c; 
        Color bkg = ColorConstants.RED;
        Color frg= ColorConstants.WHITE;
        c= new Cell(); c.add(new Paragraph("Numero")).setBackgroundColor(bkg).setFontColor(frg); 
        table.addHeaderCell(c);
        c= new Cell(); c.add(new Paragraph("Monto")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);     
        c= new Cell(); c.add(new Paragraph("Descripcion")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("Plazo")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c); 
        c= new Cell(); c.add(new Paragraph("TasaInteres")).setBackgroundColor(bkg).setFontColor(frg);
        table.addHeaderCell(c);                    
        
        for(int i=0; i <  lista.size(); i++){
            
            table.addCell(String.valueOf(lista.get(i).getNumber()));
            table.addCell(String.valueOf(lista.get(i).getMonto()));
            table.addCell(lista.get(i).getDescripcion());
            table.addCell(String.valueOf(lista.get(i).getPlazo()));
            table.addCell(String.valueOf(lista.get(i).getTasaInteres()));
           table.startNewRow();
           
    
        }
        
           
        document.add(table);
        document.close();
    }




}


