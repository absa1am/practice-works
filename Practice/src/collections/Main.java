package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> langs = new ArrayList<>();
        Collection<String> langToAdd = new ArrayList<>();

        langToAdd.add("Python");
        langToAdd.add("Swift");
        langToAdd.add("Kotlin");

        langToAdd.clear();

        var isAdded = langs.addAll(langToAdd);

        System.out.println("addAll(): " + isAdded);

        langs.add("C");
        langs.add("C++");
        langs.add("C#");
        langs.add("Java");

        printCollection(langs);
    }

    private static <T> void printCollection(Collection<T> c) {
        for (T item : c) {
            System.out.println(item);
        }
    }
}
