package ejbasico7;

import java.util.Scanner;

public class EjBasico7 {
    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos las variables nombre, direccion y telf
        String nombre, direccion;
        int telf;

        /**
         * Le pedimos al usuario que introduzca el su nombre, dirección y teléfono y lo
         * guardamos en las variables previamente declarada
         */
        System.out.println("Introduzca su nombre:");
        nombre = sc.next();
        System.out.println("Introduzca su dirección:");
        direccion = sc.next();
        System.out.println("Introduzca su número de teléfono:");
        telf = sc.nextInt();

        //mostramos por consola las variables
        System.out.println("Nombre: "+nombre);
        System.out.println("Dirección: "+direccion);
        System.out.println("Teléfono: "+telf);


    }
}
