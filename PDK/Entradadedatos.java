package PDK;

import java.util.Scanner; //Importamos la clase scanner de la libreria Java

public class Entradadedatos {
    // Creamos el metodo principal o main
    public static void main(String[] args) {
        // Inicializamos el scanner en una variable
        Scanner teclado = new Scanner(System.in);// System.in /in fuinciona como input entrada
        // Scanner + la variable + el siguiente parametro
        int valor;
        double valor1;
        String valor2, valor3;
        System.out.println("Ingrese un nombre: ");
        valor2 = teclado.nextLine();
        System.out.println("Valor guardado: " + valor2);
        System.out.println("Ingrese una oracion: ");
        valor3 = teclado.nextLine();
        System.out.println("Valor guardado: " + valor3);
        System.out.println("Digite el numero a almacenar: ");
        valor = teclado.nextInt();
        System.out.println("Valor guardado: " + valor);
        System.out.println("Digite el numero decimal para almacenar: ");
        valor1 = teclado.nextDouble();
        System.out.println("Valor guardado: " + valor1);

        /*
         * de momento aparece las advertencias
         * una del teclado que no a sido cerrado
         * Se puede cerrar usando un bucle tipo try
         * y la otra arvertencia por si queremos un constructor
         * ojo eso solo aplica para Visual Studio Code
         */

    }
}
