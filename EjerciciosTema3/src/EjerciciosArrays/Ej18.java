package EjerciciosArrays;

/*
 Diseña un programa Java que compruebe si son correctas o no las contraseñas
contenidas en este array: String [] contrasenas = {"ABC123434", "asdfasdf$$@",
"###34234234", "12341234ABC", "asdfasdfB333"};
Una contraseña es correcta si:
a. longitud mínima de 10 caracteres
b. sólo contiene letras y números
c. contiene al menos dos números.
 */

public class Ej18 {
    public static void main(String[] args) {

        String[] contrasenas = {"ABC123434", "asdfasdf$$@",
                "###34234234", "12341234ABC", "asdfasdfB333"};//Recorremos el array

        for(String c: contrasenas) {
            compruebaContrasena(c);
        }

    }

    private static void compruebaContrasena(String c) {

        int count = 0;
        if (c.length() < 10) {// Vemos si la palabra tiene los 10 caracteres
            System.out.println("La contraseña " + c + " no es valida, debe tener al menos 10 caracteres ");
            return;
        }
        for (int i = 0; i < c.length(); i++) {//
            if (!(Character.isLetterOrDigit(c.charAt(i)))) {//Este método de la clase Character devuelve true si el carácter es,
                //Una letra (a-z, A-Z).  O  Un dígito (0-9).
                System.out.println("La contraseña " + c + " no es válida"
                        + " debe tener letras y números");
                return;
            }
        }

        for (int i = 0; i < c.length(); i++) {
            if ((Character.isDigit(c.charAt(i)))) {//Me dice si tiene algun numero y minimo son dos en este caso
                count++;
            }
        }

        if (count < 2) {
            System.out.println("La contraseña " + c + " no es válida"
                    + " debe tener al menos dos números");
        }
        return;

    }


}
