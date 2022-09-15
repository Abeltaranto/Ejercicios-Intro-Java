/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package introjava_ejercicios;

import java.util.Scanner;


public class ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        
        System.out.println("Ingrese un numero");
        num = leer.nextDouble();
        
        if (num % 2 == 0) {
            System.out.println("Numero par");
        }
        else {    
            System.out.println("es impar");
        }
    }
    
}
