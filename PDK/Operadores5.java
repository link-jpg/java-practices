package PDK;

import javax.swing.JOptionPane;

public class Operadores5 {
    /*
     * Hacer un programa que calcule el salario semanal de un empleado
     * a partir de sus horas trabajadas y de su salario por hora
     * recuerda para declarar una variable constante es final+eltipodevariable
     */
    public static void main(String[] args) {
        // establecemos que gana $5 la hora
        final int hora = 5;
        // establecemos que trabaja 6 dias
        int lun, mar, mir, jue, vie, sab, suma;
        JOptionPane.showMessageDialog(null, "Programa que calcula el salario de la semana", null, 1);
        JOptionPane.showMessageDialog(null, "Pago por hora trabajada: " + hora, null, 2);
        lun = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que trabajo el dia: Lunes"));
        mar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que trabajo el dia: Martes"));
        mir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que trabajo el dia: Miercoles"));
        jue = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que trabajo el dia: Jueves"));
        vie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que trabajo el dia: Viernes"));
        sab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que trabajo el dia: Sabado"));
        JOptionPane.showMessageDialog(null, "Horas trabajadas por dia: "
                + "\n Lunes: " + lun
                + "\n Martes: " + mar
                + "\n Miercoles: " + mir
                + "\n Jueves: " + jue
                + "\n Viernes: " + vie
                + "\n Sabado: " + sab, null, 3);
        suma = (lun * hora) + (mar * hora) + (mir * hora) + (jue * hora) + (vie * hora) + (sab * hora);
        JOptionPane.showMessageDialog(null, "El total por la semana trabajada es: " + suma);
    }
}
