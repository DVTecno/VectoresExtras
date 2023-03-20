package ExtrasVetores;

import java.util.Scanner;

public class ej2Extras {

    /*
  2. Escriba un programa que averigüe si dos vectores de N enteros son
  iguales (la comparación deberá detenerse en cuanto se detecte alguna
  diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension del vector: ");
        int diferencia = 0;
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        System.out.println("Vector 1");
        llenarVector(vector1, n, leer);                
        System.out.println("Vector 2");
        llenarVector(vector2, n, leer);

        // Comparar los vectores
        boolean sonIguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false;
                diferencia = i;
                break;
            }
        }
        System.out.println("----------------------------");
        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
            System.out.println("                 Mostrar vectores");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("Los vectores no son iguales en su posicion [" + diferencia+"]");
            System.out.println("----------------------------------------------------");
            System.out.println("                 Mostrar vectores");
            System.out.println("----------------------------------------------------");
            int[] vector = new int[n];
            System.out.print("Posiscion");
            for (int i = 0; i < n; i++) {
                System.out.print(" [" + i + "] ");
            }
            System.out.println("");

        }

        System.out.print("Vector 1 ");
        mostrarVectores(vector1);
        System.out.print("Vector 2 ");
        mostrarVectores(vector2);
        System.out.println("----------------------------------------------------");
    }

    private static void llenarVector(int[] vector, int n, Scanner leer) {
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
    }

    private static void mostrarVectores(int[] vector) {
        for (int elemento : vector) {
            System.out.print(" [" + elemento + "] ");
        }
        System.out.println("");
    }

}
