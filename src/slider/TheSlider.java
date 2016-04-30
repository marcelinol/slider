/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author marcelinol
 */
public class TheSlider extends javax.swing.JPanel implements java.beans.Customizer {
    
    
    /** Requisitos do trabalho **/
    protected String imageFolder;
    protected int interval = 1;
    protected boolean controlVisible = true;
    private File currentFile;
    /** --------------------- **/
    
    private Object bean;
    private java.util.Timer timer;
    private File [] listOfFiles;
    int contador = 0;
    
    
    /**
     * Creates new customizer TheSlider
     */
    public TheSlider() {
        imageFolder = "/home/marcelinol/Pictures/wallpapers";
        File folder = new File(imageFolder);
        listOfFiles = folder.listFiles();
        initComponents();
        btnPlay.setEnabled(false);
        play();
    }
    
    public void play() {
        TheSlider componente = this;
        timer = new java.util.Timer();
        timer.schedule(new java.util.TimerTask() {
            public void run() {
                currentFile = listOfFiles[componente.getContador()];
                componente.imageLabel.repaint();
                componente.incrementaContador();
            }
        },
        interval*1000 /* tempo para 1a execução */,
        interval*1000 /* intervalo de repetição */
        );
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    public int getContador() {
        return this.contador;
    }
    
    public void incrementaContador() {
        if(contador == (this.listOfFiles.length - 1)) {
            this.contador = 0;
        } else {
            this.contador++;
        }
    }

    public void decrementaContador() {
        if(contador == 0) {
            this.contador = this.listOfFiles.length - 1;
        } else {
            this.contador--;
        }
    }

    /**
     * Get the value of imageFolder
     *
     * @return the value of imageFolder
     */
    public String getImageFolder() {
        return imageFolder;
    }

    /**
     * Set the value of imageFolder
     *
     * @param imageFolder new value of imageFolder
     */
    public void setImageFolder(String imageFolder) {
        this.imageFolder = imageFolder;
    }

    /**
     * Get the value of interval
     *
     * @return the value of interval
     */
    public int getInterval() {
        
        return interval;
    }

    /**
     * Set the value of interval
     *
     * @param interval new value of interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }
    

    /**
     * Get the value of controlVisible
     *
     * @return the value of controlVisible
     */
    public boolean isControlVisible() {
        return controlVisible;
    }

    /**
     * Set the value of controlVisible
     *
     * @param controlVisible new value of controlVisible
     */
    public void setControlVisible(boolean controlVisible) {
        this.controlVisible = controlVisible;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel =  new javax.swing.JLabel() {
             @Override
             public void paint(Graphics g) {
                 try {
                 BufferedImage img = ImageIO.read(currentFile);
                 g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
                 } catch (IOException ioe) { ioe.printStackTrace(); }
             }
         };
        btnStop = new javax.swing.JButton();
        nextImageButton = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        previousImageButton = new javax.swing.JButton();

        imageLabel.setText("imageLabel");

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        nextImageButton.setText("Próxima imagem");
        nextImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextImageButtonActionPerformed(evt);
            }
        });

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        previousImageButton.setText("Imagem anterior");
        previousImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousImageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previousImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextImageButton)
                    .addComponent(btnStop)
                    .addComponent(btnPlay)
                    .addComponent(previousImageButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        this.timer.cancel();
        btnPlay.setEnabled(true);
        btnStop.setEnabled(false);
    }//GEN-LAST:event_btnStopActionPerformed

    private void nextImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextImageButtonActionPerformed
        this.incrementaContador();
        this.currentFile = listOfFiles[this.contador];
        imageLabel.repaint();
    }//GEN-LAST:event_nextImageButtonActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        play();
        btnStop.setEnabled(true);
        btnPlay.setEnabled(false);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void previousImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousImageButtonActionPerformed
        this.decrementaContador();
        this.currentFile = listOfFiles[this.contador];
        imageLabel.repaint();
    }//GEN-LAST:event_previousImageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton nextImageButton;
    private javax.swing.JButton previousImageButton;
    // End of variables declaration//GEN-END:variables
}
