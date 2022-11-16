import javax.swing.JOptionPane;

public class condicionales1 {
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "introducir un numero del 1 al 5"));
        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "Valor ingresado 1", "Caso 1", 1);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Valor ingresado 2", "Caso 2", 1);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Valor ingresado 3", "Caso 3", 1);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Valor ingresado 4", "Caso 4", 1);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Valor ingresado 5", "Caso 5", 1);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Valor ingresado no valido", "Error", 0);
                break;
        }
    }
}
