package ru.mirea.lab1;

public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Halen");
        Dog d3 = new Dog();
        d3.SetAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
