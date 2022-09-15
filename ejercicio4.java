/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava_ejercicios;

import java.util.Scanner;


public class ejercicio4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double c,f ;
        
        System.out.println("Ingrese los grados centígrados");
        c = leer.nextDouble();
        f = 32 + (9*c/5);
        
        System.out.println("Ingresó "+f+" grados Fahrenheit");
    }
    
}
