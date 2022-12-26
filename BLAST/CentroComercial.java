package BLAST;

import java.util.Scanner;
import BLAST.ZonaAlimentacion;
import BLAST.ZonaRecre;

public class CentroComercial {
    private String nombreComercial, Codigopostal;

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getCodigopostal() {
        return Codigopostal;
    }

    public CentroComercial() {
        this.nombreComercial = "Centro Comercial Ultimate world";
        this.Codigopostal = "2135E15152";
    }

    public void mensajes() {
        System.out.println(
                " Digite 1 para ingresar a Zona Recreativa\n Digite 2 para ingresar a Zona de Tiendas\n Digite 3 para ingresa a zona de Alimentos\n ingrese 4 para salir");
    }

    public static void main(String[] Link) {
        int opcionsalir = 0, opcionprincipal;
        Scanner blast = new Scanner(System.in);
        CentroComercial obj1 = new CentroComercial();
        ZonaAlimentacion za = new ZonaAlimentacion();
        ZonaRecre zc = new ZonaRecre();
        System.out.println("Bienvenidos Al " + obj1.getNombreComercial()
                + "\nNuestro Codigo Postal Es " + obj1.getCodigopostal());
        while (opcionsalir <= 20) {
            obj1.mensajes();
            opcionprincipal = blast.nextInt();
            if (opcionprincipal > 0 && opcionprincipal <= 4) {
                switch (opcionprincipal) {
                    case 1:
                        zc.metodo1();
                        break;
                    case 2:
                        // zt.metodo2();
                        break;
                    case 3:
                        za.metodo3();
                        break;
                    case 4:
                        System.out.println("Gracias Por Visitarnos Vuelva Pronto");
                        opcionsalir += 70;
                        break;

                    default:
                        System.out.println("Numero Ingresado No Cumple Con Los Parametros");
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
