package EjerciciosProfundizacion;

/*. Diseña un programa Java que muestre en pantalla una salida como la de la imagen
1. Deben aparecer las letras de la A a la Z (a,z).*/

public class Ej43 {
    public static void main(String[] args) {


        int numLetras = 26;//El abecedario asscii tiene 26 letras

        for (int i = 0; i < numLetras; i++) {
            /*las mayusculas empiezan a partir de la 65
             *  y las minusculas a partir de la 97*/

            System.out.println((char) (i + 65) + "-----" + (char) (i + 97));
        }
    }

}