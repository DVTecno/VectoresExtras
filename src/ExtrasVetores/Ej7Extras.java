package ExtrasVetores;

import java.util.Scanner;

public class Ej7Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de terminos a consultar: ");
        int n = validarEntero(leer);
        int[] fibonacci = new int[n];
        devolverTerminos(fibonacci, n);
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

    private static void devolverTerminos(int[] fibonacci, int n) {
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        System.out.println("Terminos de la serie de Fibonacci:");
        System.out.println("Termino 1. 1 = 1 ");
        System.out.println("Termino 2. 1 = 1");
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println("Termino " + (i + 1) + ". " + fibonacci[i] + " = " + fibonacci[i - 1] + " + " + fibonacci[i - 2]);
        }
    }
}
