package vetores.EjAprendizaje;

import java.util.Scanner;

public class Ej6 {

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
    donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
    Crear un programa que permita introducir un cuadrado por teclado y determine 
    si este cuadrado es mágico o no. El programa deberá comprobar que los números 
    introducidos son correctos, es decir, están entre el 1 y el 9.
      0  1   2
  0  2 | 7 | 6
   ---|---|--- 
   1 9 | 5 | 1
   ---|---|---
  2  4 | 3 | 8
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la Matriz: ");
        int[][] matriz;
        int n = validarEntero(leer);
        matriz = new int[n][n];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("La matriz es magica: " + validarMatrizMagica(matriz, n));
        System.exit(0);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int validarEntero(Scanner leer) {
        int n;
        do {
            if (leer.hasNextInt()) {
                n = leer.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.print("El numero debe ser mayor que cero. Intente nuevamente: ");
                }
            } else {
                System.out.print("Tipo de dato incorrecto. Intente nuevamente: ");
                leer.next();// descarta el valor no entero
            }
        } while (true);
        return n;
    }

    private static void llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el elemento " + (j + 1) + " ");

                matriz[i][j] = validarEntero(leer);
            }
        }
        System.out.println("");
    }

    private static boolean validarMatrizMagica(int[][] matriz, int n) {
        boolean magica = false;
        int conutFila = 0;
        int conutColumna = 0;
        int conutDiagonal1 = 0;
        int conutDiagonal2 = 0;
      
        for (int i = 0; i < matriz.length; i++) {
            conutFila = 0;
            conutColumna = 0;
            for (int j = 0; j < n; j++) {
                conutFila += matriz[i][j];
                conutColumna += matriz[i][j];
                if (i == j) {
                    conutDiagonal1 += matriz[i][j];
                }
                if (i + j == n - 1) {
                    conutDiagonal2 += matriz[i][j];
                }

                if (true) {
                    if (conutFila == conutColumna && conutColumna == conutDiagonal2 && conutDiagonal1 == conutFila) {
                        magica = true;
                    } else {
                        if (i==n-1&&j==n-1) {
                             magica = false;
                        }
                       
                    }
                }

            }

        }

        return magica;
    }
}
