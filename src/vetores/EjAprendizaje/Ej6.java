package vetores.EjAprendizaje;

import java.util.Scanner;

public class Ej6 {

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
    donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
    Crear un programa que permita introducir un cuadrado por teclado y determine 
    si este cuadrado es mágico o no. El programa deberá comprobar que los números 
    introducidos son correctos, es decir, están entre el 1 y el 9.


     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la Matriz: ");
        int[][] matriz;
       int n = validarEntero(leer);
       

        matriz = new int[n][n];

        mostrarMatriz(matriz, n);

    }
    
    
    
    
    
    
    
    
    

    private static void mostrarMatriz(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
    
    public static int validarEntero(Scanner leer) {
    int n;
    do {
        if (leer.hasNextInt()) {
            n = leer.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("El numero debe ser mayor que cero. Intente nuevamente.");
            }
        } else {
            System.out.println("Tipo de dato incorrecto. Intente nuevamente.");
            leer.next();// descarta el valor no entero
        }
    } while (true);
    return n;
}

}
