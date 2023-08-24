import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//list is collection of object,insertion order is preserved,indexing value,duplicate allowed
public class ListExample {

    @Test
    void listNonGeneric ( ) {
        List list = new ArrayList();//Creating object of Arraylist
        list.add(1);
        list.add("Sarita");
        // System.out.println(list);
        list.forEach(System.out::println); //using forEach method java 8 onwards
    }

    @Test
    void listGeneric ( ) {
        List<Integer> list = new ArrayList();//generic type safety
        list.add(2);
        list.add(1);
        list.add(2);
        // list.add("Sarita");  //Single line comment compilation error
        // System.out.println(list);
        for (Integer val : list) {//foreach loop
            System.out.println(val);
        }
        System.out.println("--------------------------------------");
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
