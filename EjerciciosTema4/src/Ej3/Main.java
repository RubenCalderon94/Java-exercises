package Ej3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String d, m;

        Taxi tx1 = new Taxi("1534-MGL",Distritos.SUR,TipoMotor.ELECTRICO, 38.87789, -6.97061);
        Taxi tx2 = new Taxi("4565-MHJ" , Distritos.ESTE,TipoMotor.DIESEL);

        System.out.println(tx1.getCoordenadas());
        System.out.println(tx2.getCoordenadas());
        tx2.setLatitud(39.2541);
        tx2.setLongitud(-5.98741);
        System.out.println(tx2.getCoordenadas());

        if(tx1.getTaxiIgualDistrito(tx2)) {
            System.out.println("Están en la mismo distrito");
        }else {
            System.out.println("No están en la mismo distrito");
        }

        System.out.println("Elige distrito");
        d = sc.next();
        System.out.println("Elige tipo motor");
        m = sc.next();




    }
}
