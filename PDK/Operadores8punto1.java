package PDK;

import java.util.Scanner;

public class Operadores8punto1 {
    public static void main(String[] args) {
        float Parti, P1, P2, P3;
        try (Scanner zero = new Scanner(System.in)) {
            System.out.println("Ingrese su participacion");
            Parti = zero.nextFloat();
            System.out.println("Ingrese su P1");
            P1 = zero.nextFloat();
            System.out.println("Ingrese su P2");
            P2 = zero.nextFloat();
            System.out.println("Ingrese su P3");
            P3 = zero.nextFloat();
        }
        Parti *= 0.10f;
        P1 *= 0.25f;
        P2 *= 0.25f;
        P3 *= 0.40f;
        System.out.println("Nota de asistencia: " + Parti + "\n Nota de Parcial 1: " + P1
                + "\n Nota de Parcial 2: " + P2
                + "\n Nota de Parcial Final: " + P3);
        System.out.println("El promedio de la nota es: " + (Parti + P1 + P2 + P3));
    }
}
