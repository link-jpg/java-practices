package PDK;

import javax.swing.JOptionPane;

public class Operadores1 {
    public static void main(String[] args) {
        // asigancion de nuevos valores usando valores combinados
        int valor1 = 5;
        JOptionPane.showMessageDialog(null, "Proceso de Suma");
        // Para no hacer valor1=valor1+5; hacemos lo siguiente
        JOptionPane.showMessageDialog(null, "Valor incial: " + valor1);
        valor1 += 5;// en este punto valor1 adquiere 5 unidades mas quedando 10
        JOptionPane.showMessageDialog(null, "Valor final es de: " + valor1);
        JOptionPane.showMessageDialog(null, "Proceso de Multiplicacion");
        valor1 = 5;// Fijamos nuevamente el valor inicial a 5
        JOptionPane.showMessageDialog(null, "Valor incial: " + valor1);
        valor1 *= 5;// lo multiplicamos
        JOptionPane.showMessageDialog(null, "Valor final es de: " + valor1);
        JOptionPane.showMessageDialog(null, "Proceso de Resta");
        // Como aun se conserva con el valor de 25 le restamos 5 unidades
        JOptionPane.showMessageDialog(null, "Valor incial: " + valor1);
        valor1 -= 5;// lo restamos quedando 20
        JOptionPane.showMessageDialog(null, "Valor final es de: " + valor1);
        JOptionPane.showMessageDialog(null, "Proceso de Division");
        // Como aun se conserva con el valor de 20 lo dividimos 5
        JOptionPane.showMessageDialog(null, "Valor incial: " + valor1);
        valor1 /= 5;// lo restamos quedando 4
        JOptionPane.showMessageDialog(null, "Valor final es de: " + valor1);
        JOptionPane.showMessageDialog(null, "Proceso de Resto o Mod");
        // Fijamos el valor1 en 10
        valor1 = 10;
        JOptionPane.showMessageDialog(null, "Valor incial: " + valor1);
        valor1 %= 3;
        JOptionPane.showMessageDialog(null, "Valor final es de: " + valor1);

    }
}
