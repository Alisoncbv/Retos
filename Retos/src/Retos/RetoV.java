package Retos;

//Importar clase Scanner 
import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
        
        //Declarar Variables 
        int fecha;
        String mes;


        //Instanciar clase Scanner 
        Scanner leer=new Scanner(System.in);

        System.out.println("¿Qué te caracteriza según tu signo?");

        //Solicitar datos 
        System.out.println("Ingresa el mes en que cumples años");
        //Capturar mes
        mes=leer.nextLine();
        System.out.println("Ingresa el día en que cumples años");
        //Capturar fecha
        fecha=leer.nextInt();

        //Enero
        if(mes.equals("enero")){
            if(fecha>=20 && fecha<=31){
                System.out.println("Tu signo zodiacal es Acuario y te caracteristicas por tener una personalidad fuerte.");
            }else{
                System.out.println("Tu signo zodiacal es Capricornio y te caracteristicas por ser estable, seguro y tranquilo.");
            }
        }

        //Febrero
         if(mes.equals("febrero")){
            if(fecha>=1 && fecha<=18){
                System.out.println("Tu signo zodiacal es Acuario y te caracteristicas por tener una personalidad fuerte.");
            }else{
                System.out.println("Tu signo zodiacal es Piscis y te caracteristicas por ser tranquilo, amable y paciente.");
            }
        }

        //Marzo
         if(mes.equals("marzo")){
            if(fecha>=1 && fecha<=20){
                System.out.println("Tu signo zodiacal es Piscis y te caracteristicas por ser tranquilo, amable y paciente.");
            }else{
                System.out.println("Tu signo zodiacal es Aries y te caracteristicas por estar lleno de energia.");
            }
        }

        //Abril 
        if(mes.equals("abril")){
            if(fecha>=1 && fecha<=20){
                System.out.println("Tu signo zodiacal es Aries y te caracteristicas por estar lleno de energia.");
            }else{
                System.out.println("Tu signo zodiacal es Tauro y te caracteristicas por tener una gran fuerza de voluntad.");
            }
        }

        //Mayo
        if(mes.equals("Mayo")){
            if(fecha>=1 && fecha<=20){
                System.out.println("Tu signo zodiacal es Tauro y te caracteristicas por tener una gran fuerza de voluntad.");
            }else{
                System.out.println("Tu signo zodiacal es Géminis y te caracteristicas por tener un caracter doble y complejo.");
            }
        }
        
        //Junio
        if(mes.equals("junio")){
            if(fecha>=1 && fecha<=20){
                System.out.println("Tu signo zodiacal es Géminis y te caracteristicas por tener un caracter doble y complejo");
            }else{
                System.out.println("Tu signo zodiacal es Cancer y te caracteristicas por tener una alta capacidad literaria.");
            }
        }

        //Julio
        if(mes.equals("julio")){
            if(fecha>=1 && fecha<=22){
                System.out.println("Tu signo zodiacal es Cancer y te caracteristicas por tener una alta capacidad literaria.");
            }else{
                System.out.println("Tu signo zodiacal es Leo y te caracteristicas por ser demasiado creativo.");
            }
        }

        //Agosto 
        if(mes.equals("agosto")){
            if(fecha>=1 && fecha<=22){
                System.out.println("Tu signo zodiacal es Leo y te caracteristicas por ser demasiado creativo.");
            }else{
                System.out.println("Tu signo zodiacal es Virgo y te caracteristicas por ser observador y paciente.");
            }
        }

        //Septiembre 
        if(mes.equals("septiembre")){
            if(fecha>=1 && fecha<=22){
                System.out.println("Tu signo zodiacal es Virgo y te caracteristicas por ser observador y paciente.");
            }else{
                System.out.println("Tu signo zodiacal es Libra y te caracteristicas por ser elegante y tener buen gusto.");
            }
        }
    
        //Octubre 
        if(mes.equals("octubre")){
            if(fecha>=1 && fecha<=22){
                System.out.println("Tu signo zodiacal es Libra y te caracteristicas por ser elegante y tener buen gusto.");
            }else{
                System.out.println("Tu signo zodiacal es Escorpio y te caracteristicas por ser tranquilo y observador");
            }
        }
    
        //Noviembre 
        if(mes.equals("noviembre")){
            if(fecha>=1 && fecha<=21){
                System.out.println("Tu signo zodiacal es Escorpio y te caracteristicas por ser tranquilo y observador");
            }else{
                System.out.println("Tu signo zodiacal es Sagitario y te caracteristicas por ser positivo y exigente");
            }
        }
        
        //Diciembre 
        if(mes.equals("diciembre")){
            if(fecha>=1 && fecha<=21){
                System.out.println("Tu signo zodiacal es Sagitario y te caracteristicas por ser positivo y exigente");
            }else{
                System.out.println("Tu signo zodiacal es Capricornio y te caracteristicas por ser estable, seguro y tranquilo.");
            }
        }
        
    System.out.println("Gracias por utilizar el programa");

    //limpiar buffer 
    leer.close();  


        


    }
    
}
