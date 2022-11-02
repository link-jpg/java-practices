import java.util.Scanner;

public class Operadores8 {
    /*
     * La calificacion final de un estudiante de informatica se calcula con la base
     * de las calificaciones de cuatro aspectos de su rendimiento
     * academico: Participacion,Primer Examen parcial,Segundo Examen Parcial y
     * Examen Parcial Final. Sabiendo que las calificaciones anteriores entran a la
     * calificacion final con la ponderaciones del 10%,25%,25% y 40%, hacer un
     * programa que calcule e imprima la calificacion final obtenida por un
     * estudiante.
     */
    public static void main(String[] args) {
        float Parti, P1, P2, P3;
        int validacion;
        try (Scanner zero = new Scanner(System.in)) {
            System.out.println("inserte su participacion en clase");
            validacion = zero.nextInt();
            if (validacion <= 10 && validacion >= 0) {
                System.out.println("Su nota a sido guardada correctamente");
                Parti = validacion;
                System.out.println("nota guardada: " + Parti);
                validacion += 0;
                System.out.println("inserte nota del Primer Parcial");
                validacion = zero.nextInt();
                if (validacion <= 10 && validacion >= 0) {
                    System.out.println("Su nota a sido guardada correctamente");
                    P1 = validacion;
                    System.out.println("nota guardada: " + P1);
                    validacion += 0;
                    System.out.println("inserte nota del Segundo Parcial");
                    validacion = zero.nextInt();
                    if (validacion <= 10 && validacion >= 0) {
                        System.out.println("Su nota a sido guardada correctamente");
                        P2 = validacion;
                        System.out.println("nota guardada: " + P2);
                        validacion += 0;
                        System.out.println("inserte nota del Parcial Final");
                        validacion = zero.nextInt();
                        if (validacion <= 10 && validacion >= 0) {
                            System.out.println("Su nota a sido guardada correctamente");
                            System.out.println("");
                            P3 = validacion;
                            System.out.println("nota guardada: " + P3);
                            System.out.println("Nota De Participacion: " + Parti
                                    + "\n Nota Del Primer Parcial: " + P1
                                    + "\n Nota Del Segundo Parcial: " + P2
                                    + "\n Nota Del Parcial Final: " + P3);
                            Parti = Parti * 0.10f;
                            P1 = P1 * 0.25f;
                            P2 = P2 * 0.25f;
                            P3 = P3 * 0.40f;
                            System.out.println("Nota De Participacion %: " + Parti
                                    + "\n Nota Del Primer Parcial%: " + P1
                                    + "\n Nota Del Segundo Parcial%: " + P2
                                    + "\n Nota Del Parcial Final%: " + P3);
                            System.out.println("Promedio final: " + (Parti + P1 + P2 + P3));
                        } else {
                            System.out.println("El numero introducido no es valido ingrese del 0 al 10");
                        }
                    } else {
                        System.out.println("El numero introducido no es valido ingrese del 0 al 10");
                    }

                } else {
                    System.out.println("El numero introducido no es valido ingrese del 0 al 10");
                }
            } else {
                System.out.println("El numero introducido no es valido ingrese del 0 al 10");
            }

        }
    }
}
