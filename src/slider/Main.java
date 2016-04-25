/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import java.awt.Component;

/**
 *
 * @author marcelinol
 */
public class Main {
    public static void main(String[] args) {
       javax.swing.JFrame frame = new javax.swing.JFrame();  // Cria frame
       TheSlider bean = new TheSlider(); // Instancia o bean
        // Alterar as propriedades que julgar necessárias aqui!
        Component add = frame.add(bean); // Adiciona bean ao frame
       frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);  // Exibe o frame
    }
}
