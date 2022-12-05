package PDK;

import javax.swing.JOptionPane;

public class Operadores4 {
    // Haremos un programa que calcule tres notas y las imprima
    public static void main(String[] args) {
        // usaremos float por que lo datos seran decimales pero no queremos asignarle
        // memoria de mas
        Float nota1, nota2, nota3, suma;
        JOptionPane.showMessageDialog(null, "Programa para calcular las calificaciones");
        // recuerda que para inicialar la variable en este caso se pone al incio y
        // conviertes el dato a el tipo de valor que quieres
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota uno"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota dos"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Inserte la nota tres"));
        // En este punto las notas se encuentran almacenadas en sus respectivas
        // variables
        suma = nota1 + nota2 + nota3;
        JOptionPane.showMessageDialog(null, "Suma de las tres notas realizada: " + suma, null, 0);
        // JOptionPane.showMessageDialog(null, "" + suma, null, 0);
        // (primer parametro null,escribimos el mensaje y la variable,segundo parametro
        // null, escribes un numero del 0 al 3)
        // cada numero escrito en el segundo parametro es un icono diferente,
    }
}
