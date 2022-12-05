package PDK;

import javax.swing.JOptionPane;

public class condicionales15 {
    /*
     * Hacer un programa que pase de Kg a otra
     * unidad de medida de masa, mostrar en pantalla
     * un menu con las opciones posibles
     * Kg a Gramos
     * Kg a Libras
     * Kg a Tonelada
     */
    public static void main(String[] link) {
        double KG, L, G, T;
        char letra;
        letra = JOptionPane
                .showInputDialog(null,
                        "Programa para convertir KG introduzca la letra\n Gramos - G\n Libras - L \n Toneladas - T",
                        "Inicio", 1)
                .charAt(0);
        switch (letra) {
            case 'G':

                break;
            case 'L':

                break;
            case 'T':

                break;

            default:
                break;
        }
    }
}
