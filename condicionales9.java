import javax.swing.JOptionPane;

public class condicionales9 {
    /*
     * Pedir un numero entre 0 y 99 999
     * y decir cuantas cifras tiene
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, "el numero pose 1 cifra", "Ventana Final", 1);
        }
        if (numero <= 99 && numero >= 10) {
            JOptionPane.showMessageDialog(null, "el numero pose 2 cifras", "Ventana Final", 1);
        }
        if (numero <= 999 && numero >= 100) {
            JOptionPane.showMessageDialog(null, "el numero pose 3 cifras", "Ventana Final", 1);
        }
        if (numero <= 9999 && numero >= 1000) {
            JOptionPane.showMessageDialog(null, "el numero pose 4 cifras", "Ventana Final", 1);
        }
        if (numero <= 99999 && numero >= 10000) {
            JOptionPane.showMessageDialog(null, "el numero pose 5 cifras", "Ventana Final", 1);
        }
    }
}
