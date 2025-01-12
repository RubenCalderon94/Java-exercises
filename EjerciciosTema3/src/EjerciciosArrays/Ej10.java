package EjerciciosArrays;

/*
Diseña un array que guarde los nombres de los meses del año y los muestre en
pantalla uno a uno junto al número de caracteres del propio nombre
 */

public class Ej10 {
    public static void main(String[] args) {

        //Declaramos el array
        String [] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto",
        "octubre","noviembre","diciembre"};
        //Recorremos el array esta forma es foreach
        for(String mes:meses){//ESTE METODO ES EL FOREACH
            System.out.println(mes+ " tiene "+ mes.length()+ " letras");
        }
    }
}
