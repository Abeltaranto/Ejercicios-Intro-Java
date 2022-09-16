/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 la función equals() en Java.
 */

package introjava_ejercicios;

import java.util.Scanner;


public class ejercicio7 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        boolean control;
        
        System.out.println("Ingrese una frase.");
        frase = leer.nextLine();
        control = frase.equals("eureka");
        
        if (control == true){
            System.out.println("Correcto!");
        }
        else{
            System.out.println("Incorrecto!");
        }
    }
    
}
