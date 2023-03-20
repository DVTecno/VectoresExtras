package vetores.EjAprendizaje;

public class ej1 {

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
