import javax.swing.JOptionPane;

public class condicionales13 {
    /*
     * Pedir una nota de 0 a 10 y mostarla de la forma:
     * Insuficiente,Suficiente,Bien,Notable Y Sobresaliente
     */
    public static void main(String[] args) {
        int nota;
        JOptionPane.showMessageDialog(null, "Calcular ponderacion", "Inicio", 1);
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte la nota obtenida"));
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Insuficiente", "Final", 1);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Bien", "Final", 1);
                break;
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null, "Suficiente", "Final", 1);
                break;
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "Notable", "Final", 1);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Sobresaliente", "Final", 1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Fuera de parametros", "Error", 0);
                break;
        }
    }
}
