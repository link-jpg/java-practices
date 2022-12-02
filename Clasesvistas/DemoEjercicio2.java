package Clasesvistas;

import java.util.Scanner;
import Clasesvistas.Alumno;
import Clasesvistas.Profesor;
import Clasesvistas.Universidad;

public class DemoEjercicio2 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        Profesor p1 = new Profesor();
        Universidad u1 = new Universidad();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        a1.nombre = leer.nextLine();
        System.out.println("Ingrese el nombre del profesor:");
        p1.nombre = leer.nextLine();
        System.out.println("Ingrese el nombre de la universidad:");
        u1.nombre = leer.nextLine();
        System.out.println(" Alumno: " + a1.nombre + "\n Profesor: " + p1.nombre + "\n Universidad: " + u1.nombre);
    }
}
