/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriamultiplicacion.Vistas.Contadores;


/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class VistaUltimoNivelController implements Initializable {
    @FXML
    private Label puntos;

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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           puntos.setText(String.valueOf(Contadores.getPuntos()));
    }    
    
}
