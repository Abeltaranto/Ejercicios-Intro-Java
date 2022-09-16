/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package introjava_ejercicios;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valorLimite, acumulado;

        System.out.println("Inrese el valor limite.");
        valorLimite = leer.nextInt();
        acumulado = 0;

        do {
            System.out.println("Ingrese un numero para sumar");
            acumulado = (acumulado + leer.nextInt());

        } while (acumulado <= valorLimite);
        
    }

}
