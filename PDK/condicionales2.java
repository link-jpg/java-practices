package PDK;

import javax.swing.JOptionPane;

public class condicionales2 {
    /*
     * Hacer un programa que lea un numero entero y muestre su ek numero es multiplo
     * de 10
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un numero"));
        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + " es multiplo de 10", "Ventana Final",
                    1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado " + numero + " no es multiplo de 10",
                    "Ventana Final", 0);
        }
    }
}
