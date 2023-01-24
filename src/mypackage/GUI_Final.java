/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage;

import java.awt.Color;
import javax.swing.JButton;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author JUSTINE
 */
public class GUI_Final extends javax.swing.JFrame {

    public GUI_Final() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        bgPanel = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        QueueBtnMenu = new javax.swing.JButton();
        LinkedListBtnMenu = new javax.swing.JButton();
        stackBtnMenu = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        panelContainer = new javax.swing.JTabbedPane();
        panelStack = new javax.swing.JPanel();
        topIndex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        stackSizeSetBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        stackSizeInput = new javax.swing.JTextField();
        stackError = new javax.swing.JLabel();
        panelQueue = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        panelLinked = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setToolTipText("");
        kGradientPanel1.setEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setStartColor(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Select from Menu");
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 150, 40);

        QueueBtnMenu.setBackground(new java.awt.Color(0, 153, 153));
        QueueBtnMenu.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        QueueBtnMenu.setForeground(new java.awt.Color(255, 255, 255));
        QueueBtnMenu.setText("QUEUE");
        QueueBtnMenu.setBorder(null);
        QueueBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueueBtnMenuActionPerformed(evt);
            }
        });
        kGradientPanel1.add(QueueBtnMenu);
        QueueBtnMenu.setBounds(0, 220, 200, 60);

        LinkedListBtnMenu.setBackground(new java.awt.Color(0, 153, 153));
        LinkedListBtnMenu.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        LinkedListBtnMenu.setForeground(new java.awt.Color(255, 255, 255));
        LinkedListBtnMenu.setText("LINKED LIST");
        LinkedListBtnMenu.setBorder(null);
        LinkedListBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkedListBtnMenuActionPerformed(evt);
            }
        });
        kGradientPanel1.add(LinkedListBtnMenu);
        LinkedListBtnMenu.setBounds(0, 290, 200, 60);

        stackBtnMenu.setBackground(new java.awt.Color(0, 0, 255));
        stackBtnMenu.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        stackBtnMenu.setForeground(new java.awt.Color(255, 255, 255));
        stackBtnMenu.setText("STACK");
        stackBtnMenu.setBorder(null);
        stackBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackBtnMenuActionPerformed(evt);
            }
        });
        kGradientPanel1.add(stackBtnMenu);
        stackBtnMenu.setBounds(0, 150, 200, 60);

        kGradientPanel2.setEndColor(new java.awt.Color(153, 153, 153));
        kGradientPanel2.setStartColor(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setText("Welcome To Graphical User Interface of Group 7");
        kGradientPanel2.add(jLabel4);
        jLabel4.setBounds(40, 20, 570, 40);

        kGradientPanel1.add(kGradientPanel2);
        kGradientPanel2.setBounds(0, 0, 790, 70);

        panelContainer.setToolTipText("");

        panelStack.setBackground(new java.awt.Color(255, 255, 255));
        panelStack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topIndex.setEnabled(false);
        topIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topIndexActionPerformed(evt);
            }
        });
        panelStack.add(topIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 50, 30));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setText("Enter the size of the Stack");
        panelStack.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelStack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 200));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Result");
        panelStack.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 40, -1));

        stackSizeSetBtn.setBackground(new java.awt.Color(0, 51, 255));
        stackSizeSetBtn.setForeground(new java.awt.Color(255, 255, 255));
        stackSizeSetBtn.setText("SET");
        stackSizeSetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackSizeSetBtnActionPerformed(evt);
            }
        });
        panelStack.add(stackSizeSetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 60, 30));

        jButton5.setBackground(new java.awt.Color(51, 153, 0));
        jButton5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PUSH");
        panelStack.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, 50));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("RESET");
        panelStack.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 110, 50));

        jButton7.setBackground(new java.awt.Color(255, 204, 0));
        jButton7.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton7.setText("CLEAR");
        panelStack.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 50));

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("POP");
        panelStack.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 50));

        jLabel7.setText("Top Index:");
        panelStack.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 60, -1));

        stackSizeInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stackSizeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackSizeInputActionPerformed(evt);
            }
        });
        stackSizeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stackSizeInputKeyPressed(evt);
            }
        });
        panelStack.add(stackSizeInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 130, 30));

        stackError.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        stackError.setText("Error message: ");
        panelStack.add(stackError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        panelContainer.addTab("", panelStack);
        panelStack.getAccessibleContext().setAccessibleName("tab1");

        panelQueue.setBackground(new java.awt.Color(255, 255, 255));
        panelQueue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setText("Error Message: ");
        panelQueue.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 204, 204));
        jTextField1.setEnabled(false);
        panelQueue.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 40, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        panelQueue.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 260, 230));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("DEQUEUE AT BACK");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 160, 30));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setText("Enter prefered size");
        panelQueue.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 70, 30));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setText("CLEAR");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 80, 50));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("RESET");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 80, 50));

        jButton10.setBackground(new java.awt.Color(0, 204, 0));
        jButton10.setText("ENQUEUE AT FRONT");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 30));

        jButton11.setBackground(new java.awt.Color(0, 255, 255));
        jButton11.setText("ENQUEUE AT BACK");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 160, 30));

        jButton12.setBackground(new java.awt.Color(255, 0, 0));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("DEQUEUE AT FRONT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 160, 30));

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setText("DEQUEUE AT FRONT");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panelQueue.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 30));

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setText("Rear index");
        panelQueue.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel12.setText("Result");
        panelQueue.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel13.setText("data");
        panelQueue.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jTextField3.setBackground(new java.awt.Color(0, 204, 204));
        panelQueue.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, 30));

        jTextField4.setBackground(new java.awt.Color(0, 204, 204));
        jTextField4.setEnabled(false);
        panelQueue.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 40, 20));

        jLabel14.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel14.setText("Front index");
        panelQueue.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel15.setText("data");
        panelQueue.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jTextField5.setBackground(new java.awt.Color(0, 204, 204));
        jTextField5.setEnabled(false);
        panelQueue.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 40, 20));

        jTextField6.setBackground(new java.awt.Color(0, 204, 204));
        jTextField6.setEnabled(false);
        panelQueue.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 40, 20));

        panelContainer.addTab("", panelQueue);

        panelLinked.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Error message");
        panelLinked.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, -1));
        panelLinked.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, 30));

        jButton15.setBackground(new java.awt.Color(0, 51, 255));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Generate Randomly");
        panelLinked.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 140, 30));

        jButton16.setBackground(new java.awt.Color(255, 0, 51));
        jButton16.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("RESET");
        panelLinked.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 110, 40));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        panelLinked.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 220));

        jLabel16.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel16.setText("Enter prefered number of nodes");
        panelLinked.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 260, -1));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel17.setText("Search");
        panelLinked.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, -1));

        jButton17.setBackground(new java.awt.Color(0, 204, 204));
        jButton17.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton17.setText("SEARCH");
        panelLinked.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 40));

        jButton18.setBackground(new java.awt.Color(51, 204, 0));
        jButton18.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton18.setText("Insert At Beginning");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        panelLinked.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 40));

        jButton19.setBackground(new java.awt.Color(0, 204, 204));
        jButton19.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton19.setText("Remove a Node");
        panelLinked.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 40));

        jButton20.setBackground(new java.awt.Color(0, 153, 255));
        jButton20.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton20.setText("Insert At End");
        panelLinked.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 40));

        jButton21.setBackground(new java.awt.Color(0, 204, 204));
        jButton21.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton21.setText("Insert After");
        panelLinked.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 230, 40));

        jButton22.setBackground(new java.awt.Color(0, 204, 204));
        jButton22.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton22.setText("Remove At Beginning");
        panelLinked.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, 40));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel18.setText("Result");
        panelLinked.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 60, -1));
        panelLinked.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 10, 80, 30));

        jLabel19.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel19.setText("Preffered node to insert/delete");
        panelLinked.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 250, -1));
        panelLinked.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 80, 30));

        jLabel20.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel20.setText("Minimum");
        panelLinked.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, -1));
        panelLinked.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, 30));

        jLabel21.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel21.setText("Maximum");
        panelLinked.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 80, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        panelLinked.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 80, 30));

        jButton23.setBackground(new java.awt.Color(0, 51, 255));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Generate");
        panelLinked.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 100, 30));

        panelContainer.addTab("", panelLinked);

        kGradientPanel1.add(panelContainer);
        panelContainer.setBounds(200, 40, 580, 460);
        panelContainer.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Color activeColor = new Color(0,0,255);
    Color color = new Color(0,153,153);
    
    public void setActiveButton(JButton btn1, JButton btn2, JButton btn3) {
        btn1.setBackground(activeColor);
        btn2.setBackground(color);
        btn3.setBackground(color);
    }
    
    private void QueueBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueueBtnMenuActionPerformed
        // TODO add your handling code here:
        panelContainer.setSelectedIndex(1);
        setActiveButton(QueueBtnMenu, LinkedListBtnMenu, stackBtnMenu);
    }//GEN-LAST:event_QueueBtnMenuActionPerformed

    
    private void LinkedListBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkedListBtnMenuActionPerformed
        // TODO add your handling code here:
        panelContainer.setSelectedIndex(2);
        setActiveButton(LinkedListBtnMenu, stackBtnMenu, QueueBtnMenu);
    }//GEN-LAST:event_LinkedListBtnMenuActionPerformed

    private void stackBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackBtnMenuActionPerformed
        // TODO add your handling code here:
        panelContainer.setSelectedIndex(0);
        setActiveButton(stackBtnMenu, LinkedListBtnMenu, QueueBtnMenu);
    }//GEN-LAST:event_stackBtnMenuActionPerformed

    
    private void topIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topIndexActionPerformed

    private void stackSizeSetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackSizeSetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stackSizeSetBtnActionPerformed

    private void stackSizeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackSizeInputActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_stackSizeInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void stackSizeInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stackSizeInputKeyPressed
        // TODO add your handling code here:
        String value = stackSizeInput.getText();
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            stackSizeInput.setEditable(true);
            stackError.setText("");
        }else{
            stackSizeInput.setEditable(false);
            stackError.setForeground(Color.red);
            stackError.setText("Enter Only digit from 0-9");
        }
    }//GEN-LAST:event_stackSizeInputKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LinkedListBtnMenu;
    private javax.swing.JButton QueueBtnMenu;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTabbedPane panelContainer;
    private javax.swing.JPanel panelLinked;
    private javax.swing.JPanel panelQueue;
    private javax.swing.JPanel panelStack;
    private javax.swing.JButton stackBtnMenu;
    private javax.swing.JLabel stackError;
    private javax.swing.JTextField stackSizeInput;
    private javax.swing.JButton stackSizeSetBtn;
    private javax.swing.JTextField topIndex;
    // End of variables declaration//GEN-END:variables

}
