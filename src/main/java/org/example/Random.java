package org.example;

class Random {

    private final int init;
    private int seed;

    Random (int seed) {
        this.seed = seed;
        this.init = seed;
    }

    public int getNext() {
        int m = 2147483647;
        int a = 16807;
        int c = 293;
        seed = (a * seed + c) % m;
        return seed;
    }

    public void reset() {
        seed = init;
    }

}
