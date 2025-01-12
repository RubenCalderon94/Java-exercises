package EjerciciosArrays;

/*
 Diseña un   programa   Java   que   a   partir   de   esta   matriz   int   [][]   m   =
{{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}}, cuente y muestre las veces que se repite
cada valor. Los valores de la matriz están comprendidos entre 1 y 12.
 */

public class Ej33 {
    public static void main(String[] args) {

        int count1=0, count2=0, count4=0, count5=0, count6=0, count7=0, count8=0, count10=0, count12=0;

        int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" \t"+m[i][j]);


                if (m[i][j]==1){
                    count1++;
                } else if (m[i][j]==2){
                    count2++;
                } else if (m[i][j]==4){
                    count4++;
                } else if (m[i][j]==5){
                    count5++;
                } else if (m[i][j]==6){
                    count6++;
                } else if (m[i][j]==7){
                    count7++;
                } else if (m[i][j]==8){
                    count8++;
                } else if (m[i][j]==10){
                    count10++;
                }else {
                    count12++;
                }

            }
            System.out.println();
        }

        System.out.println("El numero 1 aparece "+count1+" veces");
        System.out.println("El numero 2 aparece "+count2+" veces");
        System.out.println("El numero 4 aparece "+count4+" veces");
        System.out.println("El numero 5 aparece "+count5+" veces");
        System.out.println("El numero 6 aparece "+count6+" veces");
        System.out.println("El numero 7 aparece "+count7+" veces");
        System.out.println("El numero 8 aparece "+count8+" veces");
        System.out.println("El numero 10 aparece "+count10+" veces");
        System.out.println("El numero 12 aparece "+count12+" veces");


    }

}
