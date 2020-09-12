package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Mike", "Mike18031978@gmail.com", 'm');
        Author a2 = new Author("Halen");
        Author a3 = new Author("Valera", "shelyuhin.valera@gmail.com", 'm');
        a2.setEmail("FallenAngel@yandex.ru");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
