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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriamultiplicacion.Vistas.ComparadorDeCartas;
import  juegomemoriamultiplicacion.Vistas.Contadores;
import  juegomemoriamultiplicacion.Vistas.ParejaDeCartas;



/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class VistaModoFacilController implements Initializable {

    @FXML
    private Label Puntos;
     @FXML
    private HBox contenedorA1;

    @FXML
    private HBox contenedorA2;

    @FXML
    private HBox contenedorA3;

    @FXML
    private HBox contenedorB1;

    @FXML
    private HBox contenedorB2;

    @FXML
    private HBox contenedorB3;
    
    @FXML
    private Label btnA1L1;
  

    @FXML
    private Label btnA1L2;

    @FXML
    private Label btnA1L3;

    @FXML
    private Label btnA2L1;

    @FXML
    private Label btnA2L2;

    @FXML
    private Label btnA2L3;

    @FXML
    private Label btnA3L1;

    @FXML
    private Label btnA3L2;

    @FXML
    private Label btnA3L3;

    @FXML
    private Label btnB1L1;

    @FXML
    private Label btnB1L2;

    @FXML
    private Label btnB1L3;

    @FXML
    private Label btnB2L1;

    @FXML
    private Label btnB2L2;

    @FXML
    private Label btnB2L3;

    @FXML
    private Label btnB3L1;

    @FXML
    private Label btnB3L2;

    @FXML
    private Label btnB3L3;
    
    @FXML
    private ImageView Estrella1;

    @FXML
    private ImageView Estrella2;

    @FXML
    private ImageView Estrella3;
    
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
    private Button btnb1;

    @FXML
    private Button btnb2;

    @FXML
    private Button btnb3;
    
    
//valores carta
    
    
    
ParejaDeCartas Carta1=new ParejaDeCartas();
ParejaDeCartas Carta2=new ParejaDeCartas();
ParejaDeCartas Carta3=new ParejaDeCartas();

    int a1=0;
    int a2=0;
    int a3=0;
    int b1=0;
    int b2=0;
    int b3=0;
    
    //texto carta A1
    String TextA1L1,TextA1L2,TextA1L3;
    //texto carta A2
    String TextA2L1,TextA2L2="",TextA2L3;
    //texto carta A3
    String TextA3L1,TextA3L2="",TextA3L3;
    //texto carta B1
    String TextB1L1,TextB1L2="",TextB1L3;
    //texto carta B2
    String TextB2L1,TextB2L2="",TextB2L3;
    //texto carta B3
    String TextB3L1,TextB3L2="",TextB3L3;
  
    
    
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

     int contador=0;
     
    //CARGA LOS VALORES INICIALES DEL JUEGO
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     //INICIA LOS VALORES DEL JUEGO
            //puntos acomulados
            Puntos.setText(String.valueOf(Contadores.getPuntos()));
     
            asiganarValorParejaDeCartas();
            Contadores.reiciarEstrellasOptenidas();
            
  
            //muestra el valor de la dificultad
            labelDificultad.setText(Contadores.getDificultad());
            
            //inicia el numero de estrellas que hay que optener en el juego
            Contadores.setNumeroDeEstrellas(3);

            //Asignamos el numero de cartas del juego
            Contadores.setNumeroDeCartas(3);
                      
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
              
            //VALORES DE CARTA FILA B
              btnB1L1.setText(TextB1L1);btnB1L2.setText(TextB1L2);btnB1L3.setText(TextB1L3);
              btnB2L1.setText(TextB2L1);btnB2L2.setText(TextB2L2);btnB2L3.setText(TextB2L3); 
              btnB3L1.setText(TextB3L1);btnB3L2.setText(TextB3L2);btnB3L3.setText(TextB3L3);

    }   
    
    
     //AL HACER CLICK REALIZA  LA SIGUIENTE ACCION
    public void eventoClick(int valorCarta,String ID){
        
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
        System.out.print("Las estreñas optenidaso son ---->"+Contadores.getEstrellasOptenidas());
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
            case 0:
            System.out.println("mostramos 0 estrellas");
                  Estrella1.setVisible(false);
                  Estrella2.setVisible(false);
                  Estrella3.setVisible(false);   
                  break;
            case 1:
            System.out.println("mostramos 1 estrella");
                  Estrella1.setVisible(true);
                  Estrella2.setVisible(false);
                  Estrella3.setVisible(false);   
                  break;
            case 2:
            System.out.println("mostramos 2 estrellas");
                  Estrella1.setVisible(true);
                  Estrella2.setVisible(true);
                  Estrella3.setVisible(false);   
                  break;
            case 3:
            System.out.println("mostramos 3 estrellas");
                  Estrella1.setVisible(true);
                  Estrella2.setVisible(true);
                  Estrella3.setVisible(true);   
                  break;
      
        }

    }

//establece valor a la pareja de cartas 
    public void asiganarValorParejaDeCartas(){
        int n=0;
        int numero;
        
      
        while(n<3){
            numero=Contadores.numeroaleatorio(10)+1;
            if(Carta1.getNumero2()==0){
                Carta1.juegoNuevo(numero);
                n++;
            }else{
                if(Carta1.getNumero2()!=numero){
                    if(Carta2.getNumero2()==0){
                        Carta2.juegoNuevo(numero);
                        n++;
                    }else{
                        if(Carta2.getNumero2()!=numero){
                           if(Carta3.getNumero2()==0){
                                Carta3.juegoNuevo(numero);
                                n++;
                           }
                        }
                    }
                }
            }
        }
    
        Carta2.juegoNuevo(2);
        Carta3.juegoNuevo(3);
        PosicionaCarta1(Carta1);
        PosicionaCarta1(Carta2);
        PosicionaCarta1(Carta3);
  
}
  //posiciona carta1 que es la que solo tiene la operacion
    public void PosicionaCarta1(ParejaDeCartas Carta){
                System.out.println("INICIAAAA CARTA ------------------1");
            int contador2=0;

        while(contador2<1){
            switch(Contadores.numeroaleatorio(5)){
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
                case 4:
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
                case 5:
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
            }   
        }
    }

   //posiciona carta2 que es la que solo tiene el resultado
    public void PosicionaCarta2(ParejaDeCartas Carta){

     System.out.println("INICIAAAA CARTA----------------- 2");
     
            int contador2=0;

        while(contador2<1){
            switch(Contadores.numeroaleatorio(5)){
                
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
                    if(b1==0){
                        System.out.println("2>>>carta B1 es "+b1);  
                        TextB1L2=String.valueOf(Carta.getResultado());
                        b1=Carta.getResultado();
                         System.out.println("2---carta B1 es "+b1);
                         contador2++;
                  
                        break;
                    }
                case 4:
                    if(b2==0){
                        System.out.println("2>>>carta B2 es "+b2);    
                        TextB2L2=String.valueOf(Carta.getResultado());
                        b2=Carta.getResultado();
                        System.out.println("2---carta B2 es "+b2); 
                        contador2++;
           
                        break;
                    }
                case 5:
                    if(b3==0){
                        System.out.println("2>>>carta B3 es "+b3);  
                        TextB3L2=String.valueOf(Carta.getResultado());
                        b3=Carta.getResultado();
                        System.out.println("2---carta B3 es "+b3); 
                        contador2++;
                
                        break;
                    }
            
     }
    }}

    // OCULTA CARTAS
    
    public void ocultarCartas(){
        System.out.println("--Ocultando cartas--");
        
            contenedorA1.setVisible(false);contenedorA2.setVisible(false);contenedorA3.setVisible(false);
            contenedorB1.setVisible(false);contenedorB2.setVisible(false);contenedorB3.setVisible(false);
    }
    
    //metodo que elimina la primer carta y invoca al metodo para eliminar la segunda carta 
    public void eliminarCarta1(){
        System.out.println("Elimina carta 1 con ID: "+ComparadorDeCartas.getIDcarta1());
        switch(ComparadorDeCartas.getIDcarta1()){
            case "a1":
          
               btna1.setVisible(false);
               break;
            case "a2":
                
                btna2.setVisible(false);
                break;
            case "a3":
               
                btna3.setVisible(false);
                break;
            case "b1":
                
                btnb1.setVisible(false);
                break;
            case "b2":
                
                btnb2.setVisible(false);
                break;
        
            case "b3":
               
                 btnb3.setVisible(false);
                break;
               
        }
    }
    

    //metodo que elimina la segunda carta
    public void eliminarCarta2(){
           System.out.println("Elimina carta 2 con ID: "+ComparadorDeCartas.getIDcarta2());
        switch(ComparadorDeCartas.getIDcarta2()){
            case "a1":
                btna1.setVisible(false);
                break;
            case "a2":
                btna2.setVisible(false);
                break;
            case "a3":
                btna3.setVisible(false);
                break;
            case "b1":
                btnb1.setVisible(false);
                break;
            case "b2":
                btnb2.setVisible(false);
                break;
            case "b3":
                btnb3.setVisible(false);
                break;
        }
        
    }

    
    

}
  

