package vetores.EjAprendizaje;

public class ej4 {

    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
    muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
    se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];
        llenarMatriz(matrizA);
        System.out.println("Matirz 1 ");
        mostrarMatriz(matrizA);
        System.out.println("");
        matrizTranspuesta(matrizA, matrizB);
        System.out.println("Matriz 2");
        mostrarMatriz(matrizB);

    }

    private static void llenarMatriz(int[][] matrizA) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

    }

    private static void matrizTranspuesta(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
    }

}
