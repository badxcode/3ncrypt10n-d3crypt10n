package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 * @author zah1dz
 */
public class ImageEncryptionDecryption extends javax.swing.JFrame {

    public ImageEncryptionDecryption() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        openImageButton = new javax.swing.JButton();
        imageNameTextField = new javax.swing.JTextField();
        keyTextField = new javax.swing.JTextField();
        keyLabel = new javax.swing.JLabel();
        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Encrypt/Decrypt");

        headingLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        headingLabel.setText("Image Encryption/Decryption");

        openImageButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        openImageButton.setText("Open Image");
        openImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImageButtonActionPerformed(evt);
            }
        });

        imageNameTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        keyTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        keyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTextFieldActionPerformed(evt);
            }
        });

        keyLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        keyLabel.setText("Key:");

        encryptButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        decryptButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        goBackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(headingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Separator)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(goBackButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openImageButton)
                    .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(decryptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(encryptButton)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(imageNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String fileName = null;
    File selectedImage = null;
    int key;
    
    public void imageEncryptionDecryption() {
        
        try {
            
            FileInputStream fis = new FileInputStream(selectedImage);
            byte []data = new byte[fis.available()];
            fis.read(data);
            
            // encryption using xor
            int i = 0;
            for(byte b: data) {
                //System.out.println(b);
                data[i] = (byte)(b^key);
                i++;
                //System.out.println();
                //System.out.println(b);
            }
            
            //writing encrypted byte to file
            FileOutputStream fos = new FileOutputStream(selectedImage);
            fos.write(data);
            
            //closing files
            fos.close();
            fis.close();
            
            JOptionPane.showMessageDialog(null, "Successfully completed the task");
        }
        catch(Exception e) {
            
            e.printStackTrace();
        }
        
    }
    public void imageEncryptDecrypt() throws NoSuchAlgorithmException, NoSuchPaddingException {
        try {
            Cipher cipher = Cipher.getInstance("DES");
            KeyGenerator keyg = KeyGenerator.getInstance("DES");
            Key k = keyg.generateKey();
            
            cipher.init(Cipher.ENCRYPT_MODE, k);
            
            FileInputStream FISE = new FileInputStream(selectedImage);
            CipherInputStream ciptI = new CipherInputStream(FISE, cipher);
            FileOutputStream fileE = new FileOutputStream(selectedImage.getParent()+"/encrypted_"+fileName);
            
            int i;
            while((i = ciptI.read()) != -1) {
                fileE.write(i);
            }
            
            cipher.init(Cipher.DECRYPT_MODE, k);
            FileInputStream FISD = new FileInputStream(selectedImage);
            CipherInputStream ciptD = new CipherInputStream(FISD, cipher);
            FileOutputStream fileD = new FileOutputStream(selectedImage.getParent()+"/decrypted_"+fileName);
            
            int j;
            while((j = ciptD.read()) != -1) {
                fileD.write(j);
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    private void openImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        selectedImage = chooser.getSelectedFile();
        
        fileName = selectedImage.getName();
        imageNameTextField.setText(fileName);
        
    }//GEN-LAST:event_openImageButtonActionPerformed

    private void keyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_keyTextFieldActionPerformed

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        // TODO add your handling code here:
        
        if(keyTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, provide a key");
        }
        if(selectedImage == null) {
            JOptionPane.showMessageDialog(null, "Please, select an image");
        }
        if(!keyTextField.getText().isEmpty() && selectedImage != null) {
            key = Integer.parseInt(keyTextField.getText());
            imageEncryptionDecryption();
            
//            try {
//                imageEncryptDecrypt();
//            } catch (NoSuchAlgorithmException ex) {
//                Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (NoSuchPaddingException ex) {
//                Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        // TODO add your handling code here:
        if(keyTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a key");
        }
        if(selectedImage == null) {
            JOptionPane.showMessageDialog(null, "Please select an image");
        }
        if(!keyTextField.getText().isEmpty() && selectedImage != null) {
            key = Integer.parseInt(keyTextField.getText());
             imageEncryptionDecryption();
             
//            try {
//                imageEncryptDecrypt();
//            } catch (NoSuchAlgorithmException ex) {
//                Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (NoSuchPaddingException ex) {
//                Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        fileName = null;
        key = 0;
        selectedImage = null;
        
        keyTextField.setText(null);
        imageNameTextField.setText(null);
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        EncryptionDecryption ed = new EncryptionDecryption();
        ed.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageEncryptionDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageEncryptionDecryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JTextField imageNameTextField;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JTextField keyTextField;
    private javax.swing.JButton openImageButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
