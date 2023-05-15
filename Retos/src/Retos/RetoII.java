package Retos;

import java.util.Scanner;

public class RetoII {
    
    public static void main(String[] args){

        //Declarar variables 
        String nombreE;
        String nombreM;
        String nombreB;
        int mesesBebe;
        int pesoBebe;
        int dosisVacuna=0;
        //Instanciamos la clase Scanner 
        Scanner leer=new Scanner(System.in);

        //Solicitamos el nombre de la enfermera
        System.out.println("Ingrese el nombre de la enfermera");
        //Capturamos el nombre de la enfermera 
        nombreE=leer.nextLine();

        //Solicitamos el nombre de la mamá del bebé
        System.out.println("Ingrese el nombre de la mamá del bebé");
        //Capturamos el nombre de la mamá 
        nombreM=leer.nextLine();

        //Solicitamos el nombre del bebé
        System.out.println("Ingrese el nombre del bebé");
        //Capturamos el nombre del bebé
        nombreB=leer.nextLine();

        //Solicitamos los meses del bebé
        System.out.println("Ingrese los meses cumplidos del bebé");
        //Capturamos los meses del bebé
        mesesBebe=leer.nextInt();

        //Solicitamos el peso del bebé
        System.out.println("Ingrese el peso del bebé");
        //Capturamos el peso del bebé
        pesoBebe=leer.nextInt();


        //Realizamos la operación 
        dosisVacuna=(pesoBebe+10/mesesBebe*10)*8;

        //Mostramos el resultado 
        System.out.println("El nombre de la enfermera es: "+nombreE+ ", el nombre de la madre es: "+nombreM+ ", el nombre del bebé es: "+nombreB+ ", tiene: " +mesesBebe+ " meses, pesa: " +pesoBebe+ " g y la dosis que se le debe aplicar es: " + dosisVacuna);

        //Limpiamos 
        leer.close();




    }
}
