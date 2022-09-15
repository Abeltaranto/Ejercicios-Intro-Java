
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

package introjava_ejercicios;

import java.util.Scanner;


public class ejercicio1 {


    public static void main(String[] args) {
        int num, num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros");
        num = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("La suma de los numeros es: "+(num+num2));
        
    }
    
}
