package PDK;

import javax.swing.JOptionPane;

public class condicionales8 {
    /*
     * pedir tres numeros y mostrarlos ordenados de mayor a menor
     */
    public static void main(String[] args) {
        double num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el Primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el Segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el Tercer numero"));
        if ((num1 > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden: " + num1 + "-" + num2 + "-" + num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden: " + num1 + "-" + num3 + "-" + num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden: " + num2 + "-" + num1 + "-" + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, "Orden: " + num2 + "-" + num3 + "-" + num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden: " + num3 + "-" + num1 + "-" + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Orden: " + num3 + "-" + num2 + "-" + num1);
        }
    }
}
