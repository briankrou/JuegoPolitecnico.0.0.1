/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriamultiplicacion.Vistas;


    import java.io.IOException;
    import javax.sound.sampled.AudioSystem;
    import javax.sound.sampled.Clip;
    import javax.sound.sampled.LineUnavailableException;
    import javax.sound.sampled.UnsupportedAudioFileException;
    import javax.swing.JOptionPane;

/**
 *
 * @author BrianKrou
 */
public  class Sonidos {
    
    
 
    static public Clip clip;
    static public String ruta = "/Sound/";
    static boolean sonido=true;
   public  static boolean getSonido(){
       return sonido;
   }
   public  void sonido(String archivo){
               try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResource(ruta + archivo + ".wav")));
            if(sonido){
                clip.start();
            }
            
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            JOptionPane.showMessageDialog(null, "Error en audio:\n" + ex.getMessage());
        }    
   }
   
   //QUITA EL SONIDO
   
   public static void mute(){
       
    if(sonido){
        sonido=false;
    }else{
        sonido=true;
    }
       
   }
   
    
}
