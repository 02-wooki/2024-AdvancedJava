package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        arrayListTest();
        hashMapTest();
        linkedListTest();
    }

    static void arrayListTest() {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");

        al.add(1, "mniddle insert");

        System.out.println(al);
    }

    static void hashMapTest() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "apple");
        hm.put(2, "banana");

        System.out.println(hm);
    }

    static void linkedListTest() {
        LinkedList<Double> ll = new LinkedList<>();
        ll.addFirst(0.01);
        ll.addLast(0.02);
        ll.addFirst(0.03);

        System.out.println(ll);
    }
}
