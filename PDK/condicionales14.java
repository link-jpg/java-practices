package PDK;

import javax.swing.JOptionPane;

public class condicionales14 {
    /*
     * hacer un programa que simule un cajero automatico con un saldo inicial de 100
     * dolares con el siguiente menu de opciones:
     * 1.ingresar dinero a la cuenta
     * 2. retirar dinero de la cuenta
     * 3.Salir
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa de Cajero Automatico", "Iniciando", 1);
        double SaldoDisponible = 1000, Retiro, Ingreso;
        int opcion, contador = 1;
        while (contador != 0) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Cliente ingrese una opcion: " + "\n Saldo en la cuenta: " + SaldoDisponible
                            + " \n 1.ingresar dinero a la cuenta\n 2. retirar dinero de la cuenta\n 3.Salir",
                    "Fedecredito v1", 1));
            switch (opcion) {
                case 1:
                    Ingreso = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Cliente ingrese la cantidad a depositar:", "Fedecredito v1", 2));
                    SaldoDisponible += Ingreso;
                    break;
                case 2:
                    if (SaldoDisponible > 0) {
                        Retiro = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Cliente ingrese la cantidad a retirar:", "Fedecredito v1", 2));
                        if (Retiro <= SaldoDisponible) {
                            SaldoDisponible -= Retiro;
                        } else {
                            JOptionPane.showMessageDialog(null, "Trato de hacer un retiro mayor al saldo disponible",
                                    "Error Transaccion", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No Dispone de saldo disponible",
                                "Error Transaccion", 0);
                    }
                    break;
                case 3:
                    contador = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese Una Opcion Correcta", "Error", 0);
                    break;
            }
        }
    }
}
