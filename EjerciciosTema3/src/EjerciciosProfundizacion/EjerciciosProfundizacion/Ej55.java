package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*. Diseña una aplicación Java que permita mostrar el calendario de un mes y año
concretos.  Para elaborar este calendario necesitas conocer qué día de la semana
comienza ese mes. Consulta esta web para conocer este dato:
https://www.gaussianos.com/como-calcular-que-dia-de-la-semana-fue/. */

import java.util.Scanner;

        public class Ej55 {
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                int anio=2023; int dia=1;

                for (int mes = 1; mes <= 12; mes++) {
                    int siglo = anio / 100 + 1;
                    int A = switch (siglo) {
                        case 18: {
                            yield 5;
                        }
                        case 19: {
                            yield 3;
                        }
                        case 20: {
                            yield 1;
                        }
                        case 21: {
                            yield 0;
                        }
                        case 22: {
                            yield -2;
                        }
                        case 23: {
                            yield -4;
                        }
                        default: {
                            yield 0;
                        }
                    };
                    // System.out.println("a: " + a);

                    int resto = anio % 100;

                    int B = (resto + resto / 4);
                    // System.out.println("b: " + b);

                    int C = 0;
                    boolean bisiesto = false;
                    if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
                        bisiesto = true;

                    if (bisiesto == true && (mes == 1 || mes == 2))
                        C = -1;
                    // System.out.println("c: " +c);

                    String meses = "622503514624";
                    int D = Integer.parseInt(meses.charAt(mes - 1) + "");
                    // System.out.println("d: " + d);

                    int E = dia;
                    // System.out.println("e: " + e);

                    int r = (A + B + C + D + E) % 7;
                    // System.out.println("r: " + r);

                    int numeroDias = switch (mes) {
                        case 1, 3, 5, 7, 8, 10, 12: {
                            yield 31;
                        }
                        case 4, 6, 9, 11: {
                            yield 30;
                        }
                        case 2: {
                            if (bisiesto)
                                yield 29;
                            else
                                yield 28;
                        }

                        default:
                            throw new IllegalArgumentException("Unexpected value: " + mes);
                    };

                    System.out.printf("Mes: %d. Año: %d", mes, anio);
                    System.out.println();
                    // calcular los saltos en función de r.
                    int saltos = (r == 0) ? 6 : r - 1;
                    //System.out.println("saltos: " + saltos);

                    // para los saltos del principio
                    int cuentaSemana = 0;
                    int j = 0;
                    while (j < saltos) {
                        System.out.printf("\t");
                        j++;
                        cuentaSemana++;
                    }

                    // para mostrar los días
                    int i = 1;
                    while (i <= numeroDias) {

                        System.out.printf("%2d\t", i);
                        cuentaSemana++;

                        if (cuentaSemana == 7) {
                            System.out.println();
                            cuentaSemana = 0;
                        }
                        i++;
                    }
                    entrada.nextLine();
                    System.out.println();
                }

            }

        }