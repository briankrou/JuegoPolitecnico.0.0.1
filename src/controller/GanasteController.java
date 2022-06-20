/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;
import juegomemoriamultiplicacion.Vistas.Contadores;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriamultiplicacion.Vistas.Sonidos;

 

/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class GanasteController implements Initializable  {
    
    Sonidos reproducir=new Sonidos();
    @FXML
    private Label puntos;
   
    @FXML
    private ImageView estrella1;

    @FXML
    private ImageView estrella2;

    @FXML
    private ImageView estrella3;

    @FXML
    private ImageView estrella4;

    @FXML
    private ImageView estrella5;
    
   @FXML
    void Exit(ActionEvent event) throws IOException {
        
        
        Object eventSource= event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene= sourceAsNode.getScene();
        Window window =oldScene.getWindow();
        Stage stage =(Stage) window;
        stage.hide();
        
        Contadores.reiniciarNivel();
        
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/principal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
        
    }

    @FXML
    void pasarnivel(ActionEvent event) throws IOException {   
        
        
        nivel();        
        Object eventSource= event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene= sourceAsNode.getScene();
        Window window =oldScene.getWindow();
        Stage stage =(Stage) window;
        stage.hide();
        
        if(Contadores.getNivel()==10){
            
            System.out.print("funcionaaaaa----------------------------------------------------------");
            
                    Parent root = FXMLLoader.load(getClass().getResource("/vistas/VistaUltimoNivel.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                   
                  
        }else{

                switch(Contadores.getDificultad()){
                
            case "FACIL" -> {
                Parent root1 = FXMLLoader.load(getClass().getResource("/vistas/VistaModoFacil.fxml"));
                Scene scene1 = new Scene(root1);
                stage.setScene(scene1);
                stage.show();
                }
                    
            case "MEDIO" -> {
                Parent root2 = FXMLLoader.load(getClass().getResource("/vistas/.fxml"));
                Scene scene2 = new Scene(root2);
                stage.setScene(scene2);
                stage.show();
                }
                    
            case "DIFICIL" -> {
                Parent root3 = FXMLLoader.load(getClass().getResource("/vistas/.fxml"));
                Scene scene3 = new Scene(root3);
                stage.setScene(scene3);
                stage.show();
                }       
                    
            }  
            
        }
    }
        
            
    
    
    public static void  nivel(){
        Contadores.Subirnivel();
        

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         reproducir.sonido("gano");
        
        

        //reiniciar cartas optenidas

    
    
    //REINICIAR EL CONTADOR DE ESTRELLAS OPTENIDAS    
        Contadores.reiniciarCartasOptenidas();

        //puntos acomulados
        puntos.setText(String.valueOf(Contadores.getPuntos()));
        
        // TODO
        switch(Contadores.getNumeroDeEstrellas()){
            case 3 -> {
                estrella1.setVisible(true);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(false);
                estrella5.setVisible(false);
            }
            case 4 -> {
                estrella1.setVisible(false);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(true);
                estrella5.setVisible(true);
            }
            case 5 -> {
                estrella1.setVisible(true);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(true);
                estrella5.setVisible(true);
            }
        }
        
    }    

    
}
