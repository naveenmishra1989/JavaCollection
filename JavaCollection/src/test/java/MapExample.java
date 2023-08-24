import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

//A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
//
//A Map is useful if you have to search, update or delete elements on the basis of a key.

//
public class MapExample {

    @Test
    void mapNonGeneric (){
        Map map = new HashMap();//Map is interface,HashMap implementation class of map
        map.put("sarita",6);
        map.put(5,"shaw");
        System.out.println(map);
    }

    @Test
    void mapGeneric (){
        Map<Integer, String> map = new HashMap();//Map is interface,HashMap implementation class of map
        map.put(6,"sangita");
        map.put(5,"sarita");//
        map.put(5,"sangita");
        System.out.println(map);
        System.out.println(map.get(6));
        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
