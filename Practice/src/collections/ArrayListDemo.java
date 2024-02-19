package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

import static java.lang.System.out;

public class ArrayListDemo {
    public static void main(String[] args) {
        Collection<String> langs = new ArrayList<>();
        Collection<String> langToAdd = new ArrayList<>();

        // boolean add(E e): add a single element to the collection
        langToAdd.add("Java");
        langToAdd.add("Python");
        langToAdd.add("Swift");
        langToAdd.add("Kotlin");

        // void clear(): clear all the element from collection
        //langToAdd.clear();

        // boolean addAll(Collection<? extends E> c): add a collection of element
        var isAdded = langs.addAll(langToAdd);

        System.out.println("addAll(): " + isAdded);

        langs.add("C");
        langs.add("C++");
        langs.add("C#");
        langs.add("Java");
        langs.add(null);

        // boolean contains(Object o): check whether the o exist or not
        System.out.printf("contains(\"%s\"): %b\n", "Swift", langs.contains("Swift"));

        // boolean isEmpty(): check whether the collection is empty or not
        System.out.println("isEmpty(): " + langs.isEmpty());

        // boolean remove(Object o): remove the o if exists
        System.out.println("remove(): " + langs.remove("Objective C"));

        // boolean removeAll(Collection<?> c): remove the c collection from the collection
        out.println("removeAll(): " + langs.removeAll(langToAdd));

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        out.println("removeIf(): " + langs.removeIf(isNullOrEmpty));

        printCollection(langs);
    }

    private static <T> void printCollection(Collection<T> c) {
        for (T item : c) {
            System.out.println(item);
        }
    }
}
