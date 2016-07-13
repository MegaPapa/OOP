/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import Serialize.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class main extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form main
     */
    int i = 1;
   
    ArrayList products = new ArrayList();
    private HashMap<String, Class<? extends smokingFacility>> selectedProduct;
    
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        SerializeButton = new javax.swing.JButton();
        ObjCombotext = new javax.swing.JComboBox<>();
        STypeCombotext = new javax.swing.JComboBox<>();
        DSerializeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        list = new java.awt.List();
        factory = new javax.swing.JTextField();
        material = new javax.swing.JTextField();
        nicotine = new javax.swing.JTextField();
        filter = new javax.swing.JTextField();
        tar = new javax.swing.JTextField();
        arom = new javax.swing.JTextField();
        labelFactory = new javax.swing.JLabel();
        labelMaterial = new javax.swing.JLabel();
        labelNicotine = new javax.swing.JLabel();
        labelTar = new javax.swing.JLabel();
        labelFilter = new javax.swing.JLabel();
        labelArom = new javax.swing.JLabel();
        fatness = new javax.swing.JTextField();
        evoparatorType = new javax.swing.JTextField();
        labelFatness = new javax.swing.JLabel();
        labelEvoparatorType = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        index = new javax.swing.JTextField();
        labelIndex = new javax.swing.JLabel();
        redctButton = new javax.swing.JButton();
        packerComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SerializeButton.setText("Serialize");
        SerializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerializeButtonActionPerformed(evt);
            }
        });

        ObjCombotext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pipe", "Cigar", "Cigarette", "e.Cigarette", "tobacco Product" }));
        ObjCombotext.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ObjCombotextItemStateChanged(evt);
            }
        });
        ObjCombotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjCombotextActionPerformed(evt);
            }
        });

        STypeCombotext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Text", "Binary", "XML" }));

        DSerializeButton.setText("Deserialize");
        DSerializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSerializeButtonActionPerformed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        labelFactory.setText("factory:");

        labelMaterial.setText("material:");

        labelNicotine.setText("nicotine");

        labelTar.setText("tar:");

        labelFilter.setText("filter:");

        labelArom.setText("arom:");

        labelFatness.setText("fatness:");

        labelEvoparatorType.setText("evoparater:");

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        labelIndex.setText("index:");

        redctButton.setText("RED");
        redctButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redctButtonActionPerformed(evt);
            }
        });

        packerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GZip", "Zip" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fatness, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(material, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DSerializeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(SerializeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(factory, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEvoparatorType)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nicotine, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelNicotine)
                                            .addComponent(labelTar)
                                            .addComponent(evoparatorType, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(arom, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelArom)
                                                    .addComponent(labelFilter)
                                                    .addComponent(labelIndex))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(packerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(STypeCombotext, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFatness)
                            .addComponent(labelMaterial)
                            .addComponent(labelFactory))
                        .addGap(0, 440, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObjCombotext, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(redctButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ObjCombotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(SerializeButton)
                        .addGap(18, 18, 18)
                        .addComponent(DSerializeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFactory)
                        .addComponent(labelNicotine))
                    .addComponent(labelFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nicotine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaterial)
                    .addComponent(labelTar)
                    .addComponent(labelArom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFatness)
                    .addComponent(labelEvoparatorType)
                    .addComponent(labelIndex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evoparatorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STypeCombotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(redctButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private Serializer getSerializer() {
        Serializer serializer;

        switch (String.valueOf(STypeCombotext.getSelectedItem())) {
            case "Binary":
                serializer = BinarySerializer.getInstance();
                break;
            case "XML":
                serializer = XMLSerializer.getInstance();
                break;
            case "Text":
                serializer = TextSerializer.getInstance();
                break;
            default:
                serializer = BinarySerializer.getInstance();
        }
        return serializer;
    }
    
    
    private void SerializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerializeButtonActionPerformed
       /*
        smokingFacility tmpProduct;
        for (int i = 0; i < products.size();i++){
            tmpProduct = (smokingFacility)products.get(i);
            tmpProduct.getInfo();
        }*/
       
       BufferedOutputStream out = null;
       try{
         /*  HashMap<String, Class<Packer>> selectedPack = null;
        
            selectedPack.put("GZip", (Class<Packer>)Class.forName("oop.GzipPacker"));
        
            selectedPack.put("Zip", (Class<Packer>)Class.forName("oop.ZipPacker"));
        
       
       Class<Packer> productTmp = selectedPack.get((String)packerComboBox.getSelectedItem());
        
       Packer packer = productTmp.newInstance();
        
       
       FileChooser fileChooser = new FileChooser();
       

       File tmpFile = fileChooser.showSaveDialog(null);
       File file = new File(tmpFile.getParent(), tmpFile.getName() + packer.getExtension());
       file.renameTo(tmpFile);*/
           
           out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\PC\\Desktop\\SerXML.xml"));
           Serializer serializator = getSerializer();
           serializator.serialize(products,out);
           JOptionPane.showMessageDialog(null, "Serialization is complete!");
        
       }
       catch (Exception e) {System.out.println(e);}
       finally{
           try{
              if (out != null)
                out.close();
           }
           catch (IOException e) {System.out.println(e);}
       }
    }//GEN-LAST:event_SerializeButtonActionPerformed

    private void ObjCombotextItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ObjCombotextItemStateChanged
        //System.out.println("lol");
    }//GEN-LAST:event_ObjCombotextItemStateChanged

    private void selectProduct() throws Exception {
        
        selectedProduct = new HashMap<>();
        selectedProduct.put("Pipe", pipe.class);
        selectedProduct.put("Cigar", cigar.class);
        selectedProduct.put("Cigarette", (Class<smokingFacility>)Class.forName("oop.cigarette"));
        selectedProduct.put("e.Cigarette", (Class<smokingFacility>)Class.forName("oop.electronicCigarette"));
        selectedProduct.put("tobacco Product", (Class<smokingFacility>)Class.forName("oop.tobaccoProduct"));
        
        Class<? extends smokingFacility> productTmp = selectedProduct.get((String)ObjCombotext.getSelectedItem());
        smokingFacility product = productTmp.newInstance();
        
        if (product instanceof oop.cigarette ){
           
            product.setInfo(filter.getText(),arom.getText(),factory.getText());
            product.setInfo(Integer.parseInt(nicotine.getText()),Integer.parseInt(tar.getText()),
                            Integer.parseInt(fatness.getText()));
            list.add("Cigarette : " + filter.getText() + " " + arom.getText() + " " + factory.getText());
            System.out.println("Cigarette added to arraylist");
            products.add(product);
            return;
        }
        
        if (product instanceof oop.pipe ){
           
            product.setInfo(material.getText(),factory.getText());
            product.setInfo(Integer.parseInt(nicotine.getText()),Integer.parseInt(tar.getText()));
            list.add("Pipe : " + material.getText() + " " + factory.getText());
            System.out.println("Pipe added to arraylist");
            products.add(product);
            return;
        }
        
        if (product instanceof oop.cigar ){
            
            product.setInfo(Integer.parseInt(nicotine.getText()),Integer.parseInt(tar.getText()),
                            Integer.parseInt(fatness.getText()));
            list.add("Cigar : " + fatness.getText() + " " + factory.getText());
            System.out.println("Cigar added to arraylist");
            products.add(product);
            return;
        }
        
        if (product instanceof oop.tobaccoProduct ){
            
            product.setInfo(Integer.parseInt(nicotine.getText()),Integer.parseInt(tar.getText()));
            list.add("Tobacco product : " + nicotine.getText() + " " + tar.getText());
            System.out.println("Tobacco product added to arraylist");
            products.add(product);
            return;
        }
        
        if (product instanceof oop.electronicCigarette ){
            
            product.setInfo(evoparatorType.getText(),factory.getText());
            list.add("e.Cigarette : " + evoparatorType.getText() + " " + factory.getText());
            System.out.println("e.Cigarette added to arraylist");
            products.add(product);
            //objName{field1:value;fieldObj:value1-value2}/r/n
            return;
        }
        
        
        
        
       
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try{
            selectProduct();
        }
        catch (Exception e) {System.out.println(e);}
        /*smokingFacility product = selectProduct();
       
       System.out.println(product.fabricator);*/
    }//GEN-LAST:event_addButtonActionPerformed

    
    private void ObjCombotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjCombotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObjCombotextActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String deletedItem = list.getSelectedItem();
        int deletedItemID = list.getSelectedIndex();
        products.remove(deletedItemID);
        list.remove(deletedItemID);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void redctButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redctButtonActionPerformed
        try{
            String editingItem = list.getSelectedItem();
            int editingItemID = list.getSelectedIndex();
            list.remove(editingItemID);
            products.remove(editingItemID);
            selectProduct();
        }
        catch (Exception e) {System.out.println(e);}
        //products.add(i);
        //products.set(editingItemID, );
    }//GEN-LAST:event_redctButtonActionPerformed

    private void printArrayList() {
        smokingFacility tmpProduct;
        for (int i = 0; i < products.size();i++){
            tmpProduct = (smokingFacility)products.get(i);
            list.add(tmpProduct.getInfo());
            //tmpProduct.getInfo();
        }
    }
    
    private void DSerializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSerializeButtonActionPerformed
        try{
           list.removeAll();
           products.clear();
           BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\PC\\Desktop\\SerXML.xml"));
           Serializer serializator = getSerializer();
           products = (ArrayList)serializator.deserialize(in);
           JOptionPane.showMessageDialog(null, "Deserialization is complete!");
           printArrayList();
       }
       catch (Exception e) {System.out.println(e);}
        
        
    }//GEN-LAST:event_DSerializeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DSerializeButton;
    private javax.swing.JComboBox<String> ObjCombotext;
    private javax.swing.JComboBox<String> STypeCombotext;
    private javax.swing.JButton SerializeButton;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField arom;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField evoparatorType;
    private javax.swing.JTextField factory;
    private javax.swing.JTextField fatness;
    private javax.swing.JTextField filter;
    private javax.swing.JTextField index;
    private javax.swing.JLabel labelArom;
    private javax.swing.JLabel labelEvoparatorType;
    private javax.swing.JLabel labelFactory;
    private javax.swing.JLabel labelFatness;
    private javax.swing.JLabel labelFilter;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JLabel labelMaterial;
    private javax.swing.JLabel labelNicotine;
    private javax.swing.JLabel labelTar;
    private java.awt.List list;
    private javax.swing.JTextField material;
    private javax.swing.JTextField nicotine;
    private javax.swing.JComboBox<String> packerComboBox;
    private javax.swing.JButton redctButton;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField tar;
    // End of variables declaration//GEN-END:variables
}