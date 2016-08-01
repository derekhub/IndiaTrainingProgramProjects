package com.training;

public class Example_Four {

    public static void display(int key) {

        System.out.println("Value" + key);
    }

    public static void main(String[] args) {

        /**
         * Prints the Same Value for two different options
         */
        for (int i = 0; i <= 3; i++) {
            switch (i) {
            case 1:
                display(1);
                break;
            case 2:
                display(2);
                break;
            case 3:
                display(3);
                break;
            default:
                break;
            }
        }
    }
}
