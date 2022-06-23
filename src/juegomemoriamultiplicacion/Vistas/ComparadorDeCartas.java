/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriamultiplicacion.Vistas;

/**
 *
 * @author BrianKrou
 */
public abstract class ComparadorDeCartas {
    static int carta1=0;

    static int carta2=0;

    static String IDcarta1="";

    static String IDcarta2="";
    
    /**
     *
     * @return
     *
     */
public static int getValorCarta1(){
    return carta1;
}

public static int getValorCarta2(){

    return carta2;
}

public static String getIDcarta1(){
    return IDcarta1;
}    
public static String getIDcarta2(){
    return IDcarta2;
}

//Reinicia los valores de la cartas al estado inicial 0
public static void reiniciarCartas(){
    carta1=0;
    carta2=0;
    IDcarta1="";
    IDcarta2="";
}

//Compara la carta 1 y la carta 2 retorna true si son Iguales
public static boolean ComparaCartas(){
        
        boolean cartasSonIguales=false;
        if(carta1==carta2){
            
            cartasSonIguales=true;
 
        }
        System.out.println("Compara cartas 1 / 2 "+carta1+"/"+carta2+"retorna "+cartasSonIguales);
        return cartasSonIguales;
        
}

//Asigna valores la Carta1 "valor y ID" y carta2 "valor y ID" RETURNA TRUE SI LAS DOS CARTAS ESTAN ASIGNADAS
public static boolean asignarvalorCartasSeleccionadas(int valorCarta,String ID){
            System.out.println("Asigando valor a la carta"); 
            boolean iniciar=false;
            System.out.println("valor carta 1 es "+carta1); 
            if(carta1==0){
                if("".equals(IDcarta1)){
                    
                    System.out.println("valor de la carta 1 es 0 ");
                    System.out.println("cambia el valor de la carta 1 de"+carta1+" a "+valorCarta);
                    carta1=valorCarta;
                    System.out.println("cambia el valor de ID DE la carta1 de: "+IDcarta1+" a "+ID);
                    IDcarta1=ID;
                    
                }

            }else{
                if(carta2==0){
                    if(IDcarta1 == null ? ID == null : IDcarta1.equals(ID)){

                    }else{
                        System.out.println("valor de la carta 2 es 0 ");
                        System.out.println("cambia el valor de la carta 2 de: "+carta2+" a "+valorCarta);
                        carta2=valorCarta;
                        System.out.println("cambia el valor de ID DE la carta2 de: "+IDcarta2+" a "+ID);
                        IDcarta2=ID;
                        iniciar=true;
                    }
                }
            }
            return iniciar;
    }   
}
