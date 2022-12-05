package Exposicion;

import java.util.*;

public class Restaurante {
    String Nombre, Ubicacion, Telefono, tipoCom;
    Scanner entrada = new Scanner(System.in);

    public void InfNombre() {
        System.out.println("Ingrese el Nombre del Restaurante");
        Nombre = entrada.nextLine();
        System.out.println("Ingrese la Ubicacion del Restaurante");
        Ubicacion = entrada.nextLine();
        System.out.println("Ingrese el Numero del Restaurante");
        Telefono = entrada.nextLine();
        System.out.println("Que tipo de Comida sirve el Restaurante");
        tipoCom = entrada.nextLine();
        System.out.println("\n\n");
        System.out.println("******************************************************");
        System.out.println("El nombre del restaurante es: " + Nombre);
        System.out.println("La ubicacion del restaurante es: " + Ubicacion);
        System.out.println("El numero de telefono del restaurante es: " + Telefono);
        System.out.println("El restaurante sirve: " + tipoCom);
        System.out.println("******************************************************");

    }
}
