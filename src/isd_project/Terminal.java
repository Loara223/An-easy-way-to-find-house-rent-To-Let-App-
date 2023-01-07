/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isd_project;

/**
 *
 * @author Abidh
 */
public class Terminal extends javax.swing.JFrame {

    /**
     * Creates new form Terminal
     */
    public Terminal() {
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

        jPanel3 = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IndexedFileAllocation = new javax.swing.JRadioButton();
        PriorityScheduling = new javax.swing.JRadioButton();
        MFT = new javax.swing.JRadioButton();
        RoundRobin = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        MVT = new javax.swing.JRadioButton();
        FCFS = new javax.swing.JRadioButton();
        SJF = new javax.swing.JRadioButton();
        Worstfit = new javax.swing.JRadioButton();
        Bestfit = new javax.swing.JRadioButton();
        Firstfit = new javax.swing.JRadioButton();
        BankersAlgo = new javax.swing.JRadioButton();
        SequentialFileAllocation = new javax.swing.JRadioButton();
        LinkedFileAllocation = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Terminal");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 32, 63));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setText("<--");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel3.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.setBackground(new java.awt.Color(0, 32, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select the Algorithm that you want to run-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 270, 30));

        IndexedFileAllocation.setBackground(new java.awt.Color(0, 32, 63));
        IndexedFileAllocation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        IndexedFileAllocation.setForeground(new java.awt.Color(255, 255, 255));
        IndexedFileAllocation.setText("Indexed File Allocation");
        jPanel1.add(IndexedFileAllocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, -1));

        PriorityScheduling.setBackground(new java.awt.Color(0, 32, 63));
        PriorityScheduling.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PriorityScheduling.setForeground(new java.awt.Color(255, 255, 255));
        PriorityScheduling.setText("Priority Scheduling");
        jPanel1.add(PriorityScheduling, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, -1));

        MFT.setBackground(new java.awt.Color(0, 32, 63));
        MFT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MFT.setForeground(new java.awt.Color(255, 255, 255));
        MFT.setText("MFT");
        MFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MFTActionPerformed(evt);
            }
        });
        jPanel1.add(MFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 60, -1));

        RoundRobin.setBackground(new java.awt.Color(0, 32, 63));
        RoundRobin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        RoundRobin.setForeground(new java.awt.Color(255, 255, 255));
        RoundRobin.setText("Round Robin");
        jPanel1.add(RoundRobin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 70, -1));

        MVT.setBackground(new java.awt.Color(0, 32, 63));
        MVT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MVT.setForeground(new java.awt.Color(255, 255, 255));
        MVT.setText("MVT");
        jPanel1.add(MVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, -1));

        FCFS.setBackground(new java.awt.Color(0, 32, 63));
        FCFS.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FCFS.setForeground(new java.awt.Color(255, 255, 255));
        FCFS.setText("FCFS");
        jPanel1.add(FCFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));

        SJF.setBackground(new java.awt.Color(0, 32, 63));
        SJF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SJF.setForeground(new java.awt.Color(255, 255, 255));
        SJF.setText("SJF");
        jPanel1.add(SJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, -1));

        Worstfit.setBackground(new java.awt.Color(0, 32, 63));
        Worstfit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Worstfit.setForeground(new java.awt.Color(255, 255, 255));
        Worstfit.setText("Worst-fit");
        jPanel1.add(Worstfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, -1));

        Bestfit.setBackground(new java.awt.Color(0, 32, 63));
        Bestfit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Bestfit.setForeground(new java.awt.Color(255, 255, 255));
        Bestfit.setText("Best-fit");
        jPanel1.add(Bestfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, -1));

        Firstfit.setBackground(new java.awt.Color(0, 32, 63));
        Firstfit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Firstfit.setForeground(new java.awt.Color(255, 255, 255));
        Firstfit.setText("First-fit");
        jPanel1.add(Firstfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, -1));

        BankersAlgo.setBackground(new java.awt.Color(0, 32, 63));
        BankersAlgo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BankersAlgo.setForeground(new java.awt.Color(255, 255, 255));
        BankersAlgo.setText("Banker's Algo");
        jPanel1.add(BankersAlgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, -1));

        SequentialFileAllocation.setBackground(new java.awt.Color(0, 32, 63));
        SequentialFileAllocation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SequentialFileAllocation.setForeground(new java.awt.Color(255, 255, 255));
        SequentialFileAllocation.setText("Sequential File Allocation");
        jPanel1.add(SequentialFileAllocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 150, -1));

        LinkedFileAllocation.setBackground(new java.awt.Color(0, 32, 63));
        LinkedFileAllocation.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LinkedFileAllocation.setForeground(new java.awt.Color(255, 255, 255));
        LinkedFileAllocation.setText("Linked File Allocation");
        jPanel1.add(LinkedFileAllocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 460));

        setSize(new java.awt.Dimension(330, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        MainPage m = new MainPage();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void MFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MFTActionPerformed
        // TODO add your handling code here:
        if(MFT.isSelected()){
            MVT.setSelected(false);
        }
    }//GEN-LAST:event_MFTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(MVT.isSelected()){
            MVT m = new MVT();
            m.setVisible(true);
            this.dispose();
        }
        else if(MFT.isSelected()){
            MFT mf = new MFT();
            mf.setVisible(true);
            this.dispose();
        }
        else if(SJF.isSelected()){
            SJF s = new SJF();
            s.setVisible(true);
            this.dispose();
        }
        else if(Firstfit.isSelected()){
            FirstFit ft = new FirstFit();
            ft.setVisible(true);
            this.dispose();
        }
        else if(Bestfit.isSelected()){
            Bestfit bf = new Bestfit();
            bf.setVisible(true);
            this.dispose();
        }
        else if(Worstfit.isSelected()){
            Worstfit wf = new Worstfit();
            wf.setVisible(true);
            this.dispose();
        }
        else if(IndexedFileAllocation.isSelected()){
            Index i = new Index();
            i.setVisible(true);
            this.dispose();
        }
        else if(LinkedFileAllocation.isSelected()){
            Linked l = new Linked();
            l.setVisible(true);
            this.dispose();
        }
        else if(SequentialFileAllocation.isSelected()){
            Sequential sq = new Sequential();
            sq.setVisible(true);
            this.dispose();
        }
        else if(FCFS.isSelected()){
            FCFS fc = new FCFS();
            fc.setVisible(true);
            this.dispose();
        }
        else if(PriorityScheduling.isSelected()){
            Priority p = new Priority();
            p.setVisible(true);
            this.dispose();
        }
        else if(RoundRobin.isSelected()){
            RoundRobin rr = new RoundRobin();
            rr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BankersAlgo;
    private javax.swing.JRadioButton Bestfit;
    private javax.swing.JRadioButton FCFS;
    private javax.swing.JRadioButton Firstfit;
    private javax.swing.JRadioButton IndexedFileAllocation;
    private javax.swing.JRadioButton LinkedFileAllocation;
    private javax.swing.JRadioButton MFT;
    private javax.swing.JRadioButton MVT;
    private javax.swing.JRadioButton PriorityScheduling;
    private javax.swing.JRadioButton RoundRobin;
    private javax.swing.JRadioButton SJF;
    private javax.swing.JRadioButton SequentialFileAllocation;
    private javax.swing.JRadioButton Worstfit;
    private javax.swing.JLabel backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}