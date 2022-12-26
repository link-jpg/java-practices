package LKD;

import java.util.Scanner;

import LKD.ZonaAlimentacion;
import LKD.ZonaRecre;
import LKD.ZonaTiendas;

public class CentroComercial {
    private String nombre, Codigopostal;

    public String getNombre() {
        return nombre;
    }

    public String getCodigopostal() {
        return Codigopostal;
    }

    public CentroComercial() {
        this.nombre = "Centro Comercial Ultimate world";
        this.Codigopostal = "2135E15152";
    }

    public static void main(String[] Link) {
        int num1, opc2 = 0;
        ZonaAlimentacion za = new ZonaAlimentacion();
        ZonaTiendas zt = new ZonaTiendas();
        ZonaRecre zc = new ZonaRecre();
        CentroComercial obj1 = new CentroComercial();
        System.out.println("Bienvenidos a:");
        System.out.println("" + obj1.getNombre());
        System.out.println("Codigo Pos2tal: " + obj1.getCodigopostal());
        try (Scanner Teclado = new Scanner(System.in)) {
            opc2 = 0;
            while (opc2 >= 0 && opc2 <= 4) {
                System.out.println(
                        " Digite 1 para ingresar a Zona Recreativa\n Digite 2 para ingresar a Zona de Tiendas\n Digite 3 para ingresa a zona de Alimentos\n ingrese 4 para salir");
                num1 = Teclado.nextInt();
                switch (num1) {
                    case 1:
                        zc.metodo1();
                        break;
                    case 2:
                        zt.metodo2();
                        break;
                    case 3:
                        za.metodo3();
                        break;
                    case 4:
                        opc2 += 20;
                        System.out.println("Gracias por visitarnos Vuelva Pronto");
                        break;
                    default:
                        opc2 += 20;
                        System.out.println("El digito que ingreso no es valido");
                        break;
                }
                opc2 += 1;
            }
        }
    }
}