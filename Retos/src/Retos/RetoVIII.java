package Retos;

import java.util.Random;
import java.util.Scanner;

public class RetoVIII {

    public static void main(String[] args) {

        // Declaramos las variables
        int eleccion;
        String res="si";

        // Instanciamos la clase Scanner 
        Scanner leer = new Scanner(System.in);

        // Instanciamos el metodo Random
        Random elegir = new Random();
        int juego = elegir.nextInt(3);
        
        while(res.equals("si")){

            System.out.println("¡Empecemos!");

            System.out.println(" 0.Piedra 1.Papel o 2.Tijera ");
            // Capturamos la eleción del usuario
            eleccion = leer.nextInt();

            if (eleccion < 0 || eleccion > 2) {
                System.out.println("No es una opción validad");
                return;
            }

            if (eleccion == juego) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("El programa y usted sacaron lo mismo, fue empate");
            } else if (eleccion == 0 && juego == 1) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("Lo sentimos usted perdió");

            } else if (eleccion == 0 && juego == 2) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("¡Felicitaciones, usted ganó!");

            } else if (eleccion == 1 && juego == 0) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("¡Felicitaciones, usted ganó!");

            } else if (eleccion == 1 && juego == 2) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("Lo sentimos usted perdió");

            } else if (eleccion == 2 && juego == 0) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("Lo sentimos usted perdió");

            } else if (eleccion == 2 && juego == 1) {
                System.out.println("Usted saco: " + eleccion);
                System.out.println("El programa saco: " + juego);
                System.out.println("¡Felicitaciones, usted ganó!");

            }

            res="no";

        }

        // Solicitamos si desea volver a jugar
        System.out.println("¿Quiere jugar piedra, papel o tijera?");
        //Capturamos res 
        res=leer.next();
        
        System.out.println("El juego ha terminado");

        // Limpiamos buffer
        leer.close();

    }
}
