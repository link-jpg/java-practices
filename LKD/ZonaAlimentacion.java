package LKD;

import java.util.Scanner;

public class ZonaAlimentacion {
    public void metodo3() {
        int opc = 0, num, num0, opc1 = 0;
        double total;
        try (Scanner Teclado = new Scanner(System.in)) {
            opc = 0;
            while (opc >= 0 && opc <= 1) {
                System.out.println(
                        " Bienvenidos a la Zona de Alimentos\n Digite 1 para ingresar al Restaurante\n Digite 3 para salir de esta Zona");
                num = Teclado.nextInt();
                switch (num) {
                    case 1:
                        opc = 0;
                        while (opc1 >= 0 && opc1 <= 5) {
                            System.out.println("Bienvenido a Word Games");
                            System.out.println("Digite 1 para seleccionar el plato 1");
                            System.out.println("Digite 2 para seleccionar el plato 2");
                            System.out.println("Digite 3 para seleccionar el plato 3");
                            System.out.println("Digite 4 para salir del establecimiento");
                            num0 = Teclado.nextInt();
                            switch (num0) {
                                case 1:
                                    System.out.println("el coste del plato 1 es de $5.00");
                                    System.out.println("ingrese la cantidad de platos que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 5.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    System.out.println("Buen Provecho ");
                                    break;
                                case 2:
                                    System.out.println("el coste del plato 2 es de $10.00");
                                    System.out.println("ingrese la cantidad de platos que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 10.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    System.out.println("Buen provecho");
                                    break;
                                case 3:
                                    System.out.println("el coste del plato 3 es de $15.00");
                                    System.out.println("ingrese la cantidad de platos que desea:");
                                    num0 = Teclado.nextInt();
                                    total = num0 * 15.00;
                                    System.out.println("el total a pagar es de $" + total);
                                    System.out.println("Buen provecho");
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
