package PDK;

import javax.swing.JOptionPane;

public class condicionales7 {
    /* Hacer un programa que tome dos numeros y diga si ambos son pares o impares */
    public static void main(String[] link) {
        int numero1, numero2;
        JOptionPane.showMessageDialog(null, "Programa para calular 2 num pares", "inicio", 1);
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el segundo numero"));
        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares\n" + numero1 + " y " + numero2, "Final", 1);
        } else {
            JOptionPane.showMessageDialog(null, "un numeros no es par\n" + numero1 + " y " + numero2, "Final", 0);
        }
    }
}
