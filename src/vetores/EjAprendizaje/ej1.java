package vetores.EjAprendizaje;

public class ej1 {
/*
    1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.

    */
    public static void main(String[] args) {
        int vector[] = new int[100]; //declarar vector tipo int e intanciar com 100 posiciones 
        for (int i = 0; i < 100; i++) {
            vector[i] = (i + 1);// llenar con la variable local mas 1 desde su posicion 0 hasta la 99 asi cumpliendo las 100
        }
        for (int i = 100; i > 0; i--) {
            System.out.print("[" + vector[i - 1] + "]");
        }
        System.out.println("");
    }

}
