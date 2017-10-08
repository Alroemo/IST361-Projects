/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author bci5021
 */
public class PlayerUI extends javax.swing.JPanel {

    
    /**
     * Creates new form NewJPanel
     */
    public ImageIcon currentTurretIcon;
    PlayerController thePlayerController;
    public PlayerUI(PlayerController theParentPlayerController) {
        currentTurretIcon = new ImageIcon("snake_panel.gif");
        initComponents(); 
        thePlayerController = theParentPlayerController;
        updateValues();
        Image1.setIcon(new ImageIcon("snake_panel.gif"));
        Image2.setIcon(new ImageIcon("psy_panel.gif"));
        Image3.setIcon(new ImageIcon("punch_panel.gif"));
    }
    
    public void updateValues(){
        Name.setText("Name: " + thePlayerController.getName());
        Lives.setText("Lives:   " + thePlayerController.getHealth());
        Score.setText("Score:   " + thePlayerController.getScore());
        Currency.setText("Currency: " + thePlayerController.getMoney());
        Difficulty.setText("Difficulty: " + thePlayerController.getDifficulty());
        Wave.setText("Wave: " + thePlayerController.getStage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tower1 = new javax.swing.JLabel();
        Range1 = new javax.swing.JLabel();
        Damage1 = new javax.swing.JLabel();
        Image1 = new javax.swing.JLabel();
        Tower2 = new javax.swing.JLabel();
        Range2 = new javax.swing.JLabel();
        Damage2 = new javax.swing.JLabel();
        Image2 = new javax.swing.JLabel();
        Tower3 = new javax.swing.JLabel();
        Range3 = new javax.swing.JLabel();
        Damage3 = new javax.swing.JLabel();
        Image3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        Difficulty = new javax.swing.JLabel();
        Currency = new javax.swing.JLabel();
        Lives = new javax.swing.JLabel();
        Wave = new javax.swing.JLabel();

        Tower1.setText("Tower 1");

        Range1.setText("Range:");

        Damage1.setText("Damage:");

        Image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Image1MousePressed(evt);
            }
        });

        Tower2.setText("Tower 2");

        Range2.setText("Range:");

        Damage2.setText("Damage:");

        Image2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Image2MousePressed(evt);
            }
        });

        Tower3.setText("Tower 3");

        Range3.setText("Range:");

        Damage3.setText("Damage:");

        Image3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Image3MousePressed(evt);
            }
        });

        jButton1.setText("Next Wave");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Name.setText("Name:");

        Score.setText("Score: ");

        Difficulty.setText("Difficulty: ");

        Currency.setText("Currency: ");

        Lives.setText("Lives:");

        Wave.setText("Wave:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Score)
                                    .addComponent(Name)
                                    .addComponent(Difficulty))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Wave)
                                    .addComponent(Lives)
                                    .addComponent(Currency)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Tower1)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Tower2)
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage1)
                            .addComponent(Range1)
                            .addComponent(Range2)
                            .addComponent(Damage2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tower3)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Damage3)
                            .addComponent(Range3))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Lives))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Score)
                    .addComponent(Currency))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Difficulty)
                    .addComponent(Wave))
                .addGap(129, 129, 129)
                .addComponent(Tower1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tower2)
                        .addGap(5, 5, 5)
                        .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Range1)
                                .addGap(6, 6, 6)
                                .addComponent(Damage1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(Range2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Damage2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tower3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Range3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Damage3))
                    .addComponent(Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        thePlayerController.setStage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Image1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image1MousePressed
        // TODO add your handling code here:
        ImageIcon curTurret = new ImageIcon("snake_panel.gif");
        setCurrentTurret(curTurret);
    }//GEN-LAST:event_Image1MousePressed

    private void Image2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image2MousePressed
        // TODO add your handling code here:
        ImageIcon curTurret = new ImageIcon("psy_panel.gif");
        setCurrentTurret(curTurret);
    }//GEN-LAST:event_Image2MousePressed

    private void Image3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image3MousePressed
        // TODO add your handling code here:
        ImageIcon curTurret = new ImageIcon("punch_panel.gif");
        setCurrentTurret(curTurret);
    }//GEN-LAST:event_Image3MousePressed

    public void setCurrentTurret(ImageIcon newIco){
        currentTurretIcon = newIco;
    }
    public ImageIcon getTurretIcon(){
        return currentTurretIcon;
    }
    public void populateUI()
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Currency;
    private javax.swing.JLabel Damage1;
    private javax.swing.JLabel Damage2;
    private javax.swing.JLabel Damage3;
    private javax.swing.JLabel Difficulty;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Image3;
    private javax.swing.JLabel Lives;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Range1;
    private javax.swing.JLabel Range2;
    private javax.swing.JLabel Range3;
    private javax.swing.JLabel Score;
    private javax.swing.JLabel Tower1;
    private javax.swing.JLabel Tower2;
    private javax.swing.JLabel Tower3;
    private javax.swing.JLabel Wave;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
