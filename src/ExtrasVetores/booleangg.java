package ExtrasVetores;

import java.util.Scanner;

public class booleangg {
    
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        
        String opcion = "si";
        do {
            System.out.print("Ingrese un Nombre: ");
            String nom = leer.nextLine();
            System.out.print("Ingrese la Edad: ");
            int edad = leer.nextInt();
            
            System.out.println("El nombre de la Persona ingresada es: " + nom);
            System.out.println("La edad es: " + edad);
            if (edad >= 18) {
                System.out.println("Es mayor de edad: ");
            } else {
                System.out.print("Esta Persona es Menor de Edad:");
            }
            System.out.println("Desea seguir ingresando nombres: si/no: ");
            // Scanner leer = new Scanner(System.in);leer.nextLine(); // con esta linea limpias el buffer asi pasa tu basurero y se lleva los restos de los otros tipos de datos
            opcion = leer.nextLine();
        } while (opcion.equals("si"));
        
    }
}
