package ExtrasVetores;

import java.util.Scanner;

public class Ej4Extras {

    public static void main(String[] args) {
        int cantidadAlumnos = 10;
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        Scanner scanner = new Scanner(System.in);

        // Carga de notas y cálculo de promedios
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese las notas: ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();
            double nota4 = scanner.nextDouble();

            double promedio = (nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5) / 4;
            promedios[i] = promedio;

            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}
