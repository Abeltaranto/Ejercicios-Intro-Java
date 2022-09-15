/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package introjava_ejercicios;

import java.util.Scanner;


public class ejercicio5 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       int doble, triple;
       double raiz;
       
        System.out.println("Ingrese un numero entero");
        num = leer.nextInt();
        
        doble = num*2;
        triple = num*3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble es: "+doble+" .El triple es; "+triple+" .Y la raiz es: "+raiz);
    }
    
}
