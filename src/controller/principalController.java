/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author BrianKrou
 */
public class principalController implements Initializable {
    @FXML
    void abrirInformacion(ActionEvent event) throws IOException {
        

        FXMLLoader loader =new FXMLLoader(getClass().getResource("/vistas/VistaInformacion.fxml"));
        Parent root =loader.load();
        VistaInformacionController controlador = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }
    
    @FXML
    void Exit(ActionEvent event) {
       Object eventSource= event.getSource();
       Node sourceAsNode = (Node) eventSource;
       Scene oldScene= sourceAsNode.getScene();
       Window window =oldScene.getWindow();
       Stage stage =(Stage) window;
       stage.hide();

    }

    @FXML
    void inicarjuego(ActionEvent event) throws IOException {

               Object eventSource= event.getSource();
       Node sourceAsNode = (Node) eventSource;
       Scene oldScene= sourceAsNode.getScene();
       Window window =oldScene.getWindow();
       Stage stage =(Stage) window;
       stage.hide();
       
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/SeleccionDificultad.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
