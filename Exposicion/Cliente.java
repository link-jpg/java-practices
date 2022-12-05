package Exposicion;

import java.util.*;;

public class Cliente {
    String Name, Numeromesa, Fechareservacion;

    public void in() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("El nombre del cliente es: ");
        Name = entrada.next();
        System.out.println("El numero de la mesa es: ");
        Numeromesa = entrada.next();
        System.out.println("La fecha de reservacion es: ");
        Fechareservacion = entrada.next();
    }

    public String InfName() {
        System.out.println("\n\n");
        System.out.println("********************************************");
        return "Nombre: " + Name + "\nNumero de mesa: " + Numeromesa + "\nFecha de reservacion: " + Fechareservacion
                + "\n********************************************";
    }
}
