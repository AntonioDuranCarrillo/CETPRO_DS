/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import vista.G_Inicio;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Rosy
 */
public class IniciarCetpro {
 public static void main(String[] args) {
      try {
        UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
       
        } catch (Exception e) {
        e.printStackTrace();
        }
       JFrame inicio = new G_Inicio();
        inicio.setVisible(true);
    }
}
