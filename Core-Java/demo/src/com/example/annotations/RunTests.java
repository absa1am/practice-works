package com.example.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("com.example.annotations.Sample");

        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;

                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();

                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("Inavlid @Test: " + m);
                }
            }
        }

        System.out.printf("Tests: %d, Passed: %d, Failed: %d%n", tests, passed, tests - passed);
    }

}
