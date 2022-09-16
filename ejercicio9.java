/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package introjava_ejercicios;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        
        System.out.println("Ingrese una palabra.");
        palabra = leer.next();

        if ((palabra.substring(0, 1).equals("A"))==true) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }

}
