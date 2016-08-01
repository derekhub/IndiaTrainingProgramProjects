package com.training;

public class Example_Two {
    public static void main(String args[]) {

        /*
         * Loop Runs Continuously - Fix it
         */

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 20; j++) {
                System.out.println(i + "," + j);
            }
        }

        /*
         * Loop Runs Only Once- Fix It
         */
        int k = 1;
        while (k <= 10)

        {
            System.out.println(k);
            k++;
        }
    }

}
