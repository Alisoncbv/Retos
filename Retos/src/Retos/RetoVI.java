package Retos;

//Importar clase Scanner 
import java.util.Scanner;

public class RetoVI {

    public static void main(String[] args) {
        
        //Declarar variables 
        int cantidad;
        int precio;
        int total_compra=0;

        //Instanciar la clase Scanner
        Scanner leer=new Scanner(System.in);

        //Solicitar la cantidad de productos que desea comprar 
        System.out.println("¿Cuantos productos desea llevar?");
        //Capturar cantidad
        cantidad=leer.nextInt();

        //For 
        for(int i=1; i<cantidad+1; i++){

            //Solicitar el precio de los productos 
            System.out.print("Ingrese el precio del producto " + i);
            //Capturar precio
            precio=leer.nextInt();

            //Sumar los precios
            total_compra=total_compra+precio;

        }

        //Total de la compra 
        System.out.println("En total debe pagar: $" +total_compra);

        //Limpiar buffer 
        leer.close();

        
    }
    
}
