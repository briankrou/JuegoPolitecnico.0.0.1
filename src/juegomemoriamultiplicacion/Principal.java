/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegomemoriamultiplicacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author BrianKrou
 */
public class Principal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("hola");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
           Parent root = FXMLLoader.load(getClass().getResource("ventanaPrincipal.fxml"));
           Scene scene = new Scene(root);
           stage.setTitle("BIENVENIDO");
           stage.setScene(scene);
           stage.show();
    }
    
    
}
