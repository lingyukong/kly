package thinking_in_java.object_contain_8.newcollections.example2;

import thinking_in_java.object_contain_8.newcollections.example1.Collection1;

import java.util.*;

/**
 * <p>Description: </p>
 * <p>Company:changyou</p>
 *
 * @author kly
 * @Date 2018/3/1 15:23
 * @see
 */
public class List1 {
    static boolean b;
    static Object o;
    static int i;
    static Iterator it;
    static ListIterator lit;

    // Wrap Collection1.fill() for convenience:
    public static List fill(List a) {
        return (List) Collection1.fill(a);
    }
    // You can use an Iterator, just as with a
    // Collection, but you can also use random
    // access with get():
    public static void print(List a) {
        for(int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println();
    }

    public static void basicTest(List a) {
        a.add(1, "x"); // 在此列表中指定的位置插入指定的元素
        print(a);
        a.add("x"); // 将指定元素添加到此列表的结尾
        print(a);
        // Add a collection:
        a.addAll(fill(new ArrayList())); // 添加指定 collection 中的所有元素到此列表的结尾，顺序是指定 collection 的迭代器返回这些元素的顺序
        print(a);
        a.addAll(3, fill(new ArrayList())); // 将指定 collection 中的所有元素从指定位置开始插入此列表
        print(a);
        b = a.contains("1"); // Is it in there?
        System.out.println("a.contains(\"1\"):" + b);
        // Is the entire collection in there?
        b = a.containsAll(fill(new ArrayList()));
        System.out.println("a.containsAll:" + b);


        o = a.get(1); // Get object at location 1
        System.out.println("a.get(1):" + o);
        i = a.indexOf("1"); // 返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1
        System.out.println("a.indexOf(\"1\"):"+i);

        b = a.isEmpty(); // Any elements inside?
        System.out.println("a.isEmpty:" + b);

        it = a.iterator(); // Ordinary Iterator
        lit = a.listIterator(); // 返回此列表元素的列表迭代器（按适当顺序）
        lit = a.listIterator(3); // 返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始



        i = a.lastIndexOf("1"); //返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1
        System.out.println(" a.lastIndexOf(\"1\"):" + i);

        a.remove(1); // 移除列表中指定位置的元素（可选操作）
        print(a);
        a.remove("3"); // 从此列表中移除第一次出现的指定元素（如果存在）（可选操作）
        print(a);

        a.set(1, "y"); // Set location 1 to "y"
        print(a);
        a.retainAll(fill(new ArrayList())); // 仅在列表中保留指定 collection 中所包含的元素（可选操作）
        print(a);
        // Remove everything that's in the argument:
        a.removeAll(fill(new ArrayList()));//从列表中移除指定 collection 中包含的其所有元素（可选操作）
        print(a);
        i = a.size(); // How big is it?
        a.clear(); // Remove all elements
    }
    public static void iterMotion(List a) {
        ListIterator it = a.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        o = it.next();
        i = it.nextIndex();
        o = it.previous();
        i = it.previousIndex();
    }
    public static void iterManipulation(List a) {
        ListIterator it = a.listIterator();
        it.add("47");
        // Must move to an element after add():
        it.next();
        // Remove the element that was just produced:
        it.remove();
        // Must move to an element after remove():
        it.next();
        // Change the element that was just produced:
        it.set("47");
    }
    public static void testVisual(List a) {
        print(a);
        List b = new ArrayList();
        fill(b);
        System.out.print("b = ");
        print(b);
        a.addAll(b);
        a.addAll(fill(new ArrayList()));
        print(a);
        // Shrink the list by removing all the
        // elements beyond the first 1/2 of the list
        System.out.println(a.size());
        System.out.println(a.size()/2);
        print(a);
        // Insert, remove, and replace elements
        // using a ListIterator:
        ListIterator x = a.listIterator(a.size()/2);
        x.add("one");
        print(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        print(a);
        // Traverse the list backwards:
        x = a.listIterator(a.size());
        while(x.hasPrevious())
            System.out.print(x.previous() + " ");
        System.out.println();
        System.out.println("testVisual finished");
    }
    // There are some things that only
        // LinkedLists can do:
    public static void testLinkedList() {
        LinkedList ll = new LinkedList();
        Collection1.fill(ll, 5);
        print(ll);
        // Treat it like a stack, pushing:
        ll.addFirst("one");
        ll.addFirst("two");
        print(ll);
        // Like "peeking" at the top of a stack:
        System.out.println(ll.getFirst());
        // Like popping a stack:
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        // Treat it like a queue, pulling elements
        // off the tail end:
        System.out.println(ll.removeLast());
        // With the above operations, it's a dequeue!
        print(ll);
    }
    public static void main(String args[]) {
        // Make and fill a new list each time:
        basicTest(fill(new LinkedList()));
//        basicTest(fill(new ArrayList()));
//        iterMotion(fill(new LinkedList()));
//        iterMotion(fill(new ArrayList()));
//        iterManipulation(fill(new LinkedList()));
//        iterManipulation(fill(new ArrayList()));
//        testVisual(fill(new LinkedList()));
//        testLinkedList();
    }
}
