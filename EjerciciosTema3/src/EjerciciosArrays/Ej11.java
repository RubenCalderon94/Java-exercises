package EjerciciosArrays;

/*
. Diseña un programa que partiendo de un array como este
String [] cadenas = {"asimilar", "dromedario", "calvinista", "lagartija", "tiovivo",
"salamandra"};
muestre en pantalla cuál de las cadenas del array contiene más vocales. Utiliza una
función.
 */

public class Ej11 {
    public static void main(String[] args) {

        int nvocales, maxletras=0, posicion=0;

        String [] cadenas = {"asimilar", "dromedario", "calvinista", "lagartija", "tiovivo",
                "salamandra"};
        for(int i=0; i<cadenas.length; i++) {
            nvocales=vocales(cadenas[i]);
            if(nvocales>maxletras) {
                maxletras=nvocales;
                posicion=i;
            }
        }
        System.out.println("La palabra "+ cadenas[posicion]+
                " tiene "+ maxletras +" vocales");
    }


    //Funcion para mostrar vocales
    public static int vocales(String palabra) {

        int count=0;
        for(int j=0;j<palabra.length(); j++) {
            if(palabra.charAt(j)=='a'||palabra.charAt(j)=='e'
                    ||palabra.charAt(j)=='i'||palabra.charAt(j)=='o'
                    ||palabra.charAt(j)=='u') {

                count++;
            }
        }
        return count;
    }

}


