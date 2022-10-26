public class Pvariables {
    static String a = "Hola";
    static String b = " ";
    static String c = "Este Es";
    static String d = "Un mensaje";
    static String e = "Formado con";
    static String f = "Concatenacion de varaibles";
    static int a3 = 5;
    static int a4 = 4; // son valores que no se modificaran o que solo muestran

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Practica de variables");
        System.out.println(a + b + c + b + d + b + e + b + f);
        System.out.println("---------------------------------------");
        System.out.println("Suma de variables");
        // si se hacen afuera de la clase main se tienen que definir como static
        int a1 = 5;
        int a2 = 4;
        System.out.println(a1 + a2);// impirme la suma 9
        System.out.println("---------------------------------------");
        System.out.println("Ahora haremos uno con los valores usando static");
        System.out.println(a3 + a4);
        System.out.println("---------------------------------------");
        System.out.println("Multiplicacion");
        System.out.println(a1 * a2);
        System.out.println("Ahora haremos uno con los valores usando static");
        System.out.println(a3 * a4);
        System.out.println("---------------------------------------");
        System.out.println("Resta");
        System.out.println(a1 - a2);
        System.out.println("Ahora haremos uno con los valores usando static");
        System.out.println(a3 - a4);
        System.out.println("---------------------------------------");
        System.out.println("Division");
        System.out.println(a1 / a2);
        System.out.println("Ahora haremos uno con los valores usando static");
        System.out.println(a3 / a4);
        System.out.println("---------------------------------------");
        System.out.println("Incremento");
        System.out.println(a1 += a1);
        System.out.println(a2 += a2);
        System.out.println("Ahora haremos uno con los valores usando static");
        System.out.println(a3 += a3);
        System.out.println(a4 += a4);
        System.out.println("---------------------------------------");
    }
}
