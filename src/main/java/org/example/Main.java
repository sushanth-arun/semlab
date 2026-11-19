package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(int n) {
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}