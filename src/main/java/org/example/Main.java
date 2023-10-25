package org.example;

public class Main {
    public static void main(String[] args) {
        var seq = new Random(100);
        for (int i = 1; i < 20; i++) {
            int result = seq.getNext();
            System.out.println(i + ": " + result);
        }
    }
}