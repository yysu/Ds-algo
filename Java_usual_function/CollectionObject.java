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
        System.out.println("ArrayList:");
        testArrayList();
        System.out.println("");
        System.out.println("");
        System.out.println("LinkedList:");
        testLinkedList();

        System.out.println("===================================");
        System.out.println("Test HashMap & TreeMap");
        System.out.println("HashMap:");
        testHashMap();
        System.out.println("");
        System.out.println("");
        System.out.println("TreeMap:");
        testTreeMap();
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

        ListIterator litr1 = arrayList.listIterator(arrayList.size());
        System.out.print("反向列出 ArrayList 內容:");
        while (litr1.hasPrevious()) {
            System.out.print(litr1.previous() + " "); //反向走訪元素
        }
        System.out.println();
        
        System.out.print("Collections 排序 : ");
        Collections.sort(arrayList);
        System.out.print(arrayList);
        System.out.println();

        System.out.print("Collections 反轉 : ");
        Collections.reverse(arrayList);
        System.out.print(arrayList);
        System.out.println();
    }

    public static void testLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(6);
        linkedList.add(5);
        linkedList.add(64);
        linkedList.add(3);
        System.out.println("LinkedList : " + linkedList);
        System.out.println("元素個數 : " + linkedList.size());
        System.out.println("將索引為2的，用200取代");
        linkedList.set(2, 200);
        System.out.println("LinkedList : " + linkedList);
        System.out.println("64的索引值 : " + linkedList.indexOf(64));
        System.out.println("是否有58 : " + linkedList.contains(58));
        System.out.println("是否有64 : " + linkedList.contains(64));
        System.out.println("移除索引值0");
        linkedList.remove(0);
        System.out.println("LinkedList : " + linkedList);
        System.out.println("最後一個5的索引值是 : " + linkedList.lastIndexOf(5));
        System.out.println("索引值2是 : " + linkedList.get(2));
        System.out.println("LinkedList 加 1000 到最前面" );
        linkedList.addFirst(1000);
        System.out.println("LinkedList : " + linkedList);
        System.out.println("LinkedList 加 3456 到最後面" );
        linkedList.addLast(3456);
        System.out.println("LinkedList : " + linkedList);

        ListIterator litr1 = linkedList.listIterator(linkedList.size());
        System.out.print("反向列出 LinkedList 內容:");
        while (litr1.hasPrevious()) {
            System.out.print(litr1.previous() + " "); //反向走訪元素
        }
        System.out.println();

        ListIterator litr2 = linkedList.listIterator();
        System.out.print("正向列出 LinkedList 內容:");
        while (litr2.hasNext()) {
            System.out.print(litr2.next() + " "); //正向走訪元素
        }
        System.out.println();
        
        System.out.print("Collections 排序 : ");
        Collections.sort(linkedList);
        System.out.print(linkedList);
        System.out.println();

        System.out.print("Collections 反轉 : ");
        Collections.reverse(linkedList);
        System.out.print(linkedList);
        System.out.println();
    }

    public static void testHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(102210, "Su,Jim");
        hashMap.put(104213, "Yeh,Chang");
        hashMap.put(103287, "Chiu,Lou");

        System.out.println("元素個數 : " + hashMap.size());
        System.out.println("HashMap 內元素 : " + hashMap);
        System.out.print("HashMap 內是否有關鍵值 102210 : ");
        System.out.println(hashMap.containsKey(102210));
        System.out.print("HashMap 內是否有對應值 Su,Jim : ");
        System.out.println(hashMap.containsValue("Su,Jim"));

        System.out.print("HashMap 測試 getOrDefault(102210, \"Not Exist\") : ");
        System.out.println(hashMap.getOrDefault(102210, "Not Exist"));
        System.out.print("HashMap 測試 getOrDefault(102222, \"Not Exist\") : ");
        System.out.println(hashMap.getOrDefault(102222, "Not Exist"));
        
        System.out.println("HashMap 測試 putIfAbsent(key, value) : ");
        hashMap.putIfAbsent(102222, "New Value");
        hashMap.putIfAbsent(102222, "New Value");

        hashMap.remove(104213);

        System.out.println("元素個數 : " + hashMap.size());
        System.out.println("HashMap 內元素 : " + hashMap);
        System.out.println("關鍵值 102210 的對應值 : " + hashMap.get(102210));
    }

    public static void testTreeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(102210, "Su,Jim");
        treeMap.put(104213, "Yeh,Chang");
        treeMap.put(103287, "Chiu,Lou");

        System.out.println("元素個數 : " + treeMap.size());
        System.out.println("TreeMap 內元素 : " + treeMap);
        System.out.print("TreeMap 內是否有關鍵值 102210 : ");
        System.out.println(treeMap.containsKey(102210));
        System.out.print("TreeMap 內是否有對應值 Su,Jim : ");
        System.out.println(treeMap.containsValue("Su,Jim"));

        System.out.print("TreeMap 測試 getOrDefault(102210, \"Not Exist\") : ");
        System.out.println(treeMap.getOrDefault(102210, "Not Exist"));
        System.out.print("TreeMap 測試 getOrDefault(102222, \"Not Exist\") : ");
        System.out.println(treeMap.getOrDefault(102222, "Not Exist"));
        
        System.out.print("TreeMap 測試 putIfAbsent(102222, New Value) : ");
        System.out.println(treeMap.putIfAbsent(102222, "New Value"));
        System.out.print("TreeMap 測試 putIfAbsent(102222, New Value) : ");
        System.out.println(treeMap.putIfAbsent(102222, "New Value"));

        treeMap.remove(104213);

        System.out.println("元素個數 : " + treeMap.size());
        System.out.println("TreeMap 內元素 : " + treeMap);
        System.out.println("關鍵值 102210 的對應值 : " + treeMap.get(102210));
    }
}