package vetores.EjAprendizaje;

import java.util.Scanner;

public class ej3 {

    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
    cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension del vector: ");
        int n = leer.nextInt();
        int vector[] = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10001);
//            vector[i] = leer.nextInt();
            System.out.print("["+vector[i] + "] ");
        }

        int vectorDigitos[] = new int[n];

        for (int i = 0; i < n; i++) {
            int contadorDigitos = 0;
            
            int numero = vector[i];
            
            while (numero > 0) {
                numero /= 10;
                contadorDigitos++;//cuenta las operaciones hasta llegar a 0 ej 10/10=1 no es 0 asi que realiza otra operaciobn mas 1/10=0.1  y llega a 0 con esa serian 2 opeciones que registro el contador digito
            }
            switch (contadorDigitos) {// segun contador digito es donde entra en el swhitch
                case 1 -> vectorDigitos[0] += 1;
                case 2 -> vectorDigitos[1] += 1;
                case 3 -> vectorDigitos[2] += 1;
                case 4 -> vectorDigitos[3] += 1;
                case 5 -> vectorDigitos[4] += 1;
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (i<5) {
                System.out.println("Con " + (i + 1) + " digitos " + vectorDigitos[i]);
            }
            
        }
 
    }
}
