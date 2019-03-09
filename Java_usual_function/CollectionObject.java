import java.util.*;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;

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

        System.out.println("===================================");
        System.out.println("Test ArrayList & LinkedList");
        testArrayList();
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

    public static void testArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(64);
        arrayList.add(3);
        System.out.println("ArrayList : " + arrayList);
        System.out.println("元素個數 : " + arrayList.size());
        System.out.println("將索引為2的，用200取代");
        arrayList.set(2, 200);
        System.out.println("ArrayList : " + arrayList);
        System.out.println("64的索引值 : " + arrayList.indexOf(64));
        System.out.println("是否有58 : " + arrayList.contains(58));
        System.out.println("是否有64 : " + arrayList.contains(64));
        System.out.println("移除索引值0");
        arrayList.remove(0);
        System.out.println("ArrayList : " + arrayList);
        System.out.println("最後一個5的索引值是 : " + arrayList.lastIndexOf(5));
        System.out.println("索引值2是 : " + arrayList.get(2));
        
        System.out.print("Collections 排序 : ");
        Collections.sort(arrayList);
        System.out.print(arrayList);
        System.out.println();

        System.out.print("Collections 反轉 : ");
        Collections.reverse(arrayList);
        System.out.print(arrayList);
        System.out.println();
    }
}