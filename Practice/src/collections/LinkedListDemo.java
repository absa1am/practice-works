package collections;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

public class LinkedListDemo {
    public static void main(String[] args) {
        var list = new LinkedList<Integer>();
        List<Integer> listToAdd = new LinkedList<>();

        // void add(int index, E element): add element at index to collection
        list.add(0, 1);

        // boolean add(E e): add e to collection
        list.add(5);

        listToAdd.add(3);
        listToAdd.add(5);
        listToAdd.set(1, 6);

        // boolean addAll(int index, Collection<? extends E> c): add collection c at index and return true if added
        list.addAll(0, listToAdd);

        list.addFirst(0);
        list.addLast(9);
        list = list.reversed();
        list.push(10);
        list.pop();

        out.println("getFirst(): " + list.getFirst());
        out.println("getLast(): " + list.getLast());
        out.println("element(): " + list.element());

        var descList = list.descendingIterator();

        while (descList.hasNext()) {
            out.print(descList.next() + " ");
        }

        out.println();

        printCollection(list);
    }

    private static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            out.println(item);
        }
    }
}
