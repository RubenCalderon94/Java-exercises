package EjerciciosProfundizacion.EjerciciosProfundizacion;

/** Escribe un programa Java que muestre en pantalla las letras mayúsculas y el código
 ASCII asociado a cada una de ellas. */

public class Ej30 {
    public static void main(String[] args) {

        int codigoASCII;

        for (char i = 'A'; i <='Z' ; i++){
            codigoASCII = (int) i;
            System.out.println("El código ASCII de '" +i+ "' es: " + codigoASCII);
        }



    }

}
