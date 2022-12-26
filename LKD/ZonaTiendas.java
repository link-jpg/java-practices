package LKD;

import java.util.Scanner;

public class ZonaTiendas {
    public void metodo2() {
        int opc = 0, num, num0, opc1 = 0;
        double total;
        try (Scanner Teclado = new Scanner(System.in)) {
            opc = 0;
            while (opc >= 0 && opc <= 2) {
                System.out.println(
                        " Bienvenidos a la Zona de Tiendas\n Digite 1 para ingresar tienda de lacteos\n Digite 2 para ingresar tienda de carnes\n Digite 3 para salir de esta Zona");
                num = Teclado.nextInt();
                switch (num) {
                    case 1:
                        opc = 0;
                        while (opc1 >= 0 && opc1 <= 5) {
                            System.out.println("Bienvenido a tienda lacteos San Vicente");
                            System.out.println("Digite 1 para seleccionar Queso");
                            System.out.println("Digite 2 para seleccionar Crema");
                            System.out.println("Digite 3 para seleccionar Requeson");
                            System.out.println("Digite 4 para salir del establecimiento");
                            num0 = Teclado.nextInt();
                            switch (num0) {
                                case 1:
                                    System.out.println("el coste del Queso es de $1.00 por onza");
                                    System.out.println("ingrese la cantidad de queso que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 1.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 2:
                                    System.out.println("el coste de la Crema es de $1.50 por unidad");
                                    System.out.println("ingrese la cantidad de Crema que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 1.50;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 3:
                                    System.out.println("el coste del Requeson es de $2.00 por unidad");
                                    System.out.println("ingrese la cantidad de Requeson que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 2.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 4:
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
                    case 2:
                        opc1 = 0;
                        while (opc1 >= 0 && opc1 <= 3) {
                            System.out.println("Bienvenido a Gim Fit");
                            System.out.println("Digite 1 para seleccionar carne de rez");
                            System.out.println("Digite 2 para seleccionar carne de cerdo");
                            System.out.println("Digite 3 para salir del establecimiento");
                            num0 = Teclado.nextInt();
                            switch (num0) {
                                case 1:
                                    System.out.println("el coste de la carne de rez es de $3.00 por libra");
                                    System.out.println("ingrese la cantidad de queso que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 3.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    break;
                                case 2:
                                    System.out.println("el coste de la Carne de cerdo es de $2.25 por libra");
                                    System.out.println("ingrese la cantidad de queso que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 2.25;
                                    System.out.println("el total a pagar es de $" + total);
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
