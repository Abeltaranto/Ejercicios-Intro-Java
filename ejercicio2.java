/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

package introjava_ejercicios;

import java.util.Scanner;


public class ejercicio2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingresar nombre");
        nombre = leer.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
    }
    
}
