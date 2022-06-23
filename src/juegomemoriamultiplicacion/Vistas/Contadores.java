/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriamultiplicacion.Vistas;

import java.util.Random;


/**
 *
 * @author BrianKrou
 */

//Esta clse permite crear  instancias para el funcionamiento del juego menos el nivel que es satic para todo el juego
public abstract class Contadores {
    
    
//------------------------------------------------------variables------------------------------------------------------------- 
static int nivel=0;

static String Dificultad;



static int Estrellasoptenidas; 

static int EstrelalsoptenidasFinales;

static int NumeroDeEstrellas;

static int cartasOptenidas=0;

static int  numeroDeCartas;
static int  puntos;

//------------------------------------------------------Metodos Get------------------------------------------------------------
//SUMA PUNTOS POR CANTAS ENCONTRADAS 
public static void SumarPuntos(){
    puntos=puntos+10;
}

public static void RestarPuntos(){
    if(getPuntos()>0){
        puntos=puntos-10;
    }
    
}
public static void ReiniciarPuntos(){

        puntos=0;

}


//METODO RETORNA NUMERO DE ESTRELLAS DEL JUEGO 
public static  void setNumeroDeEstrellas(int num){
    NumeroDeEstrellas=num;
}

// CAMBIA EL NUMERO DE CARTAS QUE HAY QUE DESTAPAR 

public static  void setNumeroDeCartas(int num){
    numeroDeCartas=num;
}

//REINICIA LAS ESTRELLAS OPTENIDAS 

public static void reiciarEstrellasOptenidas(){


    
    Estrellasoptenidas=0;
    
    System.out.print("recinicai estrellas a "+Estrellasoptenidas);
}


//METODO CAMBIA LAS ESTRELLAS FINAL DEL JUEGO PARA MOSTRAR CUANDO GANA O PIERDE 
public static void setEstrellasFinales(int num){
    EstrelalsoptenidasFinales=num;
}
//METODO AYUDO AUMENTA LAS ESTRELLAS 
public static  void aumentarNumeroDeEstrellasOptenidas(){

        if(Estrellasoptenidas<getNumeroDeEstrellas()){
            
            System.out.print("Estrellas a optenr cuando suma "+getNumeroDeEstrellas());
            Estrellasoptenidas++; 
        }
       
    

}
//METODO RESTA ESTRELLAS 
public static  void disminuirNumeroDeEstrellasOptenidas(){
    System.out.println("menos una estrella");
    
       if(Estrellasoptenidas>0){
           Estrellasoptenidas--;
       }
        
}
//SUBE EL NIVEL A MEDIAD QUE GANA 
public static void  Subirnivel(){
    nivel++;
}
//REINICIA EL CONTADOR DE NIVELES 
public static void reiniciarNivel(){
    nivel=0;
}

//SUMA A EL CONTADOR DE CARTAS OPTENIDAS A MEDIA QUE LAS ENCUENTRA 


public static  void sumarCartasOptenidas(){

    cartasOptenidas++;
}
public static void reiniciarCartasOptenidas(){
    cartasOptenidas=0;
}
//CAMBIA EL TEXTO DE DIFICULTAD 
public static  void CambiarDificultad(String dificultad){
    Dificultad=dificultad;
}

///-----------------------------------------------------Metodos Set-----------------------------------------------------------



public  static int getPuntos(){
    return puntos;
}

// RETORNA EL NUMERO DE ESTRELLAS DEL JUEGO SEGUN EL NIVEL 
public static  int getNumeroDeEstrellas(){
    return NumeroDeEstrellas;
}
//RETORNA EL NUMERO DE ESTRELLAS OPTENIDAS 

public static  int getEstrellasOptenidas(){

    return Estrellasoptenidas;
}

//RETORNA LAS ESTRELLAS FINALES 
public static int getEstrellasFinales(){
    return EstrelalsoptenidasFinales;
}
//RETORNA NUMERO DE CARYAS DEL JUEGO SEGUN EL NIVEL 


public static  int getNumeroDeCartas(){

    return numeroDeCartas;
}
//RETORNA EL NIVEL DEL JUEGO
public static int getNivel(){
    return nivel;
}

//RESTONA EL NUMERO DE CARTAS OPTENIDAS 

public  static int  getCartasOptenidas(){
    
    return cartasOptenidas;
    
}

//RETORNA EL VALOR DEL TEXTO DE DIFICULTAD
public static  String getDificultad(){
    return Dificultad;
}

public static int numeroaleatorio(int num){
 
                Random rd = new Random();
                int numeroAleatorio = rd.nextInt(num);
                System.out.println("nuemero aleatorio "+numeroAleatorio);
                return numeroAleatorio;
    }
}
