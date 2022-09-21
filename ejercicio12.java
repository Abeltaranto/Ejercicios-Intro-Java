/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package introjava_ejercicios;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int contOk, contNoOk,tamano;
        contOk = 0;
        contNoOk = 0;
        
        do {
            System.out.println("Por favor ingrese el codigo");
            palabra = leer.nextLine();
            tamano = palabra.length();
            if (palabra.length()<=5 && "X".equals(palabra.substring(0, 1)) && "O".equals(palabra.substring(tamano-1, tamano))){
                contOk++;
                System.out.println("Correcto!");
            }else if (!"&&&&&".equals(palabra)){
                contNoOk++;
                System.out.println("Incorrecto!");
            }else if (palabra.equals("&&&&&"))   {
                System.out.println("Se ingreso el FDE");
            }    
        } while (!"&&&&&".equals(palabra));
        
        System.out.println("Las lecturas correstas fueron: "+contOk);
        System.out.println("Las lecturas incorrectas fueron: "+contNoOk);
    }
    
}
