package ru.mirea.ikbo0219;

public class Solution {
    public static int recursion(int n){
        if (n == 1)
            return 1;
        return recursion(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
