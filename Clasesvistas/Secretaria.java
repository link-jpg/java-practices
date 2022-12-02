package Clasesvistas;

import java.util.Scanner;

public class Secretaria {
    public static void datos() {
        String nombrevacante;
        int edad, numerotel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrevista Para El empleo De Secretaria");
        System.out.println("Para Obtener El Cargo De Secretaria debe ser mayor de edad de caso contrario no");
        System.out.println("Ingrese su nombre:");
        nombrevacante = sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println(nombrevacante + " Usted es apto para el trabajo");
        } else {
            System.out.println(nombrevacante + " Usted no cumple con la edad minima");

        }

    }

    public static void main(String[] args) {
        datos();
    }
}
