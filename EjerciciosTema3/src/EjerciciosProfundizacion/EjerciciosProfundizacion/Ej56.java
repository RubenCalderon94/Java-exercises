package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*Diseña un programa Java que compruebe si un número es de Armstrong. Se dice que
un número es de Armstrong si “es igual a la suma de sus propios dígitos elevados
al número de dígitos”*/

import java.util.Scanner;

        public class Ej56 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num;

                System.out.println("Escribe un número");
                num= sc.nextInt();

                if(isArmstrong(num)) {
                    System.out.println("Este número "+ num + " si es de Armstrong");
                }
                else {
                    System.out.println("Este número "+ num + " no es de Armstrong");
                }
            }

            private static boolean isArmstrong(int num) {
                int undigito, suma=0, totaldigitos=0;

                totaldigitos=cuenta_digitos(num);
                for(int i=Math.abs(num);i>0;i/=10) {
                    undigito= i%10;//resto = al digito de la derecha
                    suma+=Math.pow(undigito, totaldigitos);
                }
                if(suma==num) {
                    return true;
                }
                return false;
            }
            /*
             * función que cuenta el número de digitos que tiene un entero
             */
            private static int cuenta_digitos(int numero) {
                if (numero == 0) {
                    return 1;
                }
                return (int) (Math.log10(numero) + 1);
            }

	/*
	 * Otra forma de contar digitos, lo convierto en String y cuento los caracteres

	private static int cuenta1_digitos(int numero) {
		String cadenum="";

		if (numero ==0) {
			return 1;
		}

		//primera forma pasar int a String
		cadenum = numero+"";
		//segunda forma pasar int a String
		cadenum =String.valueOf(numero);
		//tercera forma pasar int a String
		cadenum =Integer.toString(numero);

		return cadenum.length();
	}*/
	  /*
	   * Otra forma
	   *

	   private static int cuenta2_digitos(int numero) {
		   int numdigitos=0;

	    		for(int i=Math.abs(numero);i>0;i/=10) {
	    			numdigitos++;
	    		}
	    		return numdigitos;
		}

	   */

        }

