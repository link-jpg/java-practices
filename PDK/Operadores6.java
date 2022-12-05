package PDK;

import javax.swing.JOptionPane;

public class Operadores6 {
    /*
     * Karla tiene N dolares. Luis tiene la mitad de lo que pose Karla.
     * y Alexander tien la mitad de lo que posee Karla y Luis juntos
     * Hacer un programa que calcule e imprima la cantidad que tienen los tres.
     */
    public static void main(String[] args) {
        double Karla, Luis, Alexander;
        Karla = Double.parseDouble(JOptionPane.showInputDialog("Inserte la cantidad de dolares que pose Karla"));
        Luis = Karla / 2;
        Alexander = (Karla + Luis) / 2;
        JOptionPane.showMessageDialog(null, "Dinero que tiene karla: " + Karla
                + "\n Dinero quiene Luis: " + Luis
                + "\n Dinero que tiene Alexander: " + Alexander, null, 1);
        JOptionPane.showMessageDialog(null,
                "La cantidad de Dinero que tienen todos juntos es de: " + (Karla + Luis + Alexander), null, 1);
    }
}
