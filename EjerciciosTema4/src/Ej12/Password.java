package Ej12;

import java.util.Random;

/*
- Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de
8.
- Los constructores serán los siguientes:
- Un constructor por defecto. Generará una contraseña de 8 caracteres.
- Un constructor con la longitud que nosotros le pasemos. Generará una
contraseña aleatoria con esa longitud.
- Métodos:
- esFuerte(): devuelve un booleano indicando si la contraseña es fuerte
o no. Para que sea fuerte debe tener más de 2 mayúsculas, más de 1
minúscula y más de 3 dígitos.
- generarPassword(): genera la contraseña del objeto con la longitud
que tenga. Es un método privado.
- Métodos get para contraseña y longitud
 */
public class Password {

    //ATRIBUTOS
    private int longuitud;
    private String contrasena;

    //CONSTRUCTOR 1
    public Password() {
        this.longuitud = 12;
        this.contrasena = generarPassword(longuitud);
    }

    //CONSTRUCTOR 2
    public Password(int longuitud) {
        this.longuitud = longuitud;
        this.contrasena = generarPassword(longuitud);
    }

    //GETTER Y NO HAY SETTER PORQUE NO SE VAN A MODIFICAR LAS CONTRASEÑAS
    public int getLonguitud() {
        return longuitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    //METODOS
    //DEBEMOS GENERAR LA CONTRASEÑA AÑ AZAR CON RAMDON
    private String generarPassword(int l) {
        Random r = new Random();
        String Contrasena = "";
        for (int i = 0; i < l; i++) {
            char c = (char) (r.nextInt(127 - 33) + 33);
            contrasena += c;
        }
        return contrasena;
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        int simbolos = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)) {//CUENTA MAYUSCULAS
                mayusculas++;
            } else if (Character.isLowerCase(c)) {//CUENTA MINUSCULAS
                minusculas++;
            } else if (Character.isDigit(c)) {//CUENTA NUMEROS
                numeros++;
            } else {
                simbolos++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 3 && simbolos > 2;

    }





}
