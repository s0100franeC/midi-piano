/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaMidiPiano;

import sun.audio.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HIG24
 */
public class javaMidiPiano extends javax.swing.JFrame {

    /**
     * Creates new form javaMidiPiano
     */
    public javaMidiPiano() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbcis = new javax.swing.JButton();
        jbc = new javax.swing.JButton();
        jbdis = new javax.swing.JButton();
        jbe = new javax.swing.JButton();
        jbd = new javax.swing.JButton();
        jbfis = new javax.swing.JButton();
        jbf = new javax.swing.JButton();
        jbgis = new javax.swing.JButton();
        jbg = new javax.swing.JButton();
        jbais = new javax.swing.JButton();
        jba = new javax.swing.JButton();
        jbh = new javax.swing.JButton();
        jbAis = new javax.swing.JButton();
        jbA = new javax.swing.JButton();
        jbH = new javax.swing.JButton();
        jbc2 = new javax.swing.JButton();
        jbcis1 = new javax.swing.JButton();
        jbdis1 = new javax.swing.JButton();
        jbd1 = new javax.swing.JButton();
        jbe1 = new javax.swing.JButton();
        jbfis1 = new javax.swing.JButton();
        jbf1 = new javax.swing.JButton();
        jbgis1 = new javax.swing.JButton();
        jbg1 = new javax.swing.JButton();
        jbais1 = new javax.swing.JButton();
        jba1 = new javax.swing.JButton();
        jbh1 = new javax.swing.JButton();
        jbc1 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        jPanel1.setLayout(null);

        jbcis.setBackground(java.awt.Color.black);
        jbcis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbcis.setForeground(java.awt.Color.white);
        jbcis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbcis);
        jbcis.setBounds(240, 180, 40, 250);

        jbc.setBackground(java.awt.Color.white);
        jbc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbc.setText("c");
        jbc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcActionPerformed(evt);
            }
        });
        jbc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbcKeyPressed(evt);
            }
        });
        jPanel1.add(jbc);
        jbc.setBounds(190, 180, 70, 390);

        jbdis.setBackground(java.awt.Color.black);
        jbdis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbdis.setForeground(java.awt.Color.white);
        jbdis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbdis);
        jbdis.setBounds(310, 180, 40, 250);

        jbe.setBackground(java.awt.Color.white);
        jbe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbe.setText("e");
        jbe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeActionPerformed(evt);
            }
        });
        jPanel1.add(jbe);
        jbe.setBounds(330, 180, 70, 390);

        jbd.setBackground(java.awt.Color.white);
        jbd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbd.setText("d");
        jbd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdActionPerformed(evt);
            }
        });
        jPanel1.add(jbd);
        jbd.setBounds(260, 180, 70, 390);

        jbfis.setBackground(java.awt.Color.black);
        jbfis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbfis.setForeground(java.awt.Color.white);
        jbfis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbfis);
        jbfis.setBounds(450, 180, 40, 250);

        jbf.setBackground(java.awt.Color.white);
        jbf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbf.setText("f");
        jbf.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfActionPerformed(evt);
            }
        });
        jPanel1.add(jbf);
        jbf.setBounds(400, 180, 70, 390);

        jbgis.setBackground(java.awt.Color.black);
        jbgis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbgis.setForeground(java.awt.Color.white);
        jbgis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbgis);
        jbgis.setBounds(520, 180, 40, 250);

        jbg.setBackground(java.awt.Color.white);
        jbg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbg.setText("g");
        jbg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbgActionPerformed(evt);
            }
        });
        jPanel1.add(jbg);
        jbg.setBounds(470, 180, 70, 390);

        jbais.setBackground(java.awt.Color.black);
        jbais.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbais.setForeground(java.awt.Color.white);
        jbais.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbais);
        jbais.setBounds(590, 180, 40, 250);

        jba.setBackground(java.awt.Color.white);
        jba.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jba.setText("a");
        jba.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaActionPerformed(evt);
            }
        });
        jPanel1.add(jba);
        jba.setBounds(540, 180, 70, 390);

        jbh.setBackground(java.awt.Color.white);
        jbh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbh.setText("h");
        jbh.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhActionPerformed(evt);
            }
        });
        jPanel1.add(jbh);
        jbh.setBounds(610, 180, 70, 390);

        jbAis.setBackground(java.awt.Color.black);
        jbAis.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jbAis.setForeground(java.awt.Color.white);
        jbAis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbAis);
        jbAis.setBounds(100, 180, 40, 250);

        jbA.setBackground(java.awt.Color.white);
        jbA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbA.setText("A");
        jbA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAActionPerformed(evt);
            }
        });
        jPanel1.add(jbA);
        jbA.setBounds(50, 180, 70, 390);

        jbH.setBackground(java.awt.Color.white);
        jbH.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbH.setText("H");
        jbH.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHActionPerformed(evt);
            }
        });
        jPanel1.add(jbH);
        jbH.setBounds(120, 180, 70, 390);

        jbc2.setBackground(java.awt.Color.white);
        jbc2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbc2.setText("c2");
        jbc2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbc2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbc2);
        jbc2.setBounds(1170, 180, 70, 390);

        jbcis1.setBackground(java.awt.Color.black);
        jbcis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbcis1.setForeground(java.awt.Color.white);
        jbcis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbcis1);
        jbcis1.setBounds(730, 180, 40, 250);

        jbdis1.setBackground(java.awt.Color.black);
        jbdis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbdis1.setForeground(java.awt.Color.white);
        jbdis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbdis1);
        jbdis1.setBounds(800, 180, 40, 250);

        jbd1.setBackground(java.awt.Color.white);
        jbd1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbd1.setText("d1");
        jbd1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbd1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbd1);
        jbd1.setBounds(750, 180, 70, 390);

        jbe1.setBackground(java.awt.Color.white);
        jbe1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbe1.setText("e1");
        jbe1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbe1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbe1);
        jbe1.setBounds(820, 180, 70, 390);

        jbfis1.setBackground(java.awt.Color.black);
        jbfis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbfis1.setForeground(java.awt.Color.white);
        jbfis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbfis1);
        jbfis1.setBounds(940, 180, 40, 250);

        jbf1.setBackground(java.awt.Color.white);
        jbf1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbf1.setText("f1");
        jbf1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbf1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbf1);
        jbf1.setBounds(890, 180, 70, 390);

        jbgis1.setBackground(java.awt.Color.black);
        jbgis1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbgis1.setForeground(java.awt.Color.white);
        jbgis1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbgis1);
        jbgis1.setBounds(1010, 180, 40, 250);

        jbg1.setBackground(java.awt.Color.white);
        jbg1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbg1.setText("g1");
        jbg1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbg1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbg1);
        jbg1.setBounds(960, 180, 70, 390);

        jbais1.setBackground(java.awt.Color.black);
        jbais1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbais1.setForeground(java.awt.Color.white);
        jbais1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jbais1);
        jbais1.setBounds(1080, 180, 40, 250);

        jba1.setBackground(java.awt.Color.white);
        jba1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jba1.setText("a1");
        jba1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jba1ActionPerformed(evt);
            }
        });
        jPanel1.add(jba1);
        jba1.setBounds(1030, 180, 70, 390);

        jbh1.setBackground(java.awt.Color.white);
        jbh1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbh1.setText("h1");
        jbh1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbh1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbh1);
        jbh1.setBounds(1100, 180, 70, 390);

        jbc1.setBackground(java.awt.Color.white);
        jbc1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbc1.setText("c1");
        jbc1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbc1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbc1);
        jbc1.setBounds(680, 180, 70, 390);
        jPanel1.add(jSlider1);
        jSlider1.setBounds(990, 20, 250, 20);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setForeground(java.awt.Color.darkGray);
        jToggleButton1.setText("Metronome");
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(1100, 50, 140, 40);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton2.setForeground(java.awt.Color.darkGray);
        jToggleButton2.setText("Recorder");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2);
        jToggleButton2.setBounds(1100, 120, 140, 40);

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(990, 50, 90, 40);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Piano", "Violin", "Hammond" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 60, 160, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 50)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Java Midi Piano");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 30, 450, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Effects");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 20, 160, 40);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Vibrato");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(250, 110, 140, 37);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox2.setForeground(java.awt.Color.white);
        jCheckBox2.setText("Sustain");
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(250, 60, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Sounds Menu");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 20, 160, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("00:00");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(990, 100, 90, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 1290, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcActionPerformed
        InputStream iAudio;
        
        try {
            iAudio = new FileInputStream(new File ("C:\\Javawork\\Music_Note\\C.wav"));
            AudioStream iMusic = new AudioStream(iAudio);
            AudioPlayer.player.start(iMusic );
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jbcActionPerformed

    private void jbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbeActionPerformed

    private void jbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbdActionPerformed

    private void jbfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbfActionPerformed

    private void jbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbgActionPerformed

    private void jbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbaActionPerformed

    private void jbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbhActionPerformed

    private void jbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAActionPerformed

    private void jbHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbHActionPerformed

    private void jbc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbc2ActionPerformed

    private void jbd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbd1ActionPerformed

    private void jbe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbe1ActionPerformed

    private void jbf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbf1ActionPerformed

    private void jbg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbg1ActionPerformed

    private void jba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jba1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jba1ActionPerformed

    private void jbh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbh1ActionPerformed

    private void jbc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbc1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jbcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbcKeyPressed
        InputStream iAudio;
        
        char c = evt.getKeyChar();
        if(c == 'd') {
            try {
                iAudio = new FileInputStream(new File ("C:\\Javawork\\Music_Note\\C.wav"));
                AudioStream iMusic = new AudioStream(iAudio);
                AudioPlayer.player.start(iMusic );
            } catch (IOException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_jbcKeyPressed

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
            java.util.logging.Logger.getLogger(javaMidiPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaMidiPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaMidiPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaMidiPiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaMidiPiano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton jbA;
    private javax.swing.JButton jbAis;
    private javax.swing.JButton jbH;
    private javax.swing.JButton jba;
    private javax.swing.JButton jba1;
    private javax.swing.JButton jbais;
    private javax.swing.JButton jbais1;
    private javax.swing.JButton jbc;
    private javax.swing.JButton jbc1;
    private javax.swing.JButton jbc2;
    private javax.swing.JButton jbcis;
    private javax.swing.JButton jbcis1;
    private javax.swing.JButton jbd;
    private javax.swing.JButton jbd1;
    private javax.swing.JButton jbdis;
    private javax.swing.JButton jbdis1;
    private javax.swing.JButton jbe;
    private javax.swing.JButton jbe1;
    private javax.swing.JButton jbf;
    private javax.swing.JButton jbf1;
    private javax.swing.JButton jbfis;
    private javax.swing.JButton jbfis1;
    private javax.swing.JButton jbg;
    private javax.swing.JButton jbg1;
    private javax.swing.JButton jbgis;
    private javax.swing.JButton jbgis1;
    private javax.swing.JButton jbh;
    private javax.swing.JButton jbh1;
    // End of variables declaration//GEN-END:variables
}
