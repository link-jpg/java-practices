import javax.swing.JOptionPane;

public class Operadores2 {
    public static void main(String[] args) {
        // Operadores de Incremento y Descremento
        int valor = 9;
        JOptionPane.showMessageDialog(null, "Valor antes del Incremento: " + valor);
        valor++;// es igual a valor+=1;
        JOptionPane.showMessageDialog(null, "Valor despues del operador de Incremento:" + valor);
        JOptionPane.showMessageDialog(null, "Valor antes del Descremento: " + valor);
        valor--;
        JOptionPane.showMessageDialog(null, "Valor despues del operador de Descremento:" + valor);

        /*
         * Ojo con la asignacion de -- o ++ si van antes o despues de la variable a
         * afectar si va antes primero hara el incremento y despues se asigna a la
         * variable
         */

    }

}
