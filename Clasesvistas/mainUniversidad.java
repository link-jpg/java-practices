package Clasesvistas;

import java.util.Scanner;

import Clasesvistas.Universidad1;

public class mainUniversidad {
    public static void main(String[] link) {
        Universidad1 u1 = new Universidad1();
        u1.mostrar("Universidad Tecnologica", "Calle Arce", "2575-8888", "utec.edu.sv");
        System.out.println("-------------------------------");
        Universidad1 u2 = new Universidad1();
        String nom, dir, te, corr;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Universidad");
        nom = leer.nextLine();
        System.out.println("Ingrese la direccion de la Universidad");
        dir = leer.nextLine();
        System.out.println("Ingrese el telefono de la Universidad");
        te = leer.nextLine();
        System.out.println("Ingrese el correo de la Universidad");
        corr = leer.nextLine();
        System.out.println("-------------------------------");
        u2.mostrar(nom, dir, te, corr);
        System.out.println("///////////////////////////////");
        Universidad1 u3 = new Universidad1();
        u3.mostrar("Universidad Gavidia", "Primera Calle", "2289-9998", "uga.edu.sv");
        System.out.println("-------------------------------");
        Universidad1 u4 = new Universidad1();
        System.out.println("Ingrese el nombre de la Universidad");
        nom = leer.nextLine();
        System.out.println("Ingrese la direccion de la Universidad");
        dir = leer.nextLine();
        System.out.println("Ingrese el telefono de la Universidad");
        te = leer.nextLine();
        System.out.println("Ingrese el correo de la Universidad");
        corr = leer.nextLine();
        System.out.println("-------------------------------");
        u4.mostrar(nom, dir, te, corr);

    }
}
