package PDK;

import javax.swing.JOptionPane;

public class Operadores9 {
        /*
         * Construir un programa que,dado el numero de horas,devuelve el numero en
         * semanas,dias y horas equivalentes.Por ejemplo, dado un total de mil horas
         * debe mostrar 5semanas,6dias y 16 horas
         */
        public static void main(String[] args) {
                JOptionPane.showMessageDialog(null,
                                "Programa Para Calcular la Horas y devuelve semanas y dias equivalentes",
                                null, 1);
                int horastotales, semanas, dias, horas;
                horastotales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));
                semanas = horastotales / 168;
                dias = (horastotales % 168) / 24;
                horas = horastotales % 24;
                JOptionPane.showMessageDialog(null,
                                "La cantidad introducida equivale a: "
                                                + semanas + " Semanas"
                                                + "\n Dias: " + dias
                                                + "\n Horas: " + horas);
        }
}
