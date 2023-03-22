package vetores.EjAprendizaje;

import java.util.Scanner;

public class ej2 {

    /*
    2. Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese dimension del vector: ");
        int n = leer.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 6);
        }
        int contador = 0;
        String posicion = "";
        System.out.print("Ingrese un numero a buscar: ");
        int buscar = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "]");
        }

        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
            if (vector[i] == buscar) {
                contador++;
                posicion += ", " + String.valueOf(i);
            }

        }
        System.out.println("");
        if (contador > 0) {
            System.out.println("---------------------------------------------");
            System.out.println("El mumero " + buscar + ", esta " + contador + ", veces en posicion" + posicion);
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("El numero no se encontro!");
            System.out.println("-------------------------");

        }

    }

}
