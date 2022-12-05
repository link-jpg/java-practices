package PDK;

import javax.swing.JOptionPane;

public class condicionales11 {
    public static void main(String[] link) {
        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año"));
        if (dia >= 1 && dia <= 31) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "Fecha: " + dia + "/" + mes + "/" + año, "Ventana Final", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "El mes no es valido", "Ventana Final", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes no es valido", "Ventana Final", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dia no es valido", "Ventana Final", 0);
        }
    }
}
