package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*5. Diseña un programa Java que muestre en pantalla una salida como la de la imagen
3. Deben aparecer los números del 1 al 26.*/

public class Ej45 {
    public static void main(String[] args) {

        int count=0;
        for (int i=1; i<=26; i++){
            System.out.print(i+"----");
            for (char j='F'; j<='J'; j++){
                System.out.print(j);

            }
            System.out.println();

        }

    }

}
