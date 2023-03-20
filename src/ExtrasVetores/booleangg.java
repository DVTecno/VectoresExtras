package ExtrasVetores;

import java.util.Scanner;

public class booleangg {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean mayor;
        System.out.print("Ingrese ingrese edad a evaluar: ");
        int edad = leer.nextInt();
        System.out.println(esMayor(edad));
        mayor=esMayor(edad);
        System.out.println("Es mayor? "+ mayor);
     
                
     }

    private static boolean esMayor(int edad) {
        return edad >= 18;
    }

}
