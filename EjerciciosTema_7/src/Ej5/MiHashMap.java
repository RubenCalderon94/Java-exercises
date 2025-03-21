package Ej5;

/*
Diseña un proyecto Java que permita añadir, borrar, buscar y listar  un HashMap. Las
parejas del HashMap están formadas por  DNI y  nombre de personas (String).
 */
import java.util.HashMap;
import java.util.Map;

public class MiHashMap {

    //ATRIBUTO
    //HASMAP almacenara los DNI-NOMBRE los dos String
    //Creamos el HASMAP
    private Map<String, String> miMap = new HashMap<>();


    //CREAR UNA PERSONA POR CLAVE-VALOR (DNI-NOMBRE)
    public void create(String key, String value){
        miMap.put(key, value);
        System.out.println("Persona agregada con exito"+key+value);
    }


    //BORRAR UNA PERSONA POR CLAVE(DNI)
    public boolean borrar(String key){
        if(miMap.containsKey(key)){
            miMap.remove(key);
            return true;

        }
        return false;
    }


    //BUSCA
    public String read(String key){
        return miMap.get(key);
    }

    //LISTAR
    public boolean update(String key, String value){
        if(miMap.containsKey(key)){
            miMap.put(key, value);
            return true;
        }
        return false;
    }
}
