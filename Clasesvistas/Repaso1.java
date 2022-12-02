package Clasesvistas;

import Clasesvistas.Repaso2;

public class Repaso1 {
    public static void main(String[] link) {
        // uso de constantes
        int c, d;
        System.out.println("-----------------------");
        c = Repaso2.a + Repaso2.b;
        System.out.println("La suma de estas constantes es: " + c);
        System.out.println("-----------------------");
        /****************************/
        System.out.println("-----------------------");
        Repaso2 Obj1 = new Repaso2();
        Obj1.a = 25;
        Obj1.b = 25;
        d = Obj1.a + Obj1.b;
        System.out.println("La suma de estas constantes es: " + d);
        /****************************/
        System.out.println("-----------------------");
        Repaso2 Obj2 = new Repaso2();
        Obj2.a = 45;
        Obj2.b = 20;
        d = Obj2.a + Obj2.b;
        System.out.println("La suma de estas constantes es: " + d);
        System.out.println("-----------------------");
    }
}
