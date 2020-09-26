package ru.mirea.ikbo0219;

import javax.swing.*;
import java.util.Scanner;

public class triange {
    public static void recursion(int n){
        if (n != 1)
            recursion(n - 1);
        for (int i = 1; i <= n; i++)
            System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        recursion(x);
    }
}
