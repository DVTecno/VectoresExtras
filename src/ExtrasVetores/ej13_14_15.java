package ExtrasVetores;

import java.util.Scanner;

public class ej13_14_15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String vector[] = new String[9];

        for (int i = 0; i < 9; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            vector[i] = leer.nextLine();
        }
        for (String string : vector) {
            System.out.print(string + ",  ");
        }
        System.out.println("");

    }

}
