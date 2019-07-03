/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionpersona;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class CreacionPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Scanner entrada = new Scanner(System.in);
        //  
        System.out.println("DATOS DE ENTRADA");
        System.out.println("                ");
        System.out.print("Nombre persona 1: ");
        String cadena = entrada.next();
        persona1.setNombre(cadena);
        System.out.print("Edad persona 1: ");
        int numero = entrada.nextInt();
        persona1.setEdad(numero);
        //
        System.out.print("Nombre persona 2: ");
        String cadena2 = entrada.next();
        persona2.setNombre(cadena2);
        System.out.print("Edad persona 2: ");
        int numero2 = entrada.nextInt();
        persona2.setEdad(numero2);
        //
        System.out.print("Nombre persona 3: ");
        String cadena3 = entrada.next();
        persona3.setNombre(cadena3);
        System.out.print("Edad persona 3: ");
        int numero3 = entrada.nextInt();
        persona3.setEdad(numero3);
        System.out.println("               ");
        System.out.println("DATOS DE SALIDA");
        System.out.println("               ");
        System.out.println("PERSONA 1");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("PERSONA 2");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("PERSONA 3");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());

    }

}
