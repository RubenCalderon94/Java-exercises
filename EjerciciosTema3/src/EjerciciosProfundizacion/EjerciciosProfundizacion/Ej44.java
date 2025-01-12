package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*4. Diseña un programa Java que muestre en pantalla una salida como la de la imagen
2. Deben aparecer los números del 1 al 26.*/


public class Ej44 {
    public static void main(String[] args) {

        for (int i=1; i<=26; i++){
            System.out.println(i+"----"+(i*i)+"----"+(i*(i*i)));
        }

    }
}
