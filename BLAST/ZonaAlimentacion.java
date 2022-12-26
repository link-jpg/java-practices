package BLAST;

import java.util.Scanner;

public class ZonaAlimentacion {
    public void mensajes() {
        System.out.println(
                " Bienvenidos a la Zona de Alimentos\n Digite 1 para ingresar al Restaurante\n Digite 2 para salir de esta Zona");
    }

    public void mensajes2() {
        System.out.println(
                "Bienvenido a Word Games\nDigite 1 para seleccionar el plato 1\nDigite 2 para seleccionar el plato 2\nDigite 3 para seleccionar el plato 3\nDigite 4 para salir del establecimiento");

    }

    public void metodo3() {
        Scanner eternal = new Scanner(System.in);
        int opcionsalir = 0, opcionsalir2 = 0, opcionprincipal, opcionselectiva = 0, cantidad;
        double cuenta;
        ZonaAlimentacion obj1 = new ZonaAlimentacion();
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
                                        System.out.println("El Costo Del Plato 1 Es De $5.00");
                                        System.out.println("Ingrese La Cantidad Que Desea Ordenar Es De:");
                                        cantidad = eternal.nextInt();
                                        cuenta = cantidad * 5.00;
                                        System.out.println("La Cuenta Total Es De: $" + cuenta);
                                        System.out.println("Buen Provecho ");
                                        break;
                                    case 2:
                                        System.out.println("El Costo Del Plato 2 Es De $10.00");
                                        System.out.println("Ingrese La Cantidad Que Desea Ordenar Es De:");
                                        cantidad = eternal.nextInt();
                                        cuenta = cantidad * 10.00;
                                        System.out.println("La Cuenta Total Es De: $" + cuenta);
                                        System.out.println("Buen provecho");
                                        break;
                                    case 3:
                                        System.out.println("El Costo Del Plato 3 Es De $15.00");
                                        System.out.println("Ingrese La Cantidad Que Desea Ordenar Es De:");
                                        cantidad = eternal.nextInt();
                                        cuenta = cantidad * 15.00;
                                        System.out.println("La Cuenta Total Es De: $" + cuenta);
                                        System.out.println("Buen provecho");
                                        break;
                                    case 4:
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
