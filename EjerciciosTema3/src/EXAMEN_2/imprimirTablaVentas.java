package EXAMEN_2;

/*
EJERCICIO2
 */

public class imprimirTablaVentas {
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    static int[][] ventas = {{10, 25, 67, 89, 32, 87, 54, 86, 92, 62, 74, 57},
            {16, 15, 19, 43, 18, 89, 58, 17, 87, 33, 85, 49},
            {27, 38, 20, 65, 45, 97, 16, 68, 90, 48, 96, 39},
            {36, 42, 74, 30, 72, 69, 37, 40, 43, 74, 43, 51},
            {84, 58, 61, 84, 40, 50, 25, 83, 31, 62, 38, 23}};
    static String[] empleados = {"Antonio", "Angela", "Marta", "Jorge", "Alejandro"};

    public static void main(String[] args) {
        // Llamada a la función para imprimir la matriz
        imprimirMatrizVentas();
    }

    // Función para imprimir la matriz de ventas
    public static void imprimirMatrizVentas() {
        // Primero imprimimos los nombres de los meses (en la parte superior)
        System.out.print("          "); // Espacio para la alineación
        for (String mes : meses) {
            System.out.print(mes + " \t \t");
        }
        System.out.println(); // Salto de línea después de los meses

        // Ahora imprimimos las ventas para cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.print(empleados[i] + "\t  "); // Imprimimos el nombre del empleado
            for (int j = 0; j < meses.length; j++) {
                System.out.print("\t \t "+ventas[i][j] + "\t "); // Imprimimos la venta del empleado para cada mes
            }
            System.out.println(); // Salto de línea después de cada fila de ventas
        }
    }
}
