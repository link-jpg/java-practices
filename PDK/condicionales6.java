package PDK;

import javax.swing.JOptionPane;

public class condicionales6 {
    /*
     * Un obrero necesita calcular su salario semanal, el cual se obtiene de la
     * siguiente manera:
     * Si trabaja 40 H o menos se le paga $16 por hora
     * Si trabaja mas de 40H se le paga $16 por cada una de las primeras 40
     * y $20 por cada hora extra
     */
    public static void main(String[] link) {
        int horastrabajadas;
        float salariototal;
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas"));
        if (horastrabajadas <= 40) {
            salariototal = horastrabajadas * 16;
        } else {
            salariototal = (40 * 16) + ((horastrabajadas - 40) * 20);
        }
        JOptionPane.showMessageDialog(null, "El salario a pagar es de:" + salariototal, "Ventana final", 1);
    }
}
