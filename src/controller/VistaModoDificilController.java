/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.File;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriamultiplicacion.Vistas.ComparadorDeCartas;
import juegomemoriamultiplicacion.Vistas.Contadores;
import juegomemoriamultiplicacion.Vistas.ParejaDeCartas;
import juegomemoriamultiplicacion.Vistas.Sonidos;


/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class VistaModoDificilController implements Initializable {
    
    
    

    @FXML
    private Label Puntos;
    
    
     @FXML
    private HBox contenedorA1;

    @FXML
    private HBox contenedorA2;

    @FXML
    private HBox contenedorA3;

    @FXML
    private HBox contenedorA4;
    
    @FXML
    private HBox contenedorB1;

    @FXML
    private HBox contenedorB2;

    @FXML
    private HBox contenedorB3;
    
    @FXML
    private HBox contenedorB4;
    
    @FXML
    private HBox contenedorC1;
    
    @FXML
    private HBox contenedorC2;
    
    @FXML
    private HBox contenedorC3;
    
    @FXML
    private HBox contenedorC4;
    
    @FXML
    private HBox contenedorD1;
    
    @FXML
    private HBox contenedorD2;
    
    @FXML
    private HBox contenedorD3;
    
    @FXML
    private HBox contenedorD4;
    
    @FXML
    private HBox contenedorE1;
    
    
    @FXML
    private HBox contenedorE2;
    
    @FXML
    private HBox contenedorE3;
    
    @FXML
    private HBox contenedorE4;
    
    //--------------------------------------------------------------COLUMNA A------------------------------------------------
    
    //LABEL BOTON A1
    @FXML
    private Label btnA1L1;
  
    @FXML
    private Label btnA1L2;

    @FXML
    private Label btnA1L3;

    
    //LABEL BOTON A2
    @FXML
    private Label btnA2L1;

    @FXML
    private Label btnA2L2;

    @FXML
    private Label btnA2L3;

    //LABEL BOTON A3
    @FXML
    private Label btnA3L1;

    @FXML
    private Label btnA3L2;

    @FXML
    private Label btnA3L3;
    
    
    //LABEL BOTON A4
    @FXML
    private Label btnA4L1;

    @FXML
    private Label btnA4L2;

    @FXML
    private Label btnA4L3;
 
   
    //--------------------------------------------------------------COLUMNA B------------------------------------------------
    
    //LABEL BOTON B1

    @FXML
    private Label btnB1L1;

    @FXML
    private Label btnB1L2;

    @FXML
    private Label btnB1L3;


    //LABEL BOTON B2
    
    @FXML
    private Label btnB2L1;

    @FXML
    private Label btnB2L2;

    @FXML
    private Label btnB2L3;

    //LABEL BOTON B3
    @FXML
    private Label btnB3L1;

    @FXML
    private Label btnB3L2;

    @FXML
    private Label btnB3L3;
    
    //LABEL BOTON B4
    @FXML
    private Label btnB4L1;

    @FXML
    private Label btnB4L2;

    @FXML
    private Label btnB4L3;
    
    //--------------------------------------------------------------COLUMNA C------------------------------------------------
    
    //LABEL BOTON C1

    @FXML
    private Label btnC1L1;

    @FXML
    private Label btnC1L2;

    @FXML
    private Label btnC1L3;


    //LABEL BOTON C2
    
    @FXML
    private Label btnC2L1;

    @FXML
    private Label btnC2L2;

    @FXML
    private Label btnC2L3;

    //LABEL BOTON C3
    @FXML
    private Label btnC3L1;

    @FXML
    private Label btnC3L2;

    @FXML
    private Label btnC3L3;
    
    //LABEL BOTON C4
    @FXML
    private Label btnC4L1;

    @FXML
    private Label btnC4L2;

    @FXML
    private Label btnC4L3;
    
     //--------------------------------------------------------------COLUMNA D------------------------------------------------
    
    //LABEL BOTON D1
    @FXML
    private Label btnD1L1;
  
    @FXML
    private Label btnD1L2;

    @FXML
    private Label btnD1L3;

    
    //LABEL BOTON D2
    @FXML
    private Label btnD2L1;

    @FXML
    private Label btnD2L2;

    @FXML
    private Label btnD2L3;

    //LABEL BOTON D3
    @FXML
    private Label btnD3L1;

    @FXML
    private Label btnD3L2;

    @FXML
    private Label btnD3L3;
    
    
    //LABEL BOTON D4
    @FXML
    private Label btnD4L1;

    @FXML
    private Label btnD4L2;

    @FXML
    private Label btnD4L3;
 
   
     //--------------------------------------------------------------COLUMNA E------------------------------------------------
    
    //LABEL BOTON E1
    @FXML
    private Label btnE1L1;
  
    @FXML
    private Label btnE1L2;

    @FXML
    private Label btnE1L3;

    
    //LABEL BOTON E2
    @FXML
    private Label btnE2L1;

    @FXML
    private Label btnE2L2;

    @FXML
    private Label btnE2L3;

    //LABEL BOTON E3
    @FXML
    private Label btnE3L1;

    @FXML
    private Label btnE3L2;

    @FXML
    private Label btnE3L3;
    
    
    //LABEL BOTON E4
    @FXML
    private Label btnE4L1;

    @FXML
    private Label btnE4L2;

    @FXML
    private Label btnE4L3;
 
   
        
    
    @FXML
    private ImageView Estrella1;

    @FXML
    private ImageView Estrella2;

    @FXML
    private ImageView Estrella3;
    @FXML
    private ImageView Estrella4;
    @FXML
    private ImageView Estrella5;
    


    @FXML
    private Label labelDificultad;
    
    @FXML
    private Label Nivel;
    
    @FXML
    private Button btna1;

    @FXML
    private Button btna2;

    @FXML
    private Button btna3;
    
    @FXML
    private Button btna4;

    @FXML
    private Button btnb1;

    @FXML
    private Button btnb2;

    @FXML
    private Button btnb3;
    
    @FXML
    private Button btnb4;
    
    

    @FXML
    private Button btnc1;

    @FXML
    private Button btnc2;

    @FXML
    private Button btnc3;
    
    @FXML
    private Button btnc4;
    
    
    @FXML
    private Button btnd1;

    @FXML
    private Button btnd2;

    @FXML
    private Button btnd3;
    
    @FXML
    private Button btnd4;
    
    
    @FXML
    private Button btne1;

    @FXML
    private Button btne2;

    @FXML
    private Button btne3;
    
    @FXML
    private Button btne4;
    
    
    @FXML
    private ImageView imgbtnSonido;
 
 
    
    
//ISTANCIAS DE LA CLASE ParejaDeCartas x3
ParejaDeCartas Carta1=new ParejaDeCartas();
ParejaDeCartas Carta2=new ParejaDeCartas();
ParejaDeCartas Carta3=new ParejaDeCartas();
ParejaDeCartas Carta4=new ParejaDeCartas();
ParejaDeCartas Carta5=new ParejaDeCartas();
ParejaDeCartas Carta6=new ParejaDeCartas();
ParejaDeCartas Carta7=new ParejaDeCartas();
ParejaDeCartas Carta8=new ParejaDeCartas();
ParejaDeCartas Carta9=new ParejaDeCartas();
ParejaDeCartas Carta10=new ParejaDeCartas();


//variables que tomaran lo valores de cartas
    int a1=0;
    int a2=0;
    int a3=0;
    int a4=0;
    
    int b1=0;
    int b2=0;
    int b3=0;
    int b4=0;
    
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    
    int d1=0;
    int d2=0;
    int d3=0;
    int d4=0;
    
    int e1=0;
    int e2=0;
    int e3=0;
    int e4=0;
    
//texto carta A
    String TextA1L1,TextA1L2,TextA1L3;
    //texto carta A2
    String TextA2L1,TextA2L2="",TextA2L3;
    //texto carta A3
    String TextA3L1,TextA3L2="",TextA3L3;
    //texto carta A4
    String TextA4L1,TextA4L2="",TextA4L3;
//texto carta B
    //texto carta B1
    String TextB1L1,TextB1L2="",TextB1L3;
    //texto carta B2
    String TextB2L1,TextB2L2="",TextB2L3;
    //texto carta B3
    String TextB3L1,TextB3L2="",TextB3L3;
    //texto carta B4
    String TextB4L1,TextB4L2="",TextB4L3;
        
//texto carta C
    //texto carta C1
    String TextC1L1,TextC1L2="",TextC1L3;
    //texto carta C2
    String TextC2L1,TextC2L2="",TextC2L3;
    //texto carta C3
    String TextC3L1,TextC3L2="",TextC3L3;
    //texto carta C4
    String TextC4L1,TextC4L2="",TextC4L3;
        
//texto carta D
    //texto carta D1
    String TextD1L1,TextD1L2="",TextD1L3;
    //texto carta D2
    String TextD2L1,TextD2L2="",TextD2L3;
    //texto carta D3
    String TextD3L1,TextD3L2="",TextD3L3;
    //texto carta D4
    String TextD4L1,TextD4L2="",TextD4L3;
    
//texto carta E
    //texto carta E1
    String TextE1L1,TextE1L2="",TextE1L3;
    //texto carta E2
    String TextE2L1,TextE2L2="",TextE2L3;
    //texto carta E3
    String TextE3L1,TextE3L2="",TextE3L3;
    //texto carta E4
    String TextE4L1,TextE4L2="",TextE4L3;

    //REPRODUCE SONIDO
  
      Sonidos reproducir;
      
    public VistaModoDificilController(){
    
        this.reproducir = new Sonidos();
    }



     @FXML
    void RegresarInicio(ActionEvent event) throws IOException {
                                //CIERRA LA INTERFAS ACTUAL
                                
                                            
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                Parent root = FXMLLoader.load(getClass().getResource("/vistas/principal.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                
              Contadores.reiniciarNivel();
              Contadores.reiniciarCartasOptenidas();
              
    }
          
    @FXML
    void abrirInformacion(ActionEvent event) throws IOException {
                
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/vistas/VistaInformacion.fxml"));
        Parent root =loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
         
    }
     boolean off=false;
    //QUITA EL SONIDO
    @FXML
    void soudVol(ActionEvent event) {
      
        Sonidos.mute();
        
        if(off){
            
             sonido();
                off=false;
                
                
        }else{
                
              sonido();    
                off=true;
        }

        
        
    }
    public void sonido(){
    
        if(Sonidos.getSonido()){
            imgbtnSonido.setVisible(false);
        }else{
            imgbtnSonido.setVisible(true);
        }
    }
    
    
 ////////////////////////// BOTON A1 /////////////////////////////
@FXML
void cartaElegidaA1(ActionEvent event) throws IOException {

         if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorA1.setVisible(true);

//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a1;                    //
//------------------------------------_--//

    eventoClick(valorCarta,ID);
    
    if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
        Object eventSource= event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene= sourceAsNode.getScene();
        Window window =oldScene.getWindow();
        Stage stage =(Stage) window;
        stage.hide();
                
        if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
            abrirVistaGanaste(stage);
        }else{
            abrirVistaPerdiste(stage);
        }
        
    }

}

 ////////////////////////// BOTON A2 /////////////////////////////
@FXML
void cartaElegidaA2(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
     contenedorA2.setVisible(true);
     
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON A3 /////////////////////////////

@FXML
void cartaElegidaA3(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorA3.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                                Contadores.setEstrellasFinales(Contadores.getEstrellasOptenidas());
                               
                             
       //*****SI LAS CARTAS ESTAN COMPLETAS
                            
                        //CIERRA LA INTERFAS ACTUAL
                                            
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                        //INICIA SIGUIENTE INTERFAS
                                             
                                //Comprueba las estrellas del juego para decidir que interfas iniciar
                                             
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
            //*******SI LAS CARTAS NO ESTAN COMPLETAS  CONTINUA EL JUEGO 
}
 ////////////////////////// BOTON B1 /////////////////////////////
@FXML
void cartaElegidaA4(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorA4.setVisible(true);

    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a4";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a4;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                                Contadores.setEstrellasFinales(Contadores.getEstrellasOptenidas());
                               
                             
       //*****SI LAS CARTAS ESTAN COMPLETAS
                            
                        //CIERRA LA INTERFAS ACTUAL
                                            
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                        //INICIA SIGUIENTE INTERFAS
                                             
                                //Comprueba las estrellas del juego para decidir que interfas iniciar
                                             
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
            //*******SI LAS CARTAS NO ESTAN COMPLETAS  CONTINUA EL JUEGO 
}
 ////////////////////////// BOTON B1 /////////////////////////////
@FXML
void cartaElegidaB1(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas();
        }
    contenedorB1.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b1;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B2 /////////////////////////////

@FXML
void cartaElegidaB2(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorB2.setVisible(true);
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaB3(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorB3.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaB4(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorB4.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b4";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b4;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}

@FXML
void cartaElegidaC1(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas();
        }
    contenedorC1.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "c1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=c1;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B2 /////////////////////////////

@FXML
void cartaElegidaC2(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorC2.setVisible(true);
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "c2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=c2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaC3(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorC3.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "c3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=c3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaC4(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorC4.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "c4";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=c4;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}

@FXML
void cartaElegidaD1(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas();
        }
    contenedorD1.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "d1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=d1;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B2 /////////////////////////////

@FXML
void cartaElegidaD2(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorD2.setVisible(true);
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "d2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=d2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaD3(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorD3.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "d3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=d3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaD4(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorD4.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "d4";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=d4;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}

@FXML
void cartaElegidaE1(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas();
        }
    contenedorE1.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "e1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=e1;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B2 /////////////////////////////

@FXML
void cartaElegidaE2(ActionEvent event) throws IOException {
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorE2.setVisible(true);
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "e2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=e2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaE3(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorE3.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "e3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=e3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaE4(ActionEvent event) throws IOException {
    
    

        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    contenedorE4.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "e4";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=e4;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(Contadores.getNumeroDeCartas()==Contadores.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ Contadores.getEstrellasOptenidas()+"  ");
                if(Contadores.getEstrellasOptenidas()==Contadores.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
            }
}




     int contador=0;
     
    //CARGA LOS VALORES INICIALES DEL JUEGO

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
          sonido();
     //INICIA LOS VALORES DEL JUEGO
     
     System.out.println("INICIA EL NIVEL:-----> "+Contadores.getNivel());
     

     

     
            //puntos acomulados
            Puntos.setText(String.valueOf(Contadores.getPuntos()));
            /*
            */   asiganarValorParejaDeCartas();
            Contadores.reiciarEstrellasOptenidas();
            
  
            //muestra el valor de la dificultad
            labelDificultad.setText(Contadores.getDificultad());
            
            //inicia el numero de estrellas que hay que optener en el juego
            Contadores.setNumeroDeEstrellas(5);

            //Asignamos el numero de cartas del juego
            Contadores.setNumeroDeCartas(10);
                      
            // muestra el valor de dficultad 
            Nivel.setText(String.valueOf(Contadores.getNivel()));
            
            //muestra las estrellas iniciales Optenidas
            mostrarestrella(Contadores.getEstrellasOptenidas());
            
            //ocultar cartas
             ocultarCartas();

            
            //VALORES DE CARTA FILA A
              btnA1L1.setText(TextA1L1);btnA1L2.setText(TextA1L2);btnA1L3.setText(TextA1L3);
              btnA2L1.setText(TextA2L1);btnA2L2.setText(TextA2L2);btnA2L3.setText(TextA2L3); 
              btnA3L1.setText(TextA3L1);btnA3L2.setText(TextA3L2);btnA3L3.setText(TextA3L3);
              btnA4L1.setText(TextA4L1);btnA4L2.setText(TextA4L2);btnA4L3.setText(TextA4L3);
              
            //VALORES DE CARTA FILA B
              btnB1L1.setText(TextB1L1);btnB1L2.setText(TextB1L2);btnB1L3.setText(TextB1L3);
              btnB2L1.setText(TextB2L1);btnB2L2.setText(TextB2L2);btnB2L3.setText(TextB2L3); 
              btnB3L1.setText(TextB3L1);btnB3L2.setText(TextB3L2);btnB3L3.setText(TextB3L3);
              btnB4L1.setText(TextB4L1);btnB4L2.setText(TextB4L2);btnB4L3.setText(TextB4L3);
              
            //VALORES DE CARTA FILA C
              btnC1L1.setText(TextC1L1);btnC1L2.setText(TextC1L2);btnC1L3.setText(TextC1L3);
              btnC2L1.setText(TextC2L1);btnC2L2.setText(TextC2L2);btnC2L3.setText(TextC2L3); 
              btnC3L1.setText(TextC3L1);btnC3L2.setText(TextC3L2);btnC3L3.setText(TextC3L3);
              btnC4L1.setText(TextC4L1);btnC4L2.setText(TextC4L2);btnC4L3.setText(TextC4L3);
              
            //VALORES DE CARTA FILA D
              btnD1L1.setText(TextD1L1);btnD1L2.setText(TextD1L2);btnD1L3.setText(TextD1L3);
              btnD2L1.setText(TextD2L1);btnD2L2.setText(TextD2L2);btnD2L3.setText(TextD2L3); 
              btnD3L1.setText(TextD3L1);btnD3L2.setText(TextD3L2);btnD3L3.setText(TextD3L3);
              btnD4L1.setText(TextD4L1);btnD4L2.setText(TextD4L2);btnD4L3.setText(TextD4L3);
              
            //VALORES DE CARTA FILA E
              btnE1L1.setText(TextE1L1);btnE1L2.setText(TextE1L2);btnE1L3.setText(TextE1L3);
              btnE2L1.setText(TextE2L1);btnE2L2.setText(TextE2L2);btnE2L3.setText(TextE2L3); 
              btnE3L1.setText(TextE3L1);btnE3L2.setText(TextE3L2);btnE3L3.setText(TextE3L3);
              btnE4L1.setText(TextE4L1);btnE4L2.setText(TextE4L2);btnE4L3.setText(TextE4L3);

              

    }   
    
    
     //AL HACER CLICK REALIZA  LA SIGUIENTE ACCION
    public void eventoClick(int valorCarta,String ID){
        
             reproducir.sonido("click1");
        
        if(ComparadorDeCartas.asignarvalorCartasSeleccionadas(valorCarta,ID)){
            
            if(ComparadorDeCartas.ComparaCartas()){//<<---Cartas son iguales?
              
                sonIguales();  
            
            }else{
                
                NoSonIguales();   
            }
                
        }
    
    }
    
    //ABRE LA INTERFAS GRAFICA DE GANASTE
    public void abrirVistaGanaste(Stage stage) throws IOException{
            System.out.println("Abre venta ganaste ");
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/Ganaste.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }
    
    //ABRE LA INTERFAS GRAFICA DE PERDISTE
    public void abrirVistaPerdiste(Stage stage) throws IOException{
            System.out.print("la estrellas cargan "+Contadores.getEstrellasOptenidas());
            Contadores.setEstrellasFinales(Contadores.getEstrellasOptenidas());
            System.out.println("Abre venta Perdiste ");
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/Perdiste.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
    }
    
    //si las cartas NO son iguales realiza la sieguiente accion
    public void NoSonIguales(){
        reproducir.sonido("perdio");
        
        System.out.println("No son iguales");
        Contadores.disminuirNumeroDeEstrellasOptenidas();
        mostrarestrella(Contadores.getEstrellasOptenidas());
        Contadores.RestarPuntos();
        Puntos.setText(String.valueOf(Contadores.getPuntos()));
        ComparadorDeCartas.reiniciarCartas();
 
        
                       
    }
    
    //si las cartas son iguales realiza la sieguiente accion
    public void sonIguales(){ 
        System.out.println("son iguales ");
        Contadores.sumarCartasOptenidas();
        Contadores.aumentarNumeroDeEstrellasOptenidas();
        System.out.println("Las estreñas optenidaso son ---->"+Contadores.getEstrellasOptenidas());
        mostrarestrella(Contadores.getEstrellasOptenidas());
        eliminarCarta1();
        eliminarCarta2();
        Contadores.SumarPuntos();
        Puntos.setText(String.valueOf(Contadores.getPuntos()));
        ComparadorDeCartas.reiniciarCartas();
        
    }
    
 //METODO QUE MUESTRA O OCULTA  ESTRELLA EN LA INTERFAS GRAFICA
    
   public void mostrarestrella(int num){
        switch(num){
            case 0 -> {
                System.out.println("mostramos 0 estrellas");
                
                Estrella1.setVisible(false);
                Estrella2.setVisible(false);
                Estrella3.setVisible(false);
                Estrella4.setVisible(false);
                Estrella5.setVisible(false);
            }
            case 1 -> {
                System.out.println("mostramos 1 estrella");
                
                Estrella1.setVisible(true);
                Estrella2.setVisible(false);
                Estrella3.setVisible(false);
                Estrella4.setVisible(false);
                Estrella5.setVisible(false);
            }
            case 2 -> {
                System.out.println("mostramos 2 estrellas");
                
                Estrella1.setVisible(true);
                Estrella2.setVisible(true);
                Estrella3.setVisible(false);
                Estrella4.setVisible(false);
                Estrella5.setVisible(false);
            }
            case 3 -> {
                System.out.println("mostramos 3 estrellas");
                
                Estrella1.setVisible(true);
                Estrella2.setVisible(true);
                Estrella3.setVisible(true);
                Estrella4.setVisible(false);
                Estrella5.setVisible(false);
            }
            case 4 -> {
                System.out.println("mostramos 4 estrellas");
                
                Estrella1.setVisible(true);
                Estrella2.setVisible(true);
                Estrella3.setVisible(true);
                Estrella4.setVisible(true);
                Estrella5.setVisible(false);    
            }
            case 5 -> {
                System.out.println("mostramos 5 estrellas");
                
                Estrella1.setVisible(true);
                Estrella2.setVisible(true);
                Estrella3.setVisible(true);
                Estrella4.setVisible(true);
                Estrella5.setVisible(true);    
            }
      
        }

    }

//establece valor a la pareja de cartas 
   
   
   
    public void asiganarValorParejaDeCartas(){
        int n=0;
        int numero;
        
      
        while(n<10){
            numero=Contadores.numeroaleatorio(10)+1;
            if(Carta1.getNumero2()==0){
                Carta1.juegoNuevo(numero);
                PosicionaCarta1(Carta1);
                n++;
            }else{
                if(Carta1.getNumero2()!=numero){
                    if(Carta2.getNumero2()==0){
                        Carta2.juegoNuevo(numero);
                         PosicionaCarta1(Carta2);
                        n++;
                    }else{
                        if(Carta2.getNumero2()!=numero){
                           if(Carta3.getNumero2()==0){
                                Carta3.juegoNuevo(numero);
                                PosicionaCarta1(Carta3);
                                n++;
                           }else{
                               if(Carta3.getNumero2()!=numero){
                                    if(Carta4.getNumero2()==0){
                                        Carta4.juegoNuevo(numero);
                                        PosicionaCarta1(Carta4);
                                        n++;                         
                                    }else{
                                        if(Carta4.getNumero2()!=numero){
                                            if(Carta5.getNumero2()==0){
                                                Carta5.juegoNuevo(numero);
                                                PosicionaCarta1(Carta5);
                                                n++;
                                            }else{
                                                if(Carta5.getNumero2()!=numero){
                                                    if(Carta6.getNumero2()==0){
                                                         Carta6.juegoNuevo(numero);
                                                         PosicionaCarta1(Carta6);
                                                         n++;
                                                    }else{
                                                        if(Carta6.getNumero2()!=numero){
                                                            if(Carta7.getNumero2()==0){
                                                                Carta7.juegoNuevo(numero);
                                                                PosicionaCarta1(Carta7);
                                                                n++;
                                                            }else{
                                                                if(Carta7.getNumero2()!=numero){
                                                                    if(Carta8.getNumero2()==0){
                                                                        Carta8.juegoNuevo(numero);
                                                                        PosicionaCarta1(Carta8);
                                                                        n++;
                                                                    }else{
                                                                        if(Carta8.getNumero2()!=numero){
                                                                            if(Carta9.getNumero2()==0){
                                                                                Carta9.juegoNuevo(numero);
                                                                                PosicionaCarta1(Carta9);
                                                                                n++;
                                                                            }else{
                                                                                if(Carta9.getNumero2()!=numero){
                                                                                    if(Carta10.getNumero2()==0){
                                                                                    Carta10.juegoNuevo(numero);
                                                                                    PosicionaCarta1(Carta10);
                                                                                    n++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
       
        
        
        
        
        
        
        
        
  
}
  //posiciona carta1 que es la que solo tiene la operacion
    public void PosicionaCarta1(ParejaDeCartas Carta){
                System.out.println("INICIAAAA CARTA ----------->>>>>>>>>>1");
            int contador2=0;

        while(contador2<1){
            switch(Contadores.numeroaleatorio(19)){
                case 0:
                       
                    if(a1==0){
                        System.out.println("1>>>carta A1 es "+a1);

                        TextA1L1=String.valueOf(Carta.getNumero1());
                        TextA1L2=Carta.getOperador();
                        TextA1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1----carta A1 es "+Carta.getResultado());
                        a1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                    
                case 1:
                    if(a2==0){
                        System.out.println("1>>>carta A2 es "+a2);

                        TextA2L1=String.valueOf(Carta.getNumero1());
                        TextA2L2=Carta.getOperador();
                        TextA2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta A2 es "+Carta.getResultado());
                        a2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 2:
                    if(a3==0){
                        System.out.println("1>>>carta A3 es "+a3);
                        
                        TextA3L1=String.valueOf(Carta.getNumero1());
                        TextA3L2=Carta.getOperador();
                        TextA3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta A3 es "+Carta.getResultado());
                        a3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 3:
                    if(a4==0){
                        System.out.println("1>>>carta A4 es "+a4);
                        
                        TextA4L1=String.valueOf(Carta.getNumero1());
                        TextA4L2=Carta.getOperador();
                        TextA4L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta A4 es "+Carta.getResultado());
                        a4=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
   
                case 4:
                    if(b1==0){
                        System.out.println("1>>>carta B1 es "+b1);
                        
                        TextB1L1=String.valueOf(Carta.getNumero1());
                        TextB1L2=Carta.getOperador();
                        TextB1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B1 es "+Carta.getResultado());
                        b1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 5:
                    if(b2==0){
                        System.out.println("1>>>carta B2 es "+b2);
                        
                        TextB2L1=String.valueOf(Carta.getNumero1());
                        TextB2L2=Carta.getOperador();
                        TextB2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B2 es "+Carta.getResultado());
                        b2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 6:
                    if(b3==0){
                        System.out.println("1>>>carta B3 es "+b3);
                        
                        TextB3L1=String.valueOf(Carta.getNumero1());
                        TextB3L2=Carta.getOperador();
                        TextB3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B3 es "+Carta.getResultado());
                        b3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 7:
                    if(b4==0){
                        System.out.println("1>>>carta B4 es "+b4);
                        
                        TextB4L1=String.valueOf(Carta.getNumero1());
                        TextB4L2=Carta.getOperador();
                        TextB4L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B3 es "+Carta.getResultado());
                        b4=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                    
                case 8:
                    if(c1==0){
                        System.out.println("1>>>carta C1 es "+c1);
                        
                        TextC1L1=String.valueOf(Carta.getNumero1());
                        TextC1L2=Carta.getOperador();
                        TextC1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta C1 es "+Carta.getResultado());
                        c1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 9:
                    if(c2==0){
                        System.out.println("1>>>carta C2 es "+c2);
                        
                        TextC2L1=String.valueOf(Carta.getNumero1());
                        TextC2L2=Carta.getOperador();
                        TextC2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta C2 es "+Carta.getResultado());
                        c2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 10:
                    if(c3==0){
                        System.out.println("1>>>carta C3 es "+c3);
                        
                        TextC3L1=String.valueOf(Carta.getNumero1());
                        TextC3L2=Carta.getOperador();
                        TextC3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta C3 es "+Carta.getResultado());
                        c3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 11:
                    if(c4==0){
                        System.out.println("1>>>carta C4 es "+c4);
                        
                        TextC4L1=String.valueOf(Carta.getNumero1());
                        TextC4L2=Carta.getOperador();
                        TextC4L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta C4 es "+Carta.getResultado());
                        c4=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
 
                case 12:
                    if(d1==0){
                        System.out.println("1>>>carta D1 es "+d1);
                        
                        TextD1L1=String.valueOf(Carta.getNumero1());
                        TextD1L2=Carta.getOperador();
                        TextD1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta D1 es "+Carta.getResultado());
                        d1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 13:
                    if(d2==0){
                        System.out.println("1>>>carta D2 es "+d2);
                        
                        TextD2L1=String.valueOf(Carta.getNumero1());
                        TextD2L2=Carta.getOperador();
                        TextD2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta D2 es "+Carta.getResultado());
                        d2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 14:
                    if(d3==0){
                        System.out.println("1>>>carta D3 es "+d3);
                        
                        TextD3L1=String.valueOf(Carta.getNumero1());
                        TextD3L2=Carta.getOperador();
                        TextD3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta D3 es "+Carta.getResultado());
                        d3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 15:
                    if(d4==0){
                        System.out.println("1>>>carta D4 es "+d4);
                        
                        TextD4L1=String.valueOf(Carta.getNumero1());
                        TextD4L2=Carta.getOperador();
                        TextD4L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta D4 es "+Carta.getResultado());
                        d4=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }  
                    
                case 16:
                    if(e1==0){
                        System.out.println("1>>>carta E1 es "+e1);
                        
                        TextE1L1=String.valueOf(Carta.getNumero1());
                        TextE1L2=Carta.getOperador();
                        TextE1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta E1 es "+Carta.getResultado());
                        e1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 17:
                    if(e2==0){
                        System.out.println("1>>>carta E2 es "+e2);
                        
                        TextE2L1=String.valueOf(Carta.getNumero1());
                        TextE2L2=Carta.getOperador();
                        TextE2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta E2 es "+Carta.getResultado());
                        e2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 18:
                    if(e3==0){
                        System.out.println("1>>>carta E3 es "+e3);
                        
                        TextE3L1=String.valueOf(Carta.getNumero1());
                        TextE3L2=Carta.getOperador();
                        TextE3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta E3 es "+Carta.getResultado());
                        e3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 19:
                    if(e4==0){
                        System.out.println("1>>>carta E4 es "+e4);
                        
                        TextE4L1=String.valueOf(Carta.getNumero1());
                        TextE4L2=Carta.getOperador();
                        TextE4L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta E4 es "+Carta.getResultado());
                        e4=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
            }   
        }
    }

   //posiciona carta2 que es la que solo tiene el resultado
    public void PosicionaCarta2(ParejaDeCartas Carta){
            
     System.out.println("INICIAAAA CARTA-----------------/////////////// 2");
     
            int contador2=0;

        while(contador2<1){
            switch(Contadores.numeroaleatorio(19)){
                
                case 0:
                    if(a1==0){
                        System.out.println("2>>>carta A1 es "+a1);
                           
                        TextA1L2=String.valueOf(Carta.getResultado());
                        a1=Carta.getResultado();
                        System.out.println("2---carta A1 es "+a1); 
                        contador2++;
                        break;      
                        
                    }
                    
                case 1:
                    if(a2==0){
                        System.out.println("2>>>carta A2 es "+a2);
                        TextA2L2=String.valueOf(Carta.getResultado());
                        a2=Carta.getResultado();
                         System.out.println("2---carta A2 es "+a2); 
                         contador2++;
           
                        break;
                    }
                case 2:
                    if(a3==0){
                        System.out.println("2>>>carta A3 es "+a3);  
                        TextA3L2=String.valueOf(Carta.getResultado());
                        a3=Carta.getResultado();
                         System.out.println("2---carta A3 es "+a3); 
                         contador2++;
           
                        break;
                    }
                    
                case 3:
                    if(a4==0){
                        System.out.println("2>>>carta A4 es "+a4);  
                        TextA4L2=String.valueOf(Carta.getResultado());
                        a4=Carta.getResultado();
                         System.out.println("2---carta A4 es "+a4); 
                         contador2++;
           
                        break;
                    }
                case 4:
                    if(b1==0){
                        System.out.println("2>>>carta B1 es "+b1);  
                        TextB1L2=String.valueOf(Carta.getResultado());
                        b1=Carta.getResultado();
                         System.out.println("2---carta B1 es "+b1);
                         contador2++;
                  
                        break;
                    }
                case 5:
                    if(b2==0){
                        System.out.println("2>>>carta B2 es "+b2);    
                        TextB2L2=String.valueOf(Carta.getResultado());
                        b2=Carta.getResultado();
                        System.out.println("2---carta B2 es "+b2); 
                        contador2++;
           
                        break;
                    }
                case 6:
                    if(b3==0){
                        System.out.println("2>>>carta B3 es "+b3);  
                        TextB3L2=String.valueOf(Carta.getResultado());
                        b3=Carta.getResultado();
                        System.out.println("2---carta B3 es "+b3); 
                        contador2++;
                
                        break;
                    }
            
                case 7:
                    if(b4==0){
                        System.out.println("2>>>carta B4 es "+b4);  
                        TextB4L2=String.valueOf(Carta.getResultado());
                        b4=Carta.getResultado();
                        System.out.println("2---carta B4 es "+b4); 
                        contador2++;
                
                        break;
                    }    
  
                case 8:
                    if(c1==0){
                        System.out.println("2>>>carta C1 es "+c1);  
                        TextC1L2=String.valueOf(Carta.getResultado());
                        c1=Carta.getResultado();
                         System.out.println("2---carta C1 es "+c1);
                         contador2++;
                  
                        break;
                    }
                case 9:
                    if(c2==0){
                        System.out.println("2>>>carta C2 es "+c2);    
                        TextC2L2=String.valueOf(Carta.getResultado());
                        c2=Carta.getResultado();
                        System.out.println("2---carta C2 es "+c2); 
                        contador2++;
           
                        break;
                    }
                case 10:
                    if(c3==0){
                        System.out.println("2>>>carta C3 es "+c3);  
                        TextC3L2=String.valueOf(Carta.getResultado());
                        c3=Carta.getResultado();
                        System.out.println("2---carta C3 es "+c3); 
                        contador2++;
                
                        break;
                    }
            
                case 11:
                    if(c4==0){
                        System.out.println("2>>>carta C4 es "+c4);  
                        TextC4L2=String.valueOf(Carta.getResultado());
                        c4=Carta.getResultado();
                        System.out.println("2---carta C4 es "+c4); 
                        contador2++;
                
                        break;
                    }           
                case 12:
                    if(d1==0){
                        System.out.println("2>>>carta D1 es "+d1);  
                        TextD1L2=String.valueOf(Carta.getResultado());
                        d1=Carta.getResultado();
                        System.out.println("2---carta D1 es "+d1); 
                        contador2++;
                
                        break;
                    }      
                case 13:
                    if(d2==0){
                        System.out.println("2>>>carta D2 es "+d2);  
                        TextD2L2=String.valueOf(Carta.getResultado());
                        d2=Carta.getResultado();
                        System.out.println("2---carta D2 es "+d2); 
                        contador2++;
                
                        break;
                    }    
                case 14:
                    if(d3==0){
                        System.out.println("2>>>carta D3 es "+d3);  
                        TextD3L2=String.valueOf(Carta.getResultado());
                        d3=Carta.getResultado();
                        System.out.println("2---carta D3 es "+d3); 
                        contador2++;
                
                        break;
                    }    
                case 15:
                    if(d4==0){
                        System.out.println("2>>>carta D4 es "+d4);  
                        TextD4L2=String.valueOf(Carta.getResultado());
                        d4=Carta.getResultado();
                        System.out.println("2---carta D4 es "+d4); 
                        contador2++;
                
                        break;
                    }    
                case 16:
                    if(e1==0){
                        System.out.println("2>>>carta E1 es "+e1);  
                        TextE1L2=String.valueOf(Carta.getResultado());
                        e1=Carta.getResultado();
                        System.out.println("2---carta E1 es "+e1); 
                        contador2++;
                
                        break;
                    }    
                case 17:
                    if(e2==0){
                        System.out.println("2>>>carta E2 es "+e2);  
                        TextE2L2=String.valueOf(Carta.getResultado());
                        e2=Carta.getResultado();
                        System.out.println("2---carta E2 es "+e2); 
                        contador2++;
                
                        break;
                    } 
                case 18:
                    if(e3==0){
                        System.out.println("2>>>carta E3 es "+e3);  
                        TextE3L2=String.valueOf(Carta.getResultado());
                        e3=Carta.getResultado();
                        System.out.println("2---carta E3 es "+e3); 
                        contador2++;
                
                        break;
                    }   
                case 19:
                    if(e4==0){
                        System.out.println("2>>>carta E4 es "+e4);  
                        TextE4L2=String.valueOf(Carta.getResultado());
                        e4=Carta.getResultado();
                        System.out.println("2---carta E4 es "+e4); 
                        contador2++;
                
                        break;
                    }                       
     }
    }}

    // OCULTA CARTAS
    
    public void ocultarCartas(){
        System.out.println("--Ocultando cartas--");
        
            contenedorA1.setVisible(false);contenedorA2.setVisible(false);contenedorA3.setVisible(false);contenedorA4.setVisible(false);
            contenedorB1.setVisible(false);contenedorB2.setVisible(false);contenedorB3.setVisible(false);contenedorB4.setVisible(false);
            contenedorC1.setVisible(false);contenedorC2.setVisible(false);contenedorC3.setVisible(false);contenedorC4.setVisible(false);
            contenedorD1.setVisible(false);contenedorD2.setVisible(false);contenedorD3.setVisible(false);contenedorD4.setVisible(false);
            contenedorE1.setVisible(false);contenedorE2.setVisible(false);contenedorE3.setVisible(false);contenedorE4.setVisible(false);
    }
    
    //metodo que elimina la primer carta y invoca al metodo para eliminar la segunda carta 
    public void eliminarCarta1(){
        System.out.println("Elimina carta 1 con ID: "+ComparadorDeCartas.getIDcarta1());
        switch(ComparadorDeCartas.getIDcarta1()){
            
            case "a1" -> btna1.setVisible(false);
            case "a2" -> btna2.setVisible(false);
            case "a3" -> btna3.setVisible(false);
            case "a4" -> btna4.setVisible(false);
            
            case "b1" -> btnb1.setVisible(false);
            case "b2" -> btnb2.setVisible(false);
            case "b3" -> btnb3.setVisible(false);
            case "b4" -> btnb4.setVisible(false);
            
            case "c1" -> btnc1.setVisible(false);
            case "c2" -> btnc2.setVisible(false);   
            case "c3" -> btnc3.setVisible(false);
            case "c4" -> btnc4.setVisible(false);
                        
            case "d1" -> btnd1.setVisible(false);
            case "d2" -> btnd2.setVisible(false);   
            case "d3" -> btnd3.setVisible(false);
            case "d4" -> btnd4.setVisible(false);
            
                        
            case "e1" -> btne1.setVisible(false);
            case "e2" -> btne2.setVisible(false);   
            case "e3" -> btne3.setVisible(false);
            case "e4" -> btne4.setVisible(false);
        }
    }
    

    //metodo que elimina la segunda carta
    public void eliminarCarta2(){
           System.out.println("Elimina carta 2 con ID: "+ComparadorDeCartas.getIDcarta2());
        switch(ComparadorDeCartas.getIDcarta2()){
            
            case "a1" -> btna1.setVisible(false);
            case "a2" -> btna2.setVisible(false);
            case "a3" -> btna3.setVisible(false);
            case "a4" -> btna4.setVisible(false);
            
            case "b1" -> btnb1.setVisible(false);
            case "b2" -> btnb2.setVisible(false);
            case "b3" -> btnb3.setVisible(false);
            case "b4" -> btnb4.setVisible(false);
            
            case "c1" -> btnc1.setVisible(false);
            case "c2" -> btnc2.setVisible(false);   
            case "c3" -> btnc3.setVisible(false);
            case "c4" -> btnc4.setVisible(false);
                        
            case "d1" -> btnd1.setVisible(false);
            case "d2" -> btnd2.setVisible(false);   
            case "d3" -> btnd3.setVisible(false);
            case "d4" -> btnd4.setVisible(false);
            
                        
            case "e1" -> btne1.setVisible(false);
            case "e2" -> btne2.setVisible(false);   
            case "e3" -> btne3.setVisible(false);
            case "e4" -> btne4.setVisible(false);
            
        }
        
    }

    
    
}
