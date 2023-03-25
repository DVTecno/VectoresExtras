package ExtrasVetores;

import java.util.Random;

public class Ej5Extras {

    /*
    Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
    y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        int n = 3; 
        int m = 4; 

        int[][] matriz = new int[n][m]; 

       
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(10); 
            }
        }

       
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

       
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
}
