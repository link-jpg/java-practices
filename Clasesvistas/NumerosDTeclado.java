package Clasesvistas;

import java.util.Scanner;
import Clasesvistas.Datos;

public class NumerosDTeclado {
    public static void main(String[] Link) {
        // int a, b;
        Datos d1 = new Datos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Primer numero");
        d1.a = leer.nextInt();
        System.out.println("Ingrese el Segundo numero");
        d1.b = leer.nextInt();
        System.out.println("-----------------------------");
        if (d1.a > d1.b) {
            System.out.println(d1.a + " Es el numero mayor");
        } else {
            System.out.println(d1.b + " Es el numero mayor");
        }

    }
}
