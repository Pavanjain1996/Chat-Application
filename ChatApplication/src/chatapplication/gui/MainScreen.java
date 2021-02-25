package chatapplication.gui;

import chatapplication.networking.MessageListener;
import chatapplication.networking.MessageTransmitter;
import chatapplication.networking.WritableGUI;

public class MainScreen extends javax.swing.JFrame implements WritableGUI{
    MessageListener listener;
    public MainScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        targetPort = new javax.swing.JTextField();
        targetIP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatComing = new javax.swing.JTextArea();
        chatGoing = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        listenButton = new javax.swing.JButton();
        recievePort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Application");
        setResizable(false);

        targetPort.setBackground(new java.awt.Color(102, 102, 255));
        targetPort.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        targetPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        targetPort.setToolTipText("Target Port Number");

        targetIP.setBackground(new java.awt.Color(102, 102, 255));
        targetIP.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        targetIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        targetIP.setToolTipText("Target IP Address");

        chatComing.setEditable(false);
        chatComing.setBackground(new java.awt.Color(102, 255, 102));
        chatComing.setColumns(20);
        chatComing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chatComing.setRows(5);
        chatComing.setToolTipText("Coming Messages");
        jScrollPane2.setViewportView(chatComing);

        chatGoing.setBackground(new java.awt.Color(102, 255, 102));
        chatGoing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chatGoing.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chatGoing.setToolTipText("Write Message To Send");

        sendButton.setBackground(new java.awt.Color(0, 255, 255));
        sendButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        sendButton.setForeground(new java.awt.Color(0, 0, 204));
        sendButton.setText("Send");
        sendButton.setToolTipText("Send Message");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        listenButton.setBackground(new java.awt.Color(0, 255, 255));
        listenButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        listenButton.setForeground(new java.awt.Color(0, 0, 204));
        listenButton.setText("Listen");
        listenButton.setToolTipText("Listen At Port");
        listenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listenButtonActionPerformed(evt);
            }
        });

        recievePort.setBackground(new java.awt.Color(102, 102, 255));
        recievePort.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        recievePort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recievePort.setToolTipText("Listening Port Number");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Target Port Number");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Target IP Address");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Active Port");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chatGoing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(targetPort)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(targetIP, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(recievePort)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetPort, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetIP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recievePort, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chatGoing)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listenButtonActionPerformed
        listener=new MessageListener(this,Integer.parseInt(recievePort.getText()));
        listener.start();
    }//GEN-LAST:event_listenButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        if(chatGoing.getText()!=null){
            MessageTransmitter transmitter=new MessageTransmitter(chatGoing.getText(),targetIP.getText(),Integer.parseInt(targetPort.getText()));
            transmitter.start();
            String message=chatGoing.getText();
            chatComing.setText(chatComing.getText()+System.lineSeparator()+"You : "+message);
            chatGoing.setText("");
        }
    }//GEN-LAST:event_sendButtonActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatComing;
    private javax.swing.JTextField chatGoing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listenButton;
    private javax.swing.JTextField recievePort;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField targetIP;
    private javax.swing.JTextField targetPort;
    // End of variables declaration//GEN-END:variables
    @Override
    public void write(String s) {
        if(s!=""){
            chatComing.append(System.lineSeparator()+"Other : "+s);
        }
    }
}