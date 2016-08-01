package com.training;

class A {
    static int add(int i, int j) {
        return i + j;
    }
}

public class Example_One extends A {

    public static void main(String argv[]) {

        /*
         * Fix the following lines of code
         */
        short s = 927;

        byte b = 5;

        short sb = (short) (s + b);

        // fix the Bug in the Line Below

        System.out.println(add(s, 6));
        System.out.println(s);
    }
}
