package Java;


import Java.Dijkstra;
import Java.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

public class PanelGrafico extends javax.swing.JFrame {
    private Java gridPanel;
    private boolean isSettingWall = false;
    private boolean isSettingStartNode = false;
    private boolean isSettingEndNode = false;
    //private boolean isSettingWeight = false;
    private Point startNode = null;
    private Point endNode = null;
    /**
     * Creates new form PanDeploy
     */
    public PanelGrafico() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Panel visible");
        // Rows y cols para numero de cuadros, nodesize para el tamaño en pixeles.
        int rows = 23;
        int cols = 32;
        int nodeSize = 30;
        gridPanel = new Java(rows, cols, nodeSize);
        
        gridPanelContainer.setLayout(new BorderLayout());
        gridPanelContainer.add(gridPanel, BorderLayout.CENTER);
        
        gridPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int row = e.getY() / nodeSize;
                int col = e.getX() / nodeSize;
                if (isSettingWall) {
                    gridPanel.markWall(row, col);
                } else if (isSettingStartNode) {
                    if (startNode != null) {
                        gridPanel.clearNode(startNode.y, startNode.x);
                    }
                    startNode = new Point(col, row);
                    gridPanel.markStart(row, col);
                } else if (isSettingEndNode) {
                    if (endNode != null) {
                        gridPanel.clearNode(endNode.y, endNode.x);
                    }
                    endNode = new Point(col, row);
                    gridPanel.markEnd(row, col);
                } 
            }
        });
        this.pack();
    }  
    private void startDijkstra(){
        Dijkstra dijkstra = new Dijkstra(gridPanel);
        dijkstra.findShortestPath();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridPanelContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnStartDijkstra = new javax.swing.JButton();
        btnPaintWall = new javax.swing.JButton();
        btnNodeIn = new javax.swing.JButton();
        btnNodeOut = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gridPanelContainer.setBackground(new java.awt.Color(204, 204, 204));
        gridPanelContainer.setPreferredSize(new java.awt.Dimension(570, 570));

        javax.swing.GroupLayout gridPanelContainerLayout = new javax.swing.GroupLayout(gridPanelContainer);
        gridPanelContainer.setLayout(gridPanelContainerLayout);
        gridPanelContainerLayout.setHorizontalGroup(
            gridPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        gridPanelContainerLayout.setVerticalGroup(
            gridPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btnStartDijkstra.setBackground(new java.awt.Color(102, 102, 0));
        btnStartDijkstra.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnStartDijkstra.setForeground(new java.awt.Color(255, 255, 255));
        btnStartDijkstra.setText("Iniciar");
        btnStartDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartDijkstraActionPerformed(evt);
            }
        });

        btnPaintWall.setBackground(new java.awt.Color(255, 255, 204));
        btnPaintWall.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnPaintWall.setText("Pintar pared");
        btnPaintWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaintWallActionPerformed(evt);
            }
        });

        btnNodeIn.setBackground(new java.awt.Color(255, 255, 204));
        btnNodeIn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNodeIn.setText("Inicio");
        btnNodeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNodeInActionPerformed(evt);
            }
        });

        btnNodeOut.setBackground(new java.awt.Color(255, 255, 204));
        btnNodeOut.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnNodeOut.setText("Fin");
        btnNodeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNodeOutActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 204));
        btnReiniciar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnReiniciar.setText("Reinicio");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setText("Grupo: 4P         Registro: 22310353");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setText(" Jose Alberto Garcia Arellano");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnStartDijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNodeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnNodeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnPaintWall, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnPaintWall, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNodeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNodeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnStartDijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gridPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gridPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaintWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaintWallActionPerformed
                isSettingWall = true;
                isSettingStartNode = false;
                isSettingEndNode = false;
    }//GEN-LAST:event_btnPaintWallActionPerformed

    private void btnNodeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNodeInActionPerformed
                isSettingWall = false;
                isSettingStartNode = true;
                isSettingEndNode = false;
    }//GEN-LAST:event_btnNodeInActionPerformed

    private void btnNodeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNodeOutActionPerformed
                isSettingWall = false;
                isSettingStartNode = false;
                isSettingEndNode = true;
    }//GEN-LAST:event_btnNodeOutActionPerformed

    private void btnStartDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartDijkstraActionPerformed
        startDijkstra();
    }//GEN-LAST:event_btnStartDijkstraActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        gridPanel.clearAll();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(PanelGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelGrafico().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNodeIn;
    private javax.swing.JButton btnNodeOut;
    private javax.swing.JButton btnPaintWall;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnStartDijkstra;
    private javax.swing.JPanel gridPanelContainer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
