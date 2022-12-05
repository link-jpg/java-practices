
import javax.swing.JOptionPane;

public class condicionales4 {
    /*
     * Hacer un programa que lea un numero entero y muestre si el numero es multiplo
     * de 10
     */

    public static void main(String[] args) {
        int numero;
        JOptionPane.showMessageDialog(null, "Programa para saber si \nel numero insertado es multiplo de 10", "Inicio",
                1);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero Ingresado es multiplo de 10",
                    "Final", 3);
        } else {
            JOptionPane.showMessageDialog(null, "El numero Ingresado no es multiplo de 10",
                    "Final", 0);
        }
    }
}
