package Ej5;

public class Main {
    public static void main(String[] args) {

        MiHashMap hashMap = new MiHashMap();
        hashMap.create("Key1", "Value1");
        hashMap.create("Key2", "Value2");
        hashMap.create("Key3", "Value3");
        hashMap.create("Key4", "Value4");
        hashMap.create("Key5", "Value5");


        System.out.println(hashMap.read("Key1"));
        System.out.println(hashMap.read("Key2"));
        System.out.println(hashMap.read("Key3"));
        System.out.println(hashMap.read("Key4"));
        System.out.println(hashMap.read("Key5"));


        hashMap.update("Key1", "Value1update");
        hashMap.update("Key2", "Value2update");
        hashMap.update("Key3", "Value3update");
        hashMap.update("Key4", "Value4update");
        hashMap.update("Key5", "Value5update");


        System.out.println(hashMap.read("Key1"));
        System.out.println(hashMap.read("Key2"));
        System.out.println(hashMap.read("Key3"));
        System.out.println(hashMap.read("Key4"));
        System.out.println(hashMap.read("Key5"));


        hashMap.borrar("Key1");
        hashMap.borrar("Key2");
        hashMap.borrar("Key3");
        hashMap.borrar("Key4");
        hashMap.borrar("Key5");


        System.out.println(hashMap.read("Key1"));
        System.out.println(hashMap.read("Key2"));
        System.out.println(hashMap.read("Key3"));
        System.out.println(hashMap.read("Key4"));
        System.out.println(hashMap.read("Key5"));








    }
}
