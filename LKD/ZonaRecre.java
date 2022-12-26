package LKD;

import java.util.Scanner;

public class ZonaRecre {

    public void metodo1() {
        int opc = 0, num, num0, opc1 = 0;
        double total;
        try (Scanner Teclado = new Scanner(System.in)) {
            opc = 0;
            while (opc >= 0 && opc <= 2) {
                System.out.println(
                        " Bienvenidos a la Zona Recreativa\n Digite 1 para ingresar a Word Games\n Digite 2 para ingresar a Gym Fit\n Digite 3 para salir de esta Zona");
                num = Teclado.nextInt();
                switch (num) {
                    case 1:
                        opc = 0;
                        while (opc1 >= 0 && opc1 <= 5) {
                            System.out.println("Bienvenido a Word Games");
                            System.out.println("Digite 1 para ingresar a los carros chocones");
                            System.out.println("Digite 2 para ingresar al toro mecanico");
                            System.out.println("Digite 3 para ingresar a las maquinitas");
                            System.out.println("Digite 4 para salir del establecimiento");
                            num0 = Teclado.nextInt();
                            switch (num0) {
                                case 1:
                                    System.out.println("el coste de los carritos chocones es de $2.00");
                                    System.out.println("el tiempo es de 1 minuto");
                                    System.out.println("ingrese la cantidad de tiempo que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 2.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 2:
                                    System.out.println("el coste del Toro Mecanico es de $3.00");
                                    System.out.println("el tiempo es de 1 minuto");
                                    System.out.println("ingrese la cantidad de tiempo que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 3.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 3:
                                    System.out.println("el coste de las maquinitas es de $2.00");
                                    System.out.println("el tiempo es de 1 minuto");
                                    System.out.println("ingrese la cantidad de tiempo que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 2.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 4:
                                    opc1 += 20;
                                    System.out.println("Gracias Regrese pronto");
                                    System.out.println(" ");
                                    break;
                                default:
                                    opc1 += 20;
                                    System.out.println("opcion ingresada no valida");
                                    System.out.println(" ");
                                    break;
                            }
                            opc1 += 1;
                        }
                        break;
                    case 2:
                        opc1 = 0;
                        while (opc1 >= 0 && opc1 <= 3) {
                            System.out.println("Bienvenido a Gim Fit");
                            System.out.println("Digite 1 para acceder a la primera membresia");
                            System.out.println("Digite 2 para acceder a la segunda membresia");
                            System.out.println("Digite 3 para salir del establecimiento");
                            num0 = Teclado.nextInt();
                            switch (num0) {
                                case 1:
                                    System.out.println("el coste de esta menbresia es de $20.00");
                                    System.out.println("gracias por preferirnos");
                                    break;
                                case 2:
                                    System.out.println("el coste de esta menbresia es de $40.00");
                                    System.out.println("gracias por preferirnos");
                                    break;
                                case 3:
                                    opc1 += 20;
                                    System.out.println("Gracias Regrese pronto");
                                    break;
                                default:
                                    opc1 += 20;
                                    System.out.println("opcion ingresada no valida");
                                    break;
                            }
                            opc1 += 1;
                        }
                        break;
                    default:
                        System.out.println("Gracias por su visita");
                        opc += 20;
                        break;
                }
                opc += 1;
            }
            opc = +1;
        }
    }
}
