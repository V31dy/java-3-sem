package ru.mirea.ikbo0219;
import java.util.ArrayList;
import java.util.Scanner;

public class OddNumber {
    public static int recursion(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 99;
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            int x = console.nextInt();
            if (x != 0)
                list.add(x);
            else
                n = i + 1;
        }
        for (int i = 0; i < n; i++){
            if (i%2 == 0)
                System.out.println(list.get(i));
        }
        return 1;
    }
    public static void main(String[] args) {
        recursion();
    }
}
