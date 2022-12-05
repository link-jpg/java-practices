package PDK;

import javax.swing.JOptionPane;

public class Operadores7 {
    /*
     * Una compañia de venta de carros usados , paga a su personal de ventas un
     * salario de $1000 mensuales,
     * mas una comision de $150 por carro vendido. Cada mes el capturista de la
     * empresa ingresa en la computadora los datos
     * pertinentes. Hacer un programa que calcule e imprima el saliro mensual de un
     * vendedor dado.
     */
    public static void main(String[] args) {
        final Double salario = 1000.00, comision = 150.00, mas5porciento = 0.05;
        Double suma, vcarrovendido, ventas, ventas1, ventas2;

        JOptionPane.showMessageDialog(null, "Programa para calcular el salario"
                + "\n Salario para el empleado: " + salario
                + "\n Comision por venta: " + comision
                + "\n Valor del porcentaje por venta: " + mas5porciento);
        ventas = Double.parseDouble(JOptionPane.showInputDialog("Inserte la cantidad de autos vendidos"));
        vcarrovendido = Double.parseDouble(JOptionPane.showInputDialog("Inserte un solo valor para todos los carros"));
        ventas1 = comision * ventas;
        ventas2 = (ventas * vcarrovendido) * mas5porciento;
        suma = salario + ventas1 + ventas2;
        JOptionPane.showMessageDialog(null, "Venta Realizada"
                + "\n Total de carros vendidos: " + ventas
                + "\n Valor de los carros: " + vcarrovendido
                + "\n total de la comision: " + ventas1
                + "\n total de  del %5: " + ventas2
                + "\n total pagado: " + suma, null, 1);
    }
}
