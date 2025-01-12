package EjerciciosFunciones;

/*
Diseña una función en Java que reciba una contraseña como parámetro (cadena de
caracteres) y devuelva true o false según la citada contraseña sea válida o no. Se
considera válida una contraseña cuando:
a. tiene una longitud mínima de 10 caracteres
b. sólo contiene letras y dígitos
c. contiene al menos dos dígitos.
 */

public class Ej18 {
    public static void main(String[] args) {

        String cadena1 = "DAW12025";
        System.out.printf("\n¿Es válida la contraseña %s? %b ", cadena1,
                esValidaContraseña(cadena1));

        String cadena2="DAW12026";
        System.out.printf("\n¿Es válida la contraseña %s? %b ", cadena2,
                esValidaContraseña(cadena2));

    }

    static boolean esValidaContraseña(String cadena) {
        if (cadena.length()<10)
            return false;
        else {
            int cuentaDigitos=0;
            //la pasamos a minúscula
            cadena = cadena.toLowerCase();
            for (int i=0; i<cadena.length();i++) {
                char caracter = cadena.charAt(i);
                if (caracter>='0' && caracter <='9')
                    cuentaDigitos++;
                else if (caracter<'a' || caracter >'z')
                    return false;
            }
            if (cuentaDigitos>=2)
                return true;
            else
                return false;
        }

    }
}
