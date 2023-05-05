/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mundopc;

/**
 *
 * @author ogera
 */
public class Orden {
    private final int idorden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;
    
    public Orden(){
        this.idorden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarcomputadora(Computadora computadora){
        if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;   
        }
        else{
            System.out.println("Haz superado el limite: " +Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idorden);
        System.out.println("Computadoras de la orden #: " + this.idorden);
        for(int i =0 ; i < this.contadorComputadoras ; i++){
            System.out.println("Computadora #" + i + this.computadoras[i]);
        }
    }
    
}
