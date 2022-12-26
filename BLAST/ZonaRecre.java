package BLAST;

import java.util.Scanner;

public class ZonaRecre {
    public void mensajes() {
        System.out.println(
                " Bienvenidos a la Zona Recreativa\n Digite 1 para ingresar a Word Games\n Digite 2 para ingresar a Gym Fit\n Digite 3 para salir de esta Zona");
    }

    public void mensajes2() {
        System.out.println(
                "Bienvenido a Word Games\nDigite 1 para ingresar a los carros chocones\nDigite 2 para ingresar al toro mecanico\nDigite 3 para ingresar a las maquinitas\nDigite 4 para salir del establecimiento");
    }

    public void mensajes3() {
        System.out.println(
                "Bienvenido a Gim Fit\nDigite 1 para acceder a la primera membresia\nDigite 2 para acceder a la segunda membresia\nDigite 3 para salir del establecimiento");
    }

    public void metodo1() {
        ZonaRecre obj1 = new ZonaRecre();
        Scanner eternal = new Scanner(System.in);
        int opcionsalir = 0, opcionsalir2 = 0, opcionprincipal, opcionselectiva = 0, cantidad;
        double cuenta;
        while (opcionsalir <= 20) {
            obj1.mensajes();
            opcionprincipal = eternal.nextInt();
            if (opcionprincipal > 0 && opcionprincipal <= 4) {
                switch (opcionprincipal) {
                    case 1:
                        while (opcionsalir2 <= 20) {
                            obj1.mensajes2();
                            opcionselectiva = eternal.nextInt();
                            if (opcionselectiva > 0 && opcionselectiva <= 4) {
                                switch (opcionselectiva) {
                                    case 1:
                                        System.out.println("el coste de los carritos chocones es de $2.00");
                                        System.out.println("el tiempo es de 1 minuto");
                                        System.out.println("ingrese la cantidad de tiempo que desea:");
                                        cantidad = eternal.nextInt();
                                        cuenta = cantidad * 2.00;
                                        System.out.println("el cuenta a pagar es de $" + cuenta);
                                        break;
                                    case 2:
                                        System.out.println("el coste del Toro Mecanico es de $3.00");
                                        System.out.println("el tiempo es de 1 minuto");
                                        System.out.println("ingrese la cantidad de tiempo que desea:");
                                        cantidad = eternal.nextInt();
                                        cuenta = cantidad * 3.00;
                                        System.out.println("el cuenta a pagar es de $" + cuenta);
                                        break;
                                    case 3:
                                        System.out.println("el coste de las maquinitas es de $2.00");
                                        System.out.println("el tiempo es de 1 minuto");
                                        System.out.println("ingrese la cantidad de tiempo que desea:");
                                        cantidad = eternal.nextInt();
                                        cuenta = cantidad * 2.00;
                                        System.out.println("el cuenta a pagar es de $" + cuenta);
                                        break;
                                    case 4:
                                        System.out.println("Gracias Regrese pronto");
                                        opcionsalir2 += 70;
                                        break;
                                    default:
                                        opcionsalir2 += 1;
                                        break;
                                }
                            } else {
                                System.out.println(
                                        "Numero Ingresado No Cumple Con Los Parametros \nDigite Una Opcion Valida");
                                opcionsalir += 1;
                            }
                        }
                        break;
                    case 2:
                        while (opcionsalir2 <= 20) {
                            obj1.mensajes3();
                            opcionselectiva = eternal.nextInt();
                            if (opcionselectiva > 0 && opcionselectiva <= 3) {
                                switch (opcionselectiva) {
                                    case 1:
                                        System.out.println("el coste de esta menbresia es de $20.00");
                                        System.out.println("gracias por preferirnos");
                                        break;
                                    case 2:
                                        System.out.println("el coste de esta menbresia es de $40.00");
                                        System.out.println("gracias por preferirnos");
                                        break;
                                    case 3:
                                        System.out.println("Gracias Regrese pronto");
                                        opcionsalir2 += 70;

                                        break;
                                    default:
                                        opcionsalir2 += 1;
                                        break;
                                }
                            } else {
                                System.out.println(
                                        "Numero Ingresado No Cumple Con Los Parametros \nDigite Una Opcion Valida");
                                opcionsalir += 1;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Regresando Al Menu Anterior");
                        opcionsalir += 70;
                        break;
                    default:
                        opcionsalir += 1;
                        break;
                }
            } else {
                System.out.println("Numero Ingresado No Cumple Con Los Parametros \nDigite Una Opcion Valida");
                opcionsalir += 1;
            }
        }
    }
}
