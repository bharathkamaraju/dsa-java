package day9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
public class ListIteratorDemo {
    public static void main(String[] args) {
        //Insert elements in an ArrayList in one Line
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //list.add(3,10);
        // list.addLast(7);
        // list.addFirst(10);
        System.out.println(list);
        System.out.println("Using Iterator:");
        ListIterator<Integer> itr = list.listIterator();
        System.out.println("Forward direction");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("Backward Traversal");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
}
