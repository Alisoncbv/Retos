package Retos;

//Importamos la clase Random y Scanner 
import java.util.Random;
import java.util.Scanner;

public class RetoIII {

    public static void main(String[] args) {

        // Declaramos variables
        int eleccion;

        // Instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);

        // Instanciamos la clase Random
        Random elegir = new Random();
        // Creamos la variable eleccion y utilizamos el metodo random
        int moneda = elegir.nextInt(2);

        // Solicitamos la elección
        System.out.println("¡Jugaremos carisellazo!");
        System.out.println("Si su elección coincide con la del programa gana, si no, pierde.");
        System.out.println("En este momento la moneda esta en el aire \n Elija 0.Cara o 1.Sello");
        // Capturamos la elección
        eleccion = leer.nextInt();

        // Validamos que la elección no sea menor que 0 o mayor que 1
        if (eleccion < 0 || eleccion > 1) {
            System.out.println("Ingrese un número valido");
            // Salir del if
            return;
        }

        // Comparamos que elección coinciada o no con moneda
        if (eleccion == moneda) {
            System.out.println("Su elección fue: " + eleccion);
            System.out.println("La elección del programa fue: " + moneda);
            System.out.println("Su elección conincide con la del programa. ¡Felicitaciones, usted ganó!");

        } else {
            System.out.println("Su elección fue: " + eleccion);
            System.out.println("La elección del programa fue: " + moneda);
            System.out.println("Su elección no coincide con la del programa. Lo sentimos usted ha perdido");
        }

        // Limpiamos el buffer
        leer.close();

    }
}
