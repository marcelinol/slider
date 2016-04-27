/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;

import javax.swing.JFrame;

/**
 *
 * @author 03148014995
 */
public class play {
    
    
    public static void main(String args[]){
        JFrame frame = new JFrame( "TESTE");
        TheSlider slider = new TheSlider();
        frame.add(slider);
        frame.setVisible(true);
    }
}
