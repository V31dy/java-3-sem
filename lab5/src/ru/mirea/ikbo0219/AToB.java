package ru.mirea.ikbo0219;

import java.util.Scanner;

public class AToB {
    public static int recursion(int a, int b){
        if (a > b){
            System.out.println(a);
            recursion(a - 1, b);
        }
        else if (a < b){
            System.out.println(a);
            recursion(a + 1, b);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println(recursion(a, b));
    }
}
