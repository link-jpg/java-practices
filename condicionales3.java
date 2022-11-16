import javax.swing.JOptionPane;

public class condicionales3 {
    /*
     * Pedir dos numero y decir cual es el maor o si son iguales
     */
    public static void main(String[] args) {
        int dato, dato1;
        JOptionPane.showMessageDialog(null, "Comparacion de dos numeros", "Explicacion", 1);
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte numero"));
        dato1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero a comparar"));
        if (dato == dato1) {
            JOptionPane.showMessageDialog(null, "El numero " + dato + " y " + dato1 + " son iguales",
                    "Ventana Igualdad", 3);
        }
        if (dato > dato1) {
            JOptionPane.showMessageDialog(null, "El numero " + dato + " es mayor a " + dato1,
                    "Ventana Valor 1 mayor", 3);
        }
        if (dato < dato1) {
            JOptionPane.showMessageDialog(null, "El numero " + dato + " es menor a " + dato1,
                    "Ventana Valor 2 mayor", 3);
        }
    }
}
