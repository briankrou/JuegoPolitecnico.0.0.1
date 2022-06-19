/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriamultiplicacion.Vistas;



/**
 *
 * @author BrianKrou
 */
public class ParejaDeCartas {
    
    
    //VARIABLES PARA INICAR CARTAS 
    int numero1;
    int numero2;
    String operador;
    int resultado;
    
    //RETORNA EL VALOR DE LA CARTA 
    public int getNumero1(){
        return numero1;
    }
    //RERORNA EL VALOR DE LA CARTA 
    public int getNumero2(){
        return numero2;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public String getOperador(){
        return operador;
    }
    
    
    public void juegoNuevo(int numero2){
        
        this.numero1=Contadores.getNivel()+1;
        this.numero2=numero2;
        this.operador=" X ";
        this.resultado=numero1*numero2;
    }

    
}
