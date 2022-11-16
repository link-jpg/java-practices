import javax.swing.JOptionPane;

public class condicionales {
    public static void main(String[] args) {
        /*
         * Uso de if y else usando operador de igualdad y de desigualdad
         */
        int numero, dato = 5;
        JOptionPane.showMessageDialog(null, "Uso de operador de igualdad", null, 1);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero"));
        /*
         * Operado de igualdad ==
         */
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El mumero es 5", "Ventana final", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero introducido es diferente a 5", "Error", 0);
        }
        /*
         * Operado de desigualdad !=
         */
        JOptionPane.showMessageDialog(null, "Uso de operador de desigualdad", null, 1);

        if (numero != dato) {
            JOptionPane.showMessageDialog(null, "El numero introducido es diferente a 5", "Ventana final", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero introducido es 5", "Error", 0);
        }
        /*
         * Operado de mayor o igual >=
         */
        JOptionPane.showMessageDialog(null, "Uso de operador de mayor o igual", null, 1);
        if (numero >= dato) {
            JOptionPane.showMessageDialog(null, "El mumero es mayor o igual a 5", "Ventana final", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero introducido es menor a 5", "Error", 0);
        }
        /*
         * Operado de menor o igual <=
         */
        JOptionPane.showMessageDialog(null, "Uso de operador de menor o igual", null, 1);
        if (numero <= dato) {
            JOptionPane.showMessageDialog(null, "El mumero es menor o igual a 5", "Ventana final", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero introducido es mayor a 5", "Error", 0);
        }

    }
}