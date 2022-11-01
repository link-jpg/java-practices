import java.util.Scanner;
import javax.swing.JOptionPane;//Importamos JOptionPane

public class Entradadedatos3 {
    public static void main(String[] args) {
        // Usamos un blucel Try para quitar la advertencia
        try (Scanner z = new Scanner(System.in)) {// quitamos el ;
            String texto;
            int num;
            char Letra;
            double decimal;
            // usando JOptionPane paint para mostar datos por ventanas
            // Para cadenas
            texto = JOptionPane.showInputDialog("Inserte un Texto");
            // Para numeros
            // Para pasar Cadenas a numeros Integer.parseInt+showInputDialog()
            num = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero"));
            // Para Caracter
            // Recordar que showInputDialog() es solo para cadenas o string asi que toca
            // transformarlo
            Letra = JOptionPane.showInputDialog("Inserte un Caracter").charAt(0);
            // Para decimales o doblue
            // de igual manera que en el entero usamos Double.parseDouble()
            decimal = Double.parseDouble(JOptionPane.showInputDialog("Inserte Un Decimal"));
            // Despues de haber terminado la insercion de datos procedemos a mostrarlos
            JOptionPane.showMessageDialog(null, "El Texto ingresado es: " + texto);
            JOptionPane.showMessageDialog(null, "El Numero ingresado es: " + num);
            JOptionPane.showMessageDialog(null, "El Primer caracter de la palabra es: " + Letra);
            JOptionPane.showMessageDialog(null, "El Decimal es: " + decimal);

        }
    }
}
