package PDK;

import java.util.Scanner;

public class Entradadedatos2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;
        // Acortar palabra
        System.out.println("Inserte una palabra"
                + "\n De la palabra insertada solo se mostrara la tercera letra");
        letra = teclado.next().charAt(2);
        // next solo toma en cuenta una palabra y nextLine la oracion completa
        // recordar que se lleva en cuenta el 0
        System.out.println("Palabra recortada: " + letra);

    }
}
