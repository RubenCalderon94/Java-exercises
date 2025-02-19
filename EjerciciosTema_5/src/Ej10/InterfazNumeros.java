package Ej10;

public interface InterfazNumeros {

    public void mostrarNumeros(); // Muestra los valores del array
    public void mostrarNumerosComoString(); // Muestra el array como un String
    public void multiplicarPor(int multiplicador); // Multiplica cada valor del array por un número
    public int contarValoresMayoresQue(int valor); // Cuenta los valores mayores que el número
    public int contarValoresEntre(int numero1, int numero2); // Cuenta los valores entre dos números
    public int compararCon(int[] numeros); // Compara con otro array y devuelve la suma de valores del array más grande
    public int[] getArray(int[] num); // Devuelve el array con más elementos

}
