package Clasesvistas;

import java.util.Scanner;
import Clasesvistas.Datos;

public class Demomultiplo {
    public static void main(String[] Link) {
        Datos d1 = new Datos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Primer numero");
        d1.a = leer.nextInt();

        if (d1.a % 4 == 0) {
            System.out.println(d1.a + " Es multiplo de 4");
        } else {
            System.out.println(d1.a + " No es multiplo de 4");
        }
    }
}
