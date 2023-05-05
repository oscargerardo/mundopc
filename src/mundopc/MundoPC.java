package mundopc;

import mx.com.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computador HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorLenovo = new Monitor("Lenovo",15);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("bluetooth", "HP");
        Computadora computadoraLenovo = new Computadora("Computador Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        
        Orden orden1 = new Orden();
        orden1.agregarcomputadora(computadoraHP);
        orden1.agregarcomputadora(computadoraLenovo);
        
        orden1.mostrarOrden(); 
        
        Orden orden2 = new Orden();
        orden2.agregarcomputadora(computadoraHP);
        
        orden2.mostrarOrden();
    }
}
