package PDK;

import javax.swing.JOptionPane;

public class condicionales5 {
    /*
     * Hacer un programa que lea un caracter por tecladp
     * y compruebe si es una letra mayuscula.
     */
    public static void main(String[] Link) {
        char letra;
        JOptionPane.showMessageDialog(null, "Programa para saber si \nla letra es mayuscula o minuscula", "Inicio",
                1);
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        // .charAt () el valor de adentro le indica que posicion tomara y guardara
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra es mayuscula", "Final",
                    1);
        } else {
            JOptionPane.showMessageDialog(null, "La letra es minuscula", "Final",
                    1);
        }
    }
}
