package PDK;

import javax.swing.JOptionPane;

//clase anterior Entradadedatos3
//no se utilizo el scanner en la clase anterior 
public class Operadores {
    public static void main(String[] args) {
        // Ejercicio de los 5 operadores +,-,*,/,%
        float num1, num2, realizaroperaciones;
        JOptionPane.showMessageDialog(null, "Realizar Una Suma");
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        realizaroperaciones = num1 + num2;
        JOptionPane.showMessageDialog(null, "El Resultado de la suma es: " + realizaroperaciones);
        JOptionPane.showMessageDialog(null, "Realizar Una Resta");
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        realizaroperaciones = num1 - num2;
        JOptionPane.showMessageDialog(null, "El Resultado de la Resta es: " + realizaroperaciones);
        JOptionPane.showMessageDialog(null, "Realizar Una Multiplicacion");
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        realizaroperaciones = num1 * num2;
        JOptionPane.showMessageDialog(null, "El Resultado de la multiplicacion es: " + realizaroperaciones);
        JOptionPane.showMessageDialog(null, "Realizar Una Division");
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        realizaroperaciones = num1 / num2;
        JOptionPane.showMessageDialog(null, "El Resultado de la division es: " + realizaroperaciones);
        JOptionPane.showMessageDialog(null, "Realizar Obtener el resto de la division");
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un Numero decimal"));
        realizaroperaciones = num1 % num2;
        JOptionPane.showMessageDialog(null, "El Resultado de la resto es: " + realizaroperaciones);
    }
}
