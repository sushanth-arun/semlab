
package org.example;

public class Main {

    public static int factorial(int n) {
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
