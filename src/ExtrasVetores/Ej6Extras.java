package ExtrasVetores;

import java.util.Scanner;

public class Ej6Extras {

    /*
6. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya
una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de
las palabras, rellene los espacios no utilizados con un número
aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
letras creada. Nota: Para resolver el ejercicio deberá investigar
cómo se utilizan las siguientes funciones de Java substring()
Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 20;
        char[][] sopa = new char[num][num];
        String[] palabras = new String[5];
        //validar que sean palabras de 3 o 5 caracter
        for (int i = 0; i < palabras.length; i++) {
            String palabra;
            do {
                System.out.println("Ingrese una palabra de entre 3 y 5 caracteres:");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            palabras[i] = palabra;
        }

        //acomodar las palabras
        int[] filasUtilizadas = new int[palabras.length]; //vector para saber si la fila fue usada
        for (int i = 0; i < palabras.length; i++) {
            boolean palabraColocada = false;
            int posicion = 0;
            int fila = 0;
            while (!palabraColocada) {
                fila = (int) (Math.random() * num);//filas random
                posicion = (int) (Math.random() * (num - palabras[i].length() + 1));//columnas random

                boolean puedeSerColocada = true;// aca verificamos si la posicion esta ocupada
                for (int j = 0; j < palabras[i].length(); j++) {
                    if (fila < num && posicion + j < num && sopa[fila][posicion + j] != 0) {
                        puedeSerColocada = false;// si esta ocupada por otra letra se vuekve a comenzar
                        break;
                    }
                }
                
                boolean filaUtilizada = false;
                for (int j = 0; j < i; j++) {
                    if (fila == filasUtilizadas[j]) {
                        filaUtilizada = true;// si la fila ya ha sido utilizada antes
                        break;
                    }
                }

                if (puedeSerColocada && !filaUtilizada) {
                    // Colocar la palabra en la sopa de letras
                    for (int j = 0; j < palabras[i].length(); j++) {
                        if (fila < num && posicion + j < num) {// colocar la palabra en la sopa de letras
                            sopa[fila][posicion + j] = palabras[i].charAt(j);
                        }
                    }
                    palabraColocada = true;
                    filasUtilizadas[i] = fila; // Agregar la fila al arreglo de filas utilizadas
                }
            }
        }

        for (int i = 0; i < num; i++) { // completar con numeros en 1-9 todos los lugares inicializados con 0
            for (int j = 0; j < num; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) ((int) (Math.random() * 10) + '0');
                }
            }
        }

       //imprimir la sopa
        System.out.print("+");//empieza +
        for (int j = 0; j < num - 1; j++) {
            System.out.print("---+");//continua ---+
        }
        System.out.println("---+");//esta se encarga de imprimir ---+ hasta completar

        for (int i = 0; i < num; i++) {
            System.out.print("| ");
            for (int j = 0; j < num; j++) {
                System.out.print(sopa[i][j] + " | ");
            }
            System.out.println();
            System.out.print("+");
            for (var j = 0; j < num - 1; j++) {
                System.out.print("---+");
            }
            System.out.println("---+");
        }

    }
}
