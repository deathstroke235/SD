/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SAFI UDDIN
 */
import java.io.*;
import java.util.*;
import org.apache.commons.net.ftp.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
public class ftpclient extends javax.swing.JFrame {

    /**
     * Creates new form ftpclient
     */
    public ftpclient() {
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

        jLabel1 = new javax.swing.JLabel();
        IP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        list = new javax.swing.JButton();
        connect = new javax.swing.JButton();
        download = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ip");

        jLabel2.setText("user name");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        list.setText("List");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        connect.setText("connect");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        download.setText("Download");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        jLabel3.setText("password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(download)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(list)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IP)
                                    .addComponent(uname, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(connect)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(connect)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(download)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ItemStateChanged

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        // TODO add your handling code here:
        try{
                    String ip = IP.getText();
            FTPClient ftpc = new FTPClient();
            message.append("Establishing connection to the server [" + ip + "]...\n");
            ftpc.connect(ip);
            int reply = ftpc.getReplyCode();
            if(FTPReply.isPositiveCompletion(reply)){
                message.append("Connection Established \n" + reply + "\n");
                String username = uname.getText();
                String pass = password.getText();
                if(ftpc.login(username, pass))
                    message.append("Successfully login \n");
                else
                    message.append("couldn't login \n");
            }else{
                message.append("Error while establishing Connection");
            }
            ftpc.disconnect();
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_connectActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        // TODO add your handling code here:
        try{
            String ip = IP.getText();
            FTPClient ftpc = new FTPClient();
            message.append("Establishing connection to the server [" + ip + "]...\n");
            ftpc.connect(ip);
            int reply = ftpc.getReplyCode();
            if(FTPReply.isPositiveCompletion(reply)){
                message.append("Connection Established \n" + reply + "\n");
                String username = uname.getText();
                String pass = password.getText();
                if(ftpc.login(username, pass)){
                    message.append("Successfully login \n");
                    String pdir = ftpc.printWorkingDirectory();
                    message.append("Working Directory is :" + pdir + "\n");
                    FTPFile ftpf[] = ftpc.listFiles();
//                    cb1.removeAllItems();
                    for(int i=0; i<ftpf.length; i++){
                        cb1.addItem(ftpf[i].getName());
                    }
                }
                else
                    message.append("couldn't login \n");
            }else{
                message.append("Error while establishing Connection");
            }
            ftpc.disconnect();
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_listActionPerformed

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        // TODO add your handling code here:
        try{
            String ip = IP.getText();
            FTPClient ftpc = new FTPClient();
            message.append("Establishing connection to the server [" + ip + "]...\n");
            ftpc.connect(ip);
            int reply = ftpc.getReplyCode();
            if(FTPReply.isPositiveCompletion(reply)){
                message.append("Connection Established \n" + reply + "\n");
                String username = uname.getText();
                String pass = password.getText();
                if(ftpc.login(username, pass)){
                    message.setEnabled(false);
                    uname.setEnabled(false);
                    password.setEnabled(false);
                    String selectedFile = cb1.getSelectedItem().toString();
                    File dFile = new File(selectedFile);
                    OutputStream os = new BufferedOutputStream(new FileOutputStream(dFile));
                    boolean success = ftpc.retrieveFile(selectedFile, os);
                    os.close();
                    if(success){
                        message.append("Successfully downloaded file: "+ selectedFile + " path is "+ dFile.getAbsolutePath() + "\n");
                    }else{
                        message.append("couldn't download " + selectedFile + " \n");
                    }
                }
                else
                    message.append("couldn't login \n");
            }else{
                message.append("Error while establishing Connection");
            }
            ftpc.disconnect();
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_downloadActionPerformed

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
            java.util.logging.Logger.getLogger(ftpclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ftpclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ftpclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ftpclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ftpclient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IP;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton connect;
    private javax.swing.JButton download;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton list;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField password;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
