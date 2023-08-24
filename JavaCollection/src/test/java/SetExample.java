import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/*
set is collection of objects
duplicate not are allowed
insertion order not preserved
 */
public class SetExample {

    @Test
    void SetNonGeneric(){
        Set set = new HashSet();
        set.add(1);
        set.add("sarita");
        System.out.println(set);
    }
    @Test
    void SetGeneric(){
        Set<Integer> set = new HashSet();
        set.add(2);
        set.add(1);
        set.add(1);
       // set.add("sarita");
        System.out.println(set);
    }
}
