package ru.mirea.ikbo0219;

import java.util.Scanner;

public class OneToN {
    public static void recursion(int n){
        if (n != 1)
            recursion(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        recursion(x);
    }
}
