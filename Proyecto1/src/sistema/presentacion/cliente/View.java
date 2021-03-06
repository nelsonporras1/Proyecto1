/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.presentacion.cliente;



import java.util.Observable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import sistema.logic.Canton;
import sistema.logic.Cliente;
import sistema.logic.Distrito;
import sistema.logic.Provincia;
import sistema.logic.Service;
/**
 *
 * @author 50663
 */
public class View extends javax.swing.JFrame  implements java.util.Observer{

    /**
     * Creates new form View
     */
    
    Model model;
    Controller controller;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    public View() {
        initComponents();
        cargarMapas();
        cargarBotones();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedulaLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        cedulaTxtField = new javax.swing.JTextField();
        nombreTxtField = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        prvinciaLbl = new javax.swing.JLabel();
        cantonLbl = new javax.swing.JLabel();
        distritoLbl = new javax.swing.JLabel();
        cantonComboBox = new javax.swing.JComboBox<>();
        distritoComboBox = new javax.swing.JComboBox<>();
        prestamosBtn = new javax.swing.JButton();
        mapaLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        provinciaTxtField = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cedulaLbl.setText("Cedula");

        nombreLbl.setText("Nombre");

        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        prvinciaLbl.setText("Provincia");

        cantonLbl.setText("Canton");

        distritoLbl.setText("Distrito");

        cantonComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonComboBoxActionPerformed(evt);
            }
        });

        prestamosBtn.setText("Prestamos");
        prestamosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamosBtnActionPerformed(evt);
            }
        });

        mapaLbl.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        mapaLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mapaLblMouseMoved(evt);
            }
        });
        mapaLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapaLblMouseClicked(evt);
            }
        });

        provinciaTxtField.setEditable(false);

        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mapaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(prestamosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombreLbl)
                                    .addComponent(cedulaLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cedulaTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(nombreTxtField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(prvinciaLbl)
                                        .addGap(98, 98, 98)
                                        .addComponent(cantonLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(provinciaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(cantonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(distritoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(distritoLbl)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedulaLbl)
                    .addComponent(cedulaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distritoLbl))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantonLbl)
                        .addComponent(prvinciaLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distritoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provinciaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mapaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prestamosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mapaLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaLblMouseMoved
       
        if(evt.getX() > 17 && evt.getX() < 89  && evt.getY() > 62 && evt.getY() < 126 ||
          evt.getX() > 90 && evt.getX() < 141  && evt.getY() > 69 && evt.getY() < 100 ||
          evt.getX() > 69 && evt.getX() < 114  && evt.getY() > 46 && evt.getY() < 63 ||
          evt.getX() > 31 && evt.getX() < 69  && evt.getY() > 7 && evt.getY() < 69) {
          mapaLbl.setIcon(mapas[5]);
        } 
        else if(evt.getX() > 75 && evt.getX() < 153  && evt.getY() > 24 && evt.getY() < 46 ||
          evt.getX() > 112 && evt.getX() < 154  && evt.getY() > 47 && evt.getY() < 66 ||
          evt.getX() > 155 && evt.getX() < 208  && evt.getY() > 33 && evt.getY() < 122){
            mapaLbl.setIcon(mapas[2]);
        }
        else if(evt.getX() > 210 && evt.getX() < 252  && evt.getY() > 46 && evt.getY() < 106 ||
          evt.getX() > 210 && evt.getX() < 233  && evt.getY() > 107 && evt.getY() < 121){
            mapaLbl.setIcon(mapas[3]);
        }
        else if(evt.getX() > 254 && evt.getX() < 294  && evt.getY() > 55 && evt.getY() < 118 ||
          evt.getX() > 295 && evt.getX() < 324  && evt.getY() > 97 && evt.getY() < 118 ||
          evt.getX() > 310 && evt.getX() < 358  && evt.getY() > 122 && evt.getY() < 143 ||
          evt.getX() > 299 && evt.getX() < 363  && evt.getY() > 149 && evt.getY() < 184){
            mapaLbl.setIcon(mapas[7]);
        }
         else if(evt.getX() > 89 && evt.getX() < 115  && evt.getY() > 118 && evt.getY() < 152 ||
          evt.getX() > 123 && evt.getX() < 151  && evt.getY() > 92 && evt.getY() < 120 ||
          evt.getX() > 154 && evt.getX() < 162  && evt.getY() > 128 && evt.getY() < 158 ||
          evt.getX() > 183 && evt.getX() < 217  && evt.getY() > 157 && evt.getY() < 170 ||
          evt.getX() > 277 && evt.getX() < 294  && evt.getY() > 205 && evt.getY() < 246 ||
          evt.getX() > 273 && evt.getX() < 311  && evt.getY() > 247 && evt.getY() < 293 ||
          evt.getX() > 297 && evt.getX() < 338  && evt.getY() > 183 && evt.getY() < 233 ||
          evt.getX() > 340 && evt.getX() < 365  && evt.getY() > 203 && evt.getY() < 274){
            mapaLbl.setIcon(mapas[6]);
        }
         else if(evt.getX() > 234 && evt.getX() < 308  && evt.getY() > 122 && evt.getY() < 147 ||
         evt.getX() > 250 && evt.getX() < 296  && evt.getY() > 148 && evt.getY() < 160){
               mapaLbl.setIcon(mapas[4]);
        }
         else if(evt.getX() > 168 && evt.getX() < 230  && evt.getY() > 127 && evt.getY() < 254 ||
         evt.getX() > 224 && evt.getX() < 264  && evt.getY() > 159 && evt.getY() < 176 ||
         evt.getX() > 268 && evt.getX() < 294  && evt.getY() > 162 && evt.getY() < 202){
            mapaLbl.setIcon(mapas[1]);
        }
       
    }//GEN-LAST:event_mapaLblMouseMoved


    
    private void mapaLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaLblMouseClicked
        if(evt.getX() > 17 && evt.getX() < 89  && evt.getY() > 62 && evt.getY() < 126 ||
        evt.getX() > 90 && evt.getX() < 141  && evt.getY() > 69 && evt.getY() < 100 ||
        evt.getX() > 69 && evt.getX() < 114  && evt.getY() > 46 && evt.getY() < 63 ||
        evt.getX() > 31 && evt.getX() < 69  && evt.getY() > 7 && evt.getY() < 69) {
        
        provinciaTxtField.setText(Service.instance().retornaProvincias().get(0).getNombre());
        cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(0).getCantones().toArray()));
        } 
        else if(evt.getX() > 75 && evt.getX() < 153  && evt.getY() > 24 && evt.getY() < 46 ||
          evt.getX() > 112 && evt.getX() < 154  && evt.getY() > 47 && evt.getY() < 66 ||
          evt.getX() > 155 && evt.getX() < 208  && evt.getY() > 33 && evt.getY() < 122){
           
        provinciaTxtField.setText(Service.instance().retornaProvincias().get(1).getNombre());
        cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(1).getCantones().toArray()));
        }
        else if(evt.getX() > 210 && evt.getX() < 252  && evt.getY() > 46 && evt.getY() < 106 ||
          evt.getX() > 210 && evt.getX() < 233  && evt.getY() > 107 && evt.getY() < 121){
            
         provinciaTxtField.setText(Service.instance().retornaProvincias().get(6).getNombre());
         cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(6).getCantones().toArray()));
        }
        else if(evt.getX() > 254 && evt.getX() < 294  && evt.getY() > 55 && evt.getY() < 118 ||
          evt.getX() > 295 && evt.getX() < 324  && evt.getY() > 97 && evt.getY() < 118 ||
          evt.getX() > 310 && evt.getX() < 358  && evt.getY() > 122 && evt.getY() < 143 ||
          evt.getX() > 299 && evt.getX() < 363  && evt.getY() > 149 && evt.getY() < 184){
            
        provinciaTxtField.setText(Service.instance().retornaProvincias().get(4).getNombre());
        cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(4).getCantones().toArray()));
        }
         else if(evt.getX() > 89 && evt.getX() < 115  && evt.getY() > 118 && evt.getY() < 152 ||
          evt.getX() > 123 && evt.getX() < 151  && evt.getY() > 92 && evt.getY() < 120 ||
          evt.getX() > 154 && evt.getX() < 162  && evt.getY() > 128 && evt.getY() < 158 ||
          evt.getX() > 183 && evt.getX() < 217  && evt.getY() > 157 && evt.getY() < 170 ||
          evt.getX() > 277 && evt.getX() < 294  && evt.getY() > 205 && evt.getY() < 246 ||
          evt.getX() > 273 && evt.getX() < 311  && evt.getY() > 247 && evt.getY() < 293 ||
          evt.getX() > 297 && evt.getX() < 338  && evt.getY() > 183 && evt.getY() < 233 ||
          evt.getX() > 340 && evt.getX() < 365  && evt.getY() > 203 && evt.getY() < 274){
            
             provinciaTxtField.setText(Service.instance().retornaProvincias().get(5).getNombre());
        cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(5).getCantones().toArray()));
        }
         else if(evt.getX() > 234 && evt.getX() < 308  && evt.getY() > 122 && evt.getY() < 147 ||
        evt.getX() > 250 && evt.getX() < 296  && evt.getY() > 148 && evt.getY() < 160){
               
        provinciaTxtField.setText(Service.instance().retornaProvincias().get(3).getNombre());
        cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(3).getCantones().toArray()));
        }
         else if(evt.getX() > 168 && evt.getX() < 230  && evt.getY() > 127 && evt.getY() < 254 ||
         evt.getX() > 224 && evt.getX() < 264  && evt.getY() > 159 && evt.getY() < 176 ||
         evt.getX() > 268 && evt.getX() < 294  && evt.getY() > 162 && evt.getY() < 202){
           
        provinciaTxtField.setText(Service.instance().retornaProvincias().get(2).getNombre());
        cantonComboBox.setModel(new DefaultComboBoxModel(Service.instance().retornaProvincias().get(2).getCantones().toArray()));
        }
    }//GEN-LAST:event_mapaLblMouseClicked

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        Provincia provincia= new Provincia();
        try {
            provincia = controller.buscaProvincia(provinciaTxtField.getText());
        } catch (Exception ex) { }
        controller.addCliente(new Cliente(cedulaTxtField.getText(),nombreTxtField.getText()
       ,11111, provincia, (Canton)cantonComboBox.getSelectedItem(), (Distrito)distritoComboBox.getSelectedItem()));
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
       controller.buscarCliente(cedulaTxtField.getText());
       mapaLbl.setIcon(mapas[controller.retornaCliente(cedulaTxtField.getText()).getProvincia()
       .getNumero()]);
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controller.exit();
    }//GEN-LAST:event_formWindowClosed

    private void prestamosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamosBtnActionPerformed
        controller.showPrestamo(cedulaTxtField.getText());
    }//GEN-LAST:event_prestamosBtnActionPerformed

    private void cantonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonComboBoxActionPerformed
        
        Canton canton = (Canton) cantonComboBox.getSelectedItem();
        distritoComboBox.setModel(new DefaultComboBoxModel( canton.getDistritos().toArray()));
    }//GEN-LAST:event_cantonComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JComboBox<String> cantonComboBox;
    private javax.swing.JLabel cantonLbl;
    private javax.swing.JLabel cedulaLbl;
    private javax.swing.JTextField cedulaTxtField;
    private javax.swing.JComboBox<String> distritoComboBox;
    private javax.swing.JLabel distritoLbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mapaLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTxtField;
    private javax.swing.JButton prestamosBtn;
    private javax.swing.JTextField provinciaTxtField;
    private javax.swing.JLabel prvinciaLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
       Cliente cliente = model.getCliente();
       cedulaTxtField.setText(cliente.getCedula());
       nombreTxtField.setText(cliente.getNombre());
       
       provinciaTxtField.setText(cliente.getProvincia().toString());
        
     
       cantonComboBox.setModel(new DefaultComboBoxModel (cliente.getProvincia().getCantones().toArray()));
       cantonComboBox.setSelectedItem(cliente.getCanton());
       
       Canton canton= (Canton)cantonComboBox.getSelectedItem();
       
       if(!cliente.getProvincia().getCantones().isEmpty()){
        distritoComboBox.setModel(new DefaultComboBoxModel(canton.getDistritos().toArray()));
        distritoComboBox.setSelectedItem(cliente.getDistrito());
       }
      
    }
    int cantidad=8;
    ImageIcon[] mapas;
    ImageIcon image;
    ImageIcon imagen;
    
    public void cargarMapas() {
        
        mapas= new ImageIcon[cantidad];
        
        for(int i=0; i< cantidad; i++){
            
            image = new ImageIcon(getClass().getResource("/sistema/provincias/image"+i+".png"));
            
            imagen= new ImageIcon(image.getImage().getScaledInstance(mapaLbl.getWidth(),
                    mapaLbl.getHeight(), java.awt.Image.SCALE_DEFAULT));
            
             mapas[i]= (ImageIcon) imagen;
        }
          mapaLbl.setIcon(mapas[0]);
    }
    
    public void cargarBotones(){
        
        ImageIcon image1 = new ImageIcon(getClass().getResource("/sistema/botones/buscar.jpg"));
        
        ImageIcon buscar = new ImageIcon(image1.getImage().getScaledInstance(buscarBtn.getWidth(),
                                          buscarBtn.getHeight(), java.awt.Image.SCALE_SMOOTH));
        buscarBtn.setIcon(buscar);
        //-----------------------------------------------------------------------------------------
        ImageIcon image2 = new ImageIcon(getClass().getResource("/sistema/botones/guardar.png"));
        
        ImageIcon guardar = new ImageIcon(image2.getImage().getScaledInstance(buscarBtn.getWidth(),
                                          buscarBtn.getHeight(), java.awt.Image.SCALE_SMOOTH));
        guardarBtn.setIcon(guardar);
        //------------------------------------------------------------------------------------------
        ImageIcon image3 = new ImageIcon(getClass().getResource("/sistema/botones/prestamo.png"));
        
        ImageIcon prestamos = new ImageIcon(image3.getImage().getScaledInstance(buscarBtn.getWidth(),
                                          buscarBtn.getHeight(), java.awt.Image.SCALE_SMOOTH));
        prestamosBtn.setIcon(prestamos);
    }
}
