package EjerciciosArrays;

/*
 Diseña una aplicación Java que en principio solicite nombre de usuario y contraseña.
Si estas credenciales son correctas, la aplicación mostrará un menú con las opciones
1.AAA, 2.BBB, 3.CCC y 4.Salir. En el caso de que no exista el usuario y/o la
contraseña, la aplicación finalizará mostrando el mensaje “El usuario no está dado de
alta en el sistema”. Utiliza arrays para guardar datos de usuarios y contraseñas, crea
una matriz de dos columnas donde guardar nombre de usuario y contraseña.
 */

import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {

        String usuario, password;
        boolean encontrado = false;

        String[][] cuentas= {
                {"admin", "1234"},
                {"usuario1", "password1"},
                {"usuario2", "password2"},
                {"usuario3", "password3"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese USUARIO: ");
        usuario = sc.nextLine();
        System.out.println("Ingrese su password: ");
        password = sc.nextLine();

        for(int i=0; i<cuentas.length;i++) {
            if(cuentas[i][0].equals(usuario) && cuentas[i][1].equals(password)) {
                encontrado = true;//Bolean para poder declarar otro if sin que de error(!encontrado)
                System.out.println("Iniciado correctamente");
                System.out.println("Menú:");
                System.out.println(" 1. AAA \n 2. BBB \n 3. CCC \n 4. Salir");
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Usuario y/o Contraseña incorrecta.");
        }
    }
}
