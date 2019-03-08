import java.util.*;
import java.util.TreeSet;
import java.util.HashSet;

public class CollectionObject {
    public static void main(String[] args) {
        System.out.println("Test HashSet & TreeSet");
        HashSet<Integer> hashset = new HashSet<>();
        TreeSet<Integer> treeset = new TreeSet<>();
        System.out.println("HashSet:");
        testSet(hashset);
        System.out.println("");
        System.out.println("");
        System.out.println("TreeSet:");
        testSet(treeset);
        System.out.println("===================================");

        testIterator(hashset);
        testIterator(treeset);
    }

    public static void testIterator(Collection c) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj  + " ");
        }
        System.out.println();
    } 

    public static void testSet(Set<Integer> s) {
        System.out.println("Hash empty : " + s.isEmpty());
        s.add(5);
        s.add(5);
        s.add(5);
        s.add(2);
        s.add(15);
        s.add(13);
        s.add(18);
        s.add(18);
        s.add(537);
        s.add(537);
        System.out.println("Hash size : " + s.size());
        System.out.println("Hash empty : " + s.isEmpty());
        System.out.println("Hash : " + s);
        System.out.println("Hash 是否有 2 : " + s.contains(2));
        System.out.println("Hash 清除 2");
        s.remove(2);
        System.out.println("Hash 是否有 2 : " + s.contains(2));
        System.out.println("清除Hash");
        s.clear();
        System.out.println("Hash : " + s);
        System.out.println("Hash empty : " + s.isEmpty());
        s.add(5);
        s.add(5);
        s.add(5);
        s.add(2);
        s.add(15);
        s.add(13);
        s.add(18);
        s.add(18);
        s.add(537);
        s.add(537);
        System.out.println("Hash : " + s);
    }
}