/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

/**
 *
 * @author 03148014995
 */
public class play {
    
    
    public static void main(String args[]){
        JFrame frame = new JFrame( "TESTE");
        TheSlider slider;
        slider = new TheSlider();
        frame.add(slider);
//        frame.setSize(650, 450); // Estava escondendo os botoes
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
