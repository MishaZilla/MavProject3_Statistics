package org.example;

public class Main {
    public static void main(String[] args) {
        int [] massive = {
                1, 34, 21, 54, 2
        };
        int A = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 23) {
            A = A + 1;
            }
        }
        System.out.println(A);
    }
}