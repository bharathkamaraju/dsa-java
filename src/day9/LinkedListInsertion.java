package day9;

import java.util.LinkedList;

public class LinkedListInsertion {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll);
        //Add at the beginning
        ll.addFirst(45);
        //Add at the last
        ll.addLast(77);
        System.out.println(ll);
        //Specific position
        ll.add(2,18);
        System.out.println(ll);
    }
}
