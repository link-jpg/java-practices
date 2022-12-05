package PDK;

import javax.swing.JOptionPane;

public class condicionales12 {
    /*
     * Construir un programa que simule el funcionamiento de una calculadora
     * que puede realizar cuatri operaciones aritmeticas basicas
     * (Suma,Resta,Producto y division) con valores numericos enteros.
     * El usuario debe especificar la operacion a realizar con el primer caracter
     * del primer parametro de la linea de comandos:S os para la suma, R o r para la
     * resta,
     * P o p,M o m para el producto y D o d para la division
     */
    public static void main(String[] args) {
        int num1, num2;
        char opcion;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        opcion = JOptionPane
                .showInputDialog(null,
                        "Inserte la letra del proceso que desea realizar\n Suma\n Resta\n Multiplicacion\n Division  ")
                .charAt(0);
        switch (opcion) {
            case 'S':
            case 's':
                num1 = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + num1, "Suma", 1);
                break;
            case 'R':
            case 'r':
                num1 = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + num1, "Resta", 1);
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                num1 = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + num1, "Multiplicacion", 1);
                break;
            case 'D':
            case 'd':
                num1 = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + num1, "Multiplicacion", 1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inserte un caracter valido", "Error", 1);
                break;
        }
    }
}
