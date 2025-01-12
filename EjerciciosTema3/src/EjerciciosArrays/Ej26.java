package EjerciciosArrays;

/*
 Partiendo de este array con DNIs, mostrar cuáles de ellos son correctos, es decir, si
la letra que tienen se corresponde con el número.

String [] dnis = {"80137039T","30198235S" , "15835050X", "30533829H",
"46548712R", "30499569M", "30437328W", "30519074Y"};

Para hacer este ejercicio debes extraer de la cadena DNI, por un lado el número y por
otro la letra. Esto se hace de la siguiente forma:
-String dni = “33442244F”;
-int numero = Integer.parseInt(dni.substring(0, dni.length()-1));
-String letra = dni.substring(dni.length()-1);

Para comprobar si la letra es la correcta para ese número puedes consultar esta web
http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-de-
control-del-nif-nie.
 */

public class Ej26 {
    public static void main(String[] args) {
        String [] dnis = {"80137039T","30198235S" , "15835050X", "30533829H",
                "46548712R", "30499569M", "30437328W", "30519074Y"};
        String c, c1;
        int n;

        for (int i=0; i<dnis.length;i++) {
            n = extraerNumero(dnis[i]);
            c = extraerLetra(dnis[i]);
            c1= calculaLetra(n);
            if(c1.equalsIgnoreCase(c)) {
                System.out.println("El DNI:"+dnis[i]+" es correcto");
            }else {
                System.out.println("El DNI:"+dnis[i]+" es incorrecto");
            }
        }
    }

    private static String calculaLetra(int n) {
        String [] letrasDNI= {"T","R","W","A","G","M","Y","F","P",
                "D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int r;

        r =n%23;
        return letrasDNI[r];
    }

    private static String extraerLetra(String dni) {

        return dni.substring(dni.length()-1);

    }

    private static int extraerNumero(String dni) {

        return Integer.parseInt(dni.substring(0, dni.length()-1));

    }
}
