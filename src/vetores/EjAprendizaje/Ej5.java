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

        if (esAntisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }

    }

}
