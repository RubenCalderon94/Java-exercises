package EjerciciosArrays;

/*
 Partiendo de la matriz int [][] m = {{20,30,11,5},{12,13,17,19},{2,4,7,55}};, diseña una
aplicación Java que genere una salida como la que se muestra.
Para ello debes crear una función que retorne una matriz de tipo boolean con las
mismas filas y columnas que la original y que guarde true/false según el número de la
matriz original asociado a cada posición sea primo o no.
 */

public class Ej35 {
    public static void main(String[] args) {

        int [][] m = {{20,30,11,5},{12,13,17,19},{2,4,7,55}};
        boolean [][] p = new  boolean[3][4];

        System.out.println("¿Son primos los valores de la matriz?");

        p =crearMatrizPrimos(m, p);

        for(int i=0; i<m.length;i++) {
            for(int j=0; j<m[i].length;j++) {
                System.out.print(m[i][j]+ "-->"+ p[i][j]+"\t");
            }
            System.out.println();
        }

    }

    private static boolean[][] crearMatrizPrimos(int[][]m, boolean[][]p ) {

        for(int i=0; i<m.length;i++) {
            for(int j=0; j<m[i].length;j++) {
                p[i][j]=esPrimo(m[i][j]);
            }
        }
        return p;
    }

    private static boolean esPrimo(int n) {

        for(int i=2; i<n;i++) {
            if(n%i==0) {
                return false;
            }

        }
        return true;

    }


}
