package Retos;

//Importamos la clase Random y Scanner 
import java.util.Random;
import java.util.Scanner;

public class RetoVII{

    public static void main(String[] args) {

        // Declaramos variables
        int eleccion;
        int apuesta;
        int acumulado=0;
        int contador=0;
        String res;

        // Instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);

        // Instanciamos el metodo Random 
        Random elegir = new Random();
        // Creamos la variable eleccion y utilizamos el metodo random
        int moneda = elegir.nextInt(2);

        System.out.println("¡Jugaremos carisellazo!");
        System.out.println("Si su elección coincide con la del programa gana, si no, pierde.");
        System.out.println("Si usted gana se le sumarán $200 a su apuesta y si pierde se le restarán.");

        //Solicitamos el valor que desea apostar
        System.out.println("¿Cuanto dinero desea apostar?");
        //Capturamos apuesta
        apuesta=leer.nextInt();

        do{
            // Solicitamos la elección
            System.out.println("¡A jugar!");
            System.out.println("En este momento la moneda esta en el aire \n Elija 0.Cara o 1.Sello");
            // Capturamos la elección
            eleccion = leer.nextInt();

            // Comparamos que elección coinciada o no con moneda
            if (eleccion == moneda) {
                System.out.println("Su elección fue: " + eleccion);
                System.out.println("La elección del programa fue: " + moneda);
                System.out.println("Su elección conincide con la del programa. ¡Felicitaciones, usted ganó!");

            //Le sumamos al acumulado 
            acumulado=acumulado+200;
                    
            
            //Mostramos la cantidad de dinero que tiene 
            System.out.println("Su acumulado va en $" +acumulado);


            } else {
                System.out.println("Su elección fue: " + eleccion);
                System.out.println("La elección del programa fue: " + moneda);
                System.out.println("Su elección no coincide con la del programa. Lo sentimos usted ha perdido");

            //Le sumamos al acumulado 
            acumulado=acumulado-200;

            //Mostramos la cantidad de dinero que tiene 
            System.out.println("Su acumulado va en $" +acumulado);
                
            }

        //Incrementamos el contador 
        contador=contador+1;

        //Preguntamos que si desea volver a jugar
        System.out.println("¿Desea volver a jugar?");
        //capturamos la respuesta 
        res=leer.next();


        }while(res.equals("si"));

    //Mostramos la cantidad de veces que jugo 
    System.out.println("Usted jugo "+contador+ " veces y durante el juego acumulo $" +acumulado+ " en total gano $" +(apuesta+acumulado));

    // Limpiamos el buffer
    leer.close();

    }
}
