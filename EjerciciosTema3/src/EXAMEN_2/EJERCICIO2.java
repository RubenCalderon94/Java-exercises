package EXAMEN_2;

/*
EJERCICIO2
 */

public class EJERCICIO2 {
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    static int[][] ventas = {{10, 25, 67, 89, 32, 87, 54, 86, 92, 62, 74, 57},
            {16, 15, 19, 43, 18, 89, 58, 17, 87, 33, 85, 49},
            {27, 38, 20, 65, 45, 97, 16, 68, 90, 48, 96, 39},
            {36, 42, 74, 30, 72, 69, 37, 40, 43, 74, 43, 51},
            {84, 58, 61, 84, 40, 50, 25, 83, 31, 62, 38, 23}};
    static String[] empleados = {"Antonio", "Angela", "Marta", "Jorge", "Alejandro"};

    public static void main(String[] args) {

        empleadoMasVentas();
        masVentas();
        mejorVentaEmpleado();
        mejorVentaPorCadaMes();

    }

    public static void empleadoMasVentas() {
        // Variables para almacenar el empleado con mayores ventas
        int maxVentas = 0;
        String mejorEmpleado = "";

        // Calcular las ventas totales por empleado
        for (int i = 0; i < ventas.length; i++) {
            int suma = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                suma += ventas[i][j];
            }
            System.out.println(empleados[i] + " vendió un total de: " + suma);

            // Comprobar si es el máximo
            if (suma > maxVentas) {
                maxVentas = suma;
                mejorEmpleado = empleados[i];
            }
        }

        // Resultado final
        System.out.println("\nEl empleado con más ventas es " + mejorEmpleado +
                " con un total de " + maxVentas + " ventas.");
        System.out.println("---------------------------------------------");
    }

    public static void masVentas() {
        int maxVentas = 0; // Almacena la suma máxima de ventas
        int mesConMasVentas = 0; // Índice del mes con más ventas

        // Recorrer columnas (meses)
        for (int j = 0; j < ventas[0].length; j++) {
            int sumaMes = 0; // Suma de ventas para el mes actual
            for (int i = 0; i < ventas.length; i++) {
                sumaMes += ventas[i][j]; // Sumar ventas de todos los empleados en el mes
            }
            System.out.println("Total ventas en " + meses[j] + ": " + sumaMes);

            // Verificar si este mes tiene más ventas
            if (sumaMes > maxVentas) {
                maxVentas = sumaMes;
                mesConMasVentas = j; // Guardar índice del mes con más ventas
            }
        }
        System.out.println("Mes con mas ventas es " + meses[mesConMasVentas]);
        System.out.println("---------------------------------------------");
    }

    public static void mejorVentaEmpleado() {
        int mayorVenta = 0; // Almacena la mayor venta encontrada
        int empleado = 0; // Índice del empleado con la mayor venta
        int mes = 0; // Índice del mes de la mayor venta

        // Recorrer toda la matriz de ventas
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                if (ventas[i][j] > mayorVenta) {
                    mayorVenta = ventas[i][j];
                    empleado = i;
                    mes = j;
                }
            }
        }

        // Devolver el resultado
        System.out.println("La mayor venta fue de " + mayorVenta + " realizada por " +
                empleados[empleado] + " en el mes de " + meses[mes] + ".");
        System.out.println("---------------------------------------------");

    }

    public static void mejorVentaPorCadaMes() {

        // Recorrer cada mes
        for (int j = 0; j < ventas[0].length; j++) {
            int mayorVenta = 0;
            int empleado = 0;

            // Recorrer las ventas de cada empleado en el mes actual
            for (int i = 0; i < ventas.length; i++) {
                if (ventas[i][j] > mayorVenta) {
                    mayorVenta = ventas[i][j];
                    empleado = i;
                }
            }

            // Imprimir el vendedor con mayor venta en el mes
            System.out.println("En el mes de " + meses[j] + ", el vendedor con mayor venta fue " +
                    empleados[empleado] + " con una venta de " + mayorVenta + ".");

        }

    }
}



/*
package EXAMEN_2;


EJERCICIO2


public class EJERCICIO2 {
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    static int[][] ventas = {{10, 25, 67, 89, 32, 87, 54, 86, 92, 62, 74, 57},
            {16, 15, 19, 43, 18, 89, 58, 17, 87, 33, 85, 49},
            {27, 38, 20, 65, 45, 97, 16, 68, 90, 48, 96, 39},
            {36, 42, 74, 30, 72, 69, 37, 40, 43, 74, 43, 51},
            {84, 58, 61, 84, 40, 50, 25, 83, 31, 62, 38, 23}};
    static String[] empleados = {"Antonio", "Angela", "Marta", "Jorge", "Alejandro"};

    public static void main(String[] args) {
        // Llamadas a las funciones
        imprimirMeses();
        imprimirEmpleados();
        imprimirVentas();
    }

    // Función para imprimir los meses
    public static void imprimirMeses() {
        System.out.println("Meses:");
        for (String mes : meses) {
            System.out.println(mes);
        }
        System.out.println(); // Línea en blanco para separar la salida
    }

    // Función para imprimir los empleados
    public static void imprimirEmpleados() {
        System.out.println("Empleados:");
        for (String empleado : empleados) {
            System.out.println(empleado);
        }
        System.out.println(); // Línea en blanco para separar la salida
    }

    // Función para imprimir las ventas por empleado
    public static void imprimirVentas() {
        System.out.println("Ventas de cada empleado por mes:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print(empleados[i] + ": ");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(meses[j] + ": " + ventas[i][j] + " | ");
            }
            System.out.println(); // Salto de línea después de cada empleado
        }
        System.out.println(); // Línea en blanco para separar la salida
    }
}
 */