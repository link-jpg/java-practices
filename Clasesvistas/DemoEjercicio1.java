package Clasesvistas;

import java.util.Scanner;
import Clasesvistas.Universidad;
import Clasesvistas.MisDatos;

public class DemoEjercicio1 {
    public static void main(String[] link) {
        MisDatos dato1;
        dato1 = new MisDatos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        dato1.nombre = leer.nextLine();
        System.out.println("Ingrese el apellido: ");
        dato1.apellido = leer.nextLine();
        System.out.println("Ingrese el numero de carnet: ");
        dato1.numcarnet = leer.nextLine();
        System.out.println("---------------------------------");
        System.out.println(" Nombre: " + dato1.nombre
                + "\n Apellido: " + dato1.apellido
                + "\n Carnet: " + dato1.numcarnet);
        System.out.println("---------------------------------");
        Universidad ul;
        ul = new Universidad();
        ul.nombre = "Universidad Tecnologica";
        ul.direccion = "Calle arce #210";
        System.out.println(" Universidad: " + ul.nombre + "\n Direccion: " + ul.direccion);
        System.out.println("---------------------------------");
        MisDatos dato2;
        dato2 = new MisDatos();
        System.out.println("Ingrese el nombre: ");
        dato2.nombre = leer.nextLine();
        System.out.println("Ingrese el apellido: ");
        dato2.apellido = leer.nextLine();
        System.out.println("Ingrese el numero de carnet: ");
        dato2.numcarnet = leer.nextLine();
        System.out.println("---------------------------------");
        System.out.println(" Nombre: " + dato2.nombre
                + "\n Apellido: " + dato2.apellido
                + "\n Carnet: " + dato2.numcarnet);
        System.out.println("---------------------------------");
        Universidad ul1;
        ul1 = new Universidad();
        ul1.nombre = "Universidad Don Bosco";
        ul1.direccion = "Ciudadela #1547";
        System.out.println(" Universidad: " + ul1.nombre + "\n Direccion: " + ul1.direccion);
        System.out.println("---------------------------------");

    }
}
