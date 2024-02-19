package com.example.hibernatedemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCase = in.nextInt();

        in.next();

        for (int i = 0; i < testCase; i++) {
            int[] letters = new int[3];

            for (int j = 0; j < 3; j++) {
                String row = in.nextLine();

                for (int k = 0; k < 3; k++) {
                    letters[row.charAt(k) - 65]++;
                }
            }

            for (int j = 0; j < 3; j++) {
                if (letters[j] == 0) {
                    System.out.println((char) (65 + j));
                }
            }
        }
    }

}
