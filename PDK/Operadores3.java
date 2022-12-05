package PDK;

import javax.swing.JOptionPane;

public class Operadores3 {
    /*
     * Uso de la clase Math
     * Sacar raices
     * Potencias o elevar numero a una potencia
     * redondear numeros
     * Obtener numeros aleatorios
     */
    public static void main(String[] args) {
        int saberraiz = 9;
        // Para sacar una raiz tiene que estar almacenado en una variable tipo double
        // En el Math.sqrt(aqui se asigna el valor puede escribirse directamente o el
        // nombre de la variable )
        double raices = Math.sqrt(saberraiz);
        JOptionPane.showMessageDialog(null, "Valor en saberraiz: " + saberraiz);
        JOptionPane.showMessageDialog(null,
                "El siguiente proceso muestra la raiz del numero en la variable saberraiz: " + raices);
        /*
         * Si fuese el caso de que al el tiene que ser con una variable de tipo entero
         * int se escribe de la siguiente manera
         * int raices= (int)Math.sqrt(nombre de la variable o dato);
         * ccambiaremos el nombre de la variable para que no ocurran errores
         */
        saberraiz++;
        JOptionPane.showMessageDialog(null, "Valor en saberraiz: " + saberraiz);
        int iraiz = (int) Math.sqrt(saberraiz);// con el parametro (devuelve el numero pero en entero 3, si fuera en
                                               // double seria 3.1...)
        JOptionPane.showMessageDialog(null,
                "El siguiente proceso muestra la raiz del numero en la variable saberraiz: " + iraiz);
        JOptionPane.showMessageDialog(null, "Siguiente metodo sirve para elevar un numero con una base");
        double base = 3, exponente = 4;
        JOptionPane.showMessageDialog(null, "Valor de la base: " + base);
        // Math.pow(base + el exponente) en variables o parametros double
        JOptionPane.showMessageDialog(null, "Valor del exponente: " + exponente);
        double BmasE = Math.pow(base, exponente);
        JOptionPane.showMessageDialog(null, "Valor elevado: " + BmasE);// 81.0
        // redondear numeros double a enteros usando(math.round) variables long
        double redondear = 5.56;
        JOptionPane.showMessageDialog(null, "Siguiente metodo sirve para Redondear un numero");
        JOptionPane.showMessageDialog(null, "Valor en redondear: " + redondear);
        Long Fredondeado = Math.round(redondear);
        JOptionPane.showMessageDialog(null, "Numero redondeado: " + Fredondeado);
        // Como se vio anteriormente ofrece dos versiones la double a long y la float a
        // int
        Float redonFloat = 7.56f;// cuando es un float recuerda escribir f al final del numero
        JOptionPane.showMessageDialog(null, "Siguiente metodo sirve para Redondear un numero");
        JOptionPane.showMessageDialog(null, "Valor en redonFloat: " + redonFloat);
        int Fredondeado1 = Math.round(redonFloat);
        // paso a ser un entero
        JOptionPane.showMessageDialog(null, "Numero redondeado: " + Fredondeado1);
        JOptionPane.showMessageDialog(null, "Siguiente metodo sirve para Obtener un numero Aleatorio");
        double numaleatorio = Math.random();
        JOptionPane.showMessageDialog(null, "Numero Aleatorio: " + numaleatorio);
    }
}
