package ru.mirea.ikbo0219;

import java.util.Scanner;

public class SummaScore {
    public static int recursion(int n){
        if (n / 10 == 0)
            return n;
        return recursion(n / 10) + (n % 10);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println(recursion(n));
    }
}
