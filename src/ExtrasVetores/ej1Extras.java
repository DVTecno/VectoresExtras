package ExtrasVetores;

import java.util.Scanner;

public class ej1Extras {
/*
    1. Realizar un algoritmo que calcule la suma 
    de todos los elementos de un vector de tamaño N, 
    con los valores ingresados por el usuario.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.print("Ingrese el la dimension de su vector: ");
        int num = leer.nextInt();
        int vector[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
//        for (int i = 0; i < num; i++) {
//            suma += vector[i];
//        }
        for (int elemento : vector) {
            suma+=elemento;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

}
