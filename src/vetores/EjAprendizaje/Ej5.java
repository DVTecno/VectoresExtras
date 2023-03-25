package vetores.EjAprendizaje;

public class Ej5 {

    /*
    Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
    La matriz traspuesta de una matriz A se denota por AT y se obtiene
    cambiando sus filas por columnas (o viceversa).
    
     [0][-2][4]      [0][2][-4]
     [2][0][2]      [-2][0][-2]
    [-4][-2][0]     [4][2][0]

En este caso la matriz es antisimétrica.

     */
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        boolean esAntisimetrica = true;

        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }

       
        
        
        
         //imprimir la sopa
        System.out.print("+");//empieza +
        for (int j = 0; j < 3 - 1; j++) {
            System.out.print("---+");//continua ---+
        }
        System.out.println("----+");//esta se encarga de imprimir ---+ hasta completar

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
            System.out.print("+");
            for (var j = 0; j < 3 - 1; j++) {
                System.out.print("---+");
            }
            System.out.println("----+");
        }
        System.out.println("---------------");
         if (esAntisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }
        System.out.println("---------------");
        
         for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " | ");
            }
            System.out.println();
            System.out.print("+");
            for (var j = 0; j < 3 - 1; j++) {
                System.out.print("---+");
            }
            System.out.println("----+");
        }

    }

}
