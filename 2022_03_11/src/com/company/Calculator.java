package com.company;
//Make a Calculator class, which will have 5 static methods:
//    int plus(int a, int b) - returns the sum of a and b
//    int minus(int a, int b) - returns the difference between a and b
//    int multiply(int a, int b) - returns the product of a and b
//    double divide(int a, int b) - returns the result of dividing a by b
//    double percent(int a, int b) - returns b percent of the number a
//            (for example, percent(4, 50) should return 50% of 4)

public class Calculator {
    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return 1.*a/b;
    }

    static double percent(int a, int b) {
        return divide(multiply(a, b), 100);
    }
}
